package az.example.org;

import az.example.org.model.JsonPerson;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.InvalidProtocolBufferException;
import org.example.grpc.Person;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GrpTestApp {

    private static final String PATH = "proto.out";
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException {


        org.example.grpc.Person person = org.example.grpc.Person
                .newBuilder()
                .setName("John")
                .setAge(30)
                .setBalance(-23)
                .setSalary(434.434)
                .setEmployed(true)
                .setEmail("john@example.org")
                .setBankAccountNumber(2323)
                .build();

//        serializer(person);
//
//        System.out.println(deserializer());


        JsonPerson jsonPerson = new JsonPerson("John", 30, true, "john@example.org", 434.434, 2323, -23);


        json(jsonPerson);
        proto(person);

//        for (int i = 0; i < 5; i++) {
//            runTest("json", () -> json(jsonPerson));
//            runTest("proto", () -> proto(person));
//        }

    }


    public static void proto(Person person) {

        try {
            byte[] byteArray = person.toByteArray();
            System.out.println("proto byte length: " + byteArray.length);
            Person.parseFrom(byteArray);
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }

    }

    public static void json(JsonPerson person) {
        try {
            byte[] bytes = objectMapper.writeValueAsBytes(person);
            System.out.println("json byte length: " + bytes.length);
            objectMapper.readValue(bytes, JsonPerson.class);
        } catch (JsonProcessingException e) {

        } catch (IOException e) {


        }
    }

    private static void runTest(String testName, Runnable runnable) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5_000_000; i++) {
            runnable.run();
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken to process: " + testName + " takes " + (end - start) + " ms");
    }


    public static void serializer(org.example.grpc.Person person) throws IOException {
        try (OutputStream outputStream = Files.newOutputStream(Paths.get(PATH))) {
            person.writeTo(outputStream);
        }
    }

    public static Person deserializer() throws IOException {
        try (InputStream inputStream = Files.newInputStream(Paths.get(PATH))) {
            return org.example.grpc.Person.parseFrom(inputStream);
        }
    }


}

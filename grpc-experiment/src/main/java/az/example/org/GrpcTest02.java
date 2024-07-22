package az.example.org;

import org.example.grpc.Address;
import org.example.grpc.School;
import org.example.grpc.Student;

public class GrpcTest02 {

    public static void main(String[] args) {

        Address address = Address.newBuilder()
                .setCity("Baku")
                .setState("Azerbaijan")
                .setStreet("123 main st.")
                .build();

        Student student = Student.newBuilder()
                .setName("Test")
                .setAddress(address)
                .build();

        School school = School.newBuilder()
                .setAddress(address.toBuilder().setStreet("321 main st."))
                .setName("High school")
                .setId(2)
                .build();

        System.out.println("school: " + school);

    }

}

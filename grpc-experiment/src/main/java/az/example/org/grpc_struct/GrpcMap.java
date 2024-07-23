package az.example.org.grpc_struct;

import org.example.grpc.complex_types.BodyType;
import org.example.grpc.complex_types.Cars;

public class GrpcMap {

    public static void main(String[] args) {

        org.example.grpc.complex_types.Car c1 = org.example.grpc.complex_types.Car.newBuilder()
                .setName("test")
                .setYear(1111)
                .setBodyStyle(BodyType.COUPE)
                .build();


        org.example.grpc.complex_types.Car c2 = org.example.grpc.complex_types.Car.newBuilder()
                .setName("test")
                .setBodyStyle(BodyType.COUPE)
                .build();


        Cars cars = Cars.newBuilder()
                .addCars(c1)
                .addCars(c2)
                .build();

        org.example.grpc.complex_types.CarYearMap carYearMap = org.example.grpc.complex_types.CarYearMap
                .newBuilder()
                .putCarMap(c1.getYear(), cars)
                .build();


        System.out.println(carYearMap);

    }
}

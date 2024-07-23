package az.example.org.grpc_struct;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Timestamp;
import org.example.grpc.well_known.SampleMessage;

import java.time.Instant;

public class GrpcWellKnownTypes {

    public static void main(String[] args) {
        SampleMessage sampleMessage = SampleMessage.newBuilder()
                .setAge(Int32Value.newBuilder().setValue(23).build())
                .setLoginTame(Timestamp.newBuilder().setSeconds(Instant.now().getEpochSecond()).build())
                .build();

//        sampleMessage.hasAge();

        System.out.println(sampleMessage);

    }
}

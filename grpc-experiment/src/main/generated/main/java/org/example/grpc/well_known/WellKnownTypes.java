// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: well-known-types.proto

package org.example.grpc.well_known;

public final class WellKnownTypes {
  private WellKnownTypes() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_well_known_SampleMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_well_known_SampleMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026well-known-types.proto\022\nwell_known\032\036go" +
      "ogle/protobuf/wrappers.proto\032\037google/pro" +
      "tobuf/timestamp.proto\"\234\001\n\rSampleMessage\022" +
      "(\n\003age\030\001 \001(\0132\033.google.protobuf.Int32Valu" +
      "e\022.\n\nlogin_tame\030\002 \001(\0132\032.google.protobuf." +
      "Timestamp\022\021\n\004rank\030\003 \001(\005H\000\210\001\001B\007\n\005_rankJ\004\010" +
      "\004\020\005R\006lengthR\007messageB\037\n\033org.example.grpc" +
      ".well_knownP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_well_known_SampleMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_well_known_SampleMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_well_known_SampleMessage_descriptor,
        new java.lang.String[] { "Age", "LoginTame", "Rank", "Rank", });
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

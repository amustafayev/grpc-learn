// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: well-known-types.proto

package org.example.grpc.well_known;

public interface SampleMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:well_known.SampleMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Int32Value age = 1;</code>
   * @return Whether the age field is set.
   */
  boolean hasAge();
  /**
   * <code>.google.protobuf.Int32Value age = 1;</code>
   * @return The age.
   */
  com.google.protobuf.Int32Value getAge();
  /**
   * <code>.google.protobuf.Int32Value age = 1;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp login_tame = 2;</code>
   * @return Whether the loginTame field is set.
   */
  boolean hasLoginTame();
  /**
   * <code>.google.protobuf.Timestamp login_tame = 2;</code>
   * @return The loginTame.
   */
  com.google.protobuf.Timestamp getLoginTame();
  /**
   * <code>.google.protobuf.Timestamp login_tame = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLoginTameOrBuilder();

  /**
   * <code>optional int32 rank = 3;</code>
   * @return Whether the rank field is set.
   */
  boolean hasRank();
  /**
   * <code>optional int32 rank = 3;</code>
   * @return The rank.
   */
  int getRank();
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: connect.proto

package bcosServer;

public interface StuGradeUpdateInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:StuGradeUpdateInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 StuID = 1;</code>
   */
  long getStuID();

  /**
   * <code>optional string StuName = 2;</code>
   */
  java.lang.String getStuName();
  /**
   * <code>optional string StuName = 2;</code>
   */
  com.google.protobuf.ByteString
      getStuNameBytes();

  /**
   * <code>optional uint32 Grade = 3;</code>
   */
  int getGrade();

  /**
   * <code>optional uint32 AverageGrades = 4;</code>
   */
  int getAverageGrades();

  /**
   * <code>optional string ExtInfo = 5;</code>
   */
  java.lang.String getExtInfo();
  /**
   * <code>optional string ExtInfo = 5;</code>
   */
  com.google.protobuf.ByteString
      getExtInfoBytes();

  /**
   * <code>optional uint64 Time = 6;</code>
   */
  long getTime();

  /**
   * <code>optional uint32 ObligatoryCredit = 7;</code>
   */
  int getObligatoryCredit();

  /**
   * <code>optional uint32 OptionalCredit = 8;</code>
   */
  int getOptionalCredit();
}

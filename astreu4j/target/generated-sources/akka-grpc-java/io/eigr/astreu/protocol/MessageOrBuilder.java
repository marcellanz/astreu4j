// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: astreu/protocol/protocol.proto

package io.eigr.astreu.protocol;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:astreu.protocol.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.astreu.protocol.System system = 1;</code>
   * @return Whether the system field is set.
   */
  boolean hasSystem();
  /**
   * <code>.astreu.protocol.System system = 1;</code>
   * @return The system.
   */
  io.eigr.astreu.protocol.System getSystem();
  /**
   * <code>.astreu.protocol.System system = 1;</code>
   */
  io.eigr.astreu.protocol.SystemOrBuilder getSystemOrBuilder();

  /**
   * <code>.astreu.protocol.Exchange exchange = 2;</code>
   * @return Whether the exchange field is set.
   */
  boolean hasExchange();
  /**
   * <code>.astreu.protocol.Exchange exchange = 2;</code>
   * @return The exchange.
   */
  io.eigr.astreu.protocol.Exchange getExchange();
  /**
   * <code>.astreu.protocol.Exchange exchange = 2;</code>
   */
  io.eigr.astreu.protocol.ExchangeOrBuilder getExchangeOrBuilder();

  /**
   * <code>.astreu.protocol.Ack ack = 3;</code>
   * @return Whether the ack field is set.
   */
  boolean hasAck();
  /**
   * <code>.astreu.protocol.Ack ack = 3;</code>
   * @return The ack.
   */
  io.eigr.astreu.protocol.Ack getAck();
  /**
   * <code>.astreu.protocol.Ack ack = 3;</code>
   */
  io.eigr.astreu.protocol.AckOrBuilder getAckOrBuilder();

  public io.eigr.astreu.protocol.Message.DataCase getDataCase();
}

package com.android.framework.protobuf;

public interface Parser<MessageType extends java.lang.Object> {
    public MessageType parseFrom(com.android.framework.protobuf.CodedInputStream p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(com.android.framework.protobuf.CodedInputStream p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(java.nio.ByteBuffer p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(java.nio.ByteBuffer p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(com.android.framework.protobuf.ByteString p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(com.android.framework.protobuf.ByteString p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(byte[] p0, int p1, int p2, com.android.framework.protobuf.ExtensionRegistryLite p3) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(byte[] p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(byte[] p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(byte[] p0, int p1, int p2, com.android.framework.protobuf.ExtensionRegistryLite p3) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(byte[] p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(byte[] p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(java.io.InputStream p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(java.io.InputStream p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseDelimitedFrom(java.io.InputStream p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parseDelimitedFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialDelimitedFrom(java.io.InputStream p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
    public MessageType parsePartialDelimitedFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
}

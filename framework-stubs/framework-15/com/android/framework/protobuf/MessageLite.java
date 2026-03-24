package com.android.framework.protobuf;

public interface MessageLite extends com.android.framework.protobuf.MessageLiteOrBuilder {
    public void writeTo(com.android.framework.protobuf.CodedOutputStream p0) throws java.io.IOException;
    public int getSerializedSize();
    public com.android.framework.protobuf.Parser<? extends com.android.framework.protobuf.MessageLite> getParserForType();
    public com.android.framework.protobuf.ByteString toByteString();
    public byte[] toByteArray();
    public void writeTo(java.io.OutputStream p0) throws java.io.IOException;
    public void writeDelimitedTo(java.io.OutputStream p0) throws java.io.IOException;
    public com.android.framework.protobuf.MessageLite.Builder newBuilderForType();
    public com.android.framework.protobuf.MessageLite.Builder toBuilder();

    public static interface Builder extends com.android.framework.protobuf.MessageLiteOrBuilder, java.lang.Cloneable {
        public com.android.framework.protobuf.MessageLite.Builder clear();
        public com.android.framework.protobuf.MessageLite build();
        public com.android.framework.protobuf.MessageLite buildPartial();
        public com.android.framework.protobuf.MessageLite.Builder clone();
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(com.android.framework.protobuf.CodedInputStream p0) throws java.io.IOException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(com.android.framework.protobuf.CodedInputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(com.android.framework.protobuf.ByteString p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(com.android.framework.protobuf.ByteString p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(byte[] p0) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(byte[] p0, int p1, int p2) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(byte[] p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(byte[] p0, int p1, int p2, com.android.framework.protobuf.ExtensionRegistryLite p3) throws com.android.framework.protobuf.InvalidProtocolBufferException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream p0) throws java.io.IOException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
        public com.android.framework.protobuf.MessageLite.Builder mergeFrom(com.android.framework.protobuf.MessageLite p0);
        public boolean mergeDelimitedFrom(java.io.InputStream p0) throws java.io.IOException;
        public boolean mergeDelimitedFrom(java.io.InputStream p0, com.android.framework.protobuf.ExtensionRegistryLite p1) throws java.io.IOException;
    }
}

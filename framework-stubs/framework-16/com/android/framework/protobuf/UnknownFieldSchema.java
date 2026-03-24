package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
abstract class UnknownFieldSchema<T extends java.lang.Object, B extends java.lang.Object> {
    UnknownFieldSchema() {}
    abstract boolean shouldDiscardUnknownFields(com.android.framework.protobuf.Reader p0);
    abstract void addVarint(B p0, int p1, long p2);
    abstract void addFixed32(B p0, int p1, int p2);
    abstract void addFixed64(B p0, int p1, long p2);
    abstract void addLengthDelimited(B p0, int p1, com.android.framework.protobuf.ByteString p2);
    abstract void addGroup(B p0, int p1, T p2);
    abstract B newBuilder();
    abstract T toImmutable(B p0);
    abstract void setToMessage(java.lang.Object p0, T p1);
    abstract T getFromMessage(java.lang.Object p0);
    abstract B getBuilderFromMessage(java.lang.Object p0);
    abstract void setBuilderToMessage(java.lang.Object p0, B p1);
    abstract void makeImmutable(java.lang.Object p0);
    final boolean mergeOneFieldFrom(B p0, com.android.framework.protobuf.Reader p1) throws java.io.IOException { return false; }
    final void mergeFrom(B p0, com.android.framework.protobuf.Reader p1) throws java.io.IOException {}
    abstract void writeTo(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException;
    abstract void writeAsMessageSetTo(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException;
    abstract T merge(T p0, T p1);
    abstract int getSerializedSizeAsMessageSet(T p0);
    abstract int getSerializedSize(T p0);
}

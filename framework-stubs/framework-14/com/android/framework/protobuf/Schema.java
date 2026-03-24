package com.android.framework.protobuf;

@com.android.framework.protobuf.CheckReturnValue
interface Schema<T extends java.lang.Object> {
    public void writeTo(T p0, com.android.framework.protobuf.Writer p1) throws java.io.IOException;
    public void mergeFrom(T p0, com.android.framework.protobuf.Reader p1, com.android.framework.protobuf.ExtensionRegistryLite p2) throws java.io.IOException;
    public void mergeFrom(T p0, byte[] p1, int p2, int p3, com.android.framework.protobuf.ArrayDecoders.Registers p4) throws java.io.IOException;
    public void makeImmutable(T p0);
    public boolean isInitialized(T p0);
    public T newInstance();
    public boolean equals(T p0, T p1);
    public int hashCode(T p0);
    public void mergeFrom(T p0, T p1);
    public int getSerializedSize(T p0);
}

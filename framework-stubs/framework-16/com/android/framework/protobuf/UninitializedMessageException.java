package com.android.framework.protobuf;

public class UninitializedMessageException extends java.lang.RuntimeException {
    public UninitializedMessageException(com.android.framework.protobuf.MessageLite p0) { super(); }
    public UninitializedMessageException(java.util.List<java.lang.String> p0) { super(); }
    public java.util.List<java.lang.String> getMissingFields() { return null; }
    public com.android.framework.protobuf.InvalidProtocolBufferException asInvalidProtocolBufferException() { return null; }
}

package com.android.framework.protobuf;

public class InvalidProtocolBufferException extends java.io.IOException {
    public InvalidProtocolBufferException(java.lang.String p0) { super(); }
    public InvalidProtocolBufferException(java.lang.Exception p0) { super(); }
    public InvalidProtocolBufferException(java.lang.String p0, java.lang.Exception p1) { super(); }
    public InvalidProtocolBufferException(java.io.IOException p0) { super(); }
    public InvalidProtocolBufferException(java.lang.String p0, java.io.IOException p1) { super(); }
    public com.android.framework.protobuf.InvalidProtocolBufferException setUnfinishedMessage(com.android.framework.protobuf.MessageLite p0) { return null; }
    public com.android.framework.protobuf.MessageLite getUnfinishedMessage() { return null; }
    void setThrownFromInputStream() {}
    boolean getThrownFromInputStream() { return false; }
    public java.io.IOException unwrapIOException() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException truncatedMessage() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException negativeSize() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException malformedVarint() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException invalidTag() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException invalidEndTag() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException.InvalidWireTypeException invalidWireType() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException recursionLimitExceeded() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException sizeLimitExceeded() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException parseFailure() { return null; }
    static com.android.framework.protobuf.InvalidProtocolBufferException invalidUtf8() { return null; }

    public static class InvalidWireTypeException extends com.android.framework.protobuf.InvalidProtocolBufferException {
        public InvalidWireTypeException(java.lang.String p0) { super((java.lang.String)null); }
    }
}

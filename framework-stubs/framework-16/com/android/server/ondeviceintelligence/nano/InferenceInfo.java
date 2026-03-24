package com.android.server.ondeviceintelligence.nano;

public final class InferenceInfo extends com.android.framework.protobuf.nano.MessageNano {
    public int uid;
    public long startTimeMs;
    public long endTimeMs;
    public long suspendedTimeMs;
    public static com.android.server.ondeviceintelligence.nano.InferenceInfo[] emptyArray() { return null; }
    public InferenceInfo() { super(); }
    public com.android.server.ondeviceintelligence.nano.InferenceInfo clear() { return null; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    protected int computeSerializedSize() { return 0; }
    public com.android.server.ondeviceintelligence.nano.InferenceInfo mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public static com.android.server.ondeviceintelligence.nano.InferenceInfo parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public static com.android.server.ondeviceintelligence.nano.InferenceInfo parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
}

package com.android.server.criticalevents.nano;

public final class CriticalEventLogProto extends com.android.framework.protobuf.nano.MessageNano {
    public long timestampMs;
    public int windowMs;
    public int capacity;
    public com.android.server.criticalevents.nano.CriticalEventProto[] events;
    public static com.android.server.criticalevents.nano.CriticalEventLogProto[] emptyArray() { return null; }
    public CriticalEventLogProto() { super(); }
    public com.android.server.criticalevents.nano.CriticalEventLogProto clear() { return null; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    protected int computeSerializedSize() { return 0; }
    public com.android.server.criticalevents.nano.CriticalEventLogProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventLogProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventLogProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
}

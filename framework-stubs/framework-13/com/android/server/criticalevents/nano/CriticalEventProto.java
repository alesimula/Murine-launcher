package com.android.server.criticalevents.nano;

public final class CriticalEventProto extends com.android.framework.protobuf.nano.MessageNano {
    public static final int PROCESS_CLASS_UNKNOWN = 0;
    public static final int DATA_APP = 1;
    public static final int SYSTEM_APP = 2;
    public static final int SYSTEM_SERVER = 3;
    public static final int WATCHDOG_FIELD_NUMBER = 2;
    public static final int HALF_WATCHDOG_FIELD_NUMBER = 3;
    public static final int ANR_FIELD_NUMBER = 4;
    public static final int JAVA_CRASH_FIELD_NUMBER = 5;
    public static final int NATIVE_CRASH_FIELD_NUMBER = 6;
    public long timestampMs;
    public int getEventCase() { return 0; }
    public com.android.server.criticalevents.nano.CriticalEventProto clearEvent() { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventProto[] emptyArray() { return null; }
    public boolean hasWatchdog() { return false; }
    public com.android.server.criticalevents.nano.CriticalEventProto.Watchdog getWatchdog() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setWatchdog(com.android.server.criticalevents.nano.CriticalEventProto.Watchdog p0) { return null; }
    public boolean hasHalfWatchdog() { return false; }
    public com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog getHalfWatchdog() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setHalfWatchdog(com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog p0) { return null; }
    public boolean hasAnr() { return false; }
    public com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding getAnr() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setAnr(com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding p0) { return null; }
    public boolean hasJavaCrash() { return false; }
    public com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash getJavaCrash() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setJavaCrash(com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash p0) { return null; }
    public boolean hasNativeCrash() { return false; }
    public com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash getNativeCrash() { return null; }
    public com.android.server.criticalevents.nano.CriticalEventProto setNativeCrash(com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash p0) { return null; }
    public CriticalEventProto() { super(); }
    public com.android.server.criticalevents.nano.CriticalEventProto clear() { return null; }
    public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
    protected int computeSerializedSize() { return 0; }
    public com.android.server.criticalevents.nano.CriticalEventProto mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventProto parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
    public static com.android.server.criticalevents.nano.CriticalEventProto parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }

    public static final class AppNotResponding extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String subject;
        public java.lang.String process;
        public int pid;
        public int uid;
        public int processClass;
        public static com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding[] emptyArray() { return null; }
        public AppNotResponding() { super(); }
        public com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.AppNotResponding parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class HalfWatchdog extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String subject;
        public static com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog[] emptyArray() { return null; }
        public HalfWatchdog() { super(); }
        public com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.HalfWatchdog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class JavaCrash extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String exceptionClass;
        public java.lang.String process;
        public int pid;
        public int uid;
        public int processClass;
        public static com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash[] emptyArray() { return null; }
        public JavaCrash() { super(); }
        public com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.JavaCrash parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class NativeCrash extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String process;
        public int pid;
        public int uid;
        public int processClass;
        public static com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash[] emptyArray() { return null; }
        public NativeCrash() { super(); }
        public com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.NativeCrash parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }

    public static final class Watchdog extends com.android.framework.protobuf.nano.MessageNano {
        public java.lang.String subject;
        public java.lang.String uuid;
        public static com.android.server.criticalevents.nano.CriticalEventProto.Watchdog[] emptyArray() { return null; }
        public Watchdog() { super(); }
        public com.android.server.criticalevents.nano.CriticalEventProto.Watchdog clear() { return null; }
        public void writeTo(com.android.framework.protobuf.nano.CodedOutputByteBufferNano p0) throws java.io.IOException {}
        protected int computeSerializedSize() { return 0; }
        public com.android.server.criticalevents.nano.CriticalEventProto.Watchdog mergeFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.Watchdog parseFrom(byte[] p0) throws com.android.framework.protobuf.nano.InvalidProtocolBufferNanoException { return null; }
        public static com.android.server.criticalevents.nano.CriticalEventProto.Watchdog parseFrom(com.android.framework.protobuf.nano.CodedInputByteBufferNano p0) throws java.io.IOException { return null; }
    }
}

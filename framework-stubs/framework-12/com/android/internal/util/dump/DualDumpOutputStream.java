package com.android.internal.util.dump;

public class DualDumpOutputStream {
    private static final java.lang.String LOG_TAG = null;
    private final android.util.proto.ProtoOutputStream mProtoStream = null;
    private final android.util.IndentingPrintWriter mIpw = null;
    private final java.util.LinkedList<com.android.internal.util.dump.DualDumpOutputStream.DumpObject> mDumpObjects = null;
    public DualDumpOutputStream(android.util.proto.ProtoOutputStream p0) {}
    public DualDumpOutputStream(android.util.IndentingPrintWriter p0) {}
    public void write(java.lang.String p0, long p1, double p2) {}
    public void write(java.lang.String p0, long p1, boolean p2) {}
    public void write(java.lang.String p0, long p1, int p2) {}
    public void write(java.lang.String p0, long p1, float p2) {}
    public void write(java.lang.String p0, long p1, byte[] p2) {}
    public void write(java.lang.String p0, long p1, long p2) {}
    public void write(java.lang.String p0, long p1, java.lang.String p2) {}
    public long start(java.lang.String p0, long p1) { return 0L; }
    public void end(long p0) {}
    public void flush() {}
    public void writeNested(java.lang.String p0, byte[] p1) {}
    public boolean isProto() { return false; }

    private static class DumpField extends com.android.internal.util.dump.DualDumpOutputStream.Dumpable {
        private final java.lang.String mValue = null;
        private DumpField(java.lang.String p0, java.lang.String p1) { super(null); }
        void print(android.util.IndentingPrintWriter p0, boolean p1) {}
    }

    private static class DumpObject extends com.android.internal.util.dump.DualDumpOutputStream.Dumpable {
        private final java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<com.android.internal.util.dump.DualDumpOutputStream.Dumpable>> mSubObjects = null;
        private DumpObject(java.lang.String p0) { super(null); }
        void print(android.util.IndentingPrintWriter p0, boolean p1) {}
        public void add(java.lang.String p0, com.android.internal.util.dump.DualDumpOutputStream.Dumpable p1) {}
    }

    private static abstract class Dumpable {
        final java.lang.String name = null;
        private Dumpable(java.lang.String p0) {}
        abstract void print(android.util.IndentingPrintWriter p0, boolean p1);
    }
}

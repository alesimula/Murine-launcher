package android.util.proto;

public final class ProtoOutputStream extends android.util.proto.ProtoStream {
    public static final java.lang.String TAG = "ProtoOutputStream";
    public ProtoOutputStream() { super(); }
    public ProtoOutputStream(int p0) { super(); }
    public ProtoOutputStream(java.io.OutputStream p0) { super(); }
    public ProtoOutputStream(java.io.FileDescriptor p0) { super(); }
    public int getRawSize() { return 0; }
    public void write(long p0, double p1) {}
    public void write(long p0, float p1) {}
    public void write(long p0, int p1) {}
    public void write(long p0, long p1) {}
    public void write(long p0, boolean p1) {}
    public void write(long p0, java.lang.String p1) {}
    public void write(long p0, byte[] p1) {}
    public long start(long p0) { return 0L; }
    public void end(long p0) {}
    @java.lang.Deprecated
    public void writeDouble(long p0, double p1) {}
    @java.lang.Deprecated
    public void writeRepeatedDouble(long p0, double p1) {}
    @java.lang.Deprecated
    public void writePackedDouble(long p0, double[] p1) {}
    @java.lang.Deprecated
    public void writeFloat(long p0, float p1) {}
    @java.lang.Deprecated
    public void writeRepeatedFloat(long p0, float p1) {}
    @java.lang.Deprecated
    public void writePackedFloat(long p0, float[] p1) {}
    @java.lang.Deprecated
    public void writeInt32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedInt32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedInt32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeInt64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedInt64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedInt64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeUInt32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedUInt32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedUInt32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeUInt64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedUInt64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedUInt64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeSInt32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSInt32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedSInt32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeSInt64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSInt64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedSInt64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeFixed32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedFixed32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedFixed32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeFixed64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedFixed64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedFixed64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeSFixed32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSFixed32(long p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedSFixed32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeSFixed64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSFixed64(long p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedSFixed64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeBool(long p0, boolean p1) {}
    @java.lang.Deprecated
    public void writeRepeatedBool(long p0, boolean p1) {}
    @java.lang.Deprecated
    public void writePackedBool(long p0, boolean[] p1) {}
    @java.lang.Deprecated
    public void writeString(long p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void writeRepeatedString(long p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void writeBytes(long p0, byte[] p1) {}
    @java.lang.Deprecated
    public void writeRepeatedBytes(long p0, byte[] p1) {}
    @java.lang.Deprecated
    public void writeEnum(long p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedEnum(long p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedEnum(long p0, int[] p1) {}
    @java.lang.Deprecated
    public long startObject(long p0) { return 0L; }
    @java.lang.Deprecated
    public void endObject(long p0) {}
    @java.lang.Deprecated
    public long startRepeatedObject(long p0) { return 0L; }
    @java.lang.Deprecated
    public void endRepeatedObject(long p0) {}
    @java.lang.Deprecated
    public void writeObject(long p0, byte[] p1) {}
    void writeObjectImpl(int p0, byte[] p1) {}
    @java.lang.Deprecated
    public void writeRepeatedObject(long p0, byte[] p1) {}
    void writeRepeatedObjectImpl(int p0, byte[] p1) {}
    public static long makeFieldId(int p0, long p1) { return 0L; }
    public static int checkFieldId(long p0, long p1) { return 0; }
    public void writeTag(int p0, int p1) {}
    public byte[] getBytes() { return null; }
    public void flush() {}
    public void dump(java.lang.String p0) {}
}

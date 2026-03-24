package android.util.proto;

public final class ProtoOutputStream extends android.util.proto.ProtoStream {
    public static final java.lang.String TAG = "ProtoOutputStream";
    private android.util.proto.EncodedBuffer mBuffer;
    private java.io.OutputStream mStream;
    private int mDepth;
    private int mNextObjectId;
    private long mExpectedObjectToken;
    private int mCopyBegin;
    private boolean mCompacted;
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
    private void writeDoubleImpl(int p0, double p1) {}
    @java.lang.Deprecated
    public void writeRepeatedDouble(long p0, double p1) {}
    private void writeRepeatedDoubleImpl(int p0, double p1) {}
    @java.lang.Deprecated
    public void writePackedDouble(long p0, double[] p1) {}
    @java.lang.Deprecated
    public void writeFloat(long p0, float p1) {}
    private void writeFloatImpl(int p0, float p1) {}
    @java.lang.Deprecated
    public void writeRepeatedFloat(long p0, float p1) {}
    private void writeRepeatedFloatImpl(int p0, float p1) {}
    @java.lang.Deprecated
    public void writePackedFloat(long p0, float[] p1) {}
    private void writeUnsignedVarintFromSignedInt(int p0) {}
    @java.lang.Deprecated
    public void writeInt32(long p0, int p1) {}
    private void writeInt32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedInt32(long p0, int p1) {}
    private void writeRepeatedInt32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedInt32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeInt64(long p0, long p1) {}
    private void writeInt64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedInt64(long p0, long p1) {}
    private void writeRepeatedInt64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedInt64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeUInt32(long p0, int p1) {}
    private void writeUInt32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedUInt32(long p0, int p1) {}
    private void writeRepeatedUInt32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedUInt32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeUInt64(long p0, long p1) {}
    private void writeUInt64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedUInt64(long p0, long p1) {}
    private void writeRepeatedUInt64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedUInt64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeSInt32(long p0, int p1) {}
    private void writeSInt32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSInt32(long p0, int p1) {}
    private void writeRepeatedSInt32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedSInt32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeSInt64(long p0, long p1) {}
    private void writeSInt64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSInt64(long p0, long p1) {}
    private void writeRepeatedSInt64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedSInt64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeFixed32(long p0, int p1) {}
    private void writeFixed32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedFixed32(long p0, int p1) {}
    private void writeRepeatedFixed32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedFixed32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeFixed64(long p0, long p1) {}
    private void writeFixed64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedFixed64(long p0, long p1) {}
    private void writeRepeatedFixed64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedFixed64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeSFixed32(long p0, int p1) {}
    private void writeSFixed32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSFixed32(long p0, int p1) {}
    private void writeRepeatedSFixed32Impl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writePackedSFixed32(long p0, int[] p1) {}
    @java.lang.Deprecated
    public void writeSFixed64(long p0, long p1) {}
    private void writeSFixed64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writeRepeatedSFixed64(long p0, long p1) {}
    private void writeRepeatedSFixed64Impl(int p0, long p1) {}
    @java.lang.Deprecated
    public void writePackedSFixed64(long p0, long[] p1) {}
    @java.lang.Deprecated
    public void writeBool(long p0, boolean p1) {}
    private void writeBoolImpl(int p0, boolean p1) {}
    @java.lang.Deprecated
    public void writeRepeatedBool(long p0, boolean p1) {}
    private void writeRepeatedBoolImpl(int p0, boolean p1) {}
    @java.lang.Deprecated
    public void writePackedBool(long p0, boolean[] p1) {}
    @java.lang.Deprecated
    public void writeString(long p0, java.lang.String p1) {}
    private void writeStringImpl(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void writeRepeatedString(long p0, java.lang.String p1) {}
    private void writeRepeatedStringImpl(int p0, java.lang.String p1) {}
    private void writeUtf8String(int p0, java.lang.String p1) {}
    @java.lang.Deprecated
    public void writeBytes(long p0, byte[] p1) {}
    private void writeBytesImpl(int p0, byte[] p1) {}
    @java.lang.Deprecated
    public void writeRepeatedBytes(long p0, byte[] p1) {}
    private void writeRepeatedBytesImpl(int p0, byte[] p1) {}
    @java.lang.Deprecated
    public void writeEnum(long p0, int p1) {}
    private void writeEnumImpl(int p0, int p1) {}
    @java.lang.Deprecated
    public void writeRepeatedEnum(long p0, int p1) {}
    private void writeRepeatedEnumImpl(int p0, int p1) {}
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
    private long startObjectImpl(int p0, boolean p1) { return 0L; }
    private void endObjectImpl(long p0, boolean p1) {}
    @java.lang.Deprecated
    public void writeObject(long p0, byte[] p1) {}
    void writeObjectImpl(int p0, byte[] p1) {}
    @java.lang.Deprecated
    public void writeRepeatedObject(long p0, byte[] p1) {}
    void writeRepeatedObjectImpl(int p0, byte[] p1) {}
    public static long makeFieldId(int p0, long p1) { return 0L; }
    public static int checkFieldId(long p0, long p1) { return 0; }
    private static int getTagSize(int p0) { return 0; }
    public void writeTag(int p0, int p1) {}
    private void writeKnownLengthHeader(int p0, int p1) {}
    private void assertNotCompacted() {}
    public byte[] getBytes() { return null; }
    private void compactIfNecessary() {}
    private int editEncodedSize(int p0) { return 0; }
    private void compactSizes(int p0) {}
    public void flush() {}
    private int readRawTag() { return 0; }
    public void dump(java.lang.String p0) {}
}

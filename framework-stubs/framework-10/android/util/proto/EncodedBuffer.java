package android.util.proto;

public final class EncodedBuffer {
    private static final java.lang.String TAG = "EncodedBuffer";
    private final java.util.ArrayList<byte[]> mBuffers = null;
    private final int mChunkSize = 0;
    private int mBufferCount;
    private byte[] mWriteBuffer;
    private int mWriteIndex;
    private int mWriteBufIndex;
    private byte[] mReadBuffer;
    private int mReadBufIndex;
    private int mReadIndex;
    private int mReadLimit;
    private int mReadableSize;
    public EncodedBuffer() {}
    public EncodedBuffer(int p0) {}
    public void startEditing() {}
    public void rewindRead() {}
    public int getReadableSize() { return 0; }
    public int getSize() { return 0; }
    public int getReadPos() { return 0; }
    public void skipRead(int p0) {}
    public byte readRawByte() { return 0; }
    public long readRawUnsigned() { return 0L; }
    public int readRawFixed32() { return 0; }
    private void nextWriteBuffer() {}
    public void writeRawByte(byte p0) {}
    public static int getRawVarint32Size(int p0) { return 0; }
    public void writeRawVarint32(int p0) {}
    public static int getRawZigZag32Size(int p0) { return 0; }
    public void writeRawZigZag32(int p0) {}
    public static int getRawVarint64Size(long p0) { return 0; }
    public void writeRawVarint64(long p0) {}
    public static int getRawZigZag64Size(long p0) { return 0; }
    public void writeRawZigZag64(long p0) {}
    public void writeRawFixed32(int p0) {}
    public void writeRawFixed64(long p0) {}
    public void writeRawBuffer(byte[] p0) {}
    public void writeRawBuffer(byte[] p0, int p1, int p2) {}
    public void writeFromThisBuffer(int p0, int p1) {}
    public int getWritePos() { return 0; }
    public void rewindWriteTo(int p0) {}
    public int getRawFixed32At(int p0) { return 0; }
    public void editRawFixed32(int p0, int p1) {}
    private static int zigZag32(int p0) { return 0; }
    private static long zigZag64(long p0) { return 0L; }
    public byte[] getBytes(int p0) { return null; }
    public int getChunkCount() { return 0; }
    public int getWriteIndex() { return 0; }
    public int getWriteBufIndex() { return 0; }
    public java.lang.String getDebugString() { return null; }
    public void dumpBuffers(java.lang.String p0) {}
    public static void dumpByteString(java.lang.String p0, java.lang.String p1, byte[] p2) {}
    private static int dumpByteString(java.lang.String p0, java.lang.String p1, int p2, byte[] p3) { return 0; }
}

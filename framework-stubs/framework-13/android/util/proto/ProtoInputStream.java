package android.util.proto;

public final class ProtoInputStream extends android.util.proto.ProtoStream {
    public static final int NO_MORE_FIELDS = -1;
    public ProtoInputStream(java.io.InputStream p0, int p1) { super(); }
    public ProtoInputStream(java.io.InputStream p0) { super(); }
    public ProtoInputStream(byte[] p0) { super(); }
    public int getFieldNumber() { return 0; }
    public int getWireType() { return 0; }
    public int getOffset() { return 0; }
    public int nextField() throws java.io.IOException { return 0; }
    public boolean nextField(long p0) throws java.io.IOException { return false; }
    public double readDouble(long p0) throws java.io.IOException { return 0.0; }
    public float readFloat(long p0) throws java.io.IOException { return 0.0f; }
    public int readInt(long p0) throws java.io.IOException { return 0; }
    public long readLong(long p0) throws java.io.IOException { return 0L; }
    public boolean readBoolean(long p0) throws java.io.IOException { return false; }
    public java.lang.String readString(long p0) throws java.io.IOException { return null; }
    public byte[] readBytes(long p0) throws java.io.IOException { return null; }
    public long start(long p0) throws java.io.IOException { return 0L; }
    public void end(long p0) {}
    public int decodeZigZag32(int p0) { return 0; }
    public long decodeZigZag64(long p0) { return 0L; }
    public void skip() throws java.io.IOException {}
    public java.lang.String dumpDebugData() { return null; }
}

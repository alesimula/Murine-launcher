package android.net.wifi.aware;

public class TlvBufferUtils {
    private TlvBufferUtils() {}
    public static boolean isValid(byte[] p0, int p1, int p2) { return false; }
    public static boolean isValidEndian(byte[] p0, int p1, int p2, java.nio.ByteOrder p3) { return false; }

    public static class TlvIterable implements java.lang.Iterable<android.net.wifi.aware.TlvBufferUtils.TlvElement> {
        private int mTypeSize;
        private int mLengthSize;
        private java.nio.ByteOrder mByteOrder;
        private byte[] mArray;
        private int mArrayLength;
        public TlvIterable(int p0, int p1, byte[] p2) {}
        public void setByteOrder(java.nio.ByteOrder p0) {}
        public java.lang.String toString() { return null; }
        public java.util.List<byte[]> toList() { return null; }
        public java.util.Iterator<android.net.wifi.aware.TlvBufferUtils.TlvElement> iterator() { return null; }
    }

    public static class TlvElement {
        public int type;
        public int length;
        public java.nio.ByteOrder byteOrder;
        private byte[] mRefArray;
        public int offset;
        private TlvElement(int p0, int p1, byte[] p2, int p3) {}
        public byte[] getRawData() { return null; }
        public byte getByte() { return 0; }
        public short getShort() { return 0; }
        public int getInt() { return 0; }
        public java.lang.String getString() { return null; }
    }

    public static class TlvConstructor {
        private int mTypeSize;
        private int mLengthSize;
        private java.nio.ByteOrder mByteOrder;
        private byte[] mArray;
        private int mArrayLength;
        private int mPosition;
        public TlvConstructor(int p0, int p1) {}
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor setByteOrder(java.nio.ByteOrder p0) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor wrap(byte[] p0) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor allocate(int p0) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor allocateAndPut(java.util.List<byte[]> p0) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putByte(int p0, byte p1) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putRawByte(byte p0) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putByteArray(int p0, byte[] p1, int p2, int p3) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putByteArray(int p0, byte[] p1) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putRawByteArray(byte[] p0) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putZeroLengthElement(int p0) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putShort(int p0, short p1) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putInt(int p0, int p1) { return null; }
        public android.net.wifi.aware.TlvBufferUtils.TlvConstructor putString(int p0, java.lang.String p1) { return null; }
        public byte[] getArray() { return null; }
        private int getActualLength() { return 0; }
        private void checkLength(int p0) {}
        private void checkRawLength(int p0) {}
        private void addHeader(int p0, int p1) {}
    }
}

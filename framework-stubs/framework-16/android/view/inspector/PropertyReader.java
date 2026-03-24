package android.view.inspector;

public interface PropertyReader {
    public void readBoolean(int p0, boolean p1);
    public void readByte(int p0, byte p1);
    public void readChar(int p0, char p1);
    public void readDouble(int p0, double p1);
    public void readFloat(int p0, float p1);
    public void readInt(int p0, int p1);
    public void readLong(int p0, long p1);
    public void readShort(int p0, short p1);
    public void readObject(int p0, java.lang.Object p1);
    public void readColor(int p0, int p1);
    public void readColor(int p0, long p1);
    public void readColor(int p0, android.graphics.Color p1);
    public void readGravity(int p0, int p1);
    public void readIntEnum(int p0, int p1);
    public void readIntFlag(int p0, int p1);
    public void readResourceId(int p0, int p1);

    public static class PropertyTypeMismatchException extends java.lang.RuntimeException {
        public PropertyTypeMismatchException(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { super(); }
        public PropertyTypeMismatchException(int p0, java.lang.String p1, java.lang.String p2) { super(); }
    }
}

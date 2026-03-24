package android.database;

public abstract class AbstractWindowedCursor extends android.database.AbstractCursor {
    protected android.database.CursorWindow mWindow;
    public AbstractWindowedCursor() { super(); }
    public byte[] getBlob(int p0) { return null; }
    public java.lang.String getString(int p0) { return null; }
    public void copyStringToBuffer(int p0, android.database.CharArrayBuffer p1) {}
    public short getShort(int p0) { return 0; }
    public int getInt(int p0) { return 0; }
    public long getLong(int p0) { return 0L; }
    public float getFloat(int p0) { return 0.0f; }
    public double getDouble(int p0) { return 0.0; }
    public boolean isNull(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isBlob(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isString(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isLong(int p0) { return false; }
    @java.lang.Deprecated
    public boolean isFloat(int p0) { return false; }
    public int getType(int p0) { return 0; }
    protected void checkPosition() {}
    public android.database.CursorWindow getWindow() { return null; }
    public void setWindow(android.database.CursorWindow p0) {}
    public boolean hasWindow() { return false; }
    protected void closeWindow() {}
    protected void clearOrCreateWindow(java.lang.String p0) {}
    protected void onDeactivateOrClose() {}
}

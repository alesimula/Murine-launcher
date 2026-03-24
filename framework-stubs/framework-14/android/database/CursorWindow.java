package android.database;

public class CursorWindow extends android.database.sqlite.SQLiteClosable implements android.os.Parcelable {
    public long mWindowPtr;
    public static final android.os.Parcelable.Creator<android.database.CursorWindow> CREATOR = null;
    public CursorWindow(java.lang.String p0) { super(); }
    public CursorWindow(java.lang.String p0, long p1) { super(); }
    @java.lang.Deprecated
    public CursorWindow(boolean p0) { super(); }
    protected void finalize() throws java.lang.Throwable {}
    public java.lang.String getName() { return null; }
    public void clear() {}
    public int getStartPosition() { return 0; }
    public void setStartPosition(int p0) {}
    public int getNumRows() { return 0; }
    public boolean setNumColumns(int p0) { return false; }
    public boolean allocRow() { return false; }
    public void freeLastRow() {}
    @java.lang.Deprecated
    public boolean isNull(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isBlob(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isLong(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isFloat(int p0, int p1) { return false; }
    @java.lang.Deprecated
    public boolean isString(int p0, int p1) { return false; }
    public int getType(int p0, int p1) { return 0; }
    public byte[] getBlob(int p0, int p1) { return null; }
    public java.lang.String getString(int p0, int p1) { return null; }
    public void copyStringToBuffer(int p0, int p1, android.database.CharArrayBuffer p2) {}
    public long getLong(int p0, int p1) { return 0L; }
    public double getDouble(int p0, int p1) { return 0.0; }
    public short getShort(int p0, int p1) { return 0; }
    public int getInt(int p0, int p1) { return 0; }
    public float getFloat(int p0, int p1) { return 0.0f; }
    public boolean putBlob(byte[] p0, int p1, int p2) { return false; }
    public boolean putString(java.lang.String p0, int p1, int p2) { return false; }
    public boolean putLong(long p0, int p1, int p2) { return false; }
    public boolean putDouble(double p0, int p1, int p2) { return false; }
    public boolean putNull(int p0, int p1) { return false; }
    public static android.database.CursorWindow newFromParcel(android.os.Parcel p0) { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    protected void onAllReferencesReleased() {}
    public java.lang.String toString() { return null; }
}

package android.database;

public final class BulkCursorDescriptor implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.database.BulkCursorDescriptor> CREATOR = null;
    public android.database.IBulkCursor cursor;
    public java.lang.String[] columnNames;
    public boolean wantsAllOnMoveCalls;
    public int count;
    public android.database.CursorWindow window;
    public BulkCursorDescriptor() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
}

package android.media.tv;

public final class TableRequest extends android.media.tv.BroadcastInfoRequest implements android.os.Parcelable {
    public static final int TABLE_NAME_PAT = 0;
    public static final int TABLE_NAME_PMT = 1;
    public static final android.os.Parcelable.Creator<android.media.tv.TableRequest> CREATOR = null;
    static android.media.tv.TableRequest createFromParcelBody(android.os.Parcel p0) { return null; }
    public TableRequest(int p0, int p1, int p2, int p3, int p4) { super(0, (android.os.Parcel)null); }
    TableRequest(android.os.Parcel p0) { super(0, (android.os.Parcel)null); }
    public int getTableId() { return 0; }
    public int getTableName() { return 0; }
    public int getVersion() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TableName {
    }
}

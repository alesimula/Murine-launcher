package android.health.connect.accesslog;

public final class AccessLog implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.health.connect.accesslog.AccessLog> CREATOR = null;
    AccessLog() {}
    @android.annotation.NonNull
    public java.util.List<java.lang.Class<? extends android.health.connect.datatypes.Record>> getRecordTypes() { return null; }
    @android.annotation.NonNull
    public java.lang.String getPackageName() { return null; }
    @android.annotation.NonNull
    public java.time.Instant getAccessTime() { return null; }
    public int getOperationType() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class OperationType {
        public static final int OPERATION_TYPE_DELETE = 1;
        public static final int OPERATION_TYPE_READ = 2;
        public static final int OPERATION_TYPE_UPSERT = 0;
        OperationType() {}
    }
}

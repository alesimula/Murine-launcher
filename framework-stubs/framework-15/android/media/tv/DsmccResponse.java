package android.media.tv;

public final class DsmccResponse extends android.media.tv.BroadcastInfoResponse implements android.os.Parcelable {
    public static final java.lang.String BIOP_MESSAGE_TYPE_DIRECTORY = "directory";
    public static final java.lang.String BIOP_MESSAGE_TYPE_FILE = "file";
    public static final java.lang.String BIOP_MESSAGE_TYPE_STREAM = "stream";
    public static final java.lang.String BIOP_MESSAGE_TYPE_SERVICE_GATEWAY = "service_gateway";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.tv.DsmccResponse> CREATOR = null;
    static android.media.tv.DsmccResponse createFromParcelBody(android.os.Parcel p0) { return null; }
    public DsmccResponse(int p0, int p1, int p2, android.os.ParcelFileDescriptor p3) { super(0, (android.os.Parcel)null); }
    public DsmccResponse(int p0, int p1, int p2, boolean p3, java.util.List<java.lang.String> p4) { super(0, (android.os.Parcel)null); }
    public DsmccResponse(int p0, int p1, int p2, int[] p3, java.lang.String[] p4) { super(0, (android.os.Parcel)null); }
    @android.annotation.NonNull
    public java.lang.String getBiopMessageType() { return null; }
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor getFile() { return null; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getChildList() { return null; }
    @android.annotation.NonNull
    public int[] getStreamEventIds() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getStreamEventNames() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BiopMessageType {
    }
}

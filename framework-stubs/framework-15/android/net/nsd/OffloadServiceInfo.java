package android.net.nsd;

public final class OffloadServiceInfo implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.nsd.OffloadServiceInfo> CREATOR = null;
    public OffloadServiceInfo(android.net.nsd.OffloadServiceInfo.Key p0, java.util.List<java.lang.String> p1, java.lang.String p2, byte[] p3, int p4, long p5) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getHostname() { return null; }
    @android.annotation.NonNull
    public android.net.nsd.OffloadServiceInfo.Key getKey() { return null; }
    @android.annotation.Nullable
    public byte[] getOffloadPayload() { return null; }
    public long getOffloadType() { return 0L; }
    public int getPriority() { return 0; }
    @android.annotation.NonNull
    public java.util.List<java.lang.String> getSubtypes() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Key implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.nsd.OffloadServiceInfo.Key> CREATOR = null;
        public Key(java.lang.String p0, java.lang.String p1) {}
        public int describeContents() { return 0; }
        @android.annotation.NonNull
        public java.lang.String getServiceName() { return null; }
        @android.annotation.NonNull
        public java.lang.String getServiceType() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

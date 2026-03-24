package android.telephony.mbms;

public final class FileServiceInfo extends android.telephony.mbms.ServiceInfo implements android.os.Parcelable {
    private final java.util.List<android.telephony.mbms.FileInfo> files = null;
    public static final android.os.Parcelable.Creator<android.telephony.mbms.FileServiceInfo> CREATOR = null;
    @android.annotation.SystemApi
    public FileServiceInfo(java.util.Map<java.util.Locale, java.lang.String> p0, java.lang.String p1, java.util.List<java.util.Locale> p2, java.lang.String p3, java.util.Date p4, java.util.Date p5, java.util.List<android.telephony.mbms.FileInfo> p6) { super((android.os.Parcel)null); }
    FileServiceInfo(android.os.Parcel p0) { super((android.os.Parcel)null); }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.util.List<android.telephony.mbms.FileInfo> getFiles() { return null; }
}

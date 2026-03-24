package android.content.pm;

public class ProcessInfo implements android.os.Parcelable {
    public java.lang.String name;
    public android.util.ArraySet<java.lang.String> deniedPermissions;
    public int gwpAsanMode;
    public int memtagMode;
    public int nativeHeapZeroInitialized;
    static com.android.internal.util.Parcelling<android.util.ArraySet<java.lang.String>> sParcellingForDeniedPermissions;
    public static final android.os.Parcelable.Creator<android.content.pm.ProcessInfo> CREATOR = null;
    @java.lang.Deprecated
    public ProcessInfo(android.content.pm.ProcessInfo p0) {}
    public ProcessInfo(java.lang.String p0, android.util.ArraySet<java.lang.String> p1, int p2, int p3, int p4) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected ProcessInfo(android.os.Parcel p0) {}
}

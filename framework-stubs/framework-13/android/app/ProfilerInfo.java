package android.app;

public class ProfilerInfo implements android.os.Parcelable {
    public final java.lang.String profileFile = null;
    public android.os.ParcelFileDescriptor profileFd;
    public final int samplingInterval = 0;
    public final boolean autoStopProfiler = false;
    public final boolean streamingOutput = false;
    public final java.lang.String agent = null;
    public final boolean attachAgentDuringBind = false;
    public static final android.os.Parcelable.Creator<android.app.ProfilerInfo> CREATOR = null;
    public ProfilerInfo(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2, boolean p3, boolean p4, java.lang.String p5, boolean p6) {}
    public ProfilerInfo(android.app.ProfilerInfo p0) {}
    public android.app.ProfilerInfo setAgent(java.lang.String p0, boolean p1) { return null; }
    public void closeFd() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}

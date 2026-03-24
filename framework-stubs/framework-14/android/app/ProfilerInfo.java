package android.app;

public class ProfilerInfo implements android.os.Parcelable {
    public static final int CLOCK_TYPE_DEFAULT = 0;
    public static final int CLOCK_TYPE_WALL = 16;
    public static final int CLOCK_TYPE_THREAD_CPU = 256;
    public static final int CLOCK_TYPE_DUAL = 272;
    public final java.lang.String profileFile = null;
    public android.os.ParcelFileDescriptor profileFd;
    public final int samplingInterval = 0;
    public final boolean autoStopProfiler = false;
    public final boolean streamingOutput = false;
    public final java.lang.String agent = null;
    public final boolean attachAgentDuringBind = false;
    public final int clockType = 0;
    public static final android.os.Parcelable.Creator<android.app.ProfilerInfo> CREATOR = null;
    public ProfilerInfo(java.lang.String p0, android.os.ParcelFileDescriptor p1, int p2, boolean p3, boolean p4, java.lang.String p5, boolean p6, int p7) {}
    public ProfilerInfo(android.app.ProfilerInfo p0) {}
    public static int getClockTypeFromString(java.lang.String p0) { return 0; }
    public android.app.ProfilerInfo setAgent(java.lang.String p0, boolean p1) { return null; }
    public void closeFd() {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}

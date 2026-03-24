package android.app;

public final class ProcessMemoryState implements android.os.Parcelable {
    public static final int HOSTING_COMPONENT_TYPE_EMPTY = 0;
    public static final int HOSTING_COMPONENT_TYPE_SYSTEM = 1;
    public static final int HOSTING_COMPONENT_TYPE_PERSISTENT = 2;
    public static final int HOSTING_COMPONENT_TYPE_BACKUP = 4;
    public static final int HOSTING_COMPONENT_TYPE_INSTRUMENTATION = 8;
    public static final int HOSTING_COMPONENT_TYPE_ACTIVITY = 16;
    public static final int HOSTING_COMPONENT_TYPE_BROADCAST_RECEIVER = 32;
    public static final int HOSTING_COMPONENT_TYPE_PROVIDER = 64;
    public static final int HOSTING_COMPONENT_TYPE_STARTED_SERVICE = 128;
    public static final int HOSTING_COMPONENT_TYPE_FOREGROUND_SERVICE = 256;
    public static final int HOSTING_COMPONENT_TYPE_BOUND_SERVICE = 512;
    public final int uid = 0;
    public final int pid = 0;
    public final java.lang.String processName = null;
    public final int oomScore = 0;
    public final boolean hasForegroundServices = false;
    public final int mHostingComponentTypes = 0;
    public final int mHistoricalHostingComponentTypes = 0;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.ProcessMemoryState> CREATOR = null;
    public ProcessMemoryState(int p0, int p1, java.lang.String p2, int p3, boolean p4, int p5, int p6) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static @interface HostingComponentType {
    }
}

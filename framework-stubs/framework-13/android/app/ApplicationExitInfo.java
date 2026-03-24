package android.app;

public final class ApplicationExitInfo implements android.os.Parcelable {
    public static final int REASON_UNKNOWN = 0;
    public static final int REASON_EXIT_SELF = 1;
    public static final int REASON_SIGNALED = 2;
    public static final int REASON_LOW_MEMORY = 3;
    public static final int REASON_CRASH = 4;
    public static final int REASON_CRASH_NATIVE = 5;
    public static final int REASON_ANR = 6;
    public static final int REASON_INITIALIZATION_FAILURE = 7;
    public static final int REASON_PERMISSION_CHANGE = 8;
    public static final int REASON_EXCESSIVE_RESOURCE_USAGE = 9;
    public static final int REASON_USER_REQUESTED = 10;
    public static final int REASON_USER_STOPPED = 11;
    public static final int REASON_DEPENDENCY_DIED = 12;
    public static final int REASON_OTHER = 13;
    public static final int REASON_FREEZER = 14;
    public static final int SUBREASON_UNKNOWN = 0;
    public static final int SUBREASON_WAIT_FOR_DEBUGGER = 1;
    public static final int SUBREASON_TOO_MANY_CACHED = 2;
    public static final int SUBREASON_TOO_MANY_EMPTY = 3;
    public static final int SUBREASON_TRIM_EMPTY = 4;
    public static final int SUBREASON_LARGE_CACHED = 5;
    public static final int SUBREASON_MEMORY_PRESSURE = 6;
    public static final int SUBREASON_EXCESSIVE_CPU = 7;
    public static final int SUBREASON_SYSTEM_UPDATE_DONE = 8;
    public static final int SUBREASON_KILL_ALL_FG = 9;
    public static final int SUBREASON_KILL_ALL_BG_EXCEPT = 10;
    public static final int SUBREASON_KILL_UID = 11;
    public static final int SUBREASON_KILL_PID = 12;
    public static final int SUBREASON_INVALID_START = 13;
    public static final int SUBREASON_INVALID_STATE = 14;
    public static final int SUBREASON_IMPERCEPTIBLE = 15;
    public static final int SUBREASON_REMOVE_LRU = 16;
    public static final int SUBREASON_ISOLATED_NOT_NEEDED = 17;
    public static final int SUBREASON_CACHED_IDLE_FORCED_APP_STANDBY = 18;
    public static final int SUBREASON_FREEZER_BINDER_IOCTL = 19;
    public static final int SUBREASON_FREEZER_BINDER_TRANSACTION = 20;
    public static final int SUBREASON_FORCE_STOP = 21;
    public static final int SUBREASON_REMOVE_TASK = 22;
    public static final int SUBREASON_STOP_APP = 23;
    public static final int SUBREASON_KILL_BACKGROUND = 24;
    public static final int SUBREASON_PACKAGE_UPDATE = 25;
    public static final int SUBREASON_UNDELIVERED_BROADCAST = 26;
    public static final android.os.Parcelable.Creator<android.app.ApplicationExitInfo> CREATOR = null;
    public int getPid() { return 0; }
    public int getRealUid() { return 0; }
    public int getPackageUid() { return 0; }
    public int getDefiningUid() { return 0; }
    public java.lang.String getProcessName() { return null; }
    public int getReason() { return 0; }
    public int getStatus() { return 0; }
    public int getImportance() { return 0; }
    public long getPss() { return 0L; }
    public long getRss() { return 0L; }
    public long getTimestamp() { return 0L; }
    public java.lang.String getDescription() { return null; }
    public android.os.UserHandle getUserHandle() { return null; }
    public byte[] getProcessStateSummary() { return null; }
    public java.io.InputStream getTraceInputStream() throws java.io.IOException { return null; }
    public java.io.File getTraceFile() { return null; }
    public int getSubReason() { return 0; }
    public int getConnectionGroup() { return 0; }
    public java.lang.String getPackageName() { return null; }
    public java.lang.String[] getPackageList() { return null; }
    public void setPid(int p0) {}
    public void setRealUid(int p0) {}
    public void setPackageUid(int p0) {}
    public void setDefiningUid(int p0) {}
    public void setProcessName(java.lang.String p0) {}
    public void setReason(int p0) {}
    public void setStatus(int p0) {}
    public void setImportance(int p0) {}
    public void setPss(long p0) {}
    public void setRss(long p0) {}
    public void setTimestamp(long p0) {}
    public void setDescription(java.lang.String p0) {}
    public void setSubReason(int p0) {}
    public void setConnectionGroup(int p0) {}
    public void setPackageName(java.lang.String p0) {}
    public void setPackageList(java.lang.String[] p0) {}
    public void setProcessStateSummary(byte[] p0) {}
    public void setTraceFile(java.io.File p0) {}
    public void setAppTraceRetriever(android.app.IAppTraceRetriever p0) {}
    public void setNativeTombstoneRetriever(android.app.IParcelFileDescriptorRetriever p0) {}
    public boolean isLoggedInStatsd() { return false; }
    public void setLoggedInStatsd(boolean p0) {}
    public boolean hasForegroundServices() { return false; }
    public void setHasForegroundServices(boolean p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public ApplicationExitInfo() {}
    public ApplicationExitInfo(android.app.ApplicationExitInfo p0) {}
    public void dump(java.io.PrintWriter p0, java.lang.String p1, java.lang.String p2, android.icu.text.SimpleDateFormat p3) {}
    public java.lang.String toString() { return null; }
    public static java.lang.String reasonCodeToString(int p0) { return null; }
    public static java.lang.String subreasonToString(int p0) { return null; }
    public void writeToProto(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void readFromProto(android.util.proto.ProtoInputStream p0, long p1) throws java.io.IOException, android.util.proto.WireTypeMismatchException {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Reason {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubReason {
    }
}

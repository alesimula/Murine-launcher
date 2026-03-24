package android.app.time;

@android.annotation.SystemApi
public final class UnixEpochTime implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.time.UnixEpochTime> CREATOR = null;
    public UnixEpochTime(long p0, long p1) {}
    public static android.app.time.UnixEpochTime parseCommandLineArgs(android.os.ShellCommand p0) { return null; }
    public static void printCommandLineOpts(java.io.PrintWriter p0) {}
    public long getElapsedRealtimeMillis() { return 0L; }
    public long getUnixEpochTimeMillis() { return 0L; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public android.app.time.UnixEpochTime at(long p0) { return null; }
    public static long elapsedRealtimeDifference(android.app.time.UnixEpochTime p0, android.app.time.UnixEpochTime p1) { return 0L; }
}

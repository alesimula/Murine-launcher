package android.content;

public final class ContentCaptureOptions implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    public final int loggingLevel = 0;
    public final int maxBufferSize = 0;
    public final int idleFlushingFrequencyMs = 0;
    public final int textChangeFlushingFrequencyMs = 0;
    public final int logHistorySize = 0;
    public final android.util.ArraySet<android.content.ComponentName> whitelistedComponents = null;
    public final boolean lite = false;
    public static final android.os.Parcelable.Creator<android.content.ContentCaptureOptions> CREATOR = null;
    public ContentCaptureOptions(int p0) {}
    public ContentCaptureOptions(int p0, int p1, int p2, int p3, int p4, android.util.ArraySet<android.content.ComponentName> p5) {}
    public ContentCaptureOptions(android.util.ArraySet<android.content.ComponentName> p0) {}
    private ContentCaptureOptions(boolean p0, int p1, int p2, int p3, int p4, int p5, android.util.ArraySet<android.content.ComponentName> p6) {}
    public static android.content.ContentCaptureOptions forWhitelistingItself() { return null; }
    public boolean isWhitelisted(android.content.Context p0) { return false; }
    public java.lang.String toString() { return null; }
    public void dumpShort(java.io.PrintWriter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

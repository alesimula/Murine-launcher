package android.content;

public final class ContentCaptureOptions implements android.os.Parcelable {
    public final int loggingLevel = 0;
    public final int maxBufferSize = 0;
    public final int idleFlushingFrequencyMs = 0;
    public final int textChangeFlushingFrequencyMs = 0;
    public final int logHistorySize = 0;
    public final boolean disableFlushForViewTreeAppearing = false;
    public final boolean enableReceiver = false;
    @android.annotation.NonNull
    public final android.content.ContentCaptureOptions.ContentProtectionOptions contentProtectionOptions = null;
    @android.annotation.Nullable
    @android.annotation.SuppressLint("NullableCollection")
    public final android.util.ArraySet<android.content.ComponentName> whitelistedComponents = null;
    public final boolean lite = false;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.ContentCaptureOptions> CREATOR = null;
    public ContentCaptureOptions(int p0) {}
    public ContentCaptureOptions(int p0, int p1, int p2, int p3, int p4, android.util.ArraySet<android.content.ComponentName> p5) {}
    public ContentCaptureOptions(int p0, int p1, int p2, int p3, int p4, boolean p5, boolean p6, android.content.ContentCaptureOptions.ContentProtectionOptions p7, android.util.ArraySet<android.content.ComponentName> p8) {}
    public ContentCaptureOptions(android.util.ArraySet<android.content.ComponentName> p0) {}
    public static android.content.ContentCaptureOptions forWhitelistingItself() { return null; }
    public boolean isWhitelisted(android.content.Context p0) { return false; }
    public java.lang.String toString() { return null; }
    public void dumpShort(java.io.PrintWriter p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static class ContentProtectionOptions {
        public final boolean enableReceiver = false;
        public final int bufferSize = 0;
        @android.annotation.NonNull
        public final java.util.List<java.util.List<java.lang.String>> requiredGroups = null;
        @android.annotation.NonNull
        public final java.util.List<java.util.List<java.lang.String>> optionalGroups = null;
        public final int optionalGroupsThreshold = 0;
        public ContentProtectionOptions() {}
        public ContentProtectionOptions(boolean p0, int p1, java.util.List<java.util.List<java.lang.String>> p2, java.util.List<java.util.List<java.lang.String>> p3, int p4) {}
        public java.lang.String toString() { return null; }
    }
}

package android.view.contentcapture;

public final class ContentCaptureContext implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final int FLAG_DISABLED_BY_APP = 1;
    @android.annotation.SystemApi
    public static final int FLAG_DISABLED_BY_FLAG_SECURE = 2;
    @android.annotation.SystemApi
    public static final int FLAG_RECONNECTED = 4;
    public static final int FLAG_DISABLED_FLUSH_FOR_VIEW_TREE_APPEARING = 8;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.contentcapture.ContentCaptureContext> CREATOR = null;
    public ContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0, android.app.assist.ActivityId p1, android.content.ComponentName p2, int p3, android.os.IBinder p4, int p5) {}
    public ContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0, int p1) {}
    @android.annotation.Nullable
    public android.os.Bundle getExtras() { return null; }
    @android.annotation.Nullable
    public android.content.LocusId getLocusId() { return null; }
    @android.annotation.SystemApi
    public int getTaskId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.content.ComponentName getActivityComponent() { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.app.assist.ActivityId getActivityId() { return null; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.view.contentcapture.ContentCaptureSessionId getParentSessionId() { return null; }
    public void setParentSessionId(int p0) {}
    @android.annotation.SystemApi
    public int getDisplayId() { return 0; }
    @android.annotation.SystemApi
    @android.annotation.Nullable
    public android.os.IBinder getWindowToken() { return null; }
    @android.annotation.SystemApi
    public int getFlags() { return 0; }
    @android.annotation.NonNull
    public static android.view.contentcapture.ContentCaptureContext forLocusId(java.lang.String p0) { return null; }
    public void dump(java.io.PrintWriter p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder(android.content.LocusId p0) {}
        @android.annotation.NonNull
        public android.view.contentcapture.ContentCaptureContext.Builder setExtras(android.os.Bundle p0) { return null; }
        @android.annotation.NonNull
        public android.view.contentcapture.ContentCaptureContext build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContextCreationFlags {
    }
}

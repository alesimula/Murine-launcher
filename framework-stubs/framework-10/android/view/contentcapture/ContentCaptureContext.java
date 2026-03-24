package android.view.contentcapture;

public final class ContentCaptureContext implements android.os.Parcelable {
    @android.annotation.SystemApi
    public static final int FLAG_DISABLED_BY_APP = 1;
    @android.annotation.SystemApi
    public static final int FLAG_DISABLED_BY_FLAG_SECURE = 2;
    @android.annotation.SystemApi
    public static final int FLAG_RECONNECTED = 4;
    private final boolean mHasClientContext = false;
    private final android.os.Bundle mExtras = null;
    private final android.content.LocusId mId = null;
    private final android.content.ComponentName mComponentName = null;
    private final int mTaskId = 0;
    private final int mFlags = 0;
    private final int mDisplayId = 0;
    private int mParentSessionId;
    public static final android.os.Parcelable.Creator<android.view.contentcapture.ContentCaptureContext> CREATOR = null;
    public ContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0, android.content.ComponentName p1, int p2, int p3, int p4) {}
    private ContentCaptureContext(android.view.contentcapture.ContentCaptureContext.Builder p0) {}
    public ContentCaptureContext(android.view.contentcapture.ContentCaptureContext p0, int p1) {}
    public android.os.Bundle getExtras() { return null; }
    public android.content.LocusId getLocusId() { return null; }
    @android.annotation.SystemApi
    public int getTaskId() { return 0; }
    @android.annotation.SystemApi
    public android.content.ComponentName getActivityComponent() { return null; }
    @android.annotation.SystemApi
    public android.view.contentcapture.ContentCaptureSessionId getParentSessionId() { return null; }
    public void setParentSessionId(int p0) {}
    @android.annotation.SystemApi
    public int getDisplayId() { return 0; }
    @android.annotation.SystemApi
    public int getFlags() { return 0; }
    public static android.view.contentcapture.ContentCaptureContext forLocusId(java.lang.String p0) { return null; }
    public void dump(java.io.PrintWriter p0) {}
    private boolean fromServer() { return false; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    static @interface ContextCreationFlags {
    }

    public static final class Builder {
        private android.os.Bundle mExtras;
        private final android.content.LocusId mId = null;
        private boolean mDestroyed;
        public Builder(android.content.LocusId p0) {}
        public android.view.contentcapture.ContentCaptureContext.Builder setExtras(android.os.Bundle p0) { return null; }
        public android.view.contentcapture.ContentCaptureContext build() { return null; }
        private void throwIfDestroyed() {}
    }
}

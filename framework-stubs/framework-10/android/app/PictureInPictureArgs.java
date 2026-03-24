package android.app;

@java.lang.Deprecated
public final class PictureInPictureArgs implements android.os.Parcelable {
    private android.util.Rational mAspectRatio;
    private java.util.List<android.app.RemoteAction> mUserActions;
    private android.graphics.Rect mSourceRectHint;
    private android.graphics.Rect mSourceRectHintInsets;
    public static final android.os.Parcelable.Creator<android.app.PictureInPictureArgs> CREATOR = null;
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public PictureInPictureArgs() {}
    @java.lang.Deprecated
    public PictureInPictureArgs(float p0, java.util.List<android.app.RemoteAction> p1) {}
    private PictureInPictureArgs(android.os.Parcel p0) {}
    private PictureInPictureArgs(android.util.Rational p0, java.util.List<android.app.RemoteAction> p1, android.graphics.Rect p2) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setAspectRatio(float p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public void setActions(java.util.List<android.app.RemoteAction> p0) {}
    @java.lang.Deprecated
    public void setSourceRectHint(android.graphics.Rect p0) {}
    public void copyOnlySet(android.app.PictureInPictureArgs p0) {}
    public float getAspectRatio() { return 0.0f; }
    public android.util.Rational getAspectRatioRational() { return null; }
    public boolean hasSetAspectRatio() { return false; }
    public java.util.List<android.app.RemoteAction> getActions() { return null; }
    public boolean hasSetActions() { return false; }
    public void truncateActions(int p0) {}
    @java.lang.Deprecated
    public void setSourceRectHintInsets(android.graphics.Rect p0) {}
    public android.graphics.Rect getSourceRectHint() { return null; }
    public android.graphics.Rect getSourceRectHintInsets() { return null; }
    public boolean hasSourceBoundsHint() { return false; }
    public boolean hasSourceBoundsHintInsets() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.app.PictureInPictureArgs convert(android.app.PictureInPictureParams p0) { return null; }
    public static android.app.PictureInPictureParams convert(android.app.PictureInPictureArgs p0) { return null; }

    public static class Builder {
        private android.util.Rational mAspectRatio;
        private java.util.List<android.app.RemoteAction> mUserActions;
        private android.graphics.Rect mSourceRectHint;
        public Builder() {}
        public android.app.PictureInPictureArgs.Builder setAspectRatio(android.util.Rational p0) { return null; }
        public android.app.PictureInPictureArgs.Builder setActions(java.util.List<android.app.RemoteAction> p0) { return null; }
        public android.app.PictureInPictureArgs.Builder setSourceRectHint(android.graphics.Rect p0) { return null; }
        public android.app.PictureInPictureArgs build() { return null; }
    }
}

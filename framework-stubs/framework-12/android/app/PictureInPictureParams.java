package android.app;

public final class PictureInPictureParams implements android.os.Parcelable {
    private android.util.Rational mAspectRatio;
    private java.util.List<android.app.RemoteAction> mUserActions;
    private android.graphics.Rect mSourceRectHint;
    private java.lang.Boolean mAutoEnterEnabled;
    private java.lang.Boolean mSeamlessResizeEnabled;
    public static final android.os.Parcelable.Creator<android.app.PictureInPictureParams> CREATOR = null;
    PictureInPictureParams() {}
    PictureInPictureParams(android.os.Parcel p0) {}
    PictureInPictureParams(android.util.Rational p0, java.util.List<android.app.RemoteAction> p1, android.graphics.Rect p2, java.lang.Boolean p3, java.lang.Boolean p4) {}
    public PictureInPictureParams(android.app.PictureInPictureParams p0) {}
    public void copyOnlySet(android.app.PictureInPictureParams p0) {}
    public float getAspectRatio() { return 0.0f; }
    public android.util.Rational getAspectRatioRational() { return null; }
    public boolean hasSetAspectRatio() { return false; }
    public java.util.List<android.app.RemoteAction> getActions() { return null; }
    public boolean hasSetActions() { return false; }
    public void truncateActions(int p0) {}
    public android.graphics.Rect getSourceRectHint() { return null; }
    public boolean hasSourceBoundsHint() { return false; }
    public boolean isAutoEnterEnabled() { return false; }
    public boolean isSeamlessResizeEnabled() { return false; }
    public boolean empty() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        private android.util.Rational mAspectRatio;
        private java.util.List<android.app.RemoteAction> mUserActions;
        private android.graphics.Rect mSourceRectHint;
        private java.lang.Boolean mAutoEnterEnabled;
        private java.lang.Boolean mSeamlessResizeEnabled;
        public Builder() {}
        public android.app.PictureInPictureParams.Builder setAspectRatio(android.util.Rational p0) { return null; }
        public android.app.PictureInPictureParams.Builder setActions(java.util.List<android.app.RemoteAction> p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSourceRectHint(android.graphics.Rect p0) { return null; }
        public android.app.PictureInPictureParams.Builder setAutoEnterEnabled(boolean p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSeamlessResizeEnabled(boolean p0) { return null; }
        public android.app.PictureInPictureParams build() { return null; }
    }
}

package android.app;

public final class PictureInPictureParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.app.PictureInPictureParams> CREATOR = null;
    PictureInPictureParams() {}
    PictureInPictureParams(android.os.Parcel p0) {}
    PictureInPictureParams(android.util.Rational p0, android.util.Rational p1, java.util.List<android.app.RemoteAction> p2, android.app.RemoteAction p3, android.graphics.Rect p4, java.lang.Boolean p5, java.lang.Boolean p6, java.lang.CharSequence p7, java.lang.CharSequence p8, java.lang.Boolean p9) {}
    public PictureInPictureParams(android.app.PictureInPictureParams p0) {}
    public void copyOnlySet(android.app.PictureInPictureParams p0) {}
    public float getAspectRatioFloat() { return 0.0f; }
    public android.util.Rational getAspectRatio() { return null; }
    public boolean hasSetAspectRatio() { return false; }
    public float getExpandedAspectRatioFloat() { return 0.0f; }
    public android.util.Rational getExpandedAspectRatio() { return null; }
    public boolean hasSetExpandedAspectRatio() { return false; }
    public java.util.List<android.app.RemoteAction> getActions() { return null; }
    public boolean hasSetActions() { return false; }
    public android.app.RemoteAction getCloseAction() { return null; }
    public boolean hasSetCloseAction() { return false; }
    public void truncateActions(int p0) {}
    public android.graphics.Rect getSourceRectHint() { return null; }
    public boolean hasSourceBoundsHint() { return false; }
    public boolean isAutoEnterEnabled() { return false; }
    public boolean isSeamlessResizeEnabled() { return false; }
    public boolean hasSetTitle() { return false; }
    public java.lang.CharSequence getTitle() { return null; }
    public boolean hasSetSubtitle() { return false; }
    public java.lang.CharSequence getSubtitle() { return null; }
    public boolean isLaunchIntoPip() { return false; }
    public boolean empty() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static class Builder {
        public Builder() {}
        public Builder(android.app.PictureInPictureParams p0) {}
        public android.app.PictureInPictureParams.Builder setAspectRatio(android.util.Rational p0) { return null; }
        public android.app.PictureInPictureParams.Builder setExpandedAspectRatio(android.util.Rational p0) { return null; }
        public android.app.PictureInPictureParams.Builder setActions(java.util.List<android.app.RemoteAction> p0) { return null; }
        public android.app.PictureInPictureParams.Builder setCloseAction(android.app.RemoteAction p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSourceRectHint(android.graphics.Rect p0) { return null; }
        public android.app.PictureInPictureParams.Builder setAutoEnterEnabled(boolean p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSeamlessResizeEnabled(boolean p0) { return null; }
        public android.app.PictureInPictureParams.Builder setTitle(java.lang.CharSequence p0) { return null; }
        public android.app.PictureInPictureParams.Builder setSubtitle(java.lang.CharSequence p0) { return null; }
        android.app.PictureInPictureParams.Builder setIsLaunchIntoPip(boolean p0) { return null; }
        public android.app.PictureInPictureParams build() { return null; }
    }
}

package android.window;

public final class PictureInPictureSurfaceTransaction implements android.os.Parcelable {
    public final float mAlpha = 0.0f;
    public final android.graphics.PointF mPosition = null;
    public final float[] mFloat9 = null;
    public final float mRotation = 0.0f;
    public final float mCornerRadius = 0.0f;
    public final float mShadowRadius = 0.0f;
    public static final android.os.Parcelable.Creator<android.window.PictureInPictureSurfaceTransaction> CREATOR = null;
    public PictureInPictureSurfaceTransaction(android.window.PictureInPictureSurfaceTransaction p0) {}
    public android.graphics.Matrix getMatrix() { return null; }
    public boolean hasCornerRadiusSet() { return false; }
    public boolean hasShadowRadiusSet() { return false; }
    public void setShouldDisableCanAffectSystemUiFlags(boolean p0) {}
    public boolean getShouldDisableCanAffectSystemUiFlags() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static void apply(android.window.PictureInPictureSurfaceTransaction p0, android.view.SurfaceControl p1, android.view.SurfaceControl.Transaction p2) {}

    public static class Builder {
        public Builder() {}
        public android.window.PictureInPictureSurfaceTransaction.Builder setAlpha(float p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setPosition(float p0, float p1) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setTransform(float[] p0, float p1) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setCornerRadius(float p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setShadowRadius(float p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction.Builder setWindowCrop(android.graphics.Rect p0) { return null; }
        public android.window.PictureInPictureSurfaceTransaction build() { return null; }
    }
}

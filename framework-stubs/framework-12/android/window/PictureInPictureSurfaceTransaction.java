package android.window;

public final class PictureInPictureSurfaceTransaction implements android.os.Parcelable {
    public final float mPositionX = 0.0f;
    public final float mPositionY = 0.0f;
    public final float[] mFloat9 = null;
    public final float mRotation = 0.0f;
    public final float mCornerRadius = 0.0f;
    private final android.graphics.Rect mWindowCrop = null;
    public static final android.os.Parcelable.Creator<android.window.PictureInPictureSurfaceTransaction> CREATOR = null;
    public PictureInPictureSurfaceTransaction(android.os.Parcel p0) {}
    public PictureInPictureSurfaceTransaction(float p0, float p1, float[] p2, float p3, float p4, android.graphics.Rect p5) {}
    public PictureInPictureSurfaceTransaction(android.window.PictureInPictureSurfaceTransaction p0) {}
    public android.graphics.Matrix getMatrix() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public static void apply(android.window.PictureInPictureSurfaceTransaction p0, android.view.SurfaceControl p1, android.view.SurfaceControl.Transaction p2) {}
}

package android.window;

public final class StartingWindowRemovalInfo implements android.os.Parcelable {
    public int taskId;
    public android.view.SurfaceControl windowAnimationLeash;
    public android.graphics.Rect mainFrame;
    public boolean playRevealAnimation;
    public boolean deferRemoveForIme;
    public float roundedCornerRadius;
    public static final android.os.Parcelable.Creator<android.window.StartingWindowRemovalInfo> CREATOR = null;
    public StartingWindowRemovalInfo() {}
    public int describeContents() { return 0; }
    void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}

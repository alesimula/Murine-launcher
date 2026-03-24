package android.window;

public final class StartingWindowRemovalInfo implements android.os.Parcelable {
    public int taskId;
    public android.view.SurfaceControl windowAnimationLeash;
    public android.graphics.Rect mainFrame;
    public boolean playRevealAnimation;
    public static final int DEFER_MODE_NONE = 0;
    public static final int DEFER_MODE_NORMAL = 1;
    public static final int DEFER_MODE_ROTATION = 2;
    public int deferRemoveForImeMode;
    public float roundedCornerRadius;
    public boolean windowlessSurface;
    public boolean removeImmediately;
    public static final android.os.Parcelable.Creator<android.window.StartingWindowRemovalInfo> CREATOR = null;
    public StartingWindowRemovalInfo() {}
    public int describeContents() { return 0; }
    void readFromParcel(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface DeferMode {
    }
}

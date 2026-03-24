package android.window;

public final class StartingWindowRemovalInfo implements android.os.Parcelable {
    public int taskId;
    @android.annotation.Nullable
    public android.view.SurfaceControl windowAnimationLeash;
    @android.annotation.Nullable
    public android.graphics.Rect mainFrame;
    public boolean playRevealAnimation;
    public static final int DEFER_MODE_DEFAULT = 0;
    public static final int DEFER_MODE_NORMAL = 1;
    public static final int DEFER_MODE_ROTATION = 2;
    public static final int DEFER_MODE_NONE = 3;
    public int deferRemoveMode;
    public float roundedCornerRadius;
    public boolean windowlessSurface;
    public boolean removeImmediately;
    @android.annotation.NonNull
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

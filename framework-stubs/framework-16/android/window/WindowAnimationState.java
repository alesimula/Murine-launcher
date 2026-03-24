package android.window;

public class WindowAnimationState implements android.os.Parcelable {
    public long timestamp;
    public android.graphics.RectF bounds;
    public float scale;
    public float topLeftRadius;
    public float topRightRadius;
    public float bottomRightRadius;
    public float bottomLeftRadius;
    public android.graphics.PointF velocityPxPerMs;
    public static final android.os.Parcelable.Creator<android.window.WindowAnimationState> CREATOR = null;
    public WindowAnimationState() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

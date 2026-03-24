package android.window;

public class BackEvent implements android.os.Parcelable {
    public static final int EDGE_LEFT = 0;
    public static final int EDGE_RIGHT = 1;
    public static final android.os.Parcelable.Creator<android.window.BackEvent> CREATOR = null;
    public BackEvent(float p0, float p1, float p2, int p3, android.view.RemoteAnimationTarget p4) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public float getProgress() { return 0.0f; }
    public float getTouchX() { return 0.0f; }
    public float getTouchY() { return 0.0f; }
    public int getSwipeEdge() { return 0; }
    public android.view.RemoteAnimationTarget getDepartingAnimationTarget() { return null; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SwipeEdge {
    }
}

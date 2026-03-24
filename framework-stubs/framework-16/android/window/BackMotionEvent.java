package android.window;

public final class BackMotionEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.BackMotionEvent> CREATOR = null;
    public BackMotionEvent(float p0, float p1, long p2, float p3, boolean p4, int p5, android.view.RemoteAnimationTarget p6) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public float getTouchX() { return 0.0f; }
    public float getTouchY() { return 0.0f; }
    public float getProgress() { return 0.0f; }
    public boolean getTriggerBack() { return false; }
    public int getSwipeEdge() { return 0; }
    public long getFrameTimeMillis() { return 0L; }
    @android.annotation.Nullable
    public android.view.RemoteAnimationTarget getDepartingAnimationTarget() { return null; }
    public java.lang.String toString() { return null; }
}

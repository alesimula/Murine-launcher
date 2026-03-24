package android.window;

public final class BackMotionEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.window.BackMotionEvent> CREATOR = null;
    public BackMotionEvent(float p0, float p1, float p2, float p3, float p4, boolean p5, int p6, android.view.RemoteAnimationTarget p7) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public float getTouchX() { return 0.0f; }
    public float getTouchY() { return 0.0f; }
    public float getProgress() { return 0.0f; }
    public float getVelocityX() { return 0.0f; }
    public float getVelocityY() { return 0.0f; }
    public boolean getTriggerBack() { return false; }
    public int getSwipeEdge() { return 0; }
    @android.annotation.Nullable
    public android.view.RemoteAnimationTarget getDepartingAnimationTarget() { return null; }
    public java.lang.String toString() { return null; }
}

package android.view;

public final class VerifiedMotionEvent extends android.view.VerifiedInputEvent implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.VerifiedMotionEvent> CREATOR = null;
    @android.annotation.Nullable
    public java.lang.Boolean getFlag(int p0) { return null; }
    public VerifiedMotionEvent(int p0, long p1, int p2, int p3, float p4, float p5, int p6, long p7, int p8, int p9, int p10) { super((android.os.Parcel)null, 0); }
    public float getRawX() { return 0.0f; }
    public float getRawY() { return 0.0f; }
    public int getActionMasked() { return 0; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public long getDownTimeNanos() { return 0L; }
    public int getFlags() { return 0; }
    public int getMetaState() { return 0; }
    public int getButtonState() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    VerifiedMotionEvent(android.os.Parcel p0) { super((android.os.Parcel)null, 0); }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MotionEventAction {
    }
}

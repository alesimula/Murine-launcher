package android.view;

public final class VerifiedKeyEvent extends android.view.VerifiedInputEvent implements android.os.Parcelable {
    private static final java.lang.String TAG = "VerifiedKeyEvent";
    private int mAction;
    @android.annotation.SuppressLint("MethodNameUnits")
    private long mDownTimeNanos;
    private int mFlags;
    private int mKeyCode;
    private int mScanCode;
    private int mMetaState;
    private int mRepeatCount;
    public static final android.os.Parcelable.Creator<android.view.VerifiedKeyEvent> CREATOR = null;
    public java.lang.Boolean getFlag(int p0) { return null; }
    public VerifiedKeyEvent(int p0, long p1, int p2, int p3, int p4, long p5, int p6, int p7, int p8, int p9, int p10) { super((android.os.Parcel)null, 0); }
    public int getAction() { return 0; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public long getDownTimeNanos() { return 0L; }
    public int getFlags() { return 0; }
    public int getKeyCode() { return 0; }
    public int getScanCode() { return 0; }
    public int getMetaState() { return 0; }
    public int getRepeatCount() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    VerifiedKeyEvent(android.os.Parcel p0) { super((android.os.Parcel)null, 0); }
    @java.lang.Deprecated
    private void __metadata() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface KeyEventAction {
    }
}

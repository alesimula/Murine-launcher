package android.view;

@android.annotation.SuppressLint("ParcelNotFinal")
public abstract class VerifiedInputEvent implements android.os.Parcelable {
    private static final java.lang.String TAG = "VerifiedInputEvent";
    protected static final int VERIFIED_KEY = 1;
    protected static final int VERIFIED_MOTION = 2;
    private int mType;
    private int mDeviceId;
    private long mEventTimeNanos;
    private int mSource;
    private int mDisplayId;
    public static final android.os.Parcelable.Creator<android.view.VerifiedInputEvent> CREATOR = null;
    protected VerifiedInputEvent(int p0, int p1, long p2, int p3, int p4) {}
    protected VerifiedInputEvent(android.os.Parcel p0, int p1) {}
    public int getDeviceId() { return 0; }
    @android.annotation.SuppressLint("MethodNameUnits")
    public long getEventTimeNanos() { return 0L; }
    public int getSource() { return 0; }
    public int getDisplayId() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    private static int peekInt(android.os.Parcel p0) { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerifiedInputEventType {
    }
}

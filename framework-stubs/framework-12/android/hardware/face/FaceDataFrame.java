package android.hardware.face;

public final class FaceDataFrame implements android.os.Parcelable {
    private final int mAcquiredInfo = 0;
    private final int mVendorCode = 0;
    private final float mPan = 0.0f;
    private final float mTilt = 0.0f;
    private final float mDistance = 0.0f;
    private final boolean mIsCancellable = false;
    public static final android.os.Parcelable.Creator<android.hardware.face.FaceDataFrame> CREATOR = null;
    public FaceDataFrame(int p0, int p1, float p2, float p3, float p4, boolean p5) {}
    public FaceDataFrame(int p0, int p1) {}
    public int getAcquiredInfo() { return 0; }
    public int getVendorCode() { return 0; }
    public float getPan() { return 0.0f; }
    public float getTilt() { return 0.0f; }
    public float getDistance() { return 0.0f; }
    public boolean isCancellable() { return false; }
    private FaceDataFrame(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.hardware.input;

public class InputSensorInfo implements android.os.Parcelable {
    private java.lang.String mName;
    private java.lang.String mVendor;
    private int mVersion;
    private int mHandle;
    private int mType;
    private float mMaxRange;
    private float mResolution;
    private float mPower;
    private int mMinDelay;
    private int mFifoReservedEventCount;
    private int mFifoMaxEventCount;
    private java.lang.String mStringType;
    private java.lang.String mRequiredPermission;
    private int mMaxDelay;
    private int mFlags;
    private int mId;
    public static final android.os.Parcelable.Creator<android.hardware.input.InputSensorInfo> CREATOR = null;
    public InputSensorInfo(java.lang.String p0, java.lang.String p1, int p2, int p3, int p4, float p5, float p6, float p7, int p8, int p9, int p10, java.lang.String p11, java.lang.String p12, int p13, int p14, int p15) {}
    public java.lang.String getName() { return null; }
    public java.lang.String getVendor() { return null; }
    public int getVersion() { return 0; }
    public int getHandle() { return 0; }
    public int getType() { return 0; }
    public float getMaxRange() { return 0.0f; }
    public float getResolution() { return 0.0f; }
    public float getPower() { return 0.0f; }
    public int getMinDelay() { return 0; }
    public int getFifoReservedEventCount() { return 0; }
    public int getFifoMaxEventCount() { return 0; }
    public java.lang.String getStringType() { return null; }
    public java.lang.String getRequiredPermission() { return null; }
    public int getMaxDelay() { return 0; }
    public int getFlags() { return 0; }
    public int getId() { return 0; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    protected InputSensorInfo(android.os.Parcel p0) {}
    @java.lang.Deprecated
    private void __metadata() {}
}

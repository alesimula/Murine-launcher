package android.hardware;

public class CameraSessionStats implements android.os.Parcelable {
    public static final int CAMERA_STATE_OPEN = 0;
    public static final int CAMERA_STATE_ACTIVE = 1;
    public static final int CAMERA_STATE_IDLE = 2;
    public static final int CAMERA_STATE_CLOSED = 3;
    public static final int CAMERA_FACING_BACK = 0;
    public static final int CAMERA_FACING_FRONT = 1;
    public static final int CAMERA_FACING_EXTERNAL = 2;
    public static final int CAMERA_API_LEVEL_1 = 1;
    public static final int CAMERA_API_LEVEL_2 = 2;
    private java.lang.String mCameraId;
    private int mFacing;
    private int mNewCameraState;
    private java.lang.String mClientName;
    private int mApiLevel;
    private boolean mIsNdk;
    private int mLatencyMs;
    private int mSessionType;
    private int mInternalReconfigure;
    private long mRequestCount;
    private long mResultErrorCount;
    private boolean mDeviceError;
    private java.util.ArrayList<android.hardware.CameraStreamStats> mStreamStats;
    public static final android.os.Parcelable.Creator<android.hardware.CameraSessionStats> CREATOR = null;
    public CameraSessionStats() {}
    public CameraSessionStats(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, boolean p5, int p6, int p7, int p8) {}
    private CameraSessionStats(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String getCameraId() { return null; }
    public int getFacing() { return 0; }
    public int getNewCameraState() { return 0; }
    public java.lang.String getClientName() { return null; }
    public int getApiLevel() { return 0; }
    public boolean isNdk() { return false; }
    public int getLatencyMs() { return 0; }
    public int getSessionType() { return 0; }
    public int getInternalReconfigureCount() { return 0; }
    public long getRequestCount() { return 0L; }
    public long getResultErrorCount() { return 0L; }
    public boolean getDeviceErrorFlag() { return false; }
    public java.util.List<android.hardware.CameraStreamStats> getStreamStats() { return null; }
}

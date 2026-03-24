package android.hardware.camera2.utils;

public class SubmitInfo implements android.os.Parcelable {
    private int mRequestId;
    private long mLastFrameNumber;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.utils.SubmitInfo> CREATOR = null;
    public SubmitInfo() {}
    public SubmitInfo(int p0, long p1) {}
    private SubmitInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int getRequestId() { return 0; }
    public long getLastFrameNumber() { return 0L; }
}

package android.hardware.camera2.impl;

public class CaptureResultExtras implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.camera2.impl.CaptureResultExtras> CREATOR = null;
    public CaptureResultExtras(int p0, int p1, int p2, int p3, long p4, int p5, int p6, java.lang.String p7, long p8, long p9, long p10, boolean p11, long p12) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String getErrorPhysicalCameraId() { return null; }
    public int getRequestId() { return 0; }
    public int getSubsequenceId() { return 0; }
    public int getAfTriggerId() { return 0; }
    public int getPrecaptureTriggerId() { return 0; }
    public long getFrameNumber() { return 0L; }
    public int getPartialResultCount() { return 0; }
    public int getErrorStreamId() { return 0; }
    public long getLastCompletedRegularFrameNumber() { return 0L; }
    public long getLastCompletedReprocessFrameNumber() { return 0L; }
    public long getLastCompletedZslFrameNumber() { return 0L; }
    public boolean hasReadoutTimestamp() { return false; }
    public long getReadoutTimestamp() { return 0L; }
}

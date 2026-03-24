package android.hardware.location;

@android.annotation.SystemApi
@java.lang.Deprecated
public class NanoAppInstanceInfo implements android.os.Parcelable {
    private java.lang.String mPublisher;
    private java.lang.String mName;
    private int mHandle;
    private long mAppId;
    private int mAppVersion;
    private int mContexthubId;
    private int mNeededReadMemBytes;
    private int mNeededWriteMemBytes;
    private int mNeededExecMemBytes;
    private int[] mNeededSensors;
    private int[] mOutputEvents;
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoAppInstanceInfo> CREATOR = null;
    public NanoAppInstanceInfo() {}
    public NanoAppInstanceInfo(int p0, long p1, int p2, int p3) {}
    public java.lang.String getPublisher() { return null; }
    public java.lang.String getName() { return null; }
    public long getAppId() { return 0L; }
    public int getAppVersion() { return 0; }
    public int getNeededReadMemBytes() { return 0; }
    public int getNeededWriteMemBytes() { return 0; }
    public int getNeededExecMemBytes() { return 0; }
    public int[] getNeededSensors() { return null; }
    public int[] getOutputEvents() { return null; }
    public int getContexthubId() { return 0; }
    public int getHandle() { return 0; }
    private NanoAppInstanceInfo(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}

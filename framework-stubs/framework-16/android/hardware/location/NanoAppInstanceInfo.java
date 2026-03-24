package android.hardware.location;

@android.annotation.SystemApi
@java.lang.Deprecated
public class NanoAppInstanceInfo implements android.os.Parcelable {
    @android.annotation.NonNull
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
    @android.annotation.NonNull
    public int[] getNeededSensors() { return null; }
    @android.annotation.NonNull
    public int[] getOutputEvents() { return null; }
    public int getContexthubId() { return 0; }
    public int getHandle() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
}

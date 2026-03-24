package android.hardware.location;

@android.annotation.SystemApi
@java.lang.Deprecated
public class NanoApp implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.hardware.location.NanoApp> CREATOR = null;
    public NanoApp() {}
    @java.lang.Deprecated
    public NanoApp(int p0, byte[] p1) {}
    public NanoApp(long p0, byte[] p1) {}
    public void setPublisher(java.lang.String p0) {}
    public void setName(java.lang.String p0) {}
    public void setAppId(long p0) {}
    public void setAppVersion(int p0) {}
    public void setNeededReadMemBytes(int p0) {}
    public void setNeededWriteMemBytes(int p0) {}
    public void setNeededExecMemBytes(int p0) {}
    public void setNeededSensors(int[] p0) {}
    public void setOutputEvents(int[] p0) {}
    public void setAppBinary(byte[] p0) {}
    public java.lang.String getPublisher() { return null; }
    public java.lang.String getName() { return null; }
    public long getAppId() { return 0L; }
    public int getAppVersion() { return 0; }
    public int getNeededReadMemBytes() { return 0; }
    public int getNeededWriteMemBytes() { return 0; }
    public int getNeededExecMemBytes() { return 0; }
    public int[] getNeededSensors() { return null; }
    public int[] getOutputEvents() { return null; }
    public byte[] getAppBinary() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
}

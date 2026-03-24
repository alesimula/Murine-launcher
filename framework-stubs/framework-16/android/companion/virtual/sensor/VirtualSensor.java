package android.companion.virtual.sensor;

@android.annotation.SystemApi
public final class VirtualSensor implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.companion.virtual.sensor.VirtualSensor> CREATOR = null;
    public VirtualSensor(int p0, int p1, java.lang.String p2, android.companion.virtual.IVirtualDevice p3, android.os.IBinder p4) {}
    public VirtualSensor(int p0, int p1, java.lang.String p2, int p3, android.companion.virtual.IVirtualDevice p4, android.os.IBinder p5) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public VirtualSensor(int p0, int p1, java.lang.String p2) {}
    @android.annotation.SuppressLint("UnflaggedApi")
    public int getHandle() { return 0; }
    public int getType() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getName() { return null; }
    public int getDeviceId() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }
    public void sendEvent(android.companion.virtual.sensor.VirtualSensorEvent p0) {}
    @android.annotation.FlaggedApi("android.companion.virtualdevice.flags.virtual_sensor_additional_info")
    public void sendAdditionalInfo(android.companion.virtual.sensor.VirtualSensorAdditionalInfo p0) {}
}

package android.hardware.biometrics.common;

public class ComponentInfo implements android.os.Parcelable {
    public java.lang.String componentId;
    public java.lang.String hardwareVersion;
    public java.lang.String firmwareVersion;
    public java.lang.String serialNumber;
    public java.lang.String softwareVersion;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.common.ComponentInfo> CREATOR = null;
    public ComponentInfo() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

package android.hardware.camera2.extension;

public class Request implements android.os.Parcelable {
    public java.util.List<android.hardware.camera2.extension.OutputConfigId> targetOutputConfigIds;
    public android.hardware.camera2.impl.CameraMetadataNative parameters;
    public int templateId;
    public int requestId;
    public static final android.os.Parcelable.Creator<android.hardware.camera2.extension.Request> CREATOR = null;
    public Request() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

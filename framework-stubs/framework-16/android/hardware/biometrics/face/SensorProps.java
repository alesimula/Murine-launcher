package android.hardware.biometrics.face;

public class SensorProps implements android.os.Parcelable {
    public android.hardware.biometrics.common.CommonProps commonProps;
    public byte sensorType;
    public boolean halControlsPreview;
    public int previewDisplayId;
    public int enrollPreviewWidth;
    public int enrollPreviewHeight;
    public float enrollTranslationX;
    public float enrollTranslationY;
    public float enrollPreviewScale;
    public boolean supportsDetectInteraction;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.face.SensorProps> CREATOR = null;
    public SensorProps() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

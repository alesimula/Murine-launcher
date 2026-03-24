package android.hardware.biometrics.fingerprint;

public class TouchDetectionParameters implements android.os.Parcelable {
    public float targetSize;
    public float minOverlap;
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.fingerprint.TouchDetectionParameters> CREATOR = null;
    public TouchDetectionParameters() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

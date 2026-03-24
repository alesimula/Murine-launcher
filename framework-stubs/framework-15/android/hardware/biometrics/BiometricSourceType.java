package android.hardware.biometrics;

public enum BiometricSourceType implements android.os.Parcelable {
    FINGERPRINT,
    FACE,
    IRIS;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.hardware.biometrics.BiometricSourceType> CREATOR = null;
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

package android.security.metrics;

public class KeyCreationWithGeneralInfo implements android.os.Parcelable {
    public int algorithm;
    public int key_size;
    public int ec_curve;
    public int key_origin;
    public int error_code;
    public boolean attestation_requested;
    public static final android.os.Parcelable.Creator<android.security.metrics.KeyCreationWithGeneralInfo> CREATOR = null;
    public KeyCreationWithGeneralInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

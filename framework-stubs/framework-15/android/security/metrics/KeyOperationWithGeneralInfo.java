package android.security.metrics;

public class KeyOperationWithGeneralInfo implements android.os.Parcelable {
    public int outcome;
    public int error_code;
    public boolean key_upgraded;
    public int security_level;
    public static final android.os.Parcelable.Creator<android.security.metrics.KeyOperationWithGeneralInfo> CREATOR = null;
    public KeyOperationWithGeneralInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

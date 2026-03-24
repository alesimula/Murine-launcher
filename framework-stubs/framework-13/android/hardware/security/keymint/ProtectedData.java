package android.hardware.security.keymint;

public class ProtectedData implements android.os.Parcelable {
    public byte[] protectedData;
    public static final android.os.Parcelable.Creator<android.hardware.security.keymint.ProtectedData> CREATOR = null;
    public ProtectedData() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

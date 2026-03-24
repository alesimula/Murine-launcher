package android.hardware.vibrator;

public class VendorEffect implements android.os.Parcelable {
    public android.os.PersistableBundle vendorData;
    public byte strength;
    public float scale;
    public float vendorScale;
    public static final android.os.Parcelable.Creator<android.hardware.vibrator.VendorEffect> CREATOR = null;
    public VendorEffect() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

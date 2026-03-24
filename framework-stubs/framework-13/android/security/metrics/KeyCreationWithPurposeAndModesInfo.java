package android.security.metrics;

public class KeyCreationWithPurposeAndModesInfo implements android.os.Parcelable {
    public int algorithm;
    public int purpose_bitmap;
    public int padding_mode_bitmap;
    public int digest_bitmap;
    public int block_mode_bitmap;
    public static final android.os.Parcelable.Creator<android.security.metrics.KeyCreationWithPurposeAndModesInfo> CREATOR = null;
    public KeyCreationWithPurposeAndModesInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

package android.security.metrics;

public class KeyOperationWithPurposeAndModesInfo implements android.os.Parcelable {
    public int purpose;
    public int padding_mode_bitmap;
    public int digest_bitmap;
    public int block_mode_bitmap;
    public static final android.os.Parcelable.Creator<android.security.metrics.KeyOperationWithPurposeAndModesInfo> CREATOR = null;
    public KeyOperationWithPurposeAndModesInfo() {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

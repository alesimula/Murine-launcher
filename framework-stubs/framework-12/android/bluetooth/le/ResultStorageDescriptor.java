package android.bluetooth.le;

@android.annotation.SystemApi
public final class ResultStorageDescriptor implements android.os.Parcelable {
    private int mType;
    private int mOffset;
    private int mLength;
    public static final android.os.Parcelable.Creator<android.bluetooth.le.ResultStorageDescriptor> CREATOR = null;
    public int getType() { return 0; }
    public int getOffset() { return 0; }
    public int getLength() { return 0; }
    public ResultStorageDescriptor(int p0, int p1, int p2) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private ResultStorageDescriptor(android.os.Parcel p0) {}
    private void ReadFromParcel(android.os.Parcel p0) {}
}

package android.bluetooth;

@android.annotation.SystemApi
public final class BufferConstraints implements android.os.Parcelable {
    public static final int BUFFER_CODEC_MAX_NUM = 32;
    private static final java.lang.String TAG = "BufferConstraints";
    private java.util.Map<java.lang.Integer, android.bluetooth.BufferConstraint> mBufferConstraints;
    private java.util.List<android.bluetooth.BufferConstraint> mBufferConstraintList;
    public static final android.os.Parcelable.Creator<android.bluetooth.BufferConstraints> CREATOR = null;
    public BufferConstraints(java.util.List<android.bluetooth.BufferConstraint> p0) {}
    BufferConstraints(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public android.bluetooth.BufferConstraint forCodec(int p0) { return null; }
}

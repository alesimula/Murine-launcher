package android.bluetooth;

@android.annotation.SystemApi
public final class BufferConstraint implements android.os.Parcelable {
    private static final java.lang.String TAG = "BufferConstraint";
    private int mDefaultMillis;
    private int mMaxMillis;
    private int mMinMillis;
    public static final android.os.Parcelable.Creator<android.bluetooth.BufferConstraint> CREATOR = null;
    public BufferConstraint(int p0, int p1, int p2) {}
    BufferConstraint(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @android.annotation.SystemApi
    public int getDefaultMillis() { return 0; }
    @android.annotation.SystemApi
    public int getMaxMillis() { return 0; }
    @android.annotation.SystemApi
    public int getMinMillis() { return 0; }
}

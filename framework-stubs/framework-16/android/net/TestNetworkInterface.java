package android.net;

public final class TestNetworkInterface implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.TestNetworkInterface> CREATOR = null;
    public TestNetworkInterface(android.os.ParcelFileDescriptor p0, java.lang.String p1) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public android.os.ParcelFileDescriptor getFileDescriptor() { return null; }
    @android.annotation.NonNull
    public java.lang.String getInterfaceName() { return null; }
    @android.annotation.Nullable
    public android.net.MacAddress getMacAddress() { return null; }
    public int getMtu() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

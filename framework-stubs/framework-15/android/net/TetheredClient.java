package android.net;

public final class TetheredClient implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.TetheredClient> CREATOR = null;
    public TetheredClient(android.net.MacAddress p0, java.util.Collection<android.net.TetheredClient.AddressInfo> p1, int p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.util.List<android.net.TetheredClient.AddressInfo> getAddresses() { return null; }
    @android.annotation.NonNull
    public android.net.MacAddress getMacAddress() { return null; }
    public int getTetheringType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class AddressInfo implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.TetheredClient.AddressInfo> CREATOR = null;
        AddressInfo() {}
        public int describeContents() { return 0; }
        @android.annotation.NonNull
        public android.net.LinkAddress getAddress() { return null; }
        @android.annotation.Nullable
        public java.lang.String getHostname() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

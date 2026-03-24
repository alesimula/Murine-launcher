package android.net;

public final class TetheringInterface implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.TetheringInterface> CREATOR = null;
    public TetheringInterface(int p0, java.lang.String p1) {}
    @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
    public TetheringInterface(int p0, java.lang.String p1, android.net.wifi.SoftApConfiguration p2) {}
    public int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getInterface() { return null; }
    @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
    @android.annotation.Nullable
    public android.net.wifi.SoftApConfiguration getSoftApConfiguration() { return null; }
    public int getType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

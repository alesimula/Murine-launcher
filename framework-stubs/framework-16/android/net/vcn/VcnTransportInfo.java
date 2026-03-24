package android.net.vcn;

@android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
public final class VcnTransportInfo implements android.os.Parcelable, android.net.TransportInfo {
    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.vcn.VcnTransportInfo> CREATOR = null;
    VcnTransportInfo() {}
    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    public long getApplicableRedactions() { return 0L; }
    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    public int getMinUdpPort4500NatTimeoutSeconds() { return 0; }
    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    @android.annotation.NonNull
    public android.net.TransportInfo makeCopy(long p0) { return null; }
    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
    public static final class Builder {
        @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
        public Builder() {}
        @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
        @android.annotation.NonNull
        public android.net.vcn.VcnTransportInfo build() { return null; }
        @android.annotation.FlaggedApi("android.net.vcn.mainline_vcn_module_api")
        @android.annotation.NonNull
        public android.net.vcn.VcnTransportInfo.Builder setMinUdpPort4500NatTimeoutSeconds(int p0) { return null; }
    }
}

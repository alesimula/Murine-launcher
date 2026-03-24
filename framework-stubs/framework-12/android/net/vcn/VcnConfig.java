package android.net.vcn;

public final class VcnConfig implements android.os.Parcelable {
    private static final java.lang.String TAG = null;
    private static final java.lang.String PACKAGE_NAME_KEY = "mPackageName";
    private final java.lang.String mPackageName = null;
    private static final java.lang.String GATEWAY_CONNECTION_CONFIGS_KEY = "mGatewayConnectionConfigs";
    private final java.util.Set<android.net.vcn.VcnGatewayConnectionConfig> mGatewayConnectionConfigs = null;
    private static final java.lang.String IS_TEST_MODE_PROFILE_KEY = "mIsTestModeProfile";
    private final boolean mIsTestModeProfile = false;
    public static final android.os.Parcelable.Creator<android.net.vcn.VcnConfig> CREATOR = null;
    private VcnConfig(java.lang.String p0, java.util.Set<android.net.vcn.VcnGatewayConnectionConfig> p1, boolean p2) {}
    public VcnConfig(android.os.PersistableBundle p0) {}
    private void validate() {}
    public java.lang.String getProvisioningPackageName() { return null; }
    public java.util.Set<android.net.vcn.VcnGatewayConnectionConfig> getGatewayConnectionConfigs() { return null; }
    public boolean isTestModeProfile() { return false; }
    public android.os.PersistableBundle toPersistableBundle() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        private final java.lang.String mPackageName = null;
        private final java.util.Set<android.net.vcn.VcnGatewayConnectionConfig> mGatewayConnectionConfigs = null;
        private boolean mIsTestModeProfile;
        public Builder(android.content.Context p0) {}
        public android.net.vcn.VcnConfig.Builder addGatewayConnectionConfig(android.net.vcn.VcnGatewayConnectionConfig p0) { return null; }
        public android.net.vcn.VcnConfig.Builder setIsTestModeProfile() { return null; }
        public android.net.vcn.VcnConfig build() { return null; }
    }
}

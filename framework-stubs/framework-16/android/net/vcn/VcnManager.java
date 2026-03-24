package android.net.vcn;

public class VcnManager {
    public static final int VCN_ERROR_CODE_CONFIG_ERROR = 1;
    public static final int VCN_ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int VCN_ERROR_CODE_NETWORK_ERROR = 2;
    public static final int VCN_STATUS_CODE_ACTIVE = 2;
    public static final int VCN_STATUS_CODE_INACTIVE = 1;
    public static final int VCN_STATUS_CODE_NOT_CONFIGURED = 0;
    public static final int VCN_STATUS_CODE_SAFE_MODE = 3;
    VcnManager() {}
    public void addVcnNetworkPolicyChangeListener(java.util.concurrent.Executor p0, android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener p1) {}
    @android.annotation.NonNull
    public android.net.vcn.VcnNetworkPolicyResult applyVcnNetworkPolicy(android.net.NetworkCapabilities p0, android.net.LinkProperties p1) { return null; }
    public void clearVcnConfig(android.os.ParcelUuid p0) throws java.io.IOException {}
    @android.annotation.NonNull
    public java.util.List<android.os.ParcelUuid> getConfiguredSubscriptionGroups() { return null; }
    public void registerVcnStatusCallback(android.os.ParcelUuid p0, java.util.concurrent.Executor p1, android.net.vcn.VcnManager.VcnStatusCallback p2) {}
    public void removeVcnNetworkPolicyChangeListener(android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener p0) {}
    public void setVcnConfig(android.os.ParcelUuid p0, android.net.vcn.VcnConfig p1) throws java.io.IOException {}
    public void unregisterVcnStatusCallback(android.net.vcn.VcnManager.VcnStatusCallback p0) {}

    public static interface VcnNetworkPolicyChangeListener {
        public void onPolicyChanged();
    }

    public static abstract class VcnStatusCallback {
        public VcnStatusCallback() {}
        public abstract void onGatewayConnectionError(java.lang.String p0, int p1, java.lang.Throwable p2);
        public abstract void onStatusChanged(int p0);
    }
}

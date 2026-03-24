package android.net.vcn;

public class VcnManager {
    private static final java.lang.String TAG = null;
    public static final java.lang.String VCN_NETWORK_SELECTION_WIFI_ENTRY_RSSI_THRESHOLD_KEY = "vcn_network_selection_wifi_entry_rssi_threshold";
    public static final java.lang.String VCN_NETWORK_SELECTION_WIFI_EXIT_RSSI_THRESHOLD_KEY = "vcn_network_selection_wifi_exit_rssi_threshold";
    private static final java.util.Map<android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener, android.net.vcn.VcnManager.VcnUnderlyingNetworkPolicyListenerBinder> REGISTERED_POLICY_LISTENERS = null;
    private final android.content.Context mContext = null;
    private final android.net.vcn.IVcnManagementService mService = null;
    public static final int VCN_STATUS_CODE_NOT_CONFIGURED = 0;
    public static final int VCN_STATUS_CODE_INACTIVE = 1;
    public static final int VCN_STATUS_CODE_ACTIVE = 2;
    public static final int VCN_STATUS_CODE_SAFE_MODE = 3;
    public static final int VCN_ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int VCN_ERROR_CODE_CONFIG_ERROR = 1;
    public static final int VCN_ERROR_CODE_NETWORK_ERROR = 2;
    public VcnManager(android.content.Context p0, android.net.vcn.IVcnManagementService p1) {}
    public static java.util.Map<android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener, android.net.vcn.VcnManager.VcnUnderlyingNetworkPolicyListenerBinder> getAllPolicyListeners() { return null; }
    @android.annotation.RequiresPermission("carrier privileges")
    public void setVcnConfig(android.os.ParcelUuid p0, android.net.vcn.VcnConfig p1) throws java.io.IOException {}
    @android.annotation.RequiresPermission("carrier privileges")
    public void clearVcnConfig(android.os.ParcelUuid p0) throws java.io.IOException {}
    public java.util.List<android.os.ParcelUuid> getConfiguredSubscriptionGroups() { return null; }
    @android.annotation.RequiresPermission("android.permission.NETWORK_FACTORY")
    public void addVcnUnderlyingNetworkPolicyListener(java.util.concurrent.Executor p0, android.net.vcn.VcnManager.VcnUnderlyingNetworkPolicyListener p1) {}
    public void removeVcnUnderlyingNetworkPolicyListener(android.net.vcn.VcnManager.VcnUnderlyingNetworkPolicyListener p0) {}
    @android.annotation.RequiresPermission("android.permission.NETWORK_FACTORY")
    public android.net.vcn.VcnUnderlyingNetworkPolicy getUnderlyingNetworkPolicy(android.net.NetworkCapabilities p0, android.net.LinkProperties p1) { return null; }
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NETWORK_FACTORY")
    public void addVcnNetworkPolicyChangeListener(java.util.concurrent.Executor p0, android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NETWORK_FACTORY")
    public void removeVcnNetworkPolicyChangeListener(android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener p0) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.NETWORK_FACTORY")
    public android.net.vcn.VcnNetworkPolicyResult applyVcnNetworkPolicy(android.net.NetworkCapabilities p0, android.net.LinkProperties p1) { return null; }
    public void registerVcnStatusCallback(android.os.ParcelUuid p0, java.util.concurrent.Executor p1, android.net.vcn.VcnManager.VcnStatusCallback p2) {}
    public void unregisterVcnStatusCallback(android.net.vcn.VcnManager.VcnStatusCallback p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VcnErrorCode {
    }

    @android.annotation.SystemApi
    public static interface VcnNetworkPolicyChangeListener {
        public void onPolicyChanged();
    }

    public static abstract class VcnStatusCallback {
        private android.net.vcn.VcnManager.VcnStatusCallbackBinder mCbBinder;
        public VcnStatusCallback() {}
        public abstract void onStatusChanged(int p0);
        public abstract void onGatewayConnectionError(java.lang.String p0, int p1, java.lang.Throwable p2);
    }

    public static class VcnStatusCallbackBinder extends android.net.vcn.IVcnStatusCallback.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.net.vcn.VcnManager.VcnStatusCallback mCallback = null;
        public VcnStatusCallbackBinder(java.util.concurrent.Executor p0, android.net.vcn.VcnManager.VcnStatusCallback p1) { super(); }
        public void onVcnStatusChanged(int p0) {}
        public void onGatewayConnectionError(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) {}
        private static java.lang.Throwable createThrowableByClassName(java.lang.String p0, java.lang.String p1) { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VcnStatusCode {
    }

    public static interface VcnUnderlyingNetworkPolicyListener extends android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener {
    }

    private static class VcnUnderlyingNetworkPolicyListenerBinder extends android.net.vcn.IVcnUnderlyingNetworkPolicyListener.Stub {
        private final java.util.concurrent.Executor mExecutor = null;
        private final android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener mListener = null;
        private VcnUnderlyingNetworkPolicyListenerBinder(java.util.concurrent.Executor p0, android.net.vcn.VcnManager.VcnNetworkPolicyChangeListener p1) { super(); }
        public void onPolicyChanged() {}
    }
}

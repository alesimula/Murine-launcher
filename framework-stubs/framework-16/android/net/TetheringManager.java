package android.net;

public class TetheringManager {
    @java.lang.Deprecated
    public static final java.lang.String ACTION_TETHER_STATE_CHANGED = "android.net.conn.TETHER_STATE_CHANGED";
    public static final int CONNECTIVITY_SCOPE_GLOBAL = 1;
    public static final int CONNECTIVITY_SCOPE_LOCAL = 2;
    public static final java.lang.String EXTRA_ACTIVE_LOCAL_ONLY = "android.net.extra.ACTIVE_LOCAL_ONLY";
    public static final java.lang.String EXTRA_ACTIVE_TETHER = "tetherArray";
    public static final java.lang.String EXTRA_AVAILABLE_TETHER = "availableArray";
    public static final java.lang.String EXTRA_ERRORED_TETHER = "erroredArray";
    public static final int TETHERING_BLUETOOTH = 2;
    public static final int TETHERING_ETHERNET = 5;
    public static final int TETHERING_INVALID = -1;
    public static final int TETHERING_NCM = 4;
    public static final int TETHERING_USB = 1;
    @android.annotation.FlaggedApi("com.android.net.flags.tethering_request_virtual")
    public static final int TETHERING_VIRTUAL = 7;
    public static final int TETHERING_WIFI = 0;
    public static final int TETHERING_WIFI_P2P = 3;
    public static final int TETHER_ERROR_DHCPSERVER_ERROR = 12;
    public static final int TETHER_ERROR_DISABLE_FORWARDING_ERROR = 9;
    @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
    public static final int TETHER_ERROR_DUPLICATE_REQUEST = 18;
    public static final int TETHER_ERROR_ENABLE_FORWARDING_ERROR = 8;
    public static final int TETHER_ERROR_ENTITLEMENT_UNKNOWN = 13;
    public static final int TETHER_ERROR_IFACE_CFG_ERROR = 10;
    public static final int TETHER_ERROR_INTERNAL_ERROR = 5;
    public static final int TETHER_ERROR_NO_ACCESS_TETHERING_PERMISSION = 15;
    public static final int TETHER_ERROR_NO_CHANGE_TETHERING_PERMISSION = 14;
    public static final int TETHER_ERROR_NO_ERROR = 0;
    public static final int TETHER_ERROR_PROVISIONING_FAILED = 11;
    public static final int TETHER_ERROR_SERVICE_UNAVAIL = 2;
    public static final int TETHER_ERROR_TETHER_IFACE_ERROR = 6;
    public static final int TETHER_ERROR_UNAVAIL_IFACE = 4;
    public static final int TETHER_ERROR_UNKNOWN_IFACE = 1;
    @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
    public static final int TETHER_ERROR_UNKNOWN_REQUEST = 17;
    public static final int TETHER_ERROR_UNKNOWN_TYPE = 16;
    public static final int TETHER_ERROR_UNSUPPORTED = 3;
    public static final int TETHER_ERROR_UNTETHER_IFACE_ERROR = 7;
    public static final int TETHER_HARDWARE_OFFLOAD_FAILED = 2;
    public static final int TETHER_HARDWARE_OFFLOAD_STARTED = 1;
    public static final int TETHER_HARDWARE_OFFLOAD_STOPPED = 0;
    public TetheringManager(android.content.Context p0, java.util.function.Supplier<android.os.IBinder> p1) {}
    public int getLastTetherError(java.lang.String p0) { return 0; }
    @android.annotation.NonNull
    public java.lang.String[] getTetherableBluetoothRegexs() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getTetherableIfaces() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getTetherableUsbRegexs() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getTetherableWifiRegexs() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getTetheredIfaces() { return null; }
    @android.annotation.NonNull
    public java.lang.String[] getTetheringErroredIfaces() { return null; }
    public boolean isTetheringSupported() { return false; }
    public boolean isTetheringSupported(java.lang.String p0) { return false; }
    public void registerTetheringEventCallback(java.util.concurrent.Executor p0, android.net.TetheringManager.TetheringEventCallback p1) {}
    public void requestLatestTetheringEntitlementResult(int p0, android.os.ResultReceiver p1, boolean p2) {}
    public void requestLatestTetheringEntitlementResult(int p0, boolean p1, java.util.concurrent.Executor p2, android.net.TetheringManager.OnTetheringEntitlementResultListener p3) {}
    @java.lang.Deprecated
    public int setUsbTethering(boolean p0) { return 0; }
    public void startTethering(android.net.TetheringManager.TetheringRequest p0, java.util.concurrent.Executor p1, android.net.TetheringManager.StartTetheringCallback p2) {}
    public void startTethering(int p0, java.util.concurrent.Executor p1, android.net.TetheringManager.StartTetheringCallback p2) {}
    public void stopAllTethering() {}
    @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
    public void stopTethering(android.net.TetheringManager.TetheringRequest p0, java.util.concurrent.Executor p1, android.net.TetheringManager.StopTetheringCallback p2) {}
    public void stopTethering(int p0) {}
    @java.lang.Deprecated
    public int tether(java.lang.String p0) { return 0; }
    public void unregisterTetheringEventCallback(android.net.TetheringManager.TetheringEventCallback p0) {}
    @java.lang.Deprecated
    public int untether(java.lang.String p0) { return 0; }

    public static interface OnTetheringEntitlementResultListener {
        public void onTetheringEntitlementResult(int p0);
    }

    public static interface StartTetheringCallback {
        default public void onTetheringFailed(int p0) {}
        default public void onTetheringStarted() {}
    }

    @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
    public static interface StopTetheringCallback {
        default public void onStopTetheringFailed(int p0) {}
        default public void onStopTetheringSucceeded() {}
    }

    public static interface TetheredInterfaceCallback {
        public void onAvailable(java.lang.String p0);
        public void onUnavailable();
    }

    public static interface TetheredInterfaceRequest {
        public void release();
    }

    public static interface TetheringEventCallback {
        default public void onClientsChanged(java.util.Collection<android.net.TetheredClient> p0) {}
        default public void onError(android.net.TetheringInterface p0, int p1) {}
        default public void onError(java.lang.String p0, int p1) {}
        default public void onLocalOnlyInterfacesChanged(java.util.List<java.lang.String> p0) {}
        default public void onLocalOnlyInterfacesChanged(java.util.Set<android.net.TetheringInterface> p0) {}
        default public void onOffloadStatusChanged(int p0) {}
        @java.lang.Deprecated
        default public void onTetherableInterfaceRegexpsChanged(android.net.TetheringManager.TetheringInterfaceRegexps p0) {}
        default public void onTetherableInterfacesChanged(java.util.List<java.lang.String> p0) {}
        default public void onTetherableInterfacesChanged(java.util.Set<android.net.TetheringInterface> p0) {}
        default public void onTetheredInterfacesChanged(java.util.List<java.lang.String> p0) {}
        default public void onTetheredInterfacesChanged(java.util.Set<android.net.TetheringInterface> p0) {}
        default public void onTetheringSupported(boolean p0) {}
        default public void onUpstreamChanged(android.net.Network p0) {}
    }

    @java.lang.Deprecated
    public static class TetheringInterfaceRegexps {
        @java.lang.Deprecated
        TetheringInterfaceRegexps() {}
        @java.lang.Deprecated
        @android.annotation.NonNull
        public java.util.List<java.lang.String> getTetherableBluetoothRegexs() { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public java.util.List<java.lang.String> getTetherableUsbRegexs() { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public java.util.List<java.lang.String> getTetherableWifiRegexs() { return null; }
    }

    public static final class TetheringRequest implements android.os.Parcelable {
        @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.net.TetheringManager.TetheringRequest> CREATOR = null;
        TetheringRequest() {}
        @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
        public int describeContents() { return 0; }
        @android.annotation.Nullable
        public android.net.LinkAddress getClientStaticIpv4Address() { return null; }
        public int getConnectivityScope() { return 0; }
        @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
        @android.annotation.Nullable
        public java.lang.String getInterfaceName() { return null; }
        @android.annotation.Nullable
        public android.net.LinkAddress getLocalIpv4Address() { return null; }
        @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
        @android.annotation.Nullable
        public java.lang.String getPackageName() { return null; }
        public boolean getShouldShowEntitlementUi() { return false; }
        @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
        @android.annotation.Nullable
        public android.net.wifi.SoftApConfiguration getSoftApConfiguration() { return null; }
        public int getTetheringType() { return 0; }
        @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
        public int getUid() { return 0; }
        public boolean isExemptFromEntitlementCheck() { return false; }
        @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
        public void writeToParcel(android.os.Parcel p0, int p1) {}

        public static class Builder {
            public Builder(int p0) {}
            @android.annotation.NonNull
            public android.net.TetheringManager.TetheringRequest build() { return null; }
            @android.annotation.NonNull
            public android.net.TetheringManager.TetheringRequest.Builder setConnectivityScope(int p0) { return null; }
            @android.annotation.NonNull
            public android.net.TetheringManager.TetheringRequest.Builder setExemptFromEntitlementCheck(boolean p0) { return null; }
            @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
            @android.annotation.NonNull
            public android.net.TetheringManager.TetheringRequest.Builder setInterfaceName(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.net.TetheringManager.TetheringRequest.Builder setShouldShowEntitlementUi(boolean p0) { return null; }
            @android.annotation.FlaggedApi("com.android.net.flags.tethering_with_soft_ap_config")
            @android.annotation.NonNull
            public android.net.TetheringManager.TetheringRequest.Builder setSoftApConfiguration(android.net.wifi.SoftApConfiguration p0) { return null; }
            @android.annotation.NonNull
            public android.net.TetheringManager.TetheringRequest.Builder setStaticIpv4Addresses(android.net.LinkAddress p0, android.net.LinkAddress p1) { return null; }
        }
    }
}

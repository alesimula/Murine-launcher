package android.uwb;

public final class UwbManager {
    public static final int REMOVE_PROFILE_ADF_ERROR_INTERNAL = 2;
    public static final int REMOVE_PROFILE_ADF_ERROR_UNKNOWN_SERVICE = 1;
    public static final int REMOVE_PROFILE_ADF_SUCCESS = 0;
    public static final int REMOVE_SERVICE_PROFILE_ERROR_INTERNAL = 2;
    public static final int REMOVE_SERVICE_PROFILE_ERROR_UNKNOWN_SERVICE = 1;
    public static final int REMOVE_SERVICE_PROFILE_SUCCESS = 0;
    public static final int SEND_VENDOR_UCI_ERROR_HW = 1;
    public static final int SEND_VENDOR_UCI_ERROR_INVALID_ARGS = 3;
    public static final int SEND_VENDOR_UCI_ERROR_INVALID_GID = 4;
    public static final int SEND_VENDOR_UCI_ERROR_OFF = 2;
    public static final int SEND_VENDOR_UCI_SUCCESS = 0;
    UwbManager() {}
    public void registerAdapterStateCallback(java.util.concurrent.Executor p0, android.uwb.UwbManager.AdapterStateCallback p1) {}
    public void unregisterAdapterStateCallback(android.uwb.UwbManager.AdapterStateCallback p0) {}
    public void registerUwbVendorUciCallback(java.util.concurrent.Executor p0, android.uwb.UwbManager.UwbVendorUciCallback p1) {}
    public void unregisterUwbVendorUciCallback(android.uwb.UwbManager.UwbVendorUciCallback p0) {}
    @android.annotation.NonNull
    public android.os.PersistableBundle getSpecificationInfo() { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getSpecificationInfo(java.lang.String p0) { return null; }
    public long elapsedRealtimeResolutionNanos() { return 0L; }
    public long elapsedRealtimeResolutionNanos(java.lang.String p0) { return 0L; }
    @android.annotation.NonNull
    public android.os.CancellationSignal openRangingSession(android.os.PersistableBundle p0, java.util.concurrent.Executor p1, android.uwb.RangingSession.Callback p2) { return null; }
    @android.annotation.NonNull
    public android.os.CancellationSignal openRangingSession(android.os.PersistableBundle p0, java.util.concurrent.Executor p1, android.uwb.RangingSession.Callback p2, java.lang.String p3) { return null; }
    public int getAdapterState() { return 0; }
    public boolean isUwbEnabled() { return false; }
    public void setUwbEnabled(boolean p0) {}
    @android.annotation.NonNull
    public java.util.List<android.os.PersistableBundle> getChipInfos() { return null; }
    @android.annotation.NonNull
    public java.lang.String getDefaultChipId() { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle addServiceProfile(android.os.PersistableBundle p0) { return null; }
    public int removeServiceProfile(android.os.PersistableBundle p0) { return 0; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getAllServiceProfiles() { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getAdfProvisioningAuthorities(android.os.PersistableBundle p0) { return null; }
    @android.annotation.NonNull
    public android.os.PersistableBundle getAdfCertificateInfo(android.os.PersistableBundle p0) { return null; }
    public void provisionProfileAdfByScript(android.os.PersistableBundle p0, java.util.concurrent.Executor p1, android.uwb.UwbManager.AdfProvisionStateCallback p2) {}
    public int removeProfileAdf(android.os.PersistableBundle p0) { return 0; }
    @android.annotation.NonNull
    public int sendVendorUciMessage(int p0, int p1, byte[] p2) { return 0; }

    public static interface AdapterStateCallback {
        public static final int STATE_CHANGED_REASON_ALL_SESSIONS_CLOSED = 1;
        public static final int STATE_CHANGED_REASON_ERROR_UNKNOWN = 4;
        public static final int STATE_CHANGED_REASON_SESSION_STARTED = 0;
        public static final int STATE_CHANGED_REASON_SYSTEM_BOOT = 3;
        public static final int STATE_CHANGED_REASON_SYSTEM_POLICY = 2;
        public static final int STATE_DISABLED = 0;
        public static final int STATE_ENABLED_ACTIVE = 2;
        public static final int STATE_ENABLED_INACTIVE = 1;
        public void onStateChanged(int p0, int p1);
    }

    public static abstract class AdfProvisionStateCallback {
        public static final int REASON_INVALID_OID = 1;
        public static final int REASON_SE_FAILURE = 2;
        public static final int REASON_UNKNOWN = 3;
        public AdfProvisionStateCallback() {}
        public abstract void onProfileAdfsProvisioned(android.os.PersistableBundle p0);
        public abstract void onProfileAdfsProvisionFailed(int p0, android.os.PersistableBundle p1);
    }

    public static interface UwbVendorUciCallback {
        public void onVendorUciResponse(int p0, int p1, byte[] p2);
        public void onVendorUciNotification(int p0, int p1, byte[] p2);
    }
}

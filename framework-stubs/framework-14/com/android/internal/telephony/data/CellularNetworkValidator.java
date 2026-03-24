package com.android.internal.telephony.data;

public class CellularNetworkValidator {
    public static final long MAX_VALIDATION_CACHE_TTL = Long.valueOf(0L);
    public android.os.Handler mHandler;
    public com.android.internal.telephony.data.CellularNetworkValidator.ConnectivityNetworkCallback mNetworkCallback;
    public static com.android.internal.telephony.data.CellularNetworkValidator make(android.content.Context p0) { return null; }
    public static com.android.internal.telephony.data.CellularNetworkValidator getInstance() { return null; }
    public boolean isValidationFeatureSupported() { return false; }
    public CellularNetworkValidator(android.content.Context p0) {}
    public synchronized void validate(int p0, long p1, boolean p2, com.android.internal.telephony.data.CellularNetworkValidator.ValidationCallback p3) {}
    public synchronized void stopValidation() {}
    public synchronized int getSubIdInValidation() { return 0; }
    public synchronized boolean isValidating() { return false; }

    public class ConnectivityNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        ConnectivityNetworkCallback(com.android.internal.telephony.data.CellularNetworkValidator p0, int p1) { super(); }
        public void onAvailable(android.net.Network p0) {}
        public void onLosing(android.net.Network p0, int p1) {}
        public void onLost(android.net.Network p0) {}
        public void onUnavailable() {}
        public void onCapabilitiesChanged(android.net.Network p0, android.net.NetworkCapabilities p1) {}
    }

    private class ValidatedNetworkCache {
        synchronized boolean isRecentlyValidated(int p0) { return false; }
        synchronized void storeLastValidationResult(int p0, boolean p1) {}

        private final class ValidatedNetwork {
            final java.lang.String mValidationIdentity = null;
            long mValidationTimeStamp;
            ValidatedNetwork(com.android.internal.telephony.data.CellularNetworkValidator.ValidatedNetworkCache p0, java.lang.String p1, long p2) {}
            void update(long p0) {}
        }
    }

    public static interface ValidationCallback {
        public void onValidationDone(boolean p0, int p1);
        public void onNetworkAvailable(android.net.Network p0, int p1);
    }
}

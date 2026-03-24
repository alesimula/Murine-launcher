package com.android.internal.telephony.data;

public class DataNetworkController extends android.os.Handler {
    public DataNetworkController(com.android.internal.telephony.Phone p0, android.os.Looper p1) { super(); }
    public void handleMessage(android.os.Message p0) {}
    public void addNetworkRequest(com.android.internal.telephony.data.TelephonyNetworkRequest p0) {}
    public boolean isInternetDataAllowed() { return false; }
    public boolean isInternetUnmetered() { return false; }
    public boolean areAllDataDisconnected() { return false; }
    public java.util.List<com.android.internal.telephony.data.DataEvaluation.DataDisallowedReason> getInternetDataDisallowedReasons() { return null; }
    public boolean isInternetNetwork(int p0) { return false; }
    public void removeNetworkRequest(com.android.internal.telephony.data.TelephonyNetworkRequest p0) {}
    public boolean isNetworkRequestExisting(com.android.internal.telephony.data.TelephonyNetworkRequest p0) { return false; }
    public com.android.internal.telephony.data.DataNetwork getDataNetworkByInterface(java.lang.String p0) { return null; }
    public com.android.internal.telephony.data.DataConfigManager getDataConfigManager() { return null; }
    public com.android.internal.telephony.data.DataProfileManager getDataProfileManager() { return null; }
    public com.android.internal.telephony.data.DataSettingsManager getDataSettingsManager() { return null; }
    public com.android.internal.telephony.data.DataRetryManager getDataRetryManager() { return null; }
    public java.util.List<android.telephony.SubscriptionPlan> getSubscriptionPlans() { return null; }
    public java.util.Set<java.lang.Integer> getUnmeteredOverrideNetworkTypes() { return null; }
    public java.util.Set<java.lang.Integer> getCongestedOverrideNetworkTypes() { return null; }
    public int getDataActivity() { return 0; }
    public void registerDataNetworkControllerCallback(com.android.internal.telephony.data.DataNetworkController.DataNetworkControllerCallback p0) {}
    public void unregisterDataNetworkControllerCallback(com.android.internal.telephony.data.DataNetworkController.DataNetworkControllerCallback p0) {}
    public void tearDownAllDataNetworks(int p0) {}
    public void onTearDownAllDataNetworks(int p0) {}
    public int getInternetDataNetworkState() { return 0; }
    public java.util.List<java.lang.String> getDataServicePackages() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    public static class DataNetworkControllerCallback extends com.android.internal.telephony.data.DataCallback {
        public DataNetworkControllerCallback(java.util.concurrent.Executor p0) { super(null); }
        public void onInternetDataNetworkValidationStatusChanged(int p0) {}
        public void onInternetDataNetworkConnected(java.util.List<com.android.internal.telephony.data.DataNetwork> p0) {}
        public void onDataNetworkConnected(int p0, android.telephony.data.DataProfile p1) {}
        public void onInternetDataNetworkDisconnected() {}
        public void onAnyDataNetworkExistingChanged(boolean p0) {}
        public void onSubscriptionPlanOverride() {}
        public void onPhysicalLinkStatusChanged(int p0) {}
        public void onNrAdvancedCapableByPcoChanged(boolean p0) {}
        public void onDataServiceBound(int p0) {}
    }

    public static class HandoverRule {
        public static final int RULE_TYPE_ALLOWED = 1;
        public static final int RULE_TYPE_DISALLOWED = 2;
        public final int type = 0;
        public final java.util.Set<java.lang.Integer> sourceAccessNetworks = null;
        public final java.util.Set<java.lang.Integer> targetAccessNetworks = null;
        public final java.util.Set<java.lang.Integer> networkCapabilities = null;
        public final boolean isOnlyForRoaming = false;
        public HandoverRule(java.lang.String p0) {}
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HandoverRuleType {
        }
    }

    public static class NetworkRequestList extends java.util.LinkedList<com.android.internal.telephony.data.TelephonyNetworkRequest> {
        public NetworkRequestList() { super(); }
        public NetworkRequestList(com.android.internal.telephony.data.DataNetworkController.NetworkRequestList p0) { super(); }
        public NetworkRequestList(java.util.List<com.android.internal.telephony.data.TelephonyNetworkRequest> p0) { super(); }
        public NetworkRequestList(com.android.internal.telephony.data.TelephonyNetworkRequest p0) { super(); }
        public boolean add(com.android.internal.telephony.data.TelephonyNetworkRequest p0) { return false; }
        public void add(int p0, com.android.internal.telephony.data.TelephonyNetworkRequest p1) {}
        public boolean addAll(java.util.Collection<? extends com.android.internal.telephony.data.TelephonyNetworkRequest> p0) { return false; }
        public com.android.internal.telephony.data.TelephonyNetworkRequest get(int[] p0) { return null; }
        public boolean hasNetworkRequestsFromPackage(java.lang.String p0) { return false; }
        public java.lang.String toString() { return null; }
        public void dump(com.android.internal.telephony.AndroidUtilIndentingPrintWriter p0) {}
    }
}

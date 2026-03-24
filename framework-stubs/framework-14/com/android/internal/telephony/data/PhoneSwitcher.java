package com.android.internal.telephony.data;

public class PhoneSwitcher extends android.os.Handler {
    protected static final boolean VDBG = Boolean.valueOf(false);
    public static int ECBM_DEFAULT_DATA_SWITCH_BASE_TIME_MS;
    public static int DEFAULT_DATA_OVERRIDE_TIMEOUT_MS;
    protected final com.android.internal.telephony.RegistrantList mActivePhoneRegistrants = null;
    protected final android.content.Context mContext = null;
    protected com.android.internal.telephony.data.PhoneSwitcher.PhoneState[] mPhoneStates;
    protected int[] mPhoneSubscriptions;
    protected final com.android.internal.telephony.data.CellularNetworkValidator mValidator = null;
    public final com.android.internal.telephony.data.CellularNetworkValidator.ValidationCallback mValidationCallback = null;
    protected int mMaxDataAttachModemCount;
    protected int mActiveModemCount;
    protected static com.android.internal.telephony.data.PhoneSwitcher sPhoneSwitcher;
    protected int mPrimaryDataSubId;
    protected int mPhoneIdInVoiceCall;
    protected int mPreferredDataPhoneId;
    protected com.android.internal.telephony.subscription.SubscriptionManagerService.WatchedInt mPreferredDataSubId;
    protected static final int EVENT_SUBSCRIPTION_CHANGED = 102;
    protected static final int HAL_COMMAND_UNKNOWN = 0;
    protected static final int HAL_COMMAND_ALLOW_DATA = 1;
    protected static final int HAL_COMMAND_PREFERRED_DATA = 2;
    protected int mHalCommandToUse;
    protected com.android.internal.telephony.RadioConfig mRadioConfig;
    public com.android.internal.telephony.data.PhoneSwitcher.ImsRegTechProvider mImsRegTechProvider;
    protected static final boolean REQUESTS_CHANGED = true;
    protected static final boolean REQUESTS_UNCHANGED = false;
    public static com.android.internal.telephony.data.PhoneSwitcher getInstance() { return null; }
    public static com.android.internal.telephony.data.PhoneSwitcher make(int p0, android.content.Context p1, android.os.Looper p2) { return null; }
    public PhoneSwitcher(int p0, android.content.Context p1, android.os.Looper p2) { super(); }
    public void handleMessage(android.os.Message p0) {}
    protected boolean onEvaluate(boolean p0, java.lang.String p1) { return false; }
    protected void activate(int p0) {}
    protected void deactivate(int p0) {}
    public void onRadioCapChanged(int p0) {}
    public void overrideDefaultDataForEmergency(int p0, int p1, java.util.concurrent.CompletableFuture<java.lang.Boolean> p2) {}
    protected void sendRilCommands(int p0) {}
    protected int getSubIdFromNetworkSpecifier(android.net.NetworkSpecifier p0) { return 0; }
    protected void updatePreferredDataPhoneId() {}
    protected void transitionToEmergencyPhone() {}
    public synchronized boolean shouldApplyNetworkRequest(com.android.internal.telephony.data.TelephonyNetworkRequest p0, int p1) { return false; }
    boolean isEmergencyNetworkRequest(com.android.internal.telephony.data.TelephonyNetworkRequest p0) { return false; }
    protected boolean isPhoneActive(int p0) { return false; }
    public void registerForActivePhoneSwitch(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForActivePhoneSwitch(android.os.Handler p0) {}
    public void trySetOpportunisticDataSubscription(int p0, boolean p1, com.android.internal.telephony.ISetOpportunisticDataCallback p2) {}
    protected boolean isPhoneInVoiceCall(com.android.internal.telephony.Phone p0) { return false; }
    public int getPreferredDataPhoneId() { return 0; }
    protected void logl(java.lang.String p0) {}
    protected void notifyPreferredDataSubIdChanged() {}
    public int getActiveDataSubId() { return 0; }
    public int getAutoSelectedDataSubId() { return 0; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private class DefaultNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {
        public int mExpectedSubId;
        public int mSwitchReason;
        public boolean isDefaultNetworkOnCellular;
        public void onCapabilitiesChanged(android.net.Network p0, android.net.NetworkCapabilities p1) {}
        public void onLost(android.net.Network p0) {}
    }

    private static final class EmergencyOverrideRequest {
        int mPhoneId;
        int mGnssOverrideTimeMs;
        java.util.concurrent.CompletableFuture<java.lang.Boolean> mOverrideCompleteFuture;
        boolean mRequiresEcmFinish;
        boolean mPendingOriginatingCall;
        boolean isCallbackAvailable() { return false; }
        void sendOverrideCompleteCallbackResultAndClear(boolean p0) {}
        public java.lang.String toString() { return null; }
    }

    public static interface ImsRegTechProvider {
        public int get(android.content.Context p0, int p1);
    }

    protected static class PhoneState {
        public volatile boolean active;
        public int dataRegState;
        public long lastRequested;
        protected PhoneState() {}
    }

    private static class PhoneSwitcherNetworkRequestListener extends com.android.internal.telephony.NetworkFactory {
        public PhoneSwitcherNetworkRequestListener(android.os.Looper p0, android.content.Context p1, android.net.NetworkCapabilities p2, com.android.internal.telephony.data.PhoneSwitcher p3) { super(null, null, null, null); }
        protected void needNetworkFor(android.net.NetworkRequest p0) {}
        protected void releaseNetworkFor(android.net.NetworkRequest p0) {}
    }
}

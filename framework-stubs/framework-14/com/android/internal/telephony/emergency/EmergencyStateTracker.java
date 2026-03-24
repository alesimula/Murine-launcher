package com.android.internal.telephony.emergency;

public class EmergencyStateTracker {
    public static final int EMERGENCY_TYPE_CALL = 1;
    public static final int EMERGENCY_TYPE_SMS = 2;
    public static final int MSG_SET_EMERGENCY_MODE_DONE = 1;
    public static final int MSG_EXIT_EMERGENCY_MODE_DONE = 2;
    public static final int MSG_SET_EMERGENCY_CALLBACK_MODE_DONE = 3;
    public android.os.Handler getHandler() { return null; }
    public static void make(android.content.Context p0, boolean p1) {}
    public static com.android.internal.telephony.emergency.EmergencyStateTracker getInstance() { return null; }
    public EmergencyStateTracker(android.content.Context p0, android.os.Looper p1, boolean p2, com.android.internal.telephony.emergency.EmergencyStateTracker.PhoneFactoryProxy p3, com.android.internal.telephony.emergency.EmergencyStateTracker.PhoneSwitcherProxy p4, com.android.internal.telephony.emergency.EmergencyStateTracker.TelephonyManagerProxy p5, com.android.internal.telephony.emergency.RadioOnHelper p6, long p7) {}
    public java.util.concurrent.CompletableFuture<java.lang.Integer> startEmergencyCall(com.android.internal.telephony.Phone p0, java.lang.String p1, boolean p2) { return null; }
    public void endCall(java.lang.String p0) {}
    public boolean isInEmergencyMode() { return false; }
    public boolean isInEmergencyCall() { return false; }
    public android.telephony.EmergencyRegResult getEmergencyRegResult() { return null; }
    public void onEmergencyTransportChanged(int p0, int p1) {}
    public void onEmergencyCallDomainUpdated(int p0, java.lang.String p1) {}
    public void onEmergencyCallStateChanged(com.android.internal.telephony.Call.State p0, java.lang.String p1) {}
    public void exitEmergencyCallbackMode() {}
    public void exitEmergencyCallbackMode(java.lang.Runnable p0) {}
    public boolean isInEcm() { return false; }
    public boolean isInImsEcm() { return false; }
    public boolean isInCdmaEcm() { return false; }
    public java.util.concurrent.CompletableFuture<java.lang.Integer> startEmergencySms(com.android.internal.telephony.Phone p0, java.lang.String p1, boolean p2) { return null; }
    public void endSms(java.lang.String p0, android.telephony.emergency.EmergencyNumber p1) {}
    public void switchDdsDelayed(com.android.internal.telephony.Phone p0, java.util.function.Consumer<java.lang.Boolean> p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EmergencyType {
    }

    private class MyHandler extends android.os.Handler {
        MyHandler(com.android.internal.telephony.emergency.EmergencyStateTracker p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }

    public static interface PhoneFactoryProxy {
        public com.android.internal.telephony.Phone[] getPhones();
    }

    public static interface PhoneSwitcherProxy {
        public com.android.internal.telephony.data.PhoneSwitcher getPhoneSwitcher();
    }

    public static interface TelephonyManagerProxy {
        public int getPhoneCount();
    }

    private static class TelephonyManagerProxyImpl implements com.android.internal.telephony.emergency.EmergencyStateTracker.TelephonyManagerProxy {
        TelephonyManagerProxyImpl(android.content.Context p0) {}
        public int getPhoneCount() { return 0; }
    }
}

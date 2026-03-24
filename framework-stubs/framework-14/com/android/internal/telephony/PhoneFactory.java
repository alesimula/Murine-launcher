package com.android.internal.telephony;

public class PhoneFactory {
    static final java.lang.String LOG_TAG = "PhoneFactory";
    static final int SOCKET_OPEN_RETRY_MILLIS = 2000;
    static final int SOCKET_OPEN_MAX_RETRY = 3;
    static final boolean DBG = false;
    static final java.lang.Object sLockProxyPhones = null;
    public PhoneFactory() {}
    public static void makeDefaultPhones(android.content.Context p0) {}
    public static void makeDefaultPhone(android.content.Context p0) {}
    public static void onMultiSimConfigChanged(android.content.Context p0, int p1) {}
    public static com.android.internal.telephony.Phone getDefaultPhone() { return null; }
    public static com.android.internal.telephony.Phone getPhone(int p0) { return null; }
    public static com.android.internal.telephony.Phone[] getPhones() { return null; }
    public static com.android.internal.telephony.data.TelephonyNetworkFactory getNetworkFactory(int p0) { return null; }
    public static int calculatePreferredNetworkType(int p0) { return 0; }
    public static int getDefaultSubscription() { return 0; }
    public static boolean isSMSPromptEnabled() { return false; }
    public static com.android.internal.telephony.Phone makeImsPhone(com.android.internal.telephony.PhoneNotifier p0, com.android.internal.telephony.Phone p1) { return null; }
    public static com.android.internal.telephony.SmsController getSmsController() { return null; }
    public static com.android.internal.telephony.CommandsInterface[] getCommandsInterfaces() { return null; }
    public static void addLocalLog(java.lang.String p0, int p1) {}
    public static void localLog(java.lang.String p0, java.lang.String p1) {}
    public static com.android.internal.telephony.metrics.MetricsCollector getMetricsCollector() { return null; }
    public static void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}

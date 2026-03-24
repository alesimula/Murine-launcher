package com.android.internal.telephony;

public final class SmsApplication {
    static final java.lang.String LOG_TAG = "SmsApplication";
    private static final java.lang.String PHONE_PACKAGE_NAME = "com.android.phone";
    private static final java.lang.String BLUETOOTH_PACKAGE_NAME = "com.android.bluetooth";
    private static final java.lang.String MMS_SERVICE_PACKAGE_NAME = "com.android.mms.service";
    private static final java.lang.String TELEPHONY_PROVIDER_PACKAGE_NAME = "com.android.providers.telephony";
    private static final java.lang.String SCHEME_SMS = "sms";
    private static final java.lang.String SCHEME_SMSTO = "smsto";
    private static final java.lang.String SCHEME_MMS = "mms";
    private static final java.lang.String SCHEME_MMSTO = "mmsto";
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_MULTIUSER = false;
    private static final int[] DEFAULT_APP_EXCLUSIVE_APPOPS = null;
    private static com.android.internal.telephony.SmsApplication.SmsPackageMonitor sSmsPackageMonitor;
    public SmsApplication() {}
    private static int getIncomingUserId(android.content.Context p0) { return 0; }
    public static java.util.Collection<com.android.internal.telephony.SmsApplication.SmsApplicationData> getApplicationCollection(android.content.Context p0) { return null; }
    public static java.util.Collection<com.android.internal.telephony.SmsApplication.SmsApplicationData> getApplicationCollectionAsUser(android.content.Context p0, int p1) { return null; }
    private static java.util.Collection<com.android.internal.telephony.SmsApplication.SmsApplicationData> getApplicationCollectionInternal(android.content.Context p0, int p1) { return null; }
    public static com.android.internal.telephony.SmsApplication.SmsApplicationData getApplicationForPackage(java.util.Collection<com.android.internal.telephony.SmsApplication.SmsApplicationData> p0, java.lang.String p1) { return null; }
    private static com.android.internal.telephony.SmsApplication.SmsApplicationData getApplication(android.content.Context p0, boolean p1, int p2) { return null; }
    private static java.lang.String getDefaultSmsPackage(android.content.Context p0, int p1) { return null; }
    private static void defaultSmsAppChanged(android.content.Context p0) {}
    private static boolean tryFixExclusiveSmsAppops(android.content.Context p0, com.android.internal.telephony.SmsApplication.SmsApplicationData p1, boolean p2) { return false; }
    public static void setDefaultApplication(java.lang.String p0, android.content.Context p1) {}
    public static void setDefaultApplicationAsUser(java.lang.String p0, android.content.Context p1, int p2) {}
    private static void setDefaultApplicationInternal(java.lang.String p0, android.content.Context p1, int p2) {}
    public static void broadcastSmsAppChange(android.content.Context p0, android.os.UserHandle p1, java.lang.String p2, java.lang.String p3) {}
    private static void broadcastSmsAppChange(android.content.Context p0, android.os.UserHandle p1, com.android.internal.telephony.SmsApplication.SmsApplicationData p2, com.android.internal.telephony.SmsApplication.SmsApplicationData p3) {}
    private static void assignExclusiveSmsPermissionsToSystemApp(android.content.Context p0, android.content.pm.PackageManager p1, android.app.AppOpsManager p2, java.lang.String p3) {}
    private static void setExclusiveAppops(java.lang.String p0, android.app.AppOpsManager p1, int p2, int p3) {}
    public static void initSmsPackageMonitor(android.content.Context p0) {}
    private static void configurePreferredActivity(android.content.pm.PackageManager p0, android.content.ComponentName p1, int p2) {}
    private static void replacePreferredActivity(android.content.pm.PackageManager p0, android.content.ComponentName p1, int p2, java.lang.String p3) {}
    public static com.android.internal.telephony.SmsApplication.SmsApplicationData getSmsApplicationData(java.lang.String p0, android.content.Context p1) { return null; }
    public static android.content.ComponentName getDefaultSmsApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultSmsApplicationAsUser(android.content.Context p0, boolean p1, int p2) { return null; }
    public static android.content.ComponentName getDefaultMmsApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultRespondViaMessageApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultSendToApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultExternalTelephonyProviderChangedApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultSimFullApplication(android.content.Context p0, boolean p1) { return null; }
    public static boolean shouldWriteMessageForPackage(java.lang.String p0, android.content.Context p1) { return false; }
    public static boolean isDefaultSmsApplication(android.content.Context p0, java.lang.String p1) { return false; }
    private static java.lang.String getDefaultSmsApplicationPackageName(android.content.Context p0) { return null; }

    private static final class SmsPackageMonitor extends com.android.internal.content.PackageMonitor {
        final android.content.Context mContext = null;
        public SmsPackageMonitor(android.content.Context p0) { super(); }
        public void onPackageDisappeared(java.lang.String p0, int p1) {}
        public void onPackageAppeared(java.lang.String p0, int p1) {}
        public void onPackageModified(java.lang.String p0) {}
        private void onPackageChanged() {}
    }

    public static class SmsApplicationData {
        private java.lang.String mApplicationName;
        public java.lang.String mPackageName;
        private java.lang.String mSmsReceiverClass;
        private java.lang.String mMmsReceiverClass;
        private java.lang.String mRespondViaMessageClass;
        private java.lang.String mSendToClass;
        private java.lang.String mSmsAppChangedReceiverClass;
        private java.lang.String mProviderChangedReceiverClass;
        private java.lang.String mSimFullReceiverClass;
        private int mUid;
        public boolean isComplete() { return false; }
        public SmsApplicationData(java.lang.String p0, int p1) {}
        public java.lang.String getApplicationName(android.content.Context p0) { return null; }
        public java.lang.String toString() { return null; }
    }
}

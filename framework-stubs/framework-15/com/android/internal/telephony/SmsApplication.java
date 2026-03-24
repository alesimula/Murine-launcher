package com.android.internal.telephony;

public final class SmsApplication {
    static final java.lang.String LOG_TAG = "SmsApplication";
    public static final java.lang.String PHONE_PACKAGE_NAME = "com.android.phone";
    public static final java.lang.String MMS_SERVICE_PACKAGE_NAME = "com.android.mms.service";
    public static final java.lang.String TELEPHONY_PROVIDER_PACKAGE_NAME = "com.android.providers.telephony";
    public static final java.lang.String ACTION_DEFAULT_SMS_PACKAGE_CHANGED_INTERNAL = "android.provider.action.DEFAULT_SMS_PACKAGE_CHANGED_INTERNAL";
    public static final java.lang.String PERMISSION_MONITOR_DEFAULT_SMS_PACKAGE = "android.permission.MONITOR_DEFAULT_SMS_PACKAGE";
    public SmsApplication() {}
    public static java.util.Collection<com.android.internal.telephony.SmsApplication.SmsApplicationData> getApplicationCollection(android.content.Context p0) { return null; }
    public static java.util.Collection<com.android.internal.telephony.SmsApplication.SmsApplicationData> getApplicationCollectionAsUser(android.content.Context p0, int p1) { return null; }
    public static com.android.internal.telephony.SmsApplication.SmsApplicationData getApplicationForPackage(java.util.Collection<com.android.internal.telephony.SmsApplication.SmsApplicationData> p0, java.lang.String p1) { return null; }
    public static void setDefaultApplication(java.lang.String p0, android.content.Context p1) {}
    public static void setDefaultApplicationAsUser(java.lang.String p0, android.content.Context p1, int p2) {}
    public static void initSmsPackageMonitor(android.content.Context p0) {}
    public static com.android.internal.telephony.SmsApplication.SmsApplicationData getSmsApplicationData(java.lang.String p0, android.content.Context p1) { return null; }
    public static android.content.ComponentName getDefaultSmsApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultSmsApplicationAsUser(android.content.Context p0, boolean p1, android.os.UserHandle p2) { return null; }
    public static android.content.ComponentName getDefaultMmsApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultMmsApplicationAsUser(android.content.Context p0, boolean p1, android.os.UserHandle p2) { return null; }
    public static android.content.ComponentName getDefaultRespondViaMessageApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultRespondViaMessageApplicationAsUser(android.content.Context p0, boolean p1, android.os.UserHandle p2) { return null; }
    public static android.content.ComponentName getDefaultSendToApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultExternalTelephonyProviderChangedApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultExternalTelephonyProviderChangedApplicationAsUser(android.content.Context p0, boolean p1, android.os.UserHandle p2) { return null; }
    public static android.content.ComponentName getDefaultSimFullApplication(android.content.Context p0, boolean p1) { return null; }
    public static android.content.ComponentName getDefaultSimFullApplicationAsUser(android.content.Context p0, boolean p1, android.os.UserHandle p2) { return null; }
    public static boolean shouldWriteMessageForPackage(java.lang.String p0, android.content.Context p1) { return false; }
    public static boolean shouldWriteMessageForPackageAsUser(java.lang.String p0, android.content.Context p1, android.os.UserHandle p2) { return false; }
    public static boolean isDefaultSmsApplication(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean isDefaultSmsApplicationAsUser(android.content.Context p0, java.lang.String p1, android.os.UserHandle p2) { return false; }
    public static boolean isDefaultMmsApplication(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean isDefaultMmsApplicationAsUser(android.content.Context p0, java.lang.String p1, android.os.UserHandle p2) { return false; }

    public static class SmsApplicationData {
        public java.lang.String mPackageName;
        public boolean isComplete() { return false; }
        public SmsApplicationData(java.lang.String p0, int p1) {}
        public java.lang.String getApplicationName(android.content.Context p0) { return null; }
        public java.lang.String toString() { return null; }
    }

    private static final class SmsPackageMonitor extends com.android.internal.telephony.PackageChangeReceiver {
        final android.content.Context mContext = null;
        public SmsPackageMonitor(android.content.Context p0) { super(); }
        public void onPackageDisappeared() {}
        public void onPackageAppeared() {}
        public void onPackageModified(java.lang.String p0) {}
    }

    private static final class SmsRoleListener implements android.app.role.OnRoleHoldersChangedListener {
        public SmsRoleListener(android.content.Context p0) {}
        public void onRoleHoldersChanged(java.lang.String p0, android.os.UserHandle p1) {}
    }
}

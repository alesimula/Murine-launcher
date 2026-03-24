package com.android.internal.util;

public class NotificationMessagingUtil {
    private static final java.lang.String DEFAULT_SMS_APP_SETTING = "sms_default_application";
    private final android.content.Context mContext = null;
    private android.util.SparseArray<java.lang.String> mDefaultSmsApp;
    private final android.database.ContentObserver mSmsContentObserver = null;
    public NotificationMessagingUtil(android.content.Context p0) {}
    public boolean isImportantMessaging(android.service.notification.StatusBarNotification p0, int p1) { return false; }
    public boolean isMessaging(android.service.notification.StatusBarNotification p0) { return false; }
    private boolean isDefaultMessagingApp(android.service.notification.StatusBarNotification p0) { return false; }
    private void cacheDefaultSmsApp(int p0) {}
    private boolean hasMessagingStyle(android.service.notification.StatusBarNotification p0) { return false; }
    private boolean isCategoryMessage(android.service.notification.StatusBarNotification p0) { return false; }
}

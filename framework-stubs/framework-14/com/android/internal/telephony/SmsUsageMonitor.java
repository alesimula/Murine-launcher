package com.android.internal.telephony;

public class SmsUsageMonitor {
    public static final int PREMIUM_SMS_PERMISSION_UNKNOWN = 0;
    public static final int PREMIUM_SMS_PERMISSION_ASK_USER = 1;
    public static final int PREMIUM_SMS_PERMISSION_NEVER_ALLOW = 2;
    public static final int PREMIUM_SMS_PERMISSION_ALWAYS_ALLOW = 3;
    public static int mergeShortCodeCategories(int p0, int p1) { return 0; }
    public SmsUsageMonitor(android.content.Context p0) {}
    void dispose() {}
    public boolean check(java.lang.String p0, int p1) { return false; }
    public int checkDestination(java.lang.String p0, java.lang.String p1) { return 0; }
    public int getPremiumSmsPermission(java.lang.String p0) { return 0; }
    public void setPremiumSmsPermission(java.lang.String p0, int p1) {}
    public int getShortCodeXmlFileVersion() { return 0; }

    private static class SettingsObserver extends android.database.ContentObserver {
        SettingsObserver(android.os.Handler p0, android.content.Context p1, java.util.concurrent.atomic.AtomicBoolean p2) { super(null); }
        public void onChange(boolean p0) {}
    }

    private static class SettingsObserverHandler extends android.os.Handler {
        SettingsObserverHandler(android.content.Context p0, java.util.concurrent.atomic.AtomicBoolean p1) { super(); }
    }

    private static final class ShortCodePatternMatcher {
        ShortCodePatternMatcher(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
        int getNumberCategory(java.lang.String p0) { return 0; }
    }
}

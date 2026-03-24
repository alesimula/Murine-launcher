package com.android.internal.telephony;

public class AppSmsManager {
    public AppSmsManager(android.content.Context p0) {}
    public java.lang.String createAppSpecificSmsToken(java.lang.String p0, android.app.PendingIntent p1) { return null; }
    public java.lang.String createAppSpecificSmsTokenWithPackageInfo(int p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3) { return null; }
    public boolean handleSmsReceivedIntent(android.content.Intent p0) { return false; }

    private final class AppRequestInfo {
        public final java.lang.String packageName = null;
        public final android.app.PendingIntent pendingIntent = null;
        public final java.lang.String token = null;
        public final long timestamp = 0L;
        public final java.lang.String prefixes = null;
        public final int subId = 0;
        public final boolean packageBasedToken = false;
        AppRequestInfo(com.android.internal.telephony.AppSmsManager p0, java.lang.String p1, android.app.PendingIntent p2, java.lang.String p3) {}
        AppRequestInfo(com.android.internal.telephony.AppSmsManager p0, java.lang.String p1, android.app.PendingIntent p2, java.lang.String p3, java.lang.String p4, int p5, boolean p6) {}
    }
}

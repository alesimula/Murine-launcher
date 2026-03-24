package com.android.internal.telephony;

public class ISmsImplBase extends com.android.internal.telephony.ISms.Stub {
    public ISmsImplBase() { super(); }
    public java.util.List<com.android.internal.telephony.SmsRawData> getAllMessagesFromIccEfForSubscriber(int p0, java.lang.String p1) { return null; }
    public boolean updateMessageOnIccEfForSubscriber(int p0, java.lang.String p1, int p2, int p3, byte[] p4) { return false; }
    public boolean copyMessageToIccEfForSubscriber(int p0, java.lang.String p1, int p2, byte[] p3, byte[] p4) { return false; }
    public void sendDataForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, int p5, byte[] p6, android.app.PendingIntent p7, android.app.PendingIntent p8) {}
    public void sendTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, long p9) {}
    public void sendTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, android.app.PendingIntent p6, android.app.PendingIntent p7, boolean p8, int p9, boolean p10, int p11) {}
    public void injectSmsPduForSubscriber(int p0, byte[] p1, java.lang.String p2, android.app.PendingIntent p3) {}
    public void sendMultipartTextForSubscriber(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, long p9) {}
    public void sendMultipartTextForSubscriberWithOptions(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.util.List<java.lang.String> p5, java.util.List<android.app.PendingIntent> p6, java.util.List<android.app.PendingIntent> p7, boolean p8, int p9, boolean p10, int p11) {}
    public boolean enableCellBroadcastForSubscriber(int p0, int p1, int p2) { return false; }
    public boolean disableCellBroadcastForSubscriber(int p0, int p1, int p2) { return false; }
    public boolean enableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) { return false; }
    public boolean disableCellBroadcastRangeForSubscriber(int p0, int p1, int p2, int p3) { return false; }
    public int getPremiumSmsPermission(java.lang.String p0) { return 0; }
    public int getPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1) { return 0; }
    public void setPremiumSmsPermission(java.lang.String p0, int p1) {}
    public void setPremiumSmsPermissionForSubscriber(int p0, java.lang.String p1, int p2) {}
    public boolean isImsSmsSupportedForSubscriber(int p0) { return false; }
    public boolean isSmsSimPickActivityNeeded(int p0) { return false; }
    public int getPreferredSmsSubscription() { return 0; }
    public java.lang.String getImsSmsFormatForSubscriber(int p0) { return null; }
    public boolean isSMSPromptEnabled() { return false; }
    public void sendStoredText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, android.app.PendingIntent p5, android.app.PendingIntent p6) {}
    public void sendStoredMultipartText(int p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.lang.String p4, java.util.List<android.app.PendingIntent> p5, java.util.List<android.app.PendingIntent> p6) {}
    public android.os.Bundle getCarrierConfigValuesForSubscriber(int p0) { return null; }
    public java.lang.String createAppSpecificSmsToken(int p0, java.lang.String p1, android.app.PendingIntent p2) { return null; }
    public java.lang.String createAppSpecificSmsTokenWithPackageInfo(int p0, java.lang.String p1, java.lang.String p2, android.app.PendingIntent p3) { return null; }
    public int checkSmsShortCodeDestination(int p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { return 0; }
    public java.lang.String getSmscAddressFromIccEfForSubscriber(int p0, java.lang.String p1) { return null; }
    public boolean setSmscAddressOnIccEfForSubscriber(java.lang.String p0, int p1, java.lang.String p2) { return false; }
    public int getSmsCapacityOnIccForSubscriber(int p0) { return 0; }
    public boolean resetAllCellBroadcastRanges(int p0) { return false; }
}

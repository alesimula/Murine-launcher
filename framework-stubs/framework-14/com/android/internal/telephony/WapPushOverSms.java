package com.android.internal.telephony;

public class WapPushOverSms implements android.content.ServiceConnection {
    android.os.PowerWhitelistManager mPowerWhitelistManager;
    public void onServiceConnected(android.content.ComponentName p0, android.os.IBinder p1) {}
    public void onServiceDisconnected(android.content.ComponentName p0) {}
    public WapPushOverSms(android.content.Context p0) {}
    public void dispose() {}
    public int dispatchWapPdu(byte[] p0, com.android.internal.telephony.InboundSmsHandler.SmsBroadcastReceiver p1, com.android.internal.telephony.InboundSmsHandler p2, java.lang.String p3, int p4, long p5) { return 0; }
    public boolean isWapPushForMms(byte[] p0, com.android.internal.telephony.InboundSmsHandler p1) { return false; }
    public static java.lang.String getPermissionForType(java.lang.String p0) { return null; }
    public static java.lang.String getAppOpsStringPermissionForIntent(java.lang.String p0) { return null; }

    private final class DecodedResult {
        java.lang.String mimeType;
        java.lang.String contentType;
        int transactionId;
        int pduType;
        int phoneId;
        int subId;
        byte[] header;
        java.lang.String wapAppId;
        byte[] intentData;
        java.util.HashMap<java.lang.String, java.lang.String> contentTypeParameters;
        com.google.android.mms.pdu.GenericPdu parsedPdu;
        int statusCode;
    }
}

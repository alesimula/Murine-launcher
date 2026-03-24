package com.android.internal.telephony;

public class SmsPermissions {
    static final java.lang.String LOG_TAG = "SmsPermissions";
    public SmsPermissions(com.android.internal.telephony.Phone p0, android.content.Context p1, android.app.AppOpsManager p2) {}
    public boolean checkCallingCanSendText(boolean p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) { return false; }
    public void enforceCallerIsImsAppOrCarrierApp(java.lang.String p0) {}
    public boolean checkCallingCanSendSms(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return false; }
    public boolean checkCallingOrSelfCanSendSms(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return false; }
    public boolean checkCallingOrSelfCanGetSmscAddress(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean checkCallingOrSelfCanSetSmscAddress(java.lang.String p0, java.lang.String p1) { return false; }
    public boolean isCallerDefaultSmsPackage(java.lang.String p0, int p1) { return false; }
    public boolean packageNameMatchesCallingUid(java.lang.String p0) { return false; }
    public boolean packageNameMatchesCallingUid(java.lang.String p0, int p1) { return false; }
    protected void log(java.lang.String p0) {}
    protected void loge(java.lang.String p0) {}
    protected void loge(java.lang.String p0, java.lang.Throwable p1) {}
}

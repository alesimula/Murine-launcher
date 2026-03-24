package com.android.internal.telephony.uicc.euicc;

public class EuiccPort extends com.android.internal.telephony.uicc.UiccPort {
    public com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode mSupportedMepMode;
    public EuiccPort(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, int p3, java.lang.Object p4, com.android.internal.telephony.uicc.UiccCard p5, com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode p6) { super(null, null, null, 0, null, null); }
    public void getSpecVersion(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<com.android.internal.telephony.uicc.euicc.EuiccSpecVersion> p0, android.os.Handler p1) {}
    public void update(android.content.Context p0, com.android.internal.telephony.CommandsInterface p1, com.android.internal.telephony.uicc.IccCardStatus p2, com.android.internal.telephony.uicc.UiccCard p3) {}
    public void updateSupportedMepMode(com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode p0) {}
    public void getAllProfiles(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<android.service.euicc.EuiccProfileInfo[]> p0, android.os.Handler p1) {}
    public final void getProfile(java.lang.String p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<android.service.euicc.EuiccProfileInfo> p1, android.os.Handler p2) {}
    public void disableProfile(java.lang.String p0, boolean p1, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.Void> p2, android.os.Handler p3) {}
    public void switchToProfile(java.lang.String p0, boolean p1, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.Void> p2, android.os.Handler p3) {}
    public java.lang.String getEid() { return null; }
    public void getEid(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.String> p0, android.os.Handler p1) {}
    public void setNickname(java.lang.String p0, java.lang.String p1, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.Void> p2, android.os.Handler p3) {}
    public void deleteProfile(java.lang.String p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.Void> p1, android.os.Handler p2) {}
    public void resetMemory(int p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.Void> p1, android.os.Handler p2) {}
    public void getDefaultSmdpAddress(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.String> p0, android.os.Handler p1) {}
    public void getSmdsAddress(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.String> p0, android.os.Handler p1) {}
    public void setDefaultSmdpAddress(java.lang.String p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.Void> p1, android.os.Handler p2) {}
    public void getRulesAuthTable(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<android.telephony.euicc.EuiccRulesAuthTable> p0, android.os.Handler p1) {}
    public void getEuiccChallenge(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> p0, android.os.Handler p1) {}
    public void getEuiccInfo1(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> p0, android.os.Handler p1) {}
    public void getEuiccInfo2(com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> p0, android.os.Handler p1) {}
    public void authenticateServer(java.lang.String p0, byte[] p1, byte[] p2, byte[] p3, byte[] p4, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> p5, android.os.Handler p6) {}
    public void prepareDownload(byte[] p0, byte[] p1, byte[] p2, byte[] p3, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> p4, android.os.Handler p5) {}
    public void loadBoundProfilePackage(byte[] p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> p1, android.os.Handler p2) {}
    public void cancelSession(byte[] p0, int p1, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<byte[]> p2, android.os.Handler p3) {}
    public void listNotifications(int p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<android.telephony.euicc.EuiccNotification[]> p1, android.os.Handler p2) {}
    public void retrieveNotificationList(int p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<android.telephony.euicc.EuiccNotification[]> p1, android.os.Handler p2) {}
    public void retrieveNotification(int p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<android.telephony.euicc.EuiccNotification> p1, android.os.Handler p2) {}
    public void removeNotificationFromList(int p0, com.android.internal.telephony.uicc.euicc.async.AsyncResultCallback<java.lang.Void> p1, android.os.Handler p2) {}
    public void addDeviceCapability(com.android.internal.telephony.uicc.asn1.Asn1Node.Builder p0, java.lang.String p1) {}
    protected byte[] getDeviceId() { return null; }
    public static byte[] getDeviceId(java.lang.String p0, com.android.internal.telephony.uicc.euicc.EuiccSpecVersion p1) { return null; }
    protected android.content.res.Resources getResources() { return null; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}

    private static interface ApduExceptionHandler {
        public void handleException(java.lang.Throwable p0);
    }

    private static interface ApduIntermediateResultHandler {
        public boolean shouldContinue(com.android.internal.telephony.uicc.IccIoResult p0);
    }

    private static interface ApduRequestBuilder {
        public void build(com.android.internal.telephony.uicc.euicc.apdu.RequestBuilder p0) throws com.android.internal.telephony.uicc.euicc.EuiccCardException, com.android.internal.telephony.uicc.asn1.TagNotFoundException, com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException;
    }

    private static interface ApduResponseHandler<T extends java.lang.Object> {
        public T handleResult(byte[] p0) throws com.android.internal.telephony.uicc.euicc.EuiccCardException, com.android.internal.telephony.uicc.asn1.TagNotFoundException, com.android.internal.telephony.uicc.asn1.InvalidAsn1DataException;
    }
}

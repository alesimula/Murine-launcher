package com.android.internal.telephony.imsphone;

public final class ImsPhoneMmiCode extends android.os.Handler implements com.android.internal.telephony.MmiCode {
    static final java.lang.String LOG_TAG = "ImsPhoneMmiCode";
    @java.lang.Deprecated
    public static final java.lang.String UT_BUNDLE_KEY_CLIR = "queryClir";
    @java.lang.Deprecated
    public static final java.lang.String UT_BUNDLE_KEY_SSINFO = "imsSsInfo";
    static final java.lang.String IcbDnMmi = "Specific Incoming Call Barring";
    static final java.lang.String IcbAnonymousMmi = "Anonymous Incoming Call Barring";
    public static com.android.internal.telephony.imsphone.ImsPhoneMmiCode newFromDialString(java.lang.String p0, com.android.internal.telephony.imsphone.ImsPhone p1) { return null; }
    static com.android.internal.telephony.imsphone.ImsPhoneMmiCode newFromDialString(java.lang.String p0, com.android.internal.telephony.imsphone.ImsPhone p1, android.os.ResultReceiver p2) { return null; }
    public static com.android.internal.telephony.imsphone.ImsPhoneMmiCode newNetworkInitiatedUssd(java.lang.String p0, boolean p1, com.android.internal.telephony.imsphone.ImsPhone p2) { return null; }
    static com.android.internal.telephony.imsphone.ImsPhoneMmiCode newFromUssdUserInput(java.lang.String p0, com.android.internal.telephony.imsphone.ImsPhone p1) { return null; }
    static boolean isScMatchesSuppServType(java.lang.String p0) { return false; }
    static boolean isServiceCodeCallForwarding(java.lang.String p0) { return false; }
    static boolean isServiceCodeCallBarring(java.lang.String p0) { return false; }
    static boolean isPinPukCommand(java.lang.String p0) { return false; }
    public static boolean isSuppServiceCodes(java.lang.String p0, com.android.internal.telephony.Phone p1) { return false; }
    static java.lang.String scToBarringFacility(java.lang.String p0) { return null; }
    public ImsPhoneMmiCode(com.android.internal.telephony.imsphone.ImsPhone p0) { super(); }
    public com.android.internal.telephony.MmiCode.State getState() { return null; }
    public java.lang.CharSequence getMessage() { return null; }
    public com.android.internal.telephony.Phone getPhone() { return null; }
    public void cancel() {}
    public boolean isCancelable() { return false; }
    java.lang.String getDialingNumber() { return null; }
    boolean isMMI() { return false; }
    boolean isShortCode() { return false; }
    public java.lang.String getDialString() { return null; }
    public boolean isPinPukCommand() { return false; }
    public boolean isTemporaryModeCLIR() { return false; }
    public static boolean isEmergencyNumber(com.android.internal.telephony.Phone p0, java.lang.String p1) { return false; }
    public static boolean isCarrierSupportCallerIdVerticalServiceCodes(com.android.internal.telephony.Phone p0) { return false; }
    int getCLIRMode() { return 0; }
    boolean isActivate() { return false; }
    boolean isDeactivate() { return false; }
    boolean isInterrogate() { return false; }
    boolean isRegister() { return false; }
    boolean isErasure() { return false; }
    public boolean isPendingUSSD() { return false; }
    public boolean isUssdRequest() { return false; }
    boolean isSupportedOverImsPhone() { return false; }
    public int callBarAction(java.lang.String p0) { return 0; }
    public void processCode() throws com.android.internal.telephony.CallStateException {}
    void onUssdFinished(java.lang.String p0, boolean p1) {}
    public void onUssdFinishedError() {}
    void sendUssd(java.lang.String p0) {}
    public void handleMessage(android.os.Message p0) {}
    public java.lang.CharSequence getMmiErrorMessage(android.os.AsyncResult p0) { return null; }
    public android.os.ResultReceiver getUssdCallbackReceiver() { return null; }
    public void processImsSsData(android.os.AsyncResult p0) throws com.android.ims.ImsException {}
    void parseSsData(android.telephony.ims.ImsSsData p0) {}
    public boolean isSsInfo() { return false; }
    public void setIsSsInfo(boolean p0) {}
    public java.lang.String toString() { return null; }
    public boolean isNetworkInitiatedUssd() { return false; }
}

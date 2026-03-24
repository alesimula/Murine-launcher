package com.android.internal.telephony.gsm;

public final class GsmMmiCode extends android.os.Handler implements com.android.internal.telephony.MmiCode {
    static final java.lang.String LOG_TAG = "GsmMmiCode";
    static final int MAX_LENGTH_SHORT_CODE = 2;
    static final char END_OF_USSD_COMMAND = '#';
    static final java.lang.String ACTION_ACTIVATE = "*";
    static final java.lang.String ACTION_DEACTIVATE = "#";
    static final java.lang.String ACTION_INTERROGATE = "*#";
    static final java.lang.String ACTION_REGISTER = "**";
    static final java.lang.String ACTION_ERASURE = "##";
    static final java.lang.String SC_CLIP = "30";
    static final java.lang.String SC_CLIR = "31";
    static final java.lang.String SC_CFU = "21";
    static final java.lang.String SC_CFB = "67";
    static final java.lang.String SC_CFNRy = "61";
    static final java.lang.String SC_CFNR = "62";
    static final java.lang.String SC_CF_All = "002";
    static final java.lang.String SC_CF_All_Conditional = "004";
    static final java.lang.String SC_WAIT = "43";
    static final java.lang.String SC_BAOC = "33";
    static final java.lang.String SC_BAOIC = "331";
    static final java.lang.String SC_BAOICxH = "332";
    static final java.lang.String SC_BAIC = "35";
    static final java.lang.String SC_BAICr = "351";
    static final java.lang.String SC_BA_ALL = "330";
    static final java.lang.String SC_BA_MO = "333";
    static final java.lang.String SC_BA_MT = "353";
    static final java.lang.String SC_PWD = "03";
    static final java.lang.String SC_PIN = "04";
    static final java.lang.String SC_PIN2 = "042";
    static final java.lang.String SC_PUK = "05";
    static final java.lang.String SC_PUK2 = "052";
    static final int EVENT_SET_COMPLETE = 1;
    static final int EVENT_GET_CLIR_COMPLETE = 2;
    static final int EVENT_QUERY_CF_COMPLETE = 3;
    static final int EVENT_USSD_COMPLETE = 4;
    static final int EVENT_QUERY_COMPLETE = 5;
    static final int EVENT_SET_CFF_COMPLETE = 6;
    static final int EVENT_USSD_CANCEL_COMPLETE = 7;
    com.android.internal.telephony.GsmCdmaPhone mPhone;
    android.content.Context mContext;
    com.android.internal.telephony.uicc.UiccCardApplication mUiccApplication;
    com.android.internal.telephony.uicc.IccRecords mIccRecords;
    java.lang.String mAction;
    java.lang.String mSc;
    java.lang.String mSia;
    java.lang.String mSib;
    java.lang.String mSic;
    java.lang.String mPoundString;
    public java.lang.String mDialingNumber;
    java.lang.String mPwd;
    com.android.internal.telephony.MmiCode.State mState;
    java.lang.CharSequence mMessage;
    static java.util.regex.Pattern sPatternSuppService;
    static final int MATCH_GROUP_POUND_STRING = 1;
    static final int MATCH_GROUP_ACTION = 2;
    static final int MATCH_GROUP_SERVICE_CODE = 3;
    static final int MATCH_GROUP_SIA = 5;
    static final int MATCH_GROUP_SIB = 7;
    static final int MATCH_GROUP_SIC = 9;
    static final int MATCH_GROUP_PWD_CONFIRM = 11;
    static final int MATCH_GROUP_DIALING_NUMBER = 12;
    public static com.android.internal.telephony.gsm.GsmMmiCode newFromDialString(java.lang.String p0, com.android.internal.telephony.GsmCdmaPhone p1, com.android.internal.telephony.uicc.UiccCardApplication p2) { return null; }
    public static com.android.internal.telephony.gsm.GsmMmiCode newFromDialString(java.lang.String p0, com.android.internal.telephony.GsmCdmaPhone p1, com.android.internal.telephony.uicc.UiccCardApplication p2, android.os.ResultReceiver p3) { return null; }
    public static com.android.internal.telephony.gsm.GsmMmiCode newNetworkInitiatedUssd(java.lang.String p0, boolean p1, com.android.internal.telephony.GsmCdmaPhone p2, com.android.internal.telephony.uicc.UiccCardApplication p3) { return null; }
    public static com.android.internal.telephony.gsm.GsmMmiCode newFromUssdUserInput(java.lang.String p0, com.android.internal.telephony.GsmCdmaPhone p1, com.android.internal.telephony.uicc.UiccCardApplication p2) { return null; }
    public void processSsData(android.os.AsyncResult p0) {}
    void parseSsData(com.android.internal.telephony.gsm.SsData p0) {}
    public static com.android.internal.telephony.gsm.SsData.ServiceType cfReasonToServiceType(int p0) { return null; }
    public static com.android.internal.telephony.gsm.SsData.RequestType cfActionToRequestType(int p0) { return null; }
    static boolean isServiceCodeCallForwarding(java.lang.String p0) { return false; }
    static boolean isServiceCodeCallBarring(java.lang.String p0) { return false; }
    static java.lang.String scToBarringFacility(java.lang.String p0) { return null; }
    public static com.android.internal.telephony.gsm.SsData.ServiceType cbFacilityToServiceType(java.lang.String p0) { return null; }
    public GsmMmiCode(com.android.internal.telephony.GsmCdmaPhone p0, com.android.internal.telephony.uicc.UiccCardApplication p1) { super(); }
    public com.android.internal.telephony.MmiCode.State getState() { return null; }
    public java.lang.CharSequence getMessage() { return null; }
    public com.android.internal.telephony.Phone getPhone() { return null; }
    public void cancel() {}
    public boolean isCancelable() { return false; }
    public boolean isNetworkInitiatedUssd() { return false; }
    boolean isMMI() { return false; }
    boolean isShortCode() { return false; }
    public java.lang.String getDialString() { return null; }
    public static boolean isTwoDigitShortCode(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    public boolean isPinPukCommand() { return false; }
    public boolean isTemporaryModeCLIR() { return false; }
    public static boolean isEmergencyNumber(com.android.internal.telephony.Phone p0, java.lang.String p1) { return false; }
    public static boolean isCarrierSupportCallerIdVerticalServiceCodes(com.android.internal.telephony.Phone p0) { return false; }
    public int getCLIRMode() { return 0; }
    public static com.android.internal.telephony.gsm.SsData.RequestType clirModeToRequestType(int p0) { return null; }
    boolean isActivate() { return false; }
    boolean isDeactivate() { return false; }
    boolean isInterrogate() { return false; }
    boolean isRegister() { return false; }
    boolean isErasure() { return false; }
    public boolean isPendingUSSD() { return false; }
    public boolean isUssdRequest() { return false; }
    public boolean isSsInfo() { return false; }
    public static boolean isVoiceUnconditionalForwarding(int p0, int p1) { return false; }
    public void processCode() throws com.android.internal.telephony.CallStateException {}
    public void onUssdFinished(java.lang.String p0, boolean p1) {}
    public void onUssdFinishedError() {}
    public void onUssdRelease() {}
    public void sendUssd(java.lang.String p0) {}
    public void handleMessage(android.os.Message p0) {}
    public java.lang.CharSequence getErrorMessage(android.os.AsyncResult p0) { return null; }
    public android.os.ResultReceiver getUssdCallbackReceiver() { return null; }
    public static java.util.ArrayList<java.lang.String> getControlStrings(com.android.internal.telephony.gsm.SsData.RequestType p0, com.android.internal.telephony.gsm.SsData.ServiceType p1) { return null; }
    public static java.util.ArrayList<java.lang.String> getControlStringsForPwd(com.android.internal.telephony.gsm.SsData.RequestType p0, com.android.internal.telephony.gsm.SsData.ServiceType p1) { return null; }
    public java.lang.String toString() { return null; }
}

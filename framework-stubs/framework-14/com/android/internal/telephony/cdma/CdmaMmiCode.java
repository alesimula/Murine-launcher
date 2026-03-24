package com.android.internal.telephony.cdma;

public final class CdmaMmiCode extends android.os.Handler implements com.android.internal.telephony.MmiCode {
    static final java.lang.String LOG_TAG = "CdmaMmiCode";
    static final java.lang.String ACTION_REGISTER = "**";
    static final java.lang.String SC_PIN = "04";
    static final java.lang.String SC_PIN2 = "042";
    static final java.lang.String SC_PUK = "05";
    static final java.lang.String SC_PUK2 = "052";
    static final int EVENT_SET_COMPLETE = 1;
    com.android.internal.telephony.GsmCdmaPhone mPhone;
    android.content.Context mContext;
    com.android.internal.telephony.uicc.UiccCardApplication mUiccApplication;
    java.lang.String mAction;
    java.lang.String mSc;
    java.lang.String mSia;
    java.lang.String mSib;
    java.lang.String mSic;
    java.lang.String mPoundString;
    java.lang.String mDialingNumber;
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
    public static com.android.internal.telephony.cdma.CdmaMmiCode newFromDialString(java.lang.String p0, com.android.internal.telephony.GsmCdmaPhone p1, com.android.internal.telephony.uicc.UiccCardApplication p2) { return null; }
    CdmaMmiCode(com.android.internal.telephony.GsmCdmaPhone p0, com.android.internal.telephony.uicc.UiccCardApplication p1) { super(); }
    public com.android.internal.telephony.MmiCode.State getState() { return null; }
    public java.lang.CharSequence getMessage() { return null; }
    public com.android.internal.telephony.Phone getPhone() { return null; }
    public void cancel() {}
    public boolean isCancelable() { return false; }
    public boolean isPinPukCommand() { return false; }
    boolean isRegister() { return false; }
    public boolean isUssdRequest() { return false; }
    public java.lang.String getDialString() { return null; }
    public void processCode() {}
    public void handleMessage(android.os.Message p0) {}
    public android.os.ResultReceiver getUssdCallbackReceiver() { return null; }
    public static java.lang.String getCallForwardingPrefixAndNumber(int p0, int p1, java.lang.String p2) { return null; }
    public static java.lang.String getCallWaitingPrefix(boolean p0) { return null; }
    public boolean isNetworkInitiatedUssd() { return false; }
}

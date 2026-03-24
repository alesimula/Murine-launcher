package com.android.internal.telephony;

public interface MmiCode {
    public static final java.util.regex.Pattern sPatternCdmaMmiCodeWhileRoaming = null;
    public static final int MATCH_GROUP_CDMA_MMI_CODE_SERVICE_CODE = 1;
    public static final int MATCH_GROUP_CDMA_MMI_CODE_NUMBER_PREFIX = 2;
    public static final int MATCH_GROUP_CDMA_MMI_CODE_NUMBER = 3;
    public com.android.internal.telephony.MmiCode.State getState();
    public java.lang.CharSequence getMessage();
    public com.android.internal.telephony.Phone getPhone();
    public void cancel();
    public boolean isUssdRequest();
    public boolean isNetworkInitiatedUssd();
    public boolean isCancelable();
    public boolean isPinPukCommand();
    public void processCode() throws com.android.internal.telephony.CallStateException;
    public android.os.ResultReceiver getUssdCallbackReceiver();
    public java.lang.String getDialString();

    public static enum State {
        PENDING,
        CANCELLED,
        COMPLETE,
        FAILED;
    }
}

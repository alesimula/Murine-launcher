package com.android.internal.telephony.cat;

public class CatResponseMessage {
    com.android.internal.telephony.cat.CommandDetails mCmdDet;
    com.android.internal.telephony.cat.ResultCode mResCode;
    int mUsersMenuSelection;
    java.lang.String mUsersInput;
    boolean mUsersYesNoSelection;
    boolean mUsersConfirm;
    boolean mIncludeAdditionalInfo;
    int mAdditionalInfo;
    int mEventValue;
    byte[] mAddedInfo;
    public CatResponseMessage(com.android.internal.telephony.cat.CatCmdMessage p0) {}
    public void setResultCode(com.android.internal.telephony.cat.ResultCode p0) {}
    public void setMenuSelection(int p0) {}
    public void setInput(java.lang.String p0) {}
    public void setEventDownload(int p0, byte[] p1) {}
    public void setYesNo(boolean p0) {}
    public void setConfirmation(boolean p0) {}
    public void setAdditionalInfo(int p0) {}
    com.android.internal.telephony.cat.CommandDetails getCmdDetails() { return null; }
}

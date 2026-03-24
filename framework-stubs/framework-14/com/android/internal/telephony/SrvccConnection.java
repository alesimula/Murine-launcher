package com.android.internal.telephony;

public class SrvccConnection {
    public static final int CALL_TYPE_NORMAL = 0;
    public static final int CALL_TYPE_EMERGENCY = 1;
    public static final int SUBSTATE_NONE = 0;
    public static final int SUBSTATE_PREALERTING = 1;
    public static final int TONE_NONE = 0;
    public static final int TONE_LOCAL = 1;
    public static final int TONE_NETWORK = 2;
    public SrvccConnection(android.telephony.ims.ImsCallProfile p0, com.android.internal.telephony.imsphone.ImsPhoneConnection p1, int p2) {}
    public SrvccConnection(com.android.ims.internal.ConferenceParticipant p0, int p1) {}
    public int getType() { return 0; }
    public com.android.internal.telephony.Call.State getState() { return null; }
    public void setState(com.android.internal.telephony.Call.State p0) {}
    public int getSubState() { return 0; }
    public int getRingbackToneType() { return 0; }
    public boolean isMultiParty() { return false; }
    public boolean isIncoming() { return false; }
    public java.lang.String getNumber() { return null; }
    public int getNumberPresentation() { return 0; }
    public java.lang.String getName() { return null; }
    public int getNamePresentation() { return 0; }
    public java.lang.String toString() { return null; }
}

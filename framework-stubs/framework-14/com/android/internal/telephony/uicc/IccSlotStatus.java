package com.android.internal.telephony.uicc;

public class IccSlotStatus {
    public static final int STATE_ACTIVE = 1;
    public com.android.internal.telephony.uicc.IccCardStatus.CardState cardState;
    public java.lang.String atr;
    public java.lang.String eid;
    public com.android.internal.telephony.uicc.IccSimPortInfo[] mSimPortInfos;
    public com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode mSupportedMepMode;
    public IccSlotStatus() {}
    public void setCardState(int p0) {}
    public void setMultipleEnabledProfilesMode(int p0) {}
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static enum MultipleEnabledProfilesMode {
        NONE,
        MEP_A1,
        MEP_A2,
        MEP_B;
        public boolean isMepAMode() { return false; }
        public boolean isMepA1Mode() { return false; }
        public boolean isMepMode() { return false; }
    }
}

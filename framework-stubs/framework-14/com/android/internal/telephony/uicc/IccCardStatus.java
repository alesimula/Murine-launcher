package com.android.internal.telephony.uicc;

public class IccCardStatus {
    public static final int CARD_MAX_APPS = 8;
    public com.android.internal.telephony.uicc.IccCardStatus.CardState mCardState;
    public com.android.internal.telephony.uicc.IccCardStatus.PinState mUniversalPinState;
    public int mGsmUmtsSubscriptionAppIndex;
    public int mCdmaSubscriptionAppIndex;
    public int mImsSubscriptionAppIndex;
    public java.lang.String atr;
    public java.lang.String iccid;
    public java.lang.String eid;
    public com.android.internal.telephony.uicc.IccCardApplicationStatus[] mApplications;
    public com.android.internal.telephony.uicc.IccSlotPortMapping mSlotPortMapping;
    public com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode mSupportedMepMode;
    public IccCardStatus() {}
    public void setMultipleEnabledProfilesMode(int p0) {}
    public void setCardState(int p0) {}
    public void setUniversalPinState(int p0) {}
    public java.lang.String toString() { return null; }

    public static enum CardState {
        CARDSTATE_ABSENT,
        CARDSTATE_PRESENT,
        CARDSTATE_ERROR,
        CARDSTATE_RESTRICTED;
        public boolean isCardPresent() { return false; }
    }

    public static enum PinState {
        PINSTATE_UNKNOWN,
        PINSTATE_ENABLED_NOT_VERIFIED,
        PINSTATE_ENABLED_VERIFIED,
        PINSTATE_DISABLED,
        PINSTATE_ENABLED_BLOCKED,
        PINSTATE_ENABLED_PERM_BLOCKED;
        boolean isPermBlocked() { return false; }
        boolean isPinRequired() { return false; }
        boolean isPukRequired() { return false; }
    }
}

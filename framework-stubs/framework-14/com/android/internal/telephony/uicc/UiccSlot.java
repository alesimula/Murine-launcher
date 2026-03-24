package com.android.internal.telephony.uicc;

public class UiccSlot extends android.os.Handler {
    public static final java.lang.String EXTRA_ICC_CARD_ADDED = "com.android.internal.telephony.uicc.ICC_CARD_ADDED";
    public static final int INVALID_PHONE_ID = -1;
    public static final int VOLTAGE_CLASS_UNKNOWN = 0;
    public static final int VOLTAGE_CLASS_A = 1;
    public static final int VOLTAGE_CLASS_B = 2;
    public static final int VOLTAGE_CLASS_C = 3;
    public UiccSlot(android.content.Context p0, boolean p1) { super(); }
    public void update(com.android.internal.telephony.CommandsInterface p0, com.android.internal.telephony.uicc.IccCardStatus p1, int p2, int p3) {}
    public void update(com.android.internal.telephony.CommandsInterface[] p0, com.android.internal.telephony.uicc.IccSlotStatus p1, int p2) {}
    public int[] getPortList() { return null; }
    public boolean isValidPortIndex(int p0) { return false; }
    public int getPortIndexFromPhoneId(int p0) { return 0; }
    public int getPortIndexFromIccId(java.lang.String p0) { return 0; }
    public int getPhoneIdFromPortIndex(int p0) { return 0; }
    public boolean isPortActive(int p0) { return false; }
    public boolean isMultipleEnabledProfileSupported() { return false; }
    public boolean isStateUnknown() { return false; }
    public boolean isEuicc() { return false; }
    public int getMinimumVoltageClass() { return 0; }
    public boolean isActive() { return false; }
    public boolean isRemovable() { return false; }
    public java.lang.String getIccId(int p0) { return null; }
    public java.lang.String getEid() { return null; }
    public boolean isExtendedApduSupported() { return false; }
    protected void finalize() {}
    public void handleMessage(android.os.Message p0) {}
    public com.android.internal.telephony.uicc.IccCardStatus.CardState getCardState() { return null; }
    public com.android.internal.telephony.uicc.UiccCard getUiccCard() { return null; }
    public com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode getSupportedMepMode() { return null; }
    public void onRadioStateUnavailable(int p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VoltageClass {
    }
}

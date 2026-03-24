package com.android.internal.telephony.uicc;

public class UiccController extends android.os.Handler {
    public static final int INVALID_SLOT_ID = -1;
    public static final int APP_FAM_3GPP = 1;
    public static final int APP_FAM_3GPP2 = 2;
    public static final int APP_FAM_IMS = 3;
    public com.android.internal.telephony.uicc.UiccSlot[] mUiccSlots;
    public static java.util.ArrayList<com.android.internal.telephony.uicc.IccSlotStatus> sLastSlotStatus;
    public android.content.Context mContext;
    protected com.android.internal.telephony.RegistrantList mIccChangedRegistrants;
    public static com.android.internal.telephony.uicc.UiccController make(android.content.Context p0) { return null; }
    public int getPhoneIdFromSlotPortIndex(int p0, int p1) { return 0; }
    public int getSlotIdFromPhoneId(int p0) { return 0; }
    public static com.android.internal.telephony.uicc.UiccController getInstance() { return null; }
    public com.android.internal.telephony.uicc.UiccCard getUiccCard(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccPort getUiccPort(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccPort getUiccPortForSlot(int p0, int p1) { return null; }
    public com.android.internal.telephony.uicc.UiccCard getUiccCardForSlot(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccCard getUiccCardForPhone(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccPort getUiccPortForPhone(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccProfile getUiccProfileForPhone(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccSlot[] getUiccSlots() { return null; }
    public void switchSlots(java.util.List<android.telephony.UiccSlotMapping> p0, android.os.Message p1) {}
    public com.android.internal.telephony.uicc.UiccSlot getUiccSlot(int p0) { return null; }
    public com.android.internal.telephony.uicc.UiccSlot getUiccSlotForPhone(int p0) { return null; }
    public int getUiccSlotForCardId(java.lang.String p0) { return 0; }
    public com.android.internal.telephony.uicc.IccRecords getIccRecords(int p0, int p1) { return null; }
    public com.android.internal.telephony.uicc.IccFileHandler getIccFileHandler(int p0, int p1) { return null; }
    public void registerForIccChanged(android.os.Handler p0, int p1, java.lang.Object p2) {}
    public void unregisterForIccChanged(android.os.Handler p0) {}
    public void handleMessage(android.os.Message p0) {}
    public com.android.internal.telephony.uicc.UiccCardApplication getUiccCardApplication(int p0, int p1) { return null; }
    public static java.lang.String getIccStateIntentString(com.android.internal.telephony.IccCardConstants.State p0) { return null; }
    public void updateSimStateForInactivePort(int p0, java.lang.String p1) {}
    public void updateSimState(int p0, com.android.internal.telephony.IccCardConstants.State p1, java.lang.String p2) {}
    public java.lang.String convertToCardString(int p0) { return null; }
    public int convertToPublicCardId(java.lang.String p0) { return 0; }
    public java.util.ArrayList<android.telephony.UiccCardInfo> getAllUiccCardInfos() { return null; }
    public int getCardIdForDefaultEuicc() { return 0; }
    public com.android.internal.telephony.uicc.PinStorage getPinStorage() { return null; }
    public boolean slotStatusChanged(java.util.ArrayList<com.android.internal.telephony.uicc.IccSlotStatus> p0) { return false; }
    public static boolean isCdmaSupported(android.content.Context p0) { return false; }
    public boolean mvnoMatches(int p0, int p1, java.lang.String p2) { return false; }
    public void setRemovableEsimAsDefaultEuicc(boolean p0) {}
    public boolean isRemovableEsimDefaultEuicc() { return false; }
    public com.android.internal.telephony.uicc.IccSlotStatus.MultipleEnabledProfilesMode getSupportedMepMode(int p0) { return null; }
    public static void addLocalLog(java.lang.String p0) {}
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
}

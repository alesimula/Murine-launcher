package com.android.internal.telephony;

public class SignalStrengthController extends android.os.Handler {
    public SignalStrengthController(com.android.internal.telephony.Phone p0) { super(); }
    public void handleMessage(android.os.Message p0) {}
    void dispose() {}
    void getSignalStrengthFromCi() {}
    public android.telephony.SignalStrength getSignalStrength() { return null; }
    public void updateReportingCriteria() {}
    public int getMinimumHysteresisDb(boolean p0, int p1, int p2, int[] p3) { return 0; }
    void setSignalStrengthDefaultValues() {}
    boolean notifySignalStrength() { return false; }
    public void dump(java.io.FileDescriptor p0, java.io.PrintWriter p1, java.lang.String[] p2) {}
    public void setSignalStrengthUpdateRequest(int p0, int p1, android.telephony.SignalStrengthUpdateRequest p2, android.os.Message p3) {}
    public void clearSignalStrengthUpdateRequest(int p0, int p1, android.telephony.SignalStrengthUpdateRequest p2, android.os.Message p3) {}
    public int[] getConsolidatedSignalThresholds(int p0, int p1, int[] p2, int p3) { return null; }
    public boolean shouldHonorSystemThresholds() { return false; }
    public void onDeviceIdleStateChanged(boolean p0) {}
    public boolean shouldEnableSignalThresholdForAppRequest(int p0, int p1, int p2, boolean p3) { return false; }
    void updateArfcnLists() {}
    void updateServiceStateArfcnRsrpBoost(android.telephony.ServiceState p0, android.telephony.CellIdentity p1) {}

    private static final class AccessNetworkThresholds {
        public static final int[] GERAN = null;
        public static final int[] UTRAN = null;
        public static final int[] EUTRAN_RSRP = null;
        public static final int[] EUTRAN_RSRQ = null;
        public static final int[] EUTRAN_RSSNR = null;
        public static final int[] CDMA2000 = null;
        public static final int[] NGRAN_SSRSRP = null;
        public static final int[] NGRAN_SSRSRQ = null;
        public static final int[] NGRAN_SSSINR = null;
        public static final int[] UTRAN_ECNO = null;
    }

    private class SignalRequestRecord implements android.os.IBinder.DeathRecipient {
        final int mSubId = 0;
        final int mCallingUid = 0;
        final android.telephony.SignalStrengthUpdateRequest mRequest = null;
        SignalRequestRecord(com.android.internal.telephony.SignalStrengthController p0, int p1, int p2, android.telephony.SignalStrengthUpdateRequest p3) {}
        public void binderDied() {}
        public java.lang.String toString() { return null; }
    }
}

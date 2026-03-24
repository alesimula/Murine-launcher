package android.telephony;

public final class CellSignalStrengthLte extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "CellSignalStrengthLte";
    private static final boolean DBG = false;
    private static final int SIGNAL_STRENGTH_LTE_RSSI_ASU_UNKNOWN = 99;
    private static final int SIGNAL_STRENGTH_LTE_RSSI_VALID_ASU_MAX_VALUE = 31;
    private static final int SIGNAL_STRENGTH_LTE_RSSI_VALID_ASU_MIN_VALUE = 0;
    private static final int MAX_LTE_RSRP = -44;
    private static final int MIN_LTE_RSRP = -140;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mSignalStrength;
    private int mRssi;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mRsrp;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mRsrq;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mRssnr;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mCqi;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private int mTimingAdvance;
    private int mLevel;
    private static final int[] sThresholds = null;
    private static final int sRsrpBoost = 0;
    private static final android.telephony.CellSignalStrengthLte sInvalid = null;
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthLte> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public CellSignalStrengthLte() { super(); }
    public CellSignalStrengthLte(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    public CellSignalStrengthLte(android.hardware.radio.V1_0.LteSignalStrength p0) { super(); }
    public CellSignalStrengthLte(android.telephony.CellSignalStrengthLte p0) { super(); }
    protected void copyFrom(android.telephony.CellSignalStrengthLte p0) {}
    public android.telephony.CellSignalStrengthLte copy() { return null; }
    public void setDefaultValues() {}
    public int getLevel() { return 0; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    public int getRsrq() { return 0; }
    public int getRssi() { return 0; }
    public int getRssnr() { return 0; }
    public int getRsrp() { return 0; }
    public int getCqi() { return 0; }
    public int getDbm() { return 0; }
    public int getAsuLevel() { return 0; }
    public int getTimingAdvance() { return 0; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellSignalStrengthLte(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    private static void log(java.lang.String p0) {}
    private static int convertRssiAsuToDBm(int p0) { return 0; }
}

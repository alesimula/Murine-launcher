package android.telephony;

public class SignalStrength implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "SignalStrength";
    private static final boolean DBG = false;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static final int SIGNAL_STRENGTH_NONE_OR_UNKNOWN = 0;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static final int SIGNAL_STRENGTH_POOR = 1;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static final int SIGNAL_STRENGTH_MODERATE = 2;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static final int SIGNAL_STRENGTH_GOOD = 3;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public static final int SIGNAL_STRENGTH_GREAT = 4;
    @android.annotation.UnsupportedAppUsage
    public static final int NUM_SIGNAL_STRENGTH_BINS = 5;
    public static final java.lang.String[] SIGNAL_STRENGTH_NAMES = null;
    public static final int INVALID = 2147483647;
    private static final int LTE_RSRP_THRESHOLDS_NUM = 4;
    private static final int WCDMA_RSCP_THRESHOLDS_NUM = 4;
    private static final java.lang.String MEASUREMENT_TYPE_RSCP = "rscp";
    android.telephony.CellSignalStrengthCdma mCdma;
    android.telephony.CellSignalStrengthGsm mGsm;
    android.telephony.CellSignalStrengthWcdma mWcdma;
    android.telephony.CellSignalStrengthTdscdma mTdscdma;
    android.telephony.CellSignalStrengthLte mLte;
    android.telephony.CellSignalStrengthNr mNr;
    @android.annotation.UnsupportedAppUsage
    public static final android.os.Parcelable.Creator<android.telephony.SignalStrength> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public static android.telephony.SignalStrength newFromBundle(android.os.Bundle p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public SignalStrength() {}
    public SignalStrength(android.telephony.CellSignalStrengthCdma p0, android.telephony.CellSignalStrengthGsm p1, android.telephony.CellSignalStrengthWcdma p2, android.telephony.CellSignalStrengthTdscdma p3, android.telephony.CellSignalStrengthLte p4, android.telephony.CellSignalStrengthNr p5) {}
    public SignalStrength(android.hardware.radio.V1_0.SignalStrength p0) {}
    public SignalStrength(android.hardware.radio.V1_2.SignalStrength p0) {}
    public SignalStrength(android.hardware.radio.V1_4.SignalStrength p0) {}
    private android.telephony.CellSignalStrength getPrimary() { return null; }
    public java.util.List<android.telephony.CellSignalStrength> getCellSignalStrengths() { return null; }
    public <T extends android.telephony.CellSignalStrength> java.util.List<T> getCellSignalStrengths(java.lang.Class<T> p0) { return null; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    @android.annotation.UnsupportedAppUsage
    public SignalStrength(android.telephony.SignalStrength p0) {}
    @android.annotation.UnsupportedAppUsage
    protected void copyFrom(android.telephony.SignalStrength p0) {}
    @android.annotation.UnsupportedAppUsage
    public SignalStrength(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    @java.lang.Deprecated
    public int getGsmSignalStrength() { return 0; }
    @java.lang.Deprecated
    public int getGsmBitErrorRate() { return 0; }
    @java.lang.Deprecated
    public int getCdmaDbm() { return 0; }
    @java.lang.Deprecated
    public int getCdmaEcio() { return 0; }
    @java.lang.Deprecated
    public int getEvdoDbm() { return 0; }
    @java.lang.Deprecated
    public int getEvdoEcio() { return 0; }
    @java.lang.Deprecated
    public int getEvdoSnr() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteSignalStrength() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteRsrp() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteRsrq() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteRssnr() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteCqi() { return 0; }
    public int getLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getAsuLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getDbm() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getGsmDbm() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getGsmLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getGsmAsuLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getCdmaLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getCdmaAsuLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getEvdoLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getEvdoAsuLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteDbm() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getLteAsuLevel() { return 0; }
    @java.lang.Deprecated
    public boolean isGsm() { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getTdScdmaDbm() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getTdScdmaLevel() { return 0; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public int getTdScdmaAsuLevel() { return 0; }
    @java.lang.Deprecated
    public int getWcdmaRscp() { return 0; }
    @java.lang.Deprecated
    public int getWcdmaAsuLevel() { return 0; }
    @java.lang.Deprecated
    public int getWcdmaDbm() { return 0; }
    @java.lang.Deprecated
    public int getWcdmaLevel() { return 0; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    private void setFromNotifierBundle(android.os.Bundle p0) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28)
    public void fillInNotifierBundle(android.os.Bundle p0) {}
    private static void log(java.lang.String p0) {}
    private static void loge(java.lang.String p0) {}
}

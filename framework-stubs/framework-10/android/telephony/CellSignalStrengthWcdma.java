package android.telephony;

public final class CellSignalStrengthWcdma extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "CellSignalStrengthWcdma";
    private static final boolean DBG = false;
    private static final int WCDMA_RSSI_MAX = -51;
    private static final int WCDMA_RSSI_GREAT = -77;
    private static final int WCDMA_RSSI_GOOD = -87;
    private static final int WCDMA_RSSI_MODERATE = -97;
    private static final int WCDMA_RSSI_POOR = -107;
    private static final int WCDMA_RSSI_MIN = -113;
    private static final int[] sRssiThresholds = null;
    private static final int WCDMA_RSCP_MAX = -24;
    private static final int WCDMA_RSCP_GREAT = -85;
    private static final int WCDMA_RSCP_GOOD = -95;
    private static final int WCDMA_RSCP_MODERATE = -105;
    private static final int WCDMA_RSCP_POOR = -115;
    private static final int WCDMA_RSCP_MIN = -120;
    private static final int[] sRscpThresholds = null;
    public static final java.lang.String LEVEL_CALCULATION_METHOD_RSSI = "rssi";
    public static final java.lang.String LEVEL_CALCULATION_METHOD_RSCP = "rscp";
    private static final java.lang.String DEFAULT_LEVEL_CALCULATION_METHOD = "rssi";
    private int mRssi;
    @android.annotation.UnsupportedAppUsage
    private int mBitErrorRate;
    private int mRscp;
    private int mEcNo;
    private int mLevel;
    private static final android.telephony.CellSignalStrengthWcdma sInvalid = null;
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthWcdma> CREATOR = null;
    public CellSignalStrengthWcdma() { super(); }
    public CellSignalStrengthWcdma(int p0, int p1, int p2, int p3) { super(); }
    public CellSignalStrengthWcdma(android.hardware.radio.V1_0.WcdmaSignalStrength p0) { super(); }
    public CellSignalStrengthWcdma(android.hardware.radio.V1_2.WcdmaSignalStrength p0) { super(); }
    public CellSignalStrengthWcdma(android.telephony.CellSignalStrengthWcdma p0) { super(); }
    protected void copyFrom(android.telephony.CellSignalStrengthWcdma p0) {}
    public android.telephony.CellSignalStrengthWcdma copy() { return null; }
    public void setDefaultValues() {}
    public int getLevel() { return 0; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    public int getDbm() { return 0; }
    public int getAsuLevel() { return 0; }
    public int getRssi() { return 0; }
    public int getRscp() { return 0; }
    public int getEcNo() { return 0; }
    public int getBitErrorRate() { return 0; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellSignalStrengthWcdma(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    private static void log(java.lang.String p0) {}
    private static void loge(java.lang.String p0) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LevelCalculationMethod {
    }
}

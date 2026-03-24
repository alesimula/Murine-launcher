package android.telephony;

public final class CellSignalStrengthNr extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    public static final int UNKNOWN_ASU_LEVEL = 99;
    private static final boolean VDBG = false;
    private static final java.lang.String TAG = "CellSignalStrengthNr";
    private int[] mSsRsrpThresholds;
    private int[] mSsRsrqThresholds;
    private int[] mSsSinrThresholds;
    public static final int USE_SSRSRP = 1;
    public static final int USE_SSRSRQ = 2;
    public static final int USE_SSSINR = 4;
    private int mCsiRsrp;
    private int mCsiRsrq;
    private int mCsiSinr;
    private int mSsRsrp;
    private int mSsRsrq;
    private int mSsSinr;
    private int mLevel;
    private int mParametersUseForLevel;
    private static final android.telephony.CellSignalStrengthNr sInvalid = null;
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthNr> CREATOR = null;
    public CellSignalStrengthNr() { super(); }
    public CellSignalStrengthNr(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    public CellSignalStrengthNr(android.hardware.radio.V1_4.NrSignalStrength p0) { super(); }
    private static int flip(int p0) { return 0; }
    public int getSsRsrp() { return 0; }
    public int getSsRsrq() { return 0; }
    public int getSsSinr() { return 0; }
    public int getCsiRsrp() { return 0; }
    public int getCsiRsrq() { return 0; }
    public int getCsiSinr() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellSignalStrengthNr(android.os.Parcel p0) { super(); }
    public void setDefaultValues() {}
    public int getLevel() { return 0; }
    private boolean isLevelForParameter(int p0) { return false; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    private int updateLevelWithMeasure(int p0, int[] p1) { return 0; }
    public int getAsuLevel() { return 0; }
    public int getDbm() { return 0; }
    public CellSignalStrengthNr(android.telephony.CellSignalStrengthNr p0) { super(); }
    public android.telephony.CellSignalStrengthNr copy() { return null; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SignalLevelAndReportCriteriaSource {
    }
}

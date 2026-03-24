package android.telephony;

public final class CellSignalStrengthTdscdma extends android.telephony.CellSignalStrength implements android.os.Parcelable {
    private static final java.lang.String LOG_TAG = "CellSignalStrengthTdscdma";
    private static final boolean DBG = false;
    private static final int TDSCDMA_RSCP_MAX = -24;
    private static final int TDSCDMA_RSCP_GREAT = -49;
    private static final int TDSCDMA_RSCP_GOOD = -73;
    private static final int TDSCDMA_RSCP_MODERATE = -97;
    private static final int TDSCDMA_RSCP_POOR = -110;
    private static final int TDSCDMA_RSCP_MIN = -120;
    private int mRssi;
    private int mBitErrorRate;
    private int mRscp;
    private int mLevel;
    private static final android.telephony.CellSignalStrengthTdscdma sInvalid = null;
    public static final android.os.Parcelable.Creator<android.telephony.CellSignalStrengthTdscdma> CREATOR = null;
    public CellSignalStrengthTdscdma() { super(); }
    public CellSignalStrengthTdscdma(int p0, int p1, int p2) { super(); }
    public CellSignalStrengthTdscdma(android.hardware.radio.V1_0.TdScdmaSignalStrength p0) { super(); }
    public CellSignalStrengthTdscdma(android.hardware.radio.V1_2.TdscdmaSignalStrength p0) { super(); }
    public CellSignalStrengthTdscdma(android.telephony.CellSignalStrengthTdscdma p0) { super(); }
    protected void copyFrom(android.telephony.CellSignalStrengthTdscdma p0) {}
    public android.telephony.CellSignalStrengthTdscdma copy() { return null; }
    public void setDefaultValues() {}
    public int getLevel() { return 0; }
    public void updateLevel(android.os.PersistableBundle p0, android.telephony.ServiceState p1) {}
    public int getDbm() { return 0; }
    public int getRscp() { return 0; }
    public int getRssi() { return 0; }
    public int getBitErrorRate() { return 0; }
    public int getAsuLevel() { return 0; }
    public int hashCode() { return 0; }
    public boolean isValid() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private CellSignalStrengthTdscdma(android.os.Parcel p0) { super(); }
    public int describeContents() { return 0; }
    private static void log(java.lang.String p0) {}
}

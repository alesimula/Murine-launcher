package android.location;

public final class GnssMeasurement implements android.os.Parcelable {
    private int mFlags;
    private int mSvid;
    private int mConstellationType;
    private double mTimeOffsetNanos;
    private int mState;
    private long mReceivedSvTimeNanos;
    private long mReceivedSvTimeUncertaintyNanos;
    private double mCn0DbHz;
    private double mPseudorangeRateMetersPerSecond;
    private double mPseudorangeRateUncertaintyMetersPerSecond;
    private int mAccumulatedDeltaRangeState;
    private double mAccumulatedDeltaRangeMeters;
    private double mAccumulatedDeltaRangeUncertaintyMeters;
    private float mCarrierFrequencyHz;
    private long mCarrierCycles;
    private double mCarrierPhase;
    private double mCarrierPhaseUncertainty;
    private int mMultipathIndicator;
    private double mSnrInDb;
    private double mAutomaticGainControlLevelInDb;
    private java.lang.String mCodeType;
    private static final int HAS_NO_FLAGS = 0;
    private static final int HAS_SNR = 1;
    private static final int HAS_CARRIER_FREQUENCY = 512;
    private static final int HAS_CARRIER_CYCLES = 1024;
    private static final int HAS_CARRIER_PHASE = 2048;
    private static final int HAS_CARRIER_PHASE_UNCERTAINTY = 4096;
    private static final int HAS_AUTOMATIC_GAIN_CONTROL = 8192;
    private static final int HAS_CODE_TYPE = 16384;
    public static final int MULTIPATH_INDICATOR_UNKNOWN = 0;
    public static final int MULTIPATH_INDICATOR_DETECTED = 1;
    public static final int MULTIPATH_INDICATOR_NOT_DETECTED = 2;
    public static final int STATE_UNKNOWN = 0;
    public static final int STATE_CODE_LOCK = 1;
    public static final int STATE_BIT_SYNC = 2;
    public static final int STATE_SUBFRAME_SYNC = 4;
    public static final int STATE_TOW_DECODED = 8;
    public static final int STATE_MSEC_AMBIGUOUS = 16;
    public static final int STATE_SYMBOL_SYNC = 32;
    public static final int STATE_GLO_STRING_SYNC = 64;
    public static final int STATE_GLO_TOD_DECODED = 128;
    public static final int STATE_BDS_D2_BIT_SYNC = 256;
    public static final int STATE_BDS_D2_SUBFRAME_SYNC = 512;
    public static final int STATE_GAL_E1BC_CODE_LOCK = 1024;
    public static final int STATE_GAL_E1C_2ND_CODE_LOCK = 2048;
    public static final int STATE_GAL_E1B_PAGE_SYNC = 4096;
    public static final int STATE_SBAS_SYNC = 8192;
    public static final int STATE_TOW_KNOWN = 16384;
    public static final int STATE_GLO_TOD_KNOWN = 32768;
    public static final int STATE_2ND_CODE_LOCK = 65536;
    private static final int STATE_ALL = 16383;
    public static final int ADR_STATE_UNKNOWN = 0;
    public static final int ADR_STATE_VALID = 1;
    public static final int ADR_STATE_RESET = 2;
    public static final int ADR_STATE_CYCLE_SLIP = 4;
    public static final int ADR_STATE_HALF_CYCLE_RESOLVED = 8;
    public static final int ADR_STATE_HALF_CYCLE_REPORTED = 16;
    public static final int ADR_STATE_ALL = 31;
    public static final android.os.Parcelable.Creator<android.location.GnssMeasurement> CREATOR = null;
    public GnssMeasurement() {}
    public void set(android.location.GnssMeasurement p0) {}
    public void reset() {}
    public int getSvid() { return 0; }
    public void setSvid(int p0) {}
    public int getConstellationType() { return 0; }
    public void setConstellationType(int p0) {}
    public double getTimeOffsetNanos() { return 0.0; }
    public void setTimeOffsetNanos(double p0) {}
    public int getState() { return 0; }
    public void setState(int p0) {}
    private java.lang.String getStateString() { return null; }
    public long getReceivedSvTimeNanos() { return 0L; }
    public void setReceivedSvTimeNanos(long p0) {}
    public long getReceivedSvTimeUncertaintyNanos() { return 0L; }
    public void setReceivedSvTimeUncertaintyNanos(long p0) {}
    public double getCn0DbHz() { return 0.0; }
    public void setCn0DbHz(double p0) {}
    public double getPseudorangeRateMetersPerSecond() { return 0.0; }
    public void setPseudorangeRateMetersPerSecond(double p0) {}
    public double getPseudorangeRateUncertaintyMetersPerSecond() { return 0.0; }
    public void setPseudorangeRateUncertaintyMetersPerSecond(double p0) {}
    public int getAccumulatedDeltaRangeState() { return 0; }
    public void setAccumulatedDeltaRangeState(int p0) {}
    private java.lang.String getAccumulatedDeltaRangeStateString() { return null; }
    public double getAccumulatedDeltaRangeMeters() { return 0.0; }
    public void setAccumulatedDeltaRangeMeters(double p0) {}
    public double getAccumulatedDeltaRangeUncertaintyMeters() { return 0.0; }
    public void setAccumulatedDeltaRangeUncertaintyMeters(double p0) {}
    public boolean hasCarrierFrequencyHz() { return false; }
    public float getCarrierFrequencyHz() { return 0.0f; }
    public void setCarrierFrequencyHz(float p0) {}
    public void resetCarrierFrequencyHz() {}
    @java.lang.Deprecated
    public boolean hasCarrierCycles() { return false; }
    @java.lang.Deprecated
    public long getCarrierCycles() { return 0L; }
    @java.lang.Deprecated
    public void setCarrierCycles(long p0) {}
    @java.lang.Deprecated
    public void resetCarrierCycles() {}
    @java.lang.Deprecated
    public boolean hasCarrierPhase() { return false; }
    @java.lang.Deprecated
    public double getCarrierPhase() { return 0.0; }
    @java.lang.Deprecated
    public void setCarrierPhase(double p0) {}
    @java.lang.Deprecated
    public void resetCarrierPhase() {}
    @java.lang.Deprecated
    public boolean hasCarrierPhaseUncertainty() { return false; }
    @java.lang.Deprecated
    public double getCarrierPhaseUncertainty() { return 0.0; }
    @java.lang.Deprecated
    public void setCarrierPhaseUncertainty(double p0) {}
    @java.lang.Deprecated
    public void resetCarrierPhaseUncertainty() {}
    public int getMultipathIndicator() { return 0; }
    public void setMultipathIndicator(int p0) {}
    private java.lang.String getMultipathIndicatorString() { return null; }
    public boolean hasSnrInDb() { return false; }
    public double getSnrInDb() { return 0.0; }
    public void setSnrInDb(double p0) {}
    public void resetSnrInDb() {}
    public boolean hasAutomaticGainControlLevelDb() { return false; }
    public double getAutomaticGainControlLevelDb() { return 0.0; }
    public void setAutomaticGainControlLevelInDb(double p0) {}
    public void resetAutomaticGainControlLevel() {}
    public boolean hasCodeType() { return false; }
    public java.lang.String getCodeType() { return null; }
    public void setCodeType(java.lang.String p0) {}
    public void resetCodeType() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    private void initialize() {}
    private void setFlag(int p0) {}
    private void resetFlag(int p0) {}
    private boolean isFlagSet(int p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MultipathIndicator {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AdrState {
    }
}

package android.location;

@java.lang.Deprecated
@android.annotation.SystemApi
public class GpsMeasurement implements android.os.Parcelable {
    private int mFlags;
    private byte mPrn;
    private double mTimeOffsetInNs;
    private short mState;
    private long mReceivedGpsTowInNs;
    private long mReceivedGpsTowUncertaintyInNs;
    private double mCn0InDbHz;
    private double mPseudorangeRateInMetersPerSec;
    private double mPseudorangeRateUncertaintyInMetersPerSec;
    private short mAccumulatedDeltaRangeState;
    private double mAccumulatedDeltaRangeInMeters;
    private double mAccumulatedDeltaRangeUncertaintyInMeters;
    private double mPseudorangeInMeters;
    private double mPseudorangeUncertaintyInMeters;
    private double mCodePhaseInChips;
    private double mCodePhaseUncertaintyInChips;
    private float mCarrierFrequencyInHz;
    private long mCarrierCycles;
    private double mCarrierPhase;
    private double mCarrierPhaseUncertainty;
    private byte mLossOfLock;
    private int mBitNumber;
    private short mTimeFromLastBitInMs;
    private double mDopplerShiftInHz;
    private double mDopplerShiftUncertaintyInHz;
    private byte mMultipathIndicator;
    private double mSnrInDb;
    private double mElevationInDeg;
    private double mElevationUncertaintyInDeg;
    private double mAzimuthInDeg;
    private double mAzimuthUncertaintyInDeg;
    private boolean mUsedInFix;
    private static final int HAS_NO_FLAGS = 0;
    private static final int HAS_SNR = 1;
    private static final int HAS_ELEVATION = 2;
    private static final int HAS_ELEVATION_UNCERTAINTY = 4;
    private static final int HAS_AZIMUTH = 8;
    private static final int HAS_AZIMUTH_UNCERTAINTY = 16;
    private static final int HAS_PSEUDORANGE = 32;
    private static final int HAS_PSEUDORANGE_UNCERTAINTY = 64;
    private static final int HAS_CODE_PHASE = 128;
    private static final int HAS_CODE_PHASE_UNCERTAINTY = 256;
    private static final int HAS_CARRIER_FREQUENCY = 512;
    private static final int HAS_CARRIER_CYCLES = 1024;
    private static final int HAS_CARRIER_PHASE = 2048;
    private static final int HAS_CARRIER_PHASE_UNCERTAINTY = 4096;
    private static final int HAS_BIT_NUMBER = 8192;
    private static final int HAS_TIME_FROM_LAST_BIT = 16384;
    private static final int HAS_DOPPLER_SHIFT = 32768;
    private static final int HAS_DOPPLER_SHIFT_UNCERTAINTY = 65536;
    private static final int HAS_USED_IN_FIX = 131072;
    private static final int GPS_MEASUREMENT_HAS_UNCORRECTED_PSEUDORANGE_RATE = 262144;
    public static final byte LOSS_OF_LOCK_UNKNOWN = 0;
    public static final byte LOSS_OF_LOCK_OK = 1;
    public static final byte LOSS_OF_LOCK_CYCLE_SLIP = 2;
    public static final byte MULTIPATH_INDICATOR_UNKNOWN = 0;
    public static final byte MULTIPATH_INDICATOR_DETECTED = 1;
    public static final byte MULTIPATH_INDICATOR_NOT_USED = 2;
    public static final short STATE_UNKNOWN = 0;
    public static final short STATE_CODE_LOCK = 1;
    public static final short STATE_BIT_SYNC = 2;
    public static final short STATE_SUBFRAME_SYNC = 4;
    public static final short STATE_TOW_DECODED = 8;
    public static final short STATE_MSEC_AMBIGUOUS = 16;
    private static final short STATE_ALL = 31;
    public static final short ADR_STATE_UNKNOWN = 0;
    public static final short ADR_STATE_VALID = 1;
    public static final short ADR_STATE_RESET = 2;
    public static final short ADR_STATE_CYCLE_SLIP = 4;
    private static final short ADR_ALL = 7;
    public static final android.os.Parcelable.Creator<android.location.GpsMeasurement> CREATOR = null;
    GpsMeasurement() {}
    public void set(android.location.GpsMeasurement p0) {}
    public void reset() {}
    public byte getPrn() { return 0; }
    public void setPrn(byte p0) {}
    public double getTimeOffsetInNs() { return 0.0; }
    public void setTimeOffsetInNs(double p0) {}
    public short getState() { return 0; }
    public void setState(short p0) {}
    private java.lang.String getStateString() { return null; }
    public long getReceivedGpsTowInNs() { return 0L; }
    public void setReceivedGpsTowInNs(long p0) {}
    public long getReceivedGpsTowUncertaintyInNs() { return 0L; }
    public void setReceivedGpsTowUncertaintyInNs(long p0) {}
    public double getCn0InDbHz() { return 0.0; }
    public void setCn0InDbHz(double p0) {}
    public double getPseudorangeRateInMetersPerSec() { return 0.0; }
    public void setPseudorangeRateInMetersPerSec(double p0) {}
    public boolean isPseudorangeRateCorrected() { return false; }
    public double getPseudorangeRateUncertaintyInMetersPerSec() { return 0.0; }
    public void setPseudorangeRateUncertaintyInMetersPerSec(double p0) {}
    public short getAccumulatedDeltaRangeState() { return 0; }
    public void setAccumulatedDeltaRangeState(short p0) {}
    private java.lang.String getAccumulatedDeltaRangeStateString() { return null; }
    public double getAccumulatedDeltaRangeInMeters() { return 0.0; }
    public void setAccumulatedDeltaRangeInMeters(double p0) {}
    public double getAccumulatedDeltaRangeUncertaintyInMeters() { return 0.0; }
    public void setAccumulatedDeltaRangeUncertaintyInMeters(double p0) {}
    public boolean hasPseudorangeInMeters() { return false; }
    public double getPseudorangeInMeters() { return 0.0; }
    public void setPseudorangeInMeters(double p0) {}
    public void resetPseudorangeInMeters() {}
    public boolean hasPseudorangeUncertaintyInMeters() { return false; }
    public double getPseudorangeUncertaintyInMeters() { return 0.0; }
    public void setPseudorangeUncertaintyInMeters(double p0) {}
    public void resetPseudorangeUncertaintyInMeters() {}
    public boolean hasCodePhaseInChips() { return false; }
    public double getCodePhaseInChips() { return 0.0; }
    public void setCodePhaseInChips(double p0) {}
    public void resetCodePhaseInChips() {}
    public boolean hasCodePhaseUncertaintyInChips() { return false; }
    public double getCodePhaseUncertaintyInChips() { return 0.0; }
    public void setCodePhaseUncertaintyInChips(double p0) {}
    public void resetCodePhaseUncertaintyInChips() {}
    public boolean hasCarrierFrequencyInHz() { return false; }
    public float getCarrierFrequencyInHz() { return 0.0f; }
    public void setCarrierFrequencyInHz(float p0) {}
    public void resetCarrierFrequencyInHz() {}
    public boolean hasCarrierCycles() { return false; }
    public long getCarrierCycles() { return 0L; }
    public void setCarrierCycles(long p0) {}
    public void resetCarrierCycles() {}
    public boolean hasCarrierPhase() { return false; }
    public double getCarrierPhase() { return 0.0; }
    public void setCarrierPhase(double p0) {}
    public void resetCarrierPhase() {}
    public boolean hasCarrierPhaseUncertainty() { return false; }
    public double getCarrierPhaseUncertainty() { return 0.0; }
    public void setCarrierPhaseUncertainty(double p0) {}
    public void resetCarrierPhaseUncertainty() {}
    public byte getLossOfLock() { return 0; }
    public void setLossOfLock(byte p0) {}
    private java.lang.String getLossOfLockString() { return null; }
    public boolean hasBitNumber() { return false; }
    public int getBitNumber() { return 0; }
    public void setBitNumber(int p0) {}
    public void resetBitNumber() {}
    public boolean hasTimeFromLastBitInMs() { return false; }
    public short getTimeFromLastBitInMs() { return 0; }
    public void setTimeFromLastBitInMs(short p0) {}
    public void resetTimeFromLastBitInMs() {}
    public boolean hasDopplerShiftInHz() { return false; }
    public double getDopplerShiftInHz() { return 0.0; }
    public void setDopplerShiftInHz(double p0) {}
    public void resetDopplerShiftInHz() {}
    public boolean hasDopplerShiftUncertaintyInHz() { return false; }
    public double getDopplerShiftUncertaintyInHz() { return 0.0; }
    public void setDopplerShiftUncertaintyInHz(double p0) {}
    public void resetDopplerShiftUncertaintyInHz() {}
    public byte getMultipathIndicator() { return 0; }
    public void setMultipathIndicator(byte p0) {}
    private java.lang.String getMultipathIndicatorString() { return null; }
    public boolean hasSnrInDb() { return false; }
    public double getSnrInDb() { return 0.0; }
    public void setSnrInDb(double p0) {}
    public void resetSnrInDb() {}
    public boolean hasElevationInDeg() { return false; }
    public double getElevationInDeg() { return 0.0; }
    public void setElevationInDeg(double p0) {}
    public void resetElevationInDeg() {}
    public boolean hasElevationUncertaintyInDeg() { return false; }
    public double getElevationUncertaintyInDeg() { return 0.0; }
    public void setElevationUncertaintyInDeg(double p0) {}
    public void resetElevationUncertaintyInDeg() {}
    public boolean hasAzimuthInDeg() { return false; }
    public double getAzimuthInDeg() { return 0.0; }
    public void setAzimuthInDeg(double p0) {}
    public void resetAzimuthInDeg() {}
    public boolean hasAzimuthUncertaintyInDeg() { return false; }
    public double getAzimuthUncertaintyInDeg() { return 0.0; }
    public void setAzimuthUncertaintyInDeg(double p0) {}
    public void resetAzimuthUncertaintyInDeg() {}
    public boolean isUsedInFix() { return false; }
    public void setUsedInFix(boolean p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    private void initialize() {}
    private void setFlag(int p0) {}
    private void resetFlag(int p0) {}
    private boolean isFlagSet(int p0) { return false; }
}

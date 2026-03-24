package android.location;

@java.lang.Deprecated
@android.annotation.SystemApi
public class GpsMeasurement implements android.os.Parcelable {
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
    public static final short ADR_STATE_UNKNOWN = 0;
    public static final short ADR_STATE_VALID = 1;
    public static final short ADR_STATE_RESET = 2;
    public static final short ADR_STATE_CYCLE_SLIP = 4;
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
}

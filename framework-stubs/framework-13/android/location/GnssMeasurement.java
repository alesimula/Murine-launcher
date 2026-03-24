package android.location;

public final class GnssMeasurement implements android.os.Parcelable {
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
    public long getReceivedSvTimeNanos() { return 0L; }
    public void setReceivedSvTimeNanos(long p0) {}
    public long getReceivedSvTimeUncertaintyNanos() { return 0L; }
    public void setReceivedSvTimeUncertaintyNanos(long p0) {}
    public double getCn0DbHz() { return 0.0; }
    public void setCn0DbHz(double p0) {}
    public boolean hasBasebandCn0DbHz() { return false; }
    public double getBasebandCn0DbHz() { return 0.0; }
    public void setBasebandCn0DbHz(double p0) {}
    public void resetBasebandCn0DbHz() {}
    public double getPseudorangeRateMetersPerSecond() { return 0.0; }
    public void setPseudorangeRateMetersPerSecond(double p0) {}
    public double getPseudorangeRateUncertaintyMetersPerSecond() { return 0.0; }
    public void setPseudorangeRateUncertaintyMetersPerSecond(double p0) {}
    public int getAccumulatedDeltaRangeState() { return 0; }
    public void setAccumulatedDeltaRangeState(int p0) {}
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
    public boolean hasSnrInDb() { return false; }
    public double getSnrInDb() { return 0.0; }
    public void setSnrInDb(double p0) {}
    public void resetSnrInDb() {}
    @java.lang.Deprecated
    public boolean hasAutomaticGainControlLevelDb() { return false; }
    @java.lang.Deprecated
    public double getAutomaticGainControlLevelDb() { return 0.0; }
    @java.lang.Deprecated
    public void setAutomaticGainControlLevelInDb(double p0) {}
    public void resetAutomaticGainControlLevel() {}
    public boolean hasCodeType() { return false; }
    public java.lang.String getCodeType() { return null; }
    public void setCodeType(java.lang.String p0) {}
    public void resetCodeType() {}
    public boolean hasFullInterSignalBiasNanos() { return false; }
    public double getFullInterSignalBiasNanos() { return 0.0; }
    public void setFullInterSignalBiasNanos(double p0) {}
    public void resetFullInterSignalBiasNanos() {}
    public boolean hasFullInterSignalBiasUncertaintyNanos() { return false; }
    public double getFullInterSignalBiasUncertaintyNanos() { return 0.0; }
    public void setFullInterSignalBiasUncertaintyNanos(double p0) {}
    public void resetFullInterSignalBiasUncertaintyNanos() {}
    public boolean hasSatelliteInterSignalBiasNanos() { return false; }
    public double getSatelliteInterSignalBiasNanos() { return 0.0; }
    public void setSatelliteInterSignalBiasNanos(double p0) {}
    public void resetSatelliteInterSignalBiasNanos() {}
    public boolean hasSatelliteInterSignalBiasUncertaintyNanos() { return false; }
    public double getSatelliteInterSignalBiasUncertaintyNanos() { return 0.0; }
    public void setSatelliteInterSignalBiasUncertaintyNanos(double p0) {}
    public void resetSatelliteInterSignalBiasUncertaintyNanos() {}
    @android.annotation.SystemApi
    public boolean hasSatellitePvt() { return false; }
    @android.annotation.SystemApi
    public android.location.SatellitePvt getSatellitePvt() { return null; }
    public void setSatellitePvt(android.location.SatellitePvt p0) {}
    public void resetSatellitePvt() {}
    @android.annotation.SystemApi
    public boolean hasCorrelationVectors() { return false; }
    @android.annotation.SystemApi
    @android.annotation.SuppressLint("NullableCollection")
    public java.util.Collection<android.location.CorrelationVector> getCorrelationVectors() { return null; }
    public void setCorrelationVectors(java.util.Collection<android.location.CorrelationVector> p0) {}
    public void resetCorrelationVectors() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AdrState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface MultipathIndicator {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface State {
    }
}

package android.hardware.gnss;

public class GnssMeasurement implements android.os.Parcelable {
    public int flags;
    public int svid;
    public android.hardware.gnss.GnssSignalType signalType;
    public double timeOffsetNs;
    public int state;
    public long receivedSvTimeInNs;
    public long receivedSvTimeUncertaintyInNs;
    public double antennaCN0DbHz;
    public double basebandCN0DbHz;
    public double pseudorangeRateMps;
    public double pseudorangeRateUncertaintyMps;
    public int accumulatedDeltaRangeState;
    public double accumulatedDeltaRangeM;
    public double accumulatedDeltaRangeUncertaintyM;
    public long carrierCycles;
    public double carrierPhase;
    public double carrierPhaseUncertainty;
    public int multipathIndicator;
    public double snrDb;
    public double agcLevelDb;
    public double fullInterSignalBiasNs;
    public double fullInterSignalBiasUncertaintyNs;
    public double satelliteInterSignalBiasNs;
    public double satelliteInterSignalBiasUncertaintyNs;
    public android.hardware.gnss.SatellitePvt satellitePvt;
    public android.hardware.gnss.CorrelationVector[] correlationVectors;
    public static final android.os.Parcelable.Creator<android.hardware.gnss.GnssMeasurement> CREATOR = null;
    public static final int HAS_SNR = 1;
    public static final int HAS_CARRIER_FREQUENCY = 512;
    public static final int HAS_CARRIER_CYCLES = 1024;
    public static final int HAS_CARRIER_PHASE = 2048;
    public static final int HAS_CARRIER_PHASE_UNCERTAINTY = 4096;
    public static final int HAS_AUTOMATIC_GAIN_CONTROL = 8192;
    public static final int HAS_FULL_ISB = 65536;
    public static final int HAS_FULL_ISB_UNCERTAINTY = 131072;
    public static final int HAS_SATELLITE_ISB = 262144;
    public static final int HAS_SATELLITE_ISB_UNCERTAINTY = 524288;
    public static final int HAS_SATELLITE_PVT = 1048576;
    public static final int HAS_CORRELATION_VECTOR = 2097152;
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
    public GnssMeasurement() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}

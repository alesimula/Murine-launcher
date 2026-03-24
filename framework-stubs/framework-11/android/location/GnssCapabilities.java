package android.location;

public final class GnssCapabilities {
    public static final long LOW_POWER_MODE = 1L;
    public static final long SATELLITE_BLACKLIST = 2L;
    public static final long GEOFENCING = 4L;
    public static final long MEASUREMENTS = 8L;
    public static final long NAV_MESSAGES = 16L;
    public static final long MEASUREMENT_CORRECTIONS = 32L;
    public static final long MEASUREMENT_CORRECTIONS_LOS_SATS = 64L;
    public static final long MEASUREMENT_CORRECTIONS_EXCESS_PATH_LENGTH = 128L;
    public static final long MEASUREMENT_CORRECTIONS_REFLECTING_PLANE = 256L;
    public static final long ANTENNA_INFO = 512L;
    public static final long INVALID_CAPABILITIES = -1L;
    private final long mGnssCapabilities = 0L;
    public static android.location.GnssCapabilities of(long p0) { return null; }
    private GnssCapabilities(long p0) {}
    @android.annotation.SystemApi
    public boolean hasLowPowerMode() { return false; }
    @android.annotation.SystemApi
    public boolean hasSatelliteBlacklist() { return false; }
    @android.annotation.SystemApi
    public boolean hasGeofencing() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurements() { return false; }
    @android.annotation.SystemApi
    public boolean hasNavMessages() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrections() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsLosSats() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsExcessPathLength() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsReflectingPane() { return false; }
    public boolean hasGnssAntennaInfo() { return false; }
    private boolean hasCapability(long p0) { return false; }
}

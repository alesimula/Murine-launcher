package android.location;

public final class GnssCapabilities implements android.os.Parcelable {
    public static final int TOP_HAL_CAPABILITY_SCHEDULING = 1;
    public static final int TOP_HAL_CAPABILITY_MSB = 2;
    public static final int TOP_HAL_CAPABILITY_MSA = 4;
    public static final int TOP_HAL_CAPABILITY_SINGLE_SHOT = 8;
    public static final int TOP_HAL_CAPABILITY_ON_DEMAND_TIME = 16;
    public static final int TOP_HAL_CAPABILITY_GEOFENCING = 32;
    public static final int TOP_HAL_CAPABILITY_MEASUREMENTS = 64;
    public static final int TOP_HAL_CAPABILITY_NAV_MESSAGES = 128;
    public static final int TOP_HAL_CAPABILITY_LOW_POWER_MODE = 256;
    public static final int TOP_HAL_CAPABILITY_SATELLITE_BLOCKLIST = 512;
    public static final int TOP_HAL_CAPABILITY_MEASUREMENT_CORRECTIONS = 1024;
    public static final int TOP_HAL_CAPABILITY_ANTENNA_INFO = 2048;
    public static final int TOP_HAL_CAPABILITY_CORRELATION_VECTOR = 4096;
    public static final int TOP_HAL_CAPABILITY_SATELLITE_PVT = 8192;
    public static final int TOP_HAL_CAPABILITY_MEASUREMENT_CORRECTIONS_FOR_DRIVING = 16384;
    public static final int SUB_HAL_MEASUREMENT_CORRECTIONS_CAPABILITY_LOS_SATS = 1;
    public static final int SUB_HAL_MEASUREMENT_CORRECTIONS_CAPABILITY_EXCESS_PATH_LENGTH = 2;
    public static final int SUB_HAL_MEASUREMENT_CORRECTIONS_CAPABILITY_REFLECTING_PLANE = 4;
    public static final int SUB_HAL_POWER_CAPABILITY_TOTAL = 1;
    public static final int SUB_HAL_POWER_CAPABILITY_SINGLEBAND_TRACKING = 2;
    public static final int SUB_HAL_POWER_CAPABILITY_MULTIBAND_TRACKING = 4;
    public static final int SUB_HAL_POWER_CAPABILITY_SINGLEBAND_ACQUISITION = 8;
    public static final int SUB_HAL_POWER_CAPABILITY_MULTIBAND_ACQUISITION = 16;
    public static final int SUB_HAL_POWER_CAPABILITY_OTHER_MODES = 32;
    public static final android.os.Parcelable.Creator<android.location.GnssCapabilities> CREATOR = null;
    public static android.location.GnssCapabilities empty() { return null; }
    public android.location.GnssCapabilities withTopHalFlags(int p0) { return null; }
    public android.location.GnssCapabilities withSubHalMeasurementCorrectionsFlags(int p0) { return null; }
    public android.location.GnssCapabilities withSubHalPowerFlags(int p0) { return null; }
    public boolean hasScheduling() { return false; }
    public boolean hasMsb() { return false; }
    public boolean hasMsa() { return false; }
    public boolean hasSingleShot() { return false; }
    public boolean hasOnDemandTime() { return false; }
    @android.annotation.SystemApi
    public boolean hasGeofencing() { return false; }
    public boolean hasMeasurements() { return false; }
    @java.lang.Deprecated
    @android.annotation.SystemApi
    public boolean hasNavMessages() { return false; }
    public boolean hasNavigationMessages() { return false; }
    @android.annotation.SystemApi
    public boolean hasLowPowerMode() { return false; }
    @android.annotation.SystemApi
    @java.lang.Deprecated
    public boolean hasSatelliteBlacklist() { return false; }
    @android.annotation.SystemApi
    public boolean hasSatelliteBlocklist() { return false; }
    @android.annotation.SystemApi
    public boolean hasSatellitePvt() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrections() { return false; }
    @java.lang.Deprecated
    public boolean hasGnssAntennaInfo() { return false; }
    public boolean hasAntennaInfo() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrelationVectors() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsForDriving() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsLosSats() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsExcessPathLength() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsReflectingPane() { return false; }
    @android.annotation.SystemApi
    public boolean hasMeasurementCorrectionsReflectingPlane() { return false; }
    public boolean hasPowerTotal() { return false; }
    public boolean hasPowerSinglebandTracking() { return false; }
    public boolean hasPowerMultibandTracking() { return false; }
    public boolean hasPowerSinglebandAcquisition() { return false; }
    public boolean hasPowerMultibandAcquisition() { return false; }
    public boolean hasPowerOtherModes() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toString() { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.GnssCapabilities p0) {}
        public android.location.GnssCapabilities.Builder setHasScheduling(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasMsb(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasMsa(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasSingleShot(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasOnDemandTime(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasGeofencing(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasMeasurements(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasNavigationMessages(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasLowPowerMode(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasSatelliteBlocklist(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasSatellitePvt(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasMeasurementCorrections(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasAntennaInfo(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasMeasurementCorrelationVectors(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsForDriving(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsLosSats(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsExcessPathLength(boolean p0) { return null; }
        @android.annotation.SystemApi
        public android.location.GnssCapabilities.Builder setHasMeasurementCorrectionsReflectingPlane(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasPowerTotal(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasPowerSinglebandTracking(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasPowerMultibandTracking(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasPowerSinglebandAcquisition(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasPowerMultibandAcquisition(boolean p0) { return null; }
        public android.location.GnssCapabilities.Builder setHasPowerOtherModes(boolean p0) { return null; }
        public android.location.GnssCapabilities build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubHalMeasurementCorrectionsCapabilityFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SubHalPowerCapabilityFlags {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface TopHalCapabilityFlags {
    }
}

package android.location.provider;

public final class ProviderProperties implements android.os.Parcelable {
    public static final int POWER_USAGE_LOW = 1;
    public static final int POWER_USAGE_MEDIUM = 2;
    public static final int POWER_USAGE_HIGH = 3;
    public static final int ACCURACY_FINE = 1;
    public static final int ACCURACY_COARSE = 2;
    public static final android.os.Parcelable.Creator<android.location.provider.ProviderProperties> CREATOR = null;
    public boolean hasNetworkRequirement() { return false; }
    public boolean hasSatelliteRequirement() { return false; }
    public boolean hasCellRequirement() { return false; }
    public boolean hasMonetaryCost() { return false; }
    public boolean hasAltitudeSupport() { return false; }
    public boolean hasSpeedSupport() { return false; }
    public boolean hasBearingSupport() { return false; }
    public int getPowerUsage() { return 0; }
    public int getAccuracy() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Accuracy {
    }

    public static final class Builder {
        public Builder() {}
        public Builder(android.location.provider.ProviderProperties p0) {}
        public android.location.provider.ProviderProperties.Builder setHasNetworkRequirement(boolean p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setHasSatelliteRequirement(boolean p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setHasCellRequirement(boolean p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setHasMonetaryCost(boolean p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setHasAltitudeSupport(boolean p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setHasSpeedSupport(boolean p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setHasBearingSupport(boolean p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setPowerUsage(int p0) { return null; }
        public android.location.provider.ProviderProperties.Builder setAccuracy(int p0) { return null; }
        public android.location.provider.ProviderProperties build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PowerUsage {
    }
}

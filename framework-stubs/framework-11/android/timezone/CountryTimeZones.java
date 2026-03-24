package android.timezone;

public final class CountryTimeZones {
    CountryTimeZones(libcore.timezone.CountryTimeZones p0) {}
    public boolean matchesCountryCode(java.lang.String p0) { return false; }
    public java.lang.String getDefaultTimeZoneId() { return null; }
    public android.icu.util.TimeZone getDefaultTimeZone() { return null; }
    public boolean isDefaultTimeZoneBoosted() { return false; }
    public boolean hasUtcZone(long p0) { return false; }
    public android.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2, boolean p3) { return null; }
    public android.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2) { return null; }
    public java.util.List<android.timezone.CountryTimeZones.TimeZoneMapping> getEffectiveTimeZoneMappingsAt(long p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class OffsetResult {
        private final boolean mIsOnlyMatch = false;
        public OffsetResult(android.icu.util.TimeZone p0, boolean p1) {}
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public boolean isOnlyMatch() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class TimeZoneMapping {
        TimeZoneMapping(libcore.timezone.CountryTimeZones.TimeZoneMapping p0) {}
        public java.lang.String getTimeZoneId() { return null; }
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

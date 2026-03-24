package android.timezone;

public final class CountryTimeZones {
    CountryTimeZones(com.android.i18n.timezone.CountryTimeZones p0) {}
    public boolean matchesCountryCode(java.lang.String p0) { return false; }
    @android.annotation.Nullable
    public java.lang.String getDefaultTimeZoneId() { return null; }
    @android.annotation.Nullable
    public android.icu.util.TimeZone getDefaultTimeZone() { return null; }
    public boolean isDefaultTimeZoneBoosted() { return false; }
    public boolean hasUtcZone(long p0) { return false; }
    @android.annotation.Nullable
    public android.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2, boolean p3) { return null; }
    @android.annotation.Nullable
    public android.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2) { return null; }
    @android.annotation.NonNull
    public java.util.List<android.timezone.CountryTimeZones.TimeZoneMapping> getEffectiveTimeZoneMappingsAt(long p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }

    public static final class OffsetResult {
        public OffsetResult(android.icu.util.TimeZone p0, boolean p1) {}
        @android.annotation.NonNull
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public boolean isOnlyMatch() { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }

    public static final class TimeZoneMapping {
        TimeZoneMapping(com.android.i18n.timezone.CountryTimeZones.TimeZoneMapping p0) {}
        @android.annotation.NonNull
        public java.lang.String getTimeZoneId() { return null; }
        @android.annotation.NonNull
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

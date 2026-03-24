package com.android.i18n.timezone;

public class CountryTimeZones {
    public CountryTimeZones() {}
    public boolean matchesCountryCode(java.lang.String p0) { return false; }
    public java.lang.String getDefaultTimeZoneId() { return null; }
    public android.icu.util.TimeZone getDefaultTimeZone() { return null; }
    public boolean isDefaultTimeZoneBoosted() { return false; }
    public boolean hasUtcZone(long p0) { return false; }
    public com.android.i18n.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2, boolean p3) { return null; }
    public com.android.i18n.timezone.CountryTimeZones.OffsetResult lookupByOffsetWithBias(long p0, android.icu.util.TimeZone p1, int p2) { return null; }
    public java.util.List getEffectiveTimeZoneMappingsAt(long p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public java.util.List getTimeZoneMappings() { return null; }

    public static class TimeZoneMapping {
        public TimeZoneMapping() {}
        public java.lang.String getTimeZoneId() { return null; }
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public boolean isShownInPickerAt(java.time.Instant p0) { return false; }
    }

    public static class OffsetResult {
        public OffsetResult() {}
        public android.icu.util.TimeZone getTimeZone() { return null; }
        public boolean isOnlyMatch() { return false; }
    }
}

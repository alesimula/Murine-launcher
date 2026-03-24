package com.android.internal.telephony.nitz;

public final class TimeZoneLookupHelper {
    public TimeZoneLookupHelper() {}
    public android.timezone.CountryTimeZones.OffsetResult lookupByNitzCountry(com.android.internal.telephony.NitzData p0, java.lang.String p1) { return null; }
    public android.timezone.CountryTimeZones.OffsetResult lookupByNitz(com.android.internal.telephony.NitzData p0) { return null; }
    public com.android.internal.telephony.nitz.TimeZoneLookupHelper.CountryResult lookupByCountry(java.lang.String p0, long p1) { return null; }
    public boolean countryUsesUtc(java.lang.String p0, long p1) { return false; }

    public static final class CountryResult {
        public static final int QUALITY_SINGLE_ZONE = 1;
        public static final int QUALITY_DEFAULT_BOOSTED = 2;
        public static final int QUALITY_MULTIPLE_ZONES_SAME_OFFSET = 3;
        public static final int QUALITY_MULTIPLE_ZONES_DIFFERENT_OFFSETS = 4;
        public final java.lang.String zoneId = null;
        public final int quality = 0;
        public CountryResult(java.lang.String p0, int p1, java.lang.String p2) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface Quality {
        }
    }
}

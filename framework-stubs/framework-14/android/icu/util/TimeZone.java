package android.icu.util;

public abstract class TimeZone implements java.io.Serializable, java.lang.Cloneable, android.icu.util.Freezable<android.icu.util.TimeZone> {
    public static final int GENERIC_LOCATION = 7;
    public static final android.icu.util.TimeZone GMT_ZONE = null;
    public static final int LONG = 1;
    public static final int LONG_GENERIC = 3;
    public static final int LONG_GMT = 5;
    public static final int SHORT = 0;
    public static final int SHORT_COMMONLY_USED = 6;
    public static final int SHORT_GENERIC = 2;
    public static final int SHORT_GMT = 4;
    public static final int TIMEZONE_ICU = 0;
    public static final int TIMEZONE_JDK = 1;
    public static final android.icu.util.TimeZone UNKNOWN_ZONE = null;
    public static final java.lang.String UNKNOWN_ZONE_ID = "Etc/Unknown";
    public TimeZone() {}
    public abstract int getOffset(int p0, int p1, int p2, int p3, int p4, int p5);
    public int getOffset(long p0) { return 0; }
    public void getOffset(long p0, boolean p1, int[] p2) {}
    public abstract void setRawOffset(int p0);
    public abstract int getRawOffset();
    public java.lang.String getID() { return null; }
    public void setID(java.lang.String p0) {}
    public final java.lang.String getDisplayName() { return null; }
    public final java.lang.String getDisplayName(java.util.Locale p0) { return null; }
    public final java.lang.String getDisplayName(android.icu.util.ULocale p0) { return null; }
    public final java.lang.String getDisplayName(boolean p0, int p1) { return null; }
    public java.lang.String getDisplayName(boolean p0, int p1, java.util.Locale p2) { return null; }
    public java.lang.String getDisplayName(boolean p0, int p1, android.icu.util.ULocale p2) { return null; }
    public int getDSTSavings() { return 0; }
    public abstract boolean useDaylightTime();
    public boolean observesDaylightTime() { return false; }
    public abstract boolean inDaylightTime(java.util.Date p0);
    public static android.icu.util.TimeZone getTimeZone(java.lang.String p0) { return null; }
    public static android.icu.util.TimeZone getFrozenTimeZone(java.lang.String p0) { return null; }
    public static android.icu.util.TimeZone getTimeZone(java.lang.String p0, int p1) { return null; }
    public static java.util.Set<java.lang.String> getAvailableIDs(android.icu.util.TimeZone.SystemTimeZoneType p0, java.lang.String p1, java.lang.Integer p2) { return null; }
    public static java.lang.String[] getAvailableIDs(int p0) { return null; }
    public static java.lang.String[] getAvailableIDs(java.lang.String p0) { return null; }
    public static java.lang.String[] getAvailableIDs() { return null; }
    public static int countEquivalentIDs(java.lang.String p0) { return 0; }
    public static java.lang.String getEquivalentID(java.lang.String p0, int p1) { return null; }
    public static android.icu.util.TimeZone getDefault() { return null; }
    public boolean hasSameRules(android.icu.util.TimeZone p0) { return false; }
    public java.lang.Object clone() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public static java.lang.String getTZDataVersion() { return null; }
    public static java.lang.String getCanonicalID(java.lang.String p0) { return null; }
    public static java.lang.String getCanonicalID(java.lang.String p0, boolean[] p1) { return null; }
    public static java.lang.String getRegion(java.lang.String p0) { return null; }
    public static java.lang.String getWindowsID(java.lang.String p0) { return null; }
    public static java.lang.String getIDForWindowsID(java.lang.String p0, java.lang.String p1) { return null; }
    public boolean isFrozen() { return false; }
    public android.icu.util.TimeZone freeze() { return null; }
    public android.icu.util.TimeZone cloneAsThawed() { return null; }

    public static enum SystemTimeZoneType {
        ANY,
        CANONICAL,
        CANONICAL_LOCATION;
        private SystemTimeZoneType() {}
    }
}

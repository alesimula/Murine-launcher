package android.icu.util;

public abstract class Calendar implements java.io.Serializable, java.lang.Cloneable, java.lang.Comparable<android.icu.util.Calendar> {
    public static final int AM = 0;
    public static final int AM_PM = 9;
    public static final int APRIL = 3;
    public static final int AUGUST = 7;
    @java.lang.Deprecated
    protected static final int BASE_FIELD_COUNT = 23;
    public static final int DATE = 5;
    public static final int DAY_OF_MONTH = 5;
    public static final int DAY_OF_WEEK = 7;
    public static final int DAY_OF_WEEK_IN_MONTH = 8;
    public static final int DAY_OF_YEAR = 6;
    public static final int DECEMBER = 11;
    public static final int DOW_LOCAL = 18;
    public static final int DST_OFFSET = 16;
    protected static final int EPOCH_JULIAN_DAY = 2440588;
    public static final int ERA = 0;
    public static final int EXTENDED_YEAR = 19;
    public static final int FEBRUARY = 1;
    public static final int FRIDAY = 6;
    protected static final int GREATEST_MINIMUM = 1;
    public static final int HOUR = 10;
    public static final int HOUR_OF_DAY = 11;
    protected static final int INTERNALLY_SET = 1;
    public static final int IS_LEAP_MONTH = 22;
    public static final int JANUARY = 0;
    protected static final int JAN_1_1_JULIAN_DAY = 1721426;
    public static final int JULIAN_DAY = 20;
    public static final int JULY = 6;
    public static final int JUNE = 5;
    protected static final int LEAST_MAXIMUM = 2;
    public static final int MARCH = 2;
    protected static final int MAXIMUM = 3;
    protected static final java.util.Date MAX_DATE = null;
    @java.lang.Deprecated
    protected static final int MAX_FIELD_COUNT = 32;
    protected static final int MAX_JULIAN = 2130706432;
    protected static final long MAX_MILLIS = 183882168921600000L;
    public static final int MAY = 4;
    public static final int MILLISECOND = 14;
    public static final int MILLISECONDS_IN_DAY = 21;
    protected static final int MINIMUM = 0;
    protected static final int MINIMUM_USER_STAMP = 2;
    public static final int MINUTE = 12;
    protected static final java.util.Date MIN_DATE = null;
    protected static final int MIN_JULIAN = -2130706432;
    protected static final long MIN_MILLIS = -184303902528000000L;
    public static final int MONDAY = 2;
    public static final int MONTH = 2;
    public static final int NOVEMBER = 10;
    public static final int OCTOBER = 9;
    protected static final long ONE_DAY = 86400000L;
    protected static final int ONE_HOUR = 3600000;
    protected static final int ONE_MINUTE = 60000;
    protected static final int ONE_SECOND = 1000;
    protected static final long ONE_WEEK = 604800000L;
    public static final int PM = 1;
    protected static final int RESOLVE_REMAP = 32;
    public static final int SATURDAY = 7;
    public static final int SECOND = 13;
    public static final int SEPTEMBER = 8;
    public static final int SUNDAY = 1;
    public static final int THURSDAY = 5;
    public static final int TUESDAY = 3;
    public static final int UNDECIMBER = 12;
    protected static final int UNSET = 0;
    public static final int WALLTIME_FIRST = 1;
    public static final int WALLTIME_LAST = 0;
    public static final int WALLTIME_NEXT_VALID = 2;
    public static final int WEDNESDAY = 4;
    public static final int WEEK_OF_MONTH = 4;
    public static final int WEEK_OF_YEAR = 3;
    public static final int YEAR = 1;
    public static final int YEAR_WOY = 17;
    public static final int ZONE_OFFSET = 15;
    protected Calendar() {}
    protected Calendar(android.icu.util.TimeZone p0, java.util.Locale p1) {}
    protected Calendar(android.icu.util.TimeZone p0, android.icu.util.ULocale p1) {}
    public static android.icu.util.Calendar getInstance() { return null; }
    public static android.icu.util.Calendar getInstance(android.icu.util.TimeZone p0) { return null; }
    public static android.icu.util.Calendar getInstance(java.util.Locale p0) { return null; }
    public static android.icu.util.Calendar getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.util.Calendar getInstance(android.icu.util.TimeZone p0, java.util.Locale p1) { return null; }
    public static android.icu.util.Calendar getInstance(android.icu.util.TimeZone p0, android.icu.util.ULocale p1) { return null; }
    public static java.util.Locale[] getAvailableLocales() { return null; }
    public static final java.lang.String[] getKeywordValuesForLocale(java.lang.String p0, android.icu.util.ULocale p1, boolean p2) { return null; }
    public final java.util.Date getTime() { return null; }
    public final void setTime(java.util.Date p0) {}
    public long getTimeInMillis() { return 0L; }
    public void setTimeInMillis(long p0) {}
    public final int get(int p0) { return 0; }
    protected final int internalGet(int p0) { return 0; }
    protected final int internalGet(int p0, int p1) { return 0; }
    public final void set(int p0, int p1) {}
    public final void set(int p0, int p1, int p2) {}
    public final void set(int p0, int p1, int p2, int p3, int p4) {}
    public final void set(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public final void clear() {}
    public final void clear(int p0) {}
    public final boolean isSet(int p0) { return false; }
    protected void complete() {}
    public boolean equals(java.lang.Object p0) { return false; }
    public boolean isEquivalentTo(android.icu.util.Calendar p0) { return false; }
    public int hashCode() { return 0; }
    public boolean before(java.lang.Object p0) { return false; }
    public boolean after(java.lang.Object p0) { return false; }
    public int getActualMaximum(int p0) { return 0; }
    public int getActualMinimum(int p0) { return 0; }
    protected void prepareGetActual(int p0, boolean p1) {}
    public final void roll(int p0, boolean p1) {}
    public void roll(int p0, int p1) {}
    public void add(int p0, int p1) {}
    public java.lang.String getDisplayName(java.util.Locale p0) { return null; }
    public java.lang.String getDisplayName(android.icu.util.ULocale p0) { return null; }
    public int compareTo(android.icu.util.Calendar p0) { return 0; }
    public android.icu.text.DateFormat getDateTimeFormat(int p0, int p1, java.util.Locale p2) { return null; }
    public android.icu.text.DateFormat getDateTimeFormat(int p0, int p1, android.icu.util.ULocale p2) { return null; }
    protected android.icu.text.DateFormat handleGetDateFormat(java.lang.String p0, java.util.Locale p1) { return null; }
    protected android.icu.text.DateFormat handleGetDateFormat(java.lang.String p0, java.lang.String p1, java.util.Locale p2) { return null; }
    protected android.icu.text.DateFormat handleGetDateFormat(java.lang.String p0, android.icu.util.ULocale p1) { return null; }
    protected void pinField(int p0) {}
    protected int weekNumber(int p0, int p1, int p2) { return 0; }
    protected final int weekNumber(int p0, int p1) { return 0; }
    public int fieldDifference(java.util.Date p0, int p1) { return 0; }
    public void setTimeZone(android.icu.util.TimeZone p0) {}
    public android.icu.util.TimeZone getTimeZone() { return null; }
    public void setLenient(boolean p0) {}
    public boolean isLenient() { return false; }
    public void setRepeatedWallTimeOption(int p0) {}
    public int getRepeatedWallTimeOption() { return 0; }
    public void setSkippedWallTimeOption(int p0) {}
    public int getSkippedWallTimeOption() { return 0; }
    public void setFirstDayOfWeek(int p0) {}
    public int getFirstDayOfWeek() { return 0; }
    public void setMinimalDaysInFirstWeek(int p0) {}
    public int getMinimalDaysInFirstWeek() { return 0; }
    protected abstract int handleGetLimit(int p0, int p1);
    protected int getLimit(int p0, int p1) { return 0; }
    public final int getMinimum(int p0) { return 0; }
    public final int getMaximum(int p0) { return 0; }
    public final int getGreatestMinimum(int p0) { return 0; }
    public final int getLeastMaximum(int p0) { return 0; }
    public boolean isWeekend(java.util.Date p0) { return false; }
    public boolean isWeekend() { return false; }
    public java.lang.Object clone() { return null; }
    public java.lang.String toString() { return null; }
    public static android.icu.util.Calendar.WeekData getWeekDataForRegion(java.lang.String p0) { return null; }
    public android.icu.util.Calendar.WeekData getWeekData() { return null; }
    public android.icu.util.Calendar setWeekData(android.icu.util.Calendar.WeekData p0) { return null; }
    protected void computeFields() {}
    protected final void computeGregorianFields(int p0) {}
    protected int resolveFields(int[][][] p0) { return 0; }
    protected int newestStamp(int p0, int p1, int p2) { return 0; }
    protected final int getStamp(int p0) { return 0; }
    protected int newerField(int p0, int p1) { return 0; }
    protected void validateFields() {}
    protected void validateField(int p0) {}
    protected final void validateField(int p0, int p1, int p2) {}
    protected void computeTime() {}
    @java.lang.Deprecated
    protected int computeMillisInDay() { return 0; }
    @java.lang.Deprecated
    protected int computeZoneOffset(long p0, int p1) { return 0; }
    protected int computeJulianDay() { return 0; }
    protected int[][][] getFieldResolutionTable() { return null; }
    protected abstract int handleComputeMonthStart(int p0, int p1, boolean p2);
    protected abstract int handleGetExtendedYear();
    protected int handleGetMonthLength(int p0, int p1) { return 0; }
    protected int handleGetYearLength(int p0) { return 0; }
    protected int[] handleCreateFields() { return null; }
    protected int handleComputeJulianDay(int p0) { return 0; }
    protected int computeGregorianMonthStart(int p0, int p1) { return 0; }
    protected void handleComputeFields(int p0) {}
    protected final int getGregorianYear() { return 0; }
    protected final int getGregorianMonth() { return 0; }
    protected final int getGregorianDayOfYear() { return 0; }
    protected final int getGregorianDayOfMonth() { return 0; }
    public final int getFieldCount() { return 0; }
    protected final void internalSet(int p0, int p1) {}
    protected static final boolean isGregorianLeapYear(int p0) { return false; }
    protected static final int gregorianMonthLength(int p0, int p1) { return 0; }
    protected static final int gregorianPreviousMonthLength(int p0, int p1) { return 0; }
    protected static final long floorDivide(long p0, long p1) { return 0L; }
    protected static final int floorDivide(int p0, int p1) { return 0; }
    protected static final int floorDivide(int p0, int p1, int[] p2) { return 0; }
    protected static final int floorDivide(long p0, int p1, int[] p2) { return 0; }
    protected java.lang.String fieldName(int p0) { return null; }
    protected static final int millisToJulianDay(long p0) { return 0; }
    protected static final long julianDayToMillis(int p0) { return 0L; }
    protected static final int julianDayToDayOfWeek(int p0) { return 0; }
    protected final long internalGetTimeInMillis() { return 0L; }
    public java.lang.String getType() { return null; }

    public static final class WeekData {
        public final int firstDayOfWeek = 0;
        public final int minimalDaysInFirstWeek = 0;
        public final int weekendCease = 0;
        public final int weekendCeaseMillis = 0;
        public final int weekendOnset = 0;
        public final int weekendOnsetMillis = 0;
        public WeekData(int p0, int p1, int p2, int p3, int p4, int p5) {}
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }
}

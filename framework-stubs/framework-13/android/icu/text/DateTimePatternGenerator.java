package android.icu.text;

public class DateTimePatternGenerator implements android.icu.util.Freezable<android.icu.text.DateTimePatternGenerator>, java.lang.Cloneable {
    public static final int DAY = 7;
    public static final int DAYPERIOD = 10;
    public static final int DAY_OF_WEEK_IN_MONTH = 9;
    public static final int DAY_OF_YEAR = 8;
    public static final int ERA = 0;
    public static final int FRACTIONAL_SECOND = 14;
    public static final int HOUR = 11;
    public static final int MATCH_ALL_FIELDS_LENGTH = 65535;
    public static final int MATCH_HOUR_FIELD_LENGTH = 2048;
    public static final int MATCH_NO_OPTIONS = 0;
    public static final int MINUTE = 12;
    public static final int MONTH = 3;
    public static final int QUARTER = 2;
    public static final int SECOND = 13;
    public static final int WEEKDAY = 6;
    public static final int WEEK_OF_MONTH = 5;
    public static final int WEEK_OF_YEAR = 4;
    public static final int YEAR = 1;
    public static final int ZONE = 15;
    protected DateTimePatternGenerator() {}
    public static android.icu.text.DateTimePatternGenerator getEmptyInstance() { return null; }
    public static android.icu.text.DateTimePatternGenerator getInstance() { return null; }
    public static android.icu.text.DateTimePatternGenerator getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.DateTimePatternGenerator getInstance(java.util.Locale p0) { return null; }
    public java.lang.String getBestPattern(java.lang.String p0) { return null; }
    public java.lang.String getBestPattern(java.lang.String p0, int p1) { return null; }
    public android.icu.text.DateTimePatternGenerator addPattern(java.lang.String p0, boolean p1, android.icu.text.DateTimePatternGenerator.PatternInfo p2) { return null; }
    public java.lang.String getSkeleton(java.lang.String p0) { return null; }
    public java.lang.String getBaseSkeleton(java.lang.String p0) { return null; }
    public java.util.Map<java.lang.String, java.lang.String> getSkeletons(java.util.Map<java.lang.String, java.lang.String> p0) { return null; }
    public java.util.Set<java.lang.String> getBaseSkeletons(java.util.Set<java.lang.String> p0) { return null; }
    public java.lang.String replaceFieldTypes(java.lang.String p0, java.lang.String p1) { return null; }
    public java.lang.String replaceFieldTypes(java.lang.String p0, java.lang.String p1, int p2) { return null; }
    public void setDateTimeFormat(java.lang.String p0) {}
    public java.lang.String getDateTimeFormat() { return null; }
    public void setDecimal(java.lang.String p0) {}
    public java.lang.String getDecimal() { return null; }
    public void setAppendItemFormat(int p0, java.lang.String p1) {}
    public java.lang.String getAppendItemFormat(int p0) { return null; }
    public void setAppendItemName(int p0, java.lang.String p1) {}
    public java.lang.String getAppendItemName(int p0) { return null; }
    public android.icu.text.DateFormat.HourCycle getDefaultHourCycle() { return null; }
    public java.lang.String getFieldDisplayName(int p0, android.icu.text.DateTimePatternGenerator.DisplayWidth p1) { return null; }
    public boolean isFrozen() { return false; }
    public android.icu.text.DateTimePatternGenerator freeze() { return null; }
    public android.icu.text.DateTimePatternGenerator cloneAsThawed() { return null; }
    public java.lang.Object clone() { return null; }

    public static enum DisplayWidth {
        WIDE,
        ABBREVIATED,
        NARROW;
        private DisplayWidth() {}
    }

    public static final class PatternInfo {
        public static final int BASE_CONFLICT = 1;
        public static final int CONFLICT = 2;
        public static final int OK = 0;
        public java.lang.String conflictingPattern;
        public int status;
        public PatternInfo() {}
    }
}

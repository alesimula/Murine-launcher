package android.icu.text;

public abstract class DateFormat extends android.icu.text.UFormat {
    public static final java.lang.String ABBR_GENERIC_TZ = "v";
    public static final java.lang.String ABBR_MONTH = "MMM";
    public static final java.lang.String ABBR_MONTH_DAY = "MMMd";
    public static final java.lang.String ABBR_MONTH_WEEKDAY_DAY = "MMMEd";
    public static final java.lang.String ABBR_QUARTER = "QQQ";
    public static final java.lang.String ABBR_SPECIFIC_TZ = "z";
    public static final java.lang.String ABBR_UTC_TZ = "ZZZZ";
    public static final java.lang.String ABBR_WEEKDAY = "E";
    public static final int AM_PM_FIELD = 14;
    public static final int AM_PM_MIDNIGHT_NOON_FIELD = 35;
    public static final int DATE_FIELD = 3;
    public static final java.lang.String DAY = "d";
    public static final int DAY_OF_WEEK_FIELD = 9;
    public static final int DAY_OF_WEEK_IN_MONTH_FIELD = 11;
    public static final int DAY_OF_YEAR_FIELD = 10;
    public static final int DEFAULT = 2;
    public static final int DOW_LOCAL_FIELD = 19;
    public static final int ERA_FIELD = 0;
    public static final int EXTENDED_YEAR_FIELD = 20;
    public static final int FLEXIBLE_DAY_PERIOD_FIELD = 36;
    public static final int FRACTIONAL_SECOND_FIELD = 8;
    public static final int FULL = 0;
    public static final java.lang.String GENERIC_TZ = "vvvv";
    public static final java.lang.String HOUR = "j";
    public static final int HOUR0_FIELD = 16;
    public static final int HOUR1_FIELD = 15;
    public static final java.lang.String HOUR24 = "H";
    public static final java.lang.String HOUR24_MINUTE = "Hm";
    public static final java.lang.String HOUR24_MINUTE_SECOND = "Hms";
    public static final java.lang.String HOUR_MINUTE = "jm";
    public static final java.lang.String HOUR_MINUTE_SECOND = "jms";
    public static final int HOUR_OF_DAY0_FIELD = 5;
    public static final int HOUR_OF_DAY1_FIELD = 4;
    public static final int JULIAN_DAY_FIELD = 21;
    public static final java.lang.String LOCATION_TZ = "VVVV";
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int MILLISECONDS_IN_DAY_FIELD = 22;
    public static final int MILLISECOND_FIELD = 8;
    public static final java.lang.String MINUTE = "m";
    public static final int MINUTE_FIELD = 6;
    public static final java.lang.String MINUTE_SECOND = "ms";
    public static final java.lang.String MONTH = "MMMM";
    public static final java.lang.String MONTH_DAY = "MMMMd";
    public static final int MONTH_FIELD = 2;
    public static final java.lang.String MONTH_WEEKDAY_DAY = "MMMMEEEEd";
    public static final int NONE = -1;
    public static final java.lang.String NUM_MONTH = "M";
    public static final java.lang.String NUM_MONTH_DAY = "Md";
    public static final java.lang.String NUM_MONTH_WEEKDAY_DAY = "MEd";
    public static final java.lang.String QUARTER = "QQQQ";
    public static final int QUARTER_FIELD = 27;
    public static final int RELATIVE = 128;
    public static final int RELATIVE_DEFAULT = 130;
    public static final int RELATIVE_FULL = 128;
    public static final int RELATIVE_LONG = 129;
    public static final int RELATIVE_MEDIUM = 130;
    public static final int RELATIVE_SHORT = 131;
    public static final java.lang.String SECOND = "s";
    public static final int SECOND_FIELD = 7;
    public static final int SHORT = 3;
    public static final java.lang.String SPECIFIC_TZ = "zzzz";
    public static final int STANDALONE_DAY_FIELD = 25;
    public static final int STANDALONE_MONTH_FIELD = 26;
    public static final int STANDALONE_QUARTER_FIELD = 28;
    public static final int TIMEZONE_FIELD = 17;
    public static final int TIMEZONE_GENERIC_FIELD = 24;
    public static final int TIMEZONE_ISO_FIELD = 32;
    public static final int TIMEZONE_ISO_LOCAL_FIELD = 33;
    public static final int TIMEZONE_LOCALIZED_GMT_OFFSET_FIELD = 31;
    public static final int TIMEZONE_RFC_FIELD = 23;
    public static final int TIMEZONE_SPECIAL_FIELD = 29;
    public static final java.lang.String WEEKDAY = "EEEE";
    public static final int WEEK_OF_MONTH_FIELD = 13;
    public static final int WEEK_OF_YEAR_FIELD = 12;
    public static final java.lang.String YEAR = "y";
    public static final java.lang.String YEAR_ABBR_MONTH = "yMMM";
    public static final java.lang.String YEAR_ABBR_MONTH_DAY = "yMMMd";
    public static final java.lang.String YEAR_ABBR_MONTH_WEEKDAY_DAY = "yMMMEd";
    public static final java.lang.String YEAR_ABBR_QUARTER = "yQQQ";
    public static final int YEAR_FIELD = 1;
    public static final java.lang.String YEAR_MONTH = "yMMMM";
    public static final java.lang.String YEAR_MONTH_DAY = "yMMMMd";
    public static final java.lang.String YEAR_MONTH_WEEKDAY_DAY = "yMMMMEEEEd";
    public static final int YEAR_NAME_FIELD = 30;
    public static final java.lang.String YEAR_NUM_MONTH = "yM";
    public static final java.lang.String YEAR_NUM_MONTH_DAY = "yMd";
    public static final java.lang.String YEAR_NUM_MONTH_WEEKDAY_DAY = "yMEd";
    public static final java.lang.String YEAR_QUARTER = "yQQQQ";
    public static final int YEAR_WOY_FIELD = 18;
    protected android.icu.util.Calendar calendar;
    protected android.icu.text.NumberFormat numberFormat;
    protected DateFormat() { super(); }
    public final java.lang.StringBuffer format(java.lang.Object p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public abstract java.lang.StringBuffer format(android.icu.util.Calendar p0, java.lang.StringBuffer p1, java.text.FieldPosition p2);
    public java.lang.StringBuffer format(java.util.Date p0, java.lang.StringBuffer p1, java.text.FieldPosition p2) { return null; }
    public final java.lang.String format(java.util.Date p0) { return null; }
    public java.util.Date parse(java.lang.String p0) throws java.text.ParseException { return null; }
    public abstract void parse(java.lang.String p0, android.icu.util.Calendar p1, java.text.ParsePosition p2);
    public java.util.Date parse(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public java.lang.Object parseObject(java.lang.String p0, java.text.ParsePosition p1) { return null; }
    public static final android.icu.text.DateFormat getTimeInstance() { return null; }
    public static final android.icu.text.DateFormat getTimeInstance(int p0) { return null; }
    public static final android.icu.text.DateFormat getTimeInstance(int p0, java.util.Locale p1) { return null; }
    public static final android.icu.text.DateFormat getTimeInstance(int p0, android.icu.util.ULocale p1) { return null; }
    public static final android.icu.text.DateFormat getDateInstance() { return null; }
    public static final android.icu.text.DateFormat getDateInstance(int p0) { return null; }
    public static final android.icu.text.DateFormat getDateInstance(int p0, java.util.Locale p1) { return null; }
    public static final android.icu.text.DateFormat getDateInstance(int p0, android.icu.util.ULocale p1) { return null; }
    public static final android.icu.text.DateFormat getDateTimeInstance() { return null; }
    public static final android.icu.text.DateFormat getDateTimeInstance(int p0, int p1) { return null; }
    public static final android.icu.text.DateFormat getDateTimeInstance(int p0, int p1, java.util.Locale p2) { return null; }
    public static final android.icu.text.DateFormat getDateTimeInstance(int p0, int p1, android.icu.util.ULocale p2) { return null; }
    public static final android.icu.text.DateFormat getInstance() { return null; }
    public static java.util.Locale[] getAvailableLocales() { return null; }
    public void setCalendar(android.icu.util.Calendar p0) {}
    public android.icu.util.Calendar getCalendar() { return null; }
    public void setNumberFormat(android.icu.text.NumberFormat p0) {}
    public android.icu.text.NumberFormat getNumberFormat() { return null; }
    public void setTimeZone(android.icu.util.TimeZone p0) {}
    public android.icu.util.TimeZone getTimeZone() { return null; }
    public void setLenient(boolean p0) {}
    public boolean isLenient() { return false; }
    public void setCalendarLenient(boolean p0) {}
    public boolean isCalendarLenient() { return false; }
    public android.icu.text.DateFormat setBooleanAttribute(android.icu.text.DateFormat.BooleanAttribute p0, boolean p1) { return null; }
    public boolean getBooleanAttribute(android.icu.text.DateFormat.BooleanAttribute p0) { return false; }
    public void setContext(android.icu.text.DisplayContext p0) {}
    public android.icu.text.DisplayContext getContext(android.icu.text.DisplayContext.Type p0) { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.Object clone() { return null; }
    public static final android.icu.text.DateFormat getDateInstance(android.icu.util.Calendar p0, int p1, java.util.Locale p2) { return null; }
    public static final android.icu.text.DateFormat getDateInstance(android.icu.util.Calendar p0, int p1, android.icu.util.ULocale p2) { return null; }
    public static final android.icu.text.DateFormat getTimeInstance(android.icu.util.Calendar p0, int p1, java.util.Locale p2) { return null; }
    public static final android.icu.text.DateFormat getTimeInstance(android.icu.util.Calendar p0, int p1, android.icu.util.ULocale p2) { return null; }
    public static final android.icu.text.DateFormat getDateTimeInstance(android.icu.util.Calendar p0, int p1, int p2, java.util.Locale p3) { return null; }
    public static final android.icu.text.DateFormat getDateTimeInstance(android.icu.util.Calendar p0, int p1, int p2, android.icu.util.ULocale p3) { return null; }
    public static final android.icu.text.DateFormat getInstance(android.icu.util.Calendar p0, java.util.Locale p1) { return null; }
    public static final android.icu.text.DateFormat getInstance(android.icu.util.Calendar p0, android.icu.util.ULocale p1) { return null; }
    public static final android.icu.text.DateFormat getInstance(android.icu.util.Calendar p0) { return null; }
    public static final android.icu.text.DateFormat getDateInstance(android.icu.util.Calendar p0, int p1) { return null; }
    public static final android.icu.text.DateFormat getTimeInstance(android.icu.util.Calendar p0, int p1) { return null; }
    public static final android.icu.text.DateFormat getDateTimeInstance(android.icu.util.Calendar p0, int p1, int p2) { return null; }
    public static final android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String p0) { return null; }
    public static final android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String p0, java.util.Locale p1) { return null; }
    public static final android.icu.text.DateFormat getInstanceForSkeleton(java.lang.String p0, android.icu.util.ULocale p1) { return null; }
    public static final android.icu.text.DateFormat getInstanceForSkeleton(android.icu.util.Calendar p0, java.lang.String p1, java.util.Locale p2) { return null; }
    public static final android.icu.text.DateFormat getInstanceForSkeleton(android.icu.util.Calendar p0, java.lang.String p1, android.icu.util.ULocale p2) { return null; }
    public static final android.icu.text.DateFormat getPatternInstance(java.lang.String p0) { return null; }
    public static final android.icu.text.DateFormat getPatternInstance(java.lang.String p0, java.util.Locale p1) { return null; }
    public static final android.icu.text.DateFormat getPatternInstance(java.lang.String p0, android.icu.util.ULocale p1) { return null; }
    public static final android.icu.text.DateFormat getPatternInstance(android.icu.util.Calendar p0, java.lang.String p1, java.util.Locale p2) { return null; }
    public static final android.icu.text.DateFormat getPatternInstance(android.icu.util.Calendar p0, java.lang.String p1, android.icu.util.ULocale p2) { return null; }

    public static class Field extends java.text.Format.Field {
        public static final android.icu.text.DateFormat.Field AM_PM = null;
        public static final android.icu.text.DateFormat.Field AM_PM_MIDNIGHT_NOON = null;
        public static final android.icu.text.DateFormat.Field DAY_OF_MONTH = null;
        public static final android.icu.text.DateFormat.Field DAY_OF_WEEK = null;
        public static final android.icu.text.DateFormat.Field DAY_OF_WEEK_IN_MONTH = null;
        public static final android.icu.text.DateFormat.Field DAY_OF_YEAR = null;
        public static final android.icu.text.DateFormat.Field DOW_LOCAL = null;
        public static final android.icu.text.DateFormat.Field ERA = null;
        public static final android.icu.text.DateFormat.Field EXTENDED_YEAR = null;
        public static final android.icu.text.DateFormat.Field FLEXIBLE_DAY_PERIOD = null;
        public static final android.icu.text.DateFormat.Field HOUR0 = null;
        public static final android.icu.text.DateFormat.Field HOUR1 = null;
        public static final android.icu.text.DateFormat.Field HOUR_OF_DAY0 = null;
        public static final android.icu.text.DateFormat.Field HOUR_OF_DAY1 = null;
        public static final android.icu.text.DateFormat.Field JULIAN_DAY = null;
        public static final android.icu.text.DateFormat.Field MILLISECOND = null;
        public static final android.icu.text.DateFormat.Field MILLISECONDS_IN_DAY = null;
        public static final android.icu.text.DateFormat.Field MINUTE = null;
        public static final android.icu.text.DateFormat.Field MONTH = null;
        public static final android.icu.text.DateFormat.Field QUARTER = null;
        public static final android.icu.text.DateFormat.Field SECOND = null;
        public static final android.icu.text.DateFormat.Field TIME_ZONE = null;
        public static final android.icu.text.DateFormat.Field WEEK_OF_MONTH = null;
        public static final android.icu.text.DateFormat.Field WEEK_OF_YEAR = null;
        public static final android.icu.text.DateFormat.Field YEAR = null;
        public static final android.icu.text.DateFormat.Field YEAR_WOY = null;
        protected Field(java.lang.String p0, int p1) { super(null); }
        public static android.icu.text.DateFormat.Field ofCalendarField(int p0) { return null; }
        public int getCalendarField() { return 0; }
        protected java.lang.Object readResolve() throws java.io.InvalidObjectException { return null; }
    }

    public static enum BooleanAttribute {
        PARSE_ALLOW_WHITESPACE,
        PARSE_ALLOW_NUMERIC,
        PARSE_MULTIPLE_PATTERNS_FOR_MATCH,
        PARSE_PARTIAL_LITERAL_MATCH;
        private BooleanAttribute() {}
    }

    public static enum HourCycle {
        HOUR_CYCLE_11,
        HOUR_CYCLE_12,
        HOUR_CYCLE_23,
        HOUR_CYCLE_24;
        private HourCycle() {}
    }
}

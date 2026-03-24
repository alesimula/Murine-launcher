package android.icu.util;

public class IslamicCalendar extends android.icu.util.Calendar {
    public static final int DHU_AL_HIJJAH = 11;
    public static final int DHU_AL_QIDAH = 10;
    public static final int JUMADA_1 = 4;
    public static final int JUMADA_2 = 5;
    public static final int MUHARRAM = 0;
    public static final int RABI_1 = 2;
    public static final int RABI_2 = 3;
    public static final int RAJAB = 6;
    public static final int RAMADAN = 8;
    public static final int SAFAR = 1;
    public static final int SHABAN = 7;
    public static final int SHAWWAL = 9;
    public IslamicCalendar() { super(); }
    public IslamicCalendar(android.icu.util.TimeZone p0) { super(); }
    public IslamicCalendar(java.util.Locale p0) { super(); }
    public IslamicCalendar(android.icu.util.ULocale p0) { super(); }
    public IslamicCalendar(android.icu.util.TimeZone p0, java.util.Locale p1) { super(); }
    public IslamicCalendar(android.icu.util.TimeZone p0, android.icu.util.ULocale p1) { super(); }
    public IslamicCalendar(java.util.Date p0) { super(); }
    public IslamicCalendar(int p0, int p1, int p2) { super(); }
    public IslamicCalendar(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    protected int handleGetLimit(int p0, int p1) { return 0; }
    protected int handleGetMonthLength(int p0, int p1) { return 0; }
    protected int handleGetYearLength(int p0) { return 0; }
    protected int handleComputeMonthStart(int p0, int p1, boolean p2) { return 0; }
    protected int handleGetExtendedYear() { return 0; }
    protected void handleComputeFields(int p0) {}
    public void setCalculationType(android.icu.util.IslamicCalendar.CalculationType p0) {}
    public android.icu.util.IslamicCalendar.CalculationType getCalculationType() { return null; }
    public java.lang.String getType() { return null; }

    public static enum CalculationType {
        ISLAMIC,
        ISLAMIC_CIVIL,
        ISLAMIC_UMALQURA,
        ISLAMIC_TBLA;
        private CalculationType() {}
    }
}

package android.app.admin;

public class FreezePeriod {
    private static final java.lang.String TAG = "FreezePeriod";
    private static final int SENTINEL_YEAR = 2001;
    static final int DAYS_IN_YEAR = 365;
    private final java.time.MonthDay mStart = null;
    private final java.time.MonthDay mEnd = null;
    private final int mStartDay = 0;
    private final int mEndDay = 0;
    public FreezePeriod(java.time.MonthDay p0, java.time.MonthDay p1) {}
    public java.time.MonthDay getStart() { return null; }
    public java.time.MonthDay getEnd() { return null; }
    private FreezePeriod(int p0, int p1) {}
    int getLength() { return 0; }
    boolean isWrapped() { return false; }
    int getEffectiveEndDay() { return 0; }
    boolean contains(java.time.LocalDate p0) { return false; }
    boolean after(java.time.LocalDate p0) { return false; }
    android.util.Pair<java.time.LocalDate, java.time.LocalDate> toCurrentOrFutureRealDates(java.time.LocalDate p0) { return null; }
    public java.lang.String toString() { return null; }
    private static java.time.MonthDay dayOfYearToMonthDay(int p0) { return null; }
    private static int dayOfYearDisregardLeapYear(java.time.LocalDate p0) { return 0; }
    public static int distanceWithoutLeapYear(java.time.LocalDate p0, java.time.LocalDate p1) { return 0; }
    static java.util.List<android.app.admin.FreezePeriod> canonicalizePeriods(java.util.List<android.app.admin.FreezePeriod> p0) { return null; }
    static void validatePeriods(java.util.List<android.app.admin.FreezePeriod> p0) {}
    static void validateAgainstPreviousFreezePeriod(java.util.List<android.app.admin.FreezePeriod> p0, java.time.LocalDate p1, java.time.LocalDate p2, java.time.LocalDate p3) {}
}

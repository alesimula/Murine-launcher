package android.app.admin;

public class FreezePeriod {
    static final int DAYS_IN_YEAR = 365;
    public FreezePeriod(java.time.MonthDay p0, java.time.MonthDay p1) {}
    public java.time.MonthDay getStart() { return null; }
    public java.time.MonthDay getEnd() { return null; }
    int getLength() { return 0; }
    boolean isWrapped() { return false; }
    int getEffectiveEndDay() { return 0; }
    boolean contains(java.time.LocalDate p0) { return false; }
    boolean after(java.time.LocalDate p0) { return false; }
    android.util.Pair<java.time.LocalDate, java.time.LocalDate> toCurrentOrFutureRealDates(java.time.LocalDate p0) { return null; }
    public java.lang.String toString() { return null; }
    public static int distanceWithoutLeapYear(java.time.LocalDate p0, java.time.LocalDate p1) { return 0; }
    static java.util.List<android.app.admin.FreezePeriod> canonicalizePeriods(java.util.List<android.app.admin.FreezePeriod> p0) { return null; }
    static void validatePeriods(java.util.List<android.app.admin.FreezePeriod> p0) {}
    static void validateAgainstPreviousFreezePeriod(java.util.List<android.app.admin.FreezePeriod> p0, java.time.LocalDate p1, java.time.LocalDate p2, java.time.LocalDate p3) {}
}

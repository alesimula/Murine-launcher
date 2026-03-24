package android.icu.util;

public class GregorianCalendar extends android.icu.util.Calendar {
    public static final int AD = 1;
    public static final int BC = 0;
    protected transient boolean invertGregorian;
    protected transient boolean isGregorian;
    public GregorianCalendar() { super(); }
    public GregorianCalendar(android.icu.util.TimeZone p0) { super(); }
    public GregorianCalendar(java.util.Locale p0) { super(); }
    public GregorianCalendar(android.icu.util.ULocale p0) { super(); }
    public GregorianCalendar(android.icu.util.TimeZone p0, java.util.Locale p1) { super(); }
    public GregorianCalendar(android.icu.util.TimeZone p0, android.icu.util.ULocale p1) { super(); }
    public GregorianCalendar(int p0, int p1, int p2) { super(); }
    public GregorianCalendar(int p0, int p1, int p2, int p3, int p4) { super(); }
    public GregorianCalendar(int p0, int p1, int p2, int p3, int p4, int p5) { super(); }
    protected int handleGetLimit(int p0, int p1) { return 0; }
    public void setGregorianChange(java.util.Date p0) {}
    public final java.util.Date getGregorianChange() { return null; }
    public boolean isLeapYear(int p0) { return false; }
    public boolean isEquivalentTo(android.icu.util.Calendar p0) { return false; }
    public int hashCode() { return 0; }
    public void roll(int p0, int p1) {}
    public int getActualMinimum(int p0) { return 0; }
    public int getActualMaximum(int p0) { return 0; }
    protected int handleGetMonthLength(int p0, int p1) { return 0; }
    protected int handleGetYearLength(int p0) { return 0; }
    protected void handleComputeFields(int p0) {}
    protected int handleGetExtendedYear() { return 0; }
    protected int handleComputeJulianDay(int p0) { return 0; }
    protected int handleComputeMonthStart(int p0, int p1, boolean p2) { return 0; }
    public java.lang.String getType() { return null; }
}

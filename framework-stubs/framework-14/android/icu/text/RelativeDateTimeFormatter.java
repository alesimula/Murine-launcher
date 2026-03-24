package android.icu.text;

public final class RelativeDateTimeFormatter {
    RelativeDateTimeFormatter() {}
    public static android.icu.text.RelativeDateTimeFormatter getInstance() { return null; }
    public static android.icu.text.RelativeDateTimeFormatter getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.RelativeDateTimeFormatter getInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.RelativeDateTimeFormatter getInstance(android.icu.util.ULocale p0, android.icu.text.NumberFormat p1) { return null; }
    public static android.icu.text.RelativeDateTimeFormatter getInstance(android.icu.util.ULocale p0, android.icu.text.NumberFormat p1, android.icu.text.RelativeDateTimeFormatter.Style p2, android.icu.text.DisplayContext p3) { return null; }
    public static android.icu.text.RelativeDateTimeFormatter getInstance(java.util.Locale p0, android.icu.text.NumberFormat p1) { return null; }
    public java.lang.String format(double p0, android.icu.text.RelativeDateTimeFormatter.Direction p1, android.icu.text.RelativeDateTimeFormatter.RelativeUnit p2) { return null; }
    public android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatToValue(double p0, android.icu.text.RelativeDateTimeFormatter.Direction p1, android.icu.text.RelativeDateTimeFormatter.RelativeUnit p2) { return null; }
    public java.lang.String formatNumeric(double p0, android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit p1) { return null; }
    public android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatNumericToValue(double p0, android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit p1) { return null; }
    public java.lang.String format(android.icu.text.RelativeDateTimeFormatter.Direction p0, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit p1) { return null; }
    public android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatToValue(android.icu.text.RelativeDateTimeFormatter.Direction p0, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit p1) { return null; }
    public java.lang.String format(double p0, android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit p1) { return null; }
    public android.icu.text.RelativeDateTimeFormatter.FormattedRelativeDateTime formatToValue(double p0, android.icu.text.RelativeDateTimeFormatter.RelativeDateTimeUnit p1) { return null; }
    public java.lang.String combineDateAndTime(java.lang.String p0, java.lang.String p1) { return null; }
    public android.icu.text.NumberFormat getNumberFormat() { return null; }
    public android.icu.text.DisplayContext getCapitalizationContext() { return null; }
    public android.icu.text.RelativeDateTimeFormatter.Style getFormatStyle() { return null; }

    public static class FormattedRelativeDateTime implements android.icu.text.FormattedValue {
        FormattedRelativeDateTime() {}
        public java.lang.String toString() { return null; }
        public int length() { return 0; }
        public char charAt(int p0) { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public <A extends java.lang.Appendable> A appendTo(A p0) { return null; }
        public boolean nextPosition(android.icu.text.ConstrainedFieldPosition p0) { return false; }
        public java.text.AttributedCharacterIterator toCharacterIterator() { return null; }
    }

    public static enum Direction {
        LAST_2,
        LAST,
        THIS,
        NEXT,
        NEXT_2,
        PLAIN;
        private Direction() {}
    }

    public static enum AbsoluteUnit {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        DAY,
        WEEK,
        MONTH,
        YEAR,
        NOW,
        QUARTER,
        HOUR,
        MINUTE;
        private AbsoluteUnit() {}
    }

    public static enum Style {
        LONG,
        SHORT,
        NARROW;
        private Style() {}
    }

    public static enum RelativeUnit {
        SECONDS,
        MINUTES,
        HOURS,
        DAYS,
        WEEKS,
        MONTHS,
        YEARS;
        private RelativeUnit() {}
    }

    public static enum RelativeDateTimeUnit {
        YEAR,
        QUARTER,
        MONTH,
        WEEK,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
        private RelativeDateTimeUnit() {}
    }
}

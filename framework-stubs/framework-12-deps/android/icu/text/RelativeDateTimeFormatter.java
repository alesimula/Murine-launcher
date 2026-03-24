package android.icu.text;

public class RelativeDateTimeFormatter {
    public RelativeDateTimeFormatter() {}
    public java.lang.String format(android.icu.text.RelativeDateTimeFormatter.Direction p0, android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit p1) { return null; }
    public java.lang.String format(double p0, android.icu.text.RelativeDateTimeFormatter.Direction p1, android.icu.text.RelativeDateTimeFormatter.RelativeUnit p2) { return null; }
    public java.lang.String combineDateAndTime(java.lang.String p0, java.lang.String p1) { return null; }
    public android.icu.text.RelativeDateTimeFormatter getInstance(android.icu.util.ULocale p0, android.icu.text.NumberFormat p1, android.icu.text.RelativeDateTimeFormatter.Style p2, android.icu.text.DisplayContext p3) { return null; }
    public android.icu.text.RelativeDateTimeFormatter getInstance() { return null; }

    public static class Style {
        public Style() {}
        public android.icu.text.RelativeDateTimeFormatter.Style SHORT = null;
        public android.icu.text.RelativeDateTimeFormatter.Style LONG = null;
    }

    public static class Direction {
        public Direction() {}
        public android.icu.text.RelativeDateTimeFormatter.Direction LAST = null;
        public android.icu.text.RelativeDateTimeFormatter.Direction NEXT = null;
        public android.icu.text.RelativeDateTimeFormatter.Direction LAST_2 = null;
        public android.icu.text.RelativeDateTimeFormatter.Direction NEXT_2 = null;
        public android.icu.text.RelativeDateTimeFormatter.Direction THIS = null;
    }

    public static class RelativeUnit {
        public RelativeUnit() {}
        public android.icu.text.RelativeDateTimeFormatter.RelativeUnit SECONDS = null;
        public android.icu.text.RelativeDateTimeFormatter.RelativeUnit MINUTES = null;
        public android.icu.text.RelativeDateTimeFormatter.RelativeUnit HOURS = null;
        public android.icu.text.RelativeDateTimeFormatter.RelativeUnit DAYS = null;
        public android.icu.text.RelativeDateTimeFormatter.RelativeUnit WEEKS = null;
    }

    public static class AbsoluteUnit {
        public AbsoluteUnit() {}
        public android.icu.text.RelativeDateTimeFormatter.AbsoluteUnit DAY = null;
    }
}

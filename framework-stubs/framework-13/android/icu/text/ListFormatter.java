package android.icu.text;

public final class ListFormatter {
    ListFormatter() {}
    public static android.icu.text.ListFormatter getInstance(android.icu.util.ULocale p0, android.icu.text.ListFormatter.Type p1, android.icu.text.ListFormatter.Width p2) { return null; }
    public static android.icu.text.ListFormatter getInstance(java.util.Locale p0, android.icu.text.ListFormatter.Type p1, android.icu.text.ListFormatter.Width p2) { return null; }
    public static android.icu.text.ListFormatter getInstance(android.icu.util.ULocale p0) { return null; }
    public static android.icu.text.ListFormatter getInstance(java.util.Locale p0) { return null; }
    public static android.icu.text.ListFormatter getInstance() { return null; }
    public java.lang.String format(java.lang.Object... p0) { return null; }
    public java.lang.String format(java.util.Collection<?> p0) { return null; }
    public android.icu.text.ListFormatter.FormattedList formatToValue(java.lang.Object... p0) { return null; }
    public android.icu.text.ListFormatter.FormattedList formatToValue(java.util.Collection<?> p0) { return null; }
    public java.lang.String getPatternForNumItems(int p0) { return null; }

    public static final class FormattedList implements android.icu.text.FormattedValue {
        FormattedList() {}
        public java.lang.String toString() { return null; }
        public int length() { return 0; }
        public char charAt(int p0) { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public <A extends java.lang.Appendable> A appendTo(A p0) { return null; }
        public boolean nextPosition(android.icu.text.ConstrainedFieldPosition p0) { return false; }
        public java.text.AttributedCharacterIterator toCharacterIterator() { return null; }
    }

    public static enum Type {
        AND,
        OR,
        UNITS;
        private Type() {}
    }

    public static enum Width {
        WIDE,
        SHORT,
        NARROW;
        private Width() {}
    }
}

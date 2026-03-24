package android.icu.text;

public abstract class CaseMap {
    private CaseMap() {}
    public static android.icu.text.CaseMap.Lower toLower() { return null; }
    public static android.icu.text.CaseMap.Upper toUpper() { return null; }
    public static android.icu.text.CaseMap.Title toTitle() { return null; }
    public static android.icu.text.CaseMap.Fold fold() { return null; }
    public abstract android.icu.text.CaseMap omitUnchangedText();

    public static final class Fold extends android.icu.text.CaseMap {
        private Fold() { super(); }
        public android.icu.text.CaseMap.Fold omitUnchangedText() { return null; }
        public android.icu.text.CaseMap.Fold turkic() { return null; }
        public java.lang.String apply(java.lang.CharSequence p0) { return null; }
        public <A extends java.lang.Appendable> A apply(java.lang.CharSequence p0, A p1, android.icu.text.Edits p2) { return null; }
    }

    public static final class Lower extends android.icu.text.CaseMap {
        private Lower() { super(); }
        public android.icu.text.CaseMap.Lower omitUnchangedText() { return null; }
        public java.lang.String apply(java.util.Locale p0, java.lang.CharSequence p1) { return null; }
        public <A extends java.lang.Appendable> A apply(java.util.Locale p0, java.lang.CharSequence p1, A p2, android.icu.text.Edits p3) { return null; }
    }

    public static final class Title extends android.icu.text.CaseMap {
        private Title() { super(); }
        public android.icu.text.CaseMap.Title wholeString() { return null; }
        public android.icu.text.CaseMap.Title sentences() { return null; }
        public android.icu.text.CaseMap.Title omitUnchangedText() { return null; }
        public android.icu.text.CaseMap.Title noLowercase() { return null; }
        public android.icu.text.CaseMap.Title noBreakAdjustment() { return null; }
        public android.icu.text.CaseMap.Title adjustToCased() { return null; }
        public java.lang.String apply(java.util.Locale p0, android.icu.text.BreakIterator p1, java.lang.CharSequence p2) { return null; }
        public <A extends java.lang.Appendable> A apply(java.util.Locale p0, android.icu.text.BreakIterator p1, java.lang.CharSequence p2, A p3, android.icu.text.Edits p4) { return null; }
    }

    public static final class Upper extends android.icu.text.CaseMap {
        private Upper() { super(); }
        public android.icu.text.CaseMap.Upper omitUnchangedText() { return null; }
        public java.lang.String apply(java.util.Locale p0, java.lang.CharSequence p1) { return null; }
        public <A extends java.lang.Appendable> A apply(java.util.Locale p0, java.lang.CharSequence p1, A p2, android.icu.text.Edits p3) { return null; }
    }
}

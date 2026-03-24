package android.icu.text;

public class CaseMap {
    public CaseMap() {}
    public android.icu.text.CaseMap.Upper toUpper() { return null; }
    public android.icu.text.CaseMap.Title toTitle() { return null; }

    public static class Upper {
        public Upper() {}
        public java.lang.Appendable apply(java.util.Locale p0, java.lang.CharSequence p1, java.lang.Appendable p2, android.icu.text.Edits p3) { return null; }
    }

    public static class Title {
        public Title() {}
        public android.icu.text.CaseMap.Title wholeString() { return null; }
        public android.icu.text.CaseMap.Title noLowercase() { return null; }
        public java.lang.String apply(java.util.Locale p0, android.icu.text.BreakIterator p1, java.lang.CharSequence p2) { return null; }
    }
}

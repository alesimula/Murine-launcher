package android.icu.text;

public abstract class Transliterator {
    public static final int FORWARD = 0;
    public static final int REVERSE = 1;
    Transliterator() {}
    public final int transliterate(android.icu.text.Replaceable p0, int p1, int p2) { return 0; }
    public final void transliterate(android.icu.text.Replaceable p0) {}
    public final java.lang.String transliterate(java.lang.String p0) { return null; }
    public final void transliterate(android.icu.text.Replaceable p0, android.icu.text.Transliterator.Position p1, java.lang.String p2) {}
    public final void transliterate(android.icu.text.Replaceable p0, android.icu.text.Transliterator.Position p1, int p2) {}
    public final void transliterate(android.icu.text.Replaceable p0, android.icu.text.Transliterator.Position p1) {}
    public final void finishTransliteration(android.icu.text.Replaceable p0, android.icu.text.Transliterator.Position p1) {}
    public void filteredTransliterate(android.icu.text.Replaceable p0, android.icu.text.Transliterator.Position p1, boolean p2) {}
    public final int getMaximumContextLength() { return 0; }
    public final java.lang.String getID() { return null; }
    public static final java.lang.String getDisplayName(java.lang.String p0) { return null; }
    public static java.lang.String getDisplayName(java.lang.String p0, java.util.Locale p1) { return null; }
    public static java.lang.String getDisplayName(java.lang.String p0, android.icu.util.ULocale p1) { return null; }
    public final android.icu.text.UnicodeFilter getFilter() { return null; }
    public void setFilter(android.icu.text.UnicodeFilter p0) {}
    public static final android.icu.text.Transliterator getInstance(java.lang.String p0) { return null; }
    public static android.icu.text.Transliterator getInstance(java.lang.String p0, int p1) { return null; }
    public static final android.icu.text.Transliterator createFromRules(java.lang.String p0, java.lang.String p1, int p2) { return null; }
    public java.lang.String toRules(boolean p0) { return null; }
    public android.icu.text.Transliterator[] getElements() { return null; }
    public final android.icu.text.UnicodeSet getSourceSet() { return null; }
    public android.icu.text.UnicodeSet getTargetSet() { return null; }
    public final android.icu.text.Transliterator getInverse() { return null; }
    public static final java.util.Enumeration<java.lang.String> getAvailableIDs() { return null; }
    public static final java.util.Enumeration<java.lang.String> getAvailableSources() { return null; }
    public static final java.util.Enumeration<java.lang.String> getAvailableTargets(java.lang.String p0) { return null; }
    public static final java.util.Enumeration<java.lang.String> getAvailableVariants(java.lang.String p0, java.lang.String p1) { return null; }

    public static class Position {
        public int contextLimit;
        public int contextStart;
        public int limit;
        public int start;
        public Position() {}
        public Position(int p0, int p1, int p2) {}
        public Position(int p0, int p1, int p2, int p3) {}
        public Position(android.icu.text.Transliterator.Position p0) {}
        public void set(android.icu.text.Transliterator.Position p0) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
        public final void validate(int p0) {}
    }
}

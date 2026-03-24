package android.icu.text;

public class UnicodeSet extends android.icu.text.UnicodeFilter implements java.lang.Iterable<java.lang.String>, java.lang.Comparable<android.icu.text.UnicodeSet>, android.icu.util.Freezable<android.icu.text.UnicodeSet> {
    public static final int ADD_CASE_MAPPINGS = 4;
    public static final android.icu.text.UnicodeSet ALL_CODE_POINTS = null;
    public static final int CASE = 2;
    public static final int CASE_INSENSITIVE = 2;
    public static final android.icu.text.UnicodeSet EMPTY = null;
    public static final int IGNORE_SPACE = 1;
    public static final int MAX_VALUE = 1114111;
    public static final int MIN_VALUE = 0;
    public UnicodeSet() { super(); }
    public UnicodeSet(android.icu.text.UnicodeSet p0) { super(); }
    public UnicodeSet(int p0, int p1) { super(); }
    public UnicodeSet(int... p0) { super(); }
    public UnicodeSet(java.lang.String p0) { super(); }
    public UnicodeSet(java.lang.String p0, boolean p1) { super(); }
    public UnicodeSet(java.lang.String p0, int p1) { super(); }
    public UnicodeSet(java.lang.String p0, java.text.ParsePosition p1, android.icu.text.SymbolTable p2) { super(); }
    public UnicodeSet(java.lang.String p0, java.text.ParsePosition p1, android.icu.text.SymbolTable p2, int p3) { super(); }
    public java.lang.Object clone() { return null; }
    public android.icu.text.UnicodeSet set(int p0, int p1) { return null; }
    public android.icu.text.UnicodeSet set(android.icu.text.UnicodeSet p0) { return null; }
    public final android.icu.text.UnicodeSet applyPattern(java.lang.String p0) { return null; }
    public android.icu.text.UnicodeSet applyPattern(java.lang.String p0, boolean p1) { return null; }
    public android.icu.text.UnicodeSet applyPattern(java.lang.String p0, int p1) { return null; }
    public java.lang.String toPattern(boolean p0) { return null; }
    public java.lang.StringBuffer _generatePattern(java.lang.StringBuffer p0, boolean p1) { return null; }
    public java.lang.StringBuffer _generatePattern(java.lang.StringBuffer p0, boolean p1, boolean p2) { return null; }
    public int size() { return 0; }
    public boolean isEmpty() { return false; }
    public boolean hasStrings() { return false; }
    public boolean matchesIndexValue(int p0) { return false; }
    public int matches(android.icu.text.Replaceable p0, int[] p1, int p2, boolean p3) { return 0; }
    public void addMatchSetTo(android.icu.text.UnicodeSet p0) {}
    public int indexOf(int p0) { return 0; }
    public int charAt(int p0) { return 0; }
    public android.icu.text.UnicodeSet add(int p0, int p1) { return null; }
    public android.icu.text.UnicodeSet addAll(int p0, int p1) { return null; }
    public final android.icu.text.UnicodeSet add(int p0) { return null; }
    public final android.icu.text.UnicodeSet add(java.lang.CharSequence p0) { return null; }
    public final android.icu.text.UnicodeSet addAll(java.lang.CharSequence p0) { return null; }
    public final android.icu.text.UnicodeSet retainAll(java.lang.CharSequence p0) { return null; }
    public final android.icu.text.UnicodeSet complementAll(java.lang.CharSequence p0) { return null; }
    public final android.icu.text.UnicodeSet removeAll(java.lang.CharSequence p0) { return null; }
    public final android.icu.text.UnicodeSet removeAllStrings() { return null; }
    public static android.icu.text.UnicodeSet from(java.lang.CharSequence p0) { return null; }
    public static android.icu.text.UnicodeSet fromAll(java.lang.CharSequence p0) { return null; }
    public android.icu.text.UnicodeSet retain(int p0, int p1) { return null; }
    public final android.icu.text.UnicodeSet retain(int p0) { return null; }
    public final android.icu.text.UnicodeSet retain(java.lang.CharSequence p0) { return null; }
    public android.icu.text.UnicodeSet remove(int p0, int p1) { return null; }
    public final android.icu.text.UnicodeSet remove(int p0) { return null; }
    public final android.icu.text.UnicodeSet remove(java.lang.CharSequence p0) { return null; }
    public android.icu.text.UnicodeSet complement(int p0, int p1) { return null; }
    public final android.icu.text.UnicodeSet complement(int p0) { return null; }
    public android.icu.text.UnicodeSet complement() { return null; }
    public final android.icu.text.UnicodeSet complement(java.lang.CharSequence p0) { return null; }
    public boolean contains(int p0) { return false; }
    public boolean contains(int p0, int p1) { return false; }
    public final boolean contains(java.lang.CharSequence p0) { return false; }
    public boolean containsAll(android.icu.text.UnicodeSet p0) { return false; }
    public boolean containsAll(java.lang.String p0) { return false; }
    public boolean containsNone(int p0, int p1) { return false; }
    public boolean containsNone(android.icu.text.UnicodeSet p0) { return false; }
    public boolean containsNone(java.lang.CharSequence p0) { return false; }
    public final boolean containsSome(int p0, int p1) { return false; }
    public final boolean containsSome(android.icu.text.UnicodeSet p0) { return false; }
    public final boolean containsSome(java.lang.CharSequence p0) { return false; }
    public android.icu.text.UnicodeSet addAll(android.icu.text.UnicodeSet p0) { return null; }
    public android.icu.text.UnicodeSet retainAll(android.icu.text.UnicodeSet p0) { return null; }
    public android.icu.text.UnicodeSet removeAll(android.icu.text.UnicodeSet p0) { return null; }
    public android.icu.text.UnicodeSet complementAll(android.icu.text.UnicodeSet p0) { return null; }
    public android.icu.text.UnicodeSet clear() { return null; }
    public int getRangeCount() { return 0; }
    public int getRangeStart(int p0) { return 0; }
    public int getRangeEnd(int p0) { return 0; }
    public android.icu.text.UnicodeSet compact() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public <T extends java.util.Collection<java.lang.String>> T addAllTo(T p0) { return null; }
    public android.icu.text.UnicodeSet add(java.lang.Iterable<?> p0) { return null; }
    public android.icu.text.UnicodeSet addAll(java.lang.Iterable<?> p0) { return null; }
    public android.icu.text.UnicodeSet applyIntPropertyValue(int p0, int p1) { return null; }
    public android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String p0, java.lang.String p1) { return null; }
    public android.icu.text.UnicodeSet applyPropertyAlias(java.lang.String p0, java.lang.String p1, android.icu.text.SymbolTable p2) { return null; }
    public android.icu.text.UnicodeSet closeOver(int p0) { return null; }
    public boolean isFrozen() { return false; }
    public android.icu.text.UnicodeSet freeze() { return null; }
    public int span(java.lang.CharSequence p0, android.icu.text.UnicodeSet.SpanCondition p1) { return 0; }
    public int span(java.lang.CharSequence p0, int p1, android.icu.text.UnicodeSet.SpanCondition p2) { return 0; }
    public int spanBack(java.lang.CharSequence p0, android.icu.text.UnicodeSet.SpanCondition p1) { return 0; }
    public int spanBack(java.lang.CharSequence p0, int p1, android.icu.text.UnicodeSet.SpanCondition p2) { return 0; }
    public android.icu.text.UnicodeSet cloneAsThawed() { return null; }
    public java.lang.Iterable<android.icu.text.UnicodeSet.EntryRange> ranges() { return null; }
    public java.util.Iterator<java.lang.String> iterator() { return null; }
    public <T extends java.lang.CharSequence> boolean containsAll(java.lang.Iterable<T> p0) { return false; }
    public <T extends java.lang.CharSequence> boolean containsNone(java.lang.Iterable<T> p0) { return false; }
    public final <T extends java.lang.CharSequence> boolean containsSome(java.lang.Iterable<T> p0) { return false; }
    public <T extends java.lang.CharSequence> android.icu.text.UnicodeSet addAll(T... p0) { return null; }
    public <T extends java.lang.CharSequence> android.icu.text.UnicodeSet removeAll(java.lang.Iterable<T> p0) { return null; }
    public <T extends java.lang.CharSequence> android.icu.text.UnicodeSet retainAll(java.lang.Iterable<T> p0) { return null; }
    public int compareTo(android.icu.text.UnicodeSet p0) { return 0; }
    public int compareTo(android.icu.text.UnicodeSet p0, android.icu.text.UnicodeSet.ComparisonStyle p1) { return 0; }
    public int compareTo(java.lang.Iterable<java.lang.String> p0) { return 0; }
    public java.util.Collection<java.lang.String> strings() { return null; }

    public static class EntryRange {
        public int codepoint;
        public int codepointEnd;
        EntryRange() {}
        public java.lang.String toString() { return null; }
    }

    public static enum SpanCondition {
        NOT_CONTAINED,
        CONTAINED,
        SIMPLE,
        CONDITION_COUNT;
        private SpanCondition() {}
    }

    public static enum ComparisonStyle {
        SHORTER_FIRST,
        LEXICOGRAPHIC,
        LONGER_FIRST;
        private ComparisonStyle() {}
    }
}

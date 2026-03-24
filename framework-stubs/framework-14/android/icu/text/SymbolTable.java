package android.icu.text;

public interface SymbolTable {
    public static final char SYMBOL_REF = '$';
    public char[] lookup(java.lang.String p0);
    public android.icu.text.UnicodeMatcher lookupMatcher(int p0);
    public java.lang.String parseReference(java.lang.String p0, java.text.ParsePosition p1, int p2);
}

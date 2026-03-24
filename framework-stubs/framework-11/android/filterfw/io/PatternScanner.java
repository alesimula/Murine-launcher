package android.filterfw.io;

public class PatternScanner {
    private java.lang.String mInput;
    private java.util.regex.Pattern mIgnorePattern;
    private int mOffset;
    private int mLineNo;
    private int mStartOfLine;
    public PatternScanner(java.lang.String p0) {}
    public PatternScanner(java.lang.String p0, java.util.regex.Pattern p1) {}
    public java.lang.String tryEat(java.util.regex.Pattern p0) { return null; }
    public java.lang.String eat(java.util.regex.Pattern p0, java.lang.String p1) { return null; }
    public boolean peek(java.util.regex.Pattern p0) { return false; }
    public void skip(java.util.regex.Pattern p0) {}
    public boolean atEnd() { return false; }
    public int lineNo() { return 0; }
    public java.lang.String unexpectedTokenMessage(java.lang.String p0) { return null; }
    public void updateLineCount(int p0, int p1) {}
}

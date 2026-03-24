package android.text;

public class SpannableStringBuilder implements java.lang.CharSequence, android.text.GetChars, android.text.Spannable, android.text.Editable, java.lang.Appendable, android.text.GraphicsOperations {
    public SpannableStringBuilder() {}
    public SpannableStringBuilder(java.lang.CharSequence p0) {}
    public SpannableStringBuilder(java.lang.CharSequence p0, int p1, int p2) {}
    public static android.text.SpannableStringBuilder valueOf(java.lang.CharSequence p0) { return null; }
    public char charAt(int p0) { return 0; }
    public int length() { return 0; }
    public android.text.SpannableStringBuilder insert(int p0, java.lang.CharSequence p1, int p2, int p3) { return null; }
    public android.text.SpannableStringBuilder insert(int p0, java.lang.CharSequence p1) { return null; }
    public android.text.SpannableStringBuilder delete(int p0, int p1) { return null; }
    public void clear() {}
    public void clearSpans() {}
    public android.text.SpannableStringBuilder append(java.lang.CharSequence p0) { return null; }
    public android.text.SpannableStringBuilder append(java.lang.CharSequence p0, java.lang.Object p1, int p2) { return null; }
    public android.text.SpannableStringBuilder append(java.lang.CharSequence p0, int p1, int p2) { return null; }
    public android.text.SpannableStringBuilder append(char p0) { return null; }
    public android.text.SpannableStringBuilder replace(int p0, int p1, java.lang.CharSequence p2) { return null; }
    public android.text.SpannableStringBuilder replace(int p0, int p1, java.lang.CharSequence p2, int p3, int p4) { return null; }
    public void setSpan(java.lang.Object p0, int p1, int p2, int p3) {}
    public void removeSpan(java.lang.Object p0) {}
    public void removeSpan(java.lang.Object p0, int p1) {}
    public int getSpanStart(java.lang.Object p0) { return 0; }
    public int getSpanEnd(java.lang.Object p0) { return 0; }
    public int getSpanFlags(java.lang.Object p0) { return 0; }
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
    public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2, boolean p3) { return null; }
    public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
    public void getChars(int p0, int p1, char[] p2, int p3) {}
    public java.lang.String toString() { return null; }
    public java.lang.String substring(int p0, int p1) { return null; }
    public int getTextWatcherDepth() { return 0; }
    public void drawText(android.graphics.BaseCanvas p0, int p1, int p2, float p3, float p4, android.graphics.Paint p5) {}
    public void drawTextRun(android.graphics.BaseCanvas p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7, android.graphics.Paint p8) {}
    public float measureText(int p0, int p1, android.graphics.Paint p2) { return 0.0f; }
    public int getTextWidths(int p0, int p1, float[] p2, android.graphics.Paint p3) { return 0; }
    public float getTextRunAdvances(int p0, int p1, int p2, int p3, boolean p4, float[] p5, int p6, android.graphics.Paint p7) { return 0.0f; }
    @java.lang.Deprecated
    public int getTextRunCursor(int p0, int p1, int p2, int p3, int p4, android.graphics.Paint p5) { return 0; }
    public int getTextRunCursor(int p0, int p1, boolean p2, int p3, int p4, android.graphics.Paint p5) { return 0; }
    public void setFilters(android.text.InputFilter[] p0) {}
    public android.text.InputFilter[] getFilters() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
}

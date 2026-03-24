package android.text;

@java.lang.Deprecated
public class AlteredCharSequence implements java.lang.CharSequence, android.text.GetChars {
    public static android.text.AlteredCharSequence make(java.lang.CharSequence p0, char[] p1, int p2, int p3) { return null; }
    void update(char[] p0, int p1, int p2) {}
    public char charAt(int p0) { return 0; }
    public int length() { return 0; }
    public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
    public void getChars(int p0, int p1, char[] p2, int p3) {}
    public java.lang.String toString() { return null; }

    private static class AlteredSpanned extends android.text.AlteredCharSequence implements android.text.Spanned {
        public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
        public int getSpanStart(java.lang.Object p0) { return 0; }
        public int getSpanEnd(java.lang.Object p0) { return 0; }
        public int getSpanFlags(java.lang.Object p0) { return 0; }
        public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    }
}

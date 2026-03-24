package android.text.method;

public abstract class ReplacementTransformationMethod implements android.text.method.TransformationMethod {
    public ReplacementTransformationMethod() {}
    protected abstract char[] getOriginal();
    protected abstract char[] getReplacement();
    public java.lang.CharSequence getTransformation(java.lang.CharSequence p0, android.view.View p1) { return null; }
    public void onFocusChanged(android.view.View p0, java.lang.CharSequence p1, boolean p2, int p3, android.graphics.Rect p4) {}

    private static class ReplacementCharSequence implements java.lang.CharSequence, android.text.GetChars {
        private char[] mOriginal;
        private char[] mReplacement;
        private java.lang.CharSequence mSource;
        public ReplacementCharSequence(java.lang.CharSequence p0, char[] p1, char[] p2) {}
        public int length() { return 0; }
        public char charAt(int p0) { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
        public void getChars(int p0, int p1, char[] p2, int p3) {}
    }

    private static class SpannedReplacementCharSequence extends android.text.method.ReplacementTransformationMethod.ReplacementCharSequence implements android.text.Spanned {
        private android.text.Spanned mSpanned;
        public SpannedReplacementCharSequence(android.text.Spanned p0, char[] p1, char[] p2) { super(null, null, null); }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
        public int getSpanStart(java.lang.Object p0) { return 0; }
        public int getSpanEnd(java.lang.Object p0) { return 0; }
        public int getSpanFlags(java.lang.Object p0) { return 0; }
        public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
    }
}

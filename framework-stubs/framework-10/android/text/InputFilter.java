package android.text;

public interface InputFilter {
    public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5);

    public static class LengthFilter implements android.text.InputFilter {
        @android.annotation.UnsupportedAppUsage
        private final int mMax = 0;
        public LengthFilter(int p0) {}
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }
        public int getMax() { return 0; }
    }

    public static class AllCaps implements android.text.InputFilter {
        private final java.util.Locale mLocale = null;
        public AllCaps() {}
        public AllCaps(java.util.Locale p0) {}
        public java.lang.CharSequence filter(java.lang.CharSequence p0, int p1, int p2, android.text.Spanned p3, int p4, int p5) { return null; }

        private static class CharSequenceWrapper implements java.lang.CharSequence, android.text.Spanned {
            private final java.lang.CharSequence mSource = null;
            private final int mStart = 0;
            private final int mEnd = 0;
            private final int mLength = 0;
            CharSequenceWrapper(java.lang.CharSequence p0, int p1, int p2) {}
            public int length() { return 0; }
            public char charAt(int p0) { return 0; }
            public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
            public java.lang.String toString() { return null; }
            public <T extends java.lang.Object> T[] getSpans(int p0, int p1, java.lang.Class<T> p2) { return null; }
            public int getSpanStart(java.lang.Object p0) { return 0; }
            public int getSpanEnd(java.lang.Object p0) { return 0; }
            public int getSpanFlags(java.lang.Object p0) { return 0; }
            public int nextSpanTransition(int p0, int p1, java.lang.Class p2) { return 0; }
        }
    }
}

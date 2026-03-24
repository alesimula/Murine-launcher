package android.graphics.text;

public class MeasuredText {
    private long mNativePtr;
    private boolean mComputeHyphenation;
    private boolean mComputeLayout;
    private char[] mChars;
    private MeasuredText(long p0, char[] p1, boolean p2, boolean p3) {}
    public char[] getChars() { return null; }
    public float getWidth(int p0, int p1) { return 0.0f; }
    public int getMemoryUsage() { return 0; }
    public void getBounds(int p0, int p1, android.graphics.Rect p2) {}
    public float getCharWidthAt(int p0) { return 0.0f; }
    public long getNativePtr() { return 0L; }
    private static native float nGetWidth(long p0, int p1, int p2);
    private static native long nGetReleaseFunc();
    private static native int nGetMemoryUsage(long p0);
    private static native void nGetBounds(long p0, char[] p1, int p2, int p3, android.graphics.Rect p4);
    private static native float nGetCharWidthAt(long p0, int p1);

    public static final class Builder {
        private long mNativePtr;
        private final char[] mText = null;
        private boolean mComputeHyphenation;
        private boolean mComputeLayout;
        private int mCurrentOffset;
        private android.graphics.text.MeasuredText mHintMt;
        public Builder(char[] p0) {}
        public Builder(android.graphics.text.MeasuredText p0) {}
        public android.graphics.text.MeasuredText.Builder appendStyleRun(android.graphics.Paint p0, int p1, boolean p2) { return null; }
        public android.graphics.text.MeasuredText.Builder appendReplacementRun(android.graphics.Paint p0, int p1, float p2) { return null; }
        public android.graphics.text.MeasuredText.Builder setComputeHyphenation(boolean p0) { return null; }
        public android.graphics.text.MeasuredText.Builder setComputeLayout(boolean p0) { return null; }
        public android.graphics.text.MeasuredText build() { return null; }
        private void ensureNativePtrNoReuse() {}
        private static native long nInitBuilder();
        private static native void nAddStyleRun(long p0, long p1, int p2, int p3, boolean p4);
        private static native void nAddReplacementRun(long p0, long p1, int p2, int p3, float p4);
        private static native long nBuildMeasuredText(long p0, long p1, char[] p2, boolean p3, boolean p4);
        private static native void nFreeBuilder(long p0);
    }
}

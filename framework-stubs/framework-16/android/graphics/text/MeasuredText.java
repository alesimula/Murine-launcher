package android.graphics.text;

public class MeasuredText {
    @android.annotation.NonNull
    public char[] getChars() { return null; }
    public float getWidth(int p0, int p1) { return 0.0f; }
    public int getMemoryUsage() { return 0; }
    public void getBounds(int p0, int p1, android.graphics.Rect p2) {}
    public void getFontMetricsInt(int p0, int p1, android.graphics.Paint.FontMetricsInt p2) {}
    public float getCharWidthAt(int p0) { return 0.0f; }
    public long getNativePtr() { return 0L; }

    public static final class Builder {
        public static final int HYPHENATION_MODE_NONE = 0;
        public static final int HYPHENATION_MODE_NORMAL = 1;
        public static final int HYPHENATION_MODE_FAST = 2;
        public Builder(char[] p0) {}
        public Builder(android.graphics.text.MeasuredText p0) {}
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText.Builder appendStyleRun(android.graphics.Paint p0, int p1, boolean p2) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText.Builder appendStyleRun(android.graphics.Paint p0, android.graphics.text.LineBreakConfig p1, int p2, boolean p3) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText.Builder appendReplacementRun(android.graphics.Paint p0, int p1, float p2) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText.Builder setComputeHyphenation(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText.Builder setComputeHyphenation(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText.Builder setComputeLayout(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText.Builder setComputeBounds(boolean p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.MeasuredText build() { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface HyphenationMode {
        }
    }
}

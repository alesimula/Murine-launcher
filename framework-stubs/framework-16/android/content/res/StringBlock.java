package android.content.res;

public final class StringBlock implements java.io.Closeable {
    android.content.res.StringBlock.StyleIDs mStyleIDs;
    public StringBlock(byte[] p0, boolean p1) {}
    public StringBlock(byte[] p0, int p1, int p2, boolean p3) {}
    @java.lang.Deprecated
    public java.lang.CharSequence get(int p0) { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getSequence(int p0) { return null; }
    protected void finalize() throws java.lang.Throwable {}
    public void close() {}
    public StringBlock(long p0, boolean p1) {}

    private static class Height implements android.text.style.LineHeightSpan.WithDensity {
        public Height(int p0) {}
        public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5) {}
        public void chooseHeight(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, android.graphics.Paint.FontMetricsInt p5, android.text.TextPaint p6) {}
    }

    static final class StyleIDs {
        StyleIDs() {}
    }
}

package android.text;

public final class BidiFormatter {
    public static android.text.BidiFormatter getInstance() { return null; }
    public static android.text.BidiFormatter getInstance(boolean p0) { return null; }
    public static android.text.BidiFormatter getInstance(java.util.Locale p0) { return null; }
    public boolean isRtlContext() { return false; }
    public boolean getStereoReset() { return false; }
    public java.lang.String markAfter(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1) { return null; }
    public java.lang.String markBefore(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1) { return null; }
    public boolean isRtl(java.lang.String p0) { return false; }
    public boolean isRtl(java.lang.CharSequence p0) { return false; }
    @android.annotation.Nullable
    public java.lang.String unicodeWrap(java.lang.String p0, android.text.TextDirectionHeuristic p1, boolean p2) { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1, boolean p2) { return null; }
    public java.lang.String unicodeWrap(java.lang.String p0, android.text.TextDirectionHeuristic p1) { return null; }
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0, android.text.TextDirectionHeuristic p1) { return null; }
    public java.lang.String unicodeWrap(java.lang.String p0, boolean p1) { return null; }
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0, boolean p1) { return null; }
    public java.lang.String unicodeWrap(java.lang.String p0) { return null; }
    public java.lang.CharSequence unicodeWrap(java.lang.CharSequence p0) { return null; }

    public static final class Builder {
        public Builder() {}
        public Builder(boolean p0) {}
        public Builder(java.util.Locale p0) {}
        public android.text.BidiFormatter.Builder stereoReset(boolean p0) { return null; }
        public android.text.BidiFormatter.Builder setTextDirectionHeuristic(android.text.TextDirectionHeuristic p0) { return null; }
        public android.text.BidiFormatter build() { return null; }
    }

    public static class DirectionalityEstimator {
        public static byte getDirectionality(int p0) { return 0; }
        DirectionalityEstimator(java.lang.CharSequence p0, boolean p1) {}
        int getEntryDir() { return 0; }
        int getExitDir() { return 0; }
        byte dirTypeForward() { return 0; }
        byte dirTypeBackward() { return 0; }
    }
}

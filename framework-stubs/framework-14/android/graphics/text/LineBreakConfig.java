package android.graphics.text;

public final class LineBreakConfig {
    public static final int LINE_BREAK_STYLE_NONE = 0;
    public static final int LINE_BREAK_STYLE_LOOSE = 1;
    public static final int LINE_BREAK_STYLE_NORMAL = 2;
    public static final int LINE_BREAK_STYLE_STRICT = 3;
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;
    public static final android.graphics.text.LineBreakConfig NONE = null;
    public static android.graphics.text.LineBreakConfig getLineBreakConfig(int p0, int p1) { return null; }
    public static android.graphics.text.LineBreakConfig getLineBreakConfig(int p0, int p1, boolean p2) { return null; }
    public int getLineBreakStyle() { return 0; }
    public int getLineBreakWordStyle() { return 0; }
    public boolean getAutoPhraseBreaking() { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public android.graphics.text.LineBreakConfig.Builder setLineBreakStyle(int p0) { return null; }
        public android.graphics.text.LineBreakConfig.Builder setLineBreakWordStyle(int p0) { return null; }
        public android.graphics.text.LineBreakConfig.Builder setAutoPhraseBreaking(boolean p0) { return null; }
        public android.graphics.text.LineBreakConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LineBreakStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LineBreakWordStyle {
    }
}

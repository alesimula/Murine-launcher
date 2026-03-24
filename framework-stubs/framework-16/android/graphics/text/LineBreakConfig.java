package android.graphics.text;

public final class LineBreakConfig implements android.os.Parcelable {
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static final int HYPHENATION_UNSPECIFIED = -1;
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static final int HYPHENATION_DISABLED = 0;
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static final int HYPHENATION_ENABLED = 1;
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static final int LINE_BREAK_STYLE_UNSPECIFIED = -1;
    public static final int LINE_BREAK_STYLE_NONE = 0;
    public static final int LINE_BREAK_STYLE_LOOSE = 1;
    public static final int LINE_BREAK_STYLE_NORMAL = 2;
    public static final int LINE_BREAK_STYLE_STRICT = 3;
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static final int LINE_BREAK_STYLE_NO_BREAK = 4;
    @android.annotation.FlaggedApi("com.android.text.flags.word_style_auto")
    public static final int LINE_BREAK_STYLE_AUTO = 5;
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public static final int LINE_BREAK_WORD_STYLE_UNSPECIFIED = -1;
    public static final int LINE_BREAK_WORD_STYLE_NONE = 0;
    public static final int LINE_BREAK_WORD_STYLE_PHRASE = 1;
    @android.annotation.FlaggedApi("com.android.text.flags.word_style_auto")
    public static final int LINE_BREAK_WORD_STYLE_AUTO = 2;
    public static final android.graphics.text.LineBreakConfig NONE = null;
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.text.LineBreakConfig> CREATOR = null;
    @android.annotation.NonNull
    public static android.graphics.text.LineBreakConfig getLineBreakConfig(int p0, int p1) { return null; }
    public LineBreakConfig(int p0, int p1, int p2) {}
    public int getLineBreakStyle() { return 0; }
    public static int getResolvedLineBreakStyle(android.graphics.text.LineBreakConfig p0) { return 0; }
    public int getLineBreakWordStyle() { return 0; }
    public static int getResolvedLineBreakWordStyle(android.graphics.text.LineBreakConfig p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public int getHyphenation() { return 0; }
    public static int getResolvedHyphenation(android.graphics.text.LineBreakConfig p0) { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    @android.annotation.NonNull
    public android.graphics.text.LineBreakConfig merge(android.graphics.text.LineBreakConfig p0) { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public int describeContents() { return 0; }
    @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
    public void writeToParcel(android.os.Parcel p0, int p1) {}

    public static final class Builder {
        public Builder() {}
        @android.annotation.SuppressLint("BuilderSetStyle")
        @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
        @android.annotation.NonNull
        public android.graphics.text.LineBreakConfig.Builder merge(android.graphics.text.LineBreakConfig p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreakConfig.Builder reset(android.graphics.text.LineBreakConfig p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreakConfig.Builder setLineBreakStyle(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreakConfig.Builder setLineBreakWordStyle(int p0) { return null; }
        @android.annotation.FlaggedApi("com.android.text.flags.no_break_no_hyphenation_span")
        @android.annotation.NonNull
        public android.graphics.text.LineBreakConfig.Builder setHyphenation(int p0) { return null; }
        @android.annotation.NonNull
        public android.graphics.text.LineBreakConfig build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Hyphenation {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LineBreakStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface LineBreakWordStyle {
    }
}

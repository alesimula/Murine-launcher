package android.text;

public class TextUtils {
    static final char ELLIPSIS_FILLER = (char)0xfeff;
    public static final int LINE_FEED_CODE_POINT = 10;
    public static final int SAFE_STRING_FLAG_TRIM = 1;
    public static final int SAFE_STRING_FLAG_SINGLE_LINE = 2;
    public static final int SAFE_STRING_FLAG_FIRST_LINE = 4;
    public static final int ALIGNMENT_SPAN = 1;
    public static final int FIRST_SPAN = 1;
    public static final int FOREGROUND_COLOR_SPAN = 2;
    public static final int RELATIVE_SIZE_SPAN = 3;
    public static final int SCALE_X_SPAN = 4;
    public static final int STRIKETHROUGH_SPAN = 5;
    public static final int UNDERLINE_SPAN = 6;
    public static final int STYLE_SPAN = 7;
    public static final int BULLET_SPAN = 8;
    public static final int QUOTE_SPAN = 9;
    public static final int LEADING_MARGIN_SPAN = 10;
    public static final int URL_SPAN = 11;
    public static final int BACKGROUND_COLOR_SPAN = 12;
    public static final int TYPEFACE_SPAN = 13;
    public static final int SUPERSCRIPT_SPAN = 14;
    public static final int SUBSCRIPT_SPAN = 15;
    public static final int ABSOLUTE_SIZE_SPAN = 16;
    public static final int TEXT_APPEARANCE_SPAN = 17;
    public static final int ANNOTATION = 18;
    public static final int SUGGESTION_SPAN = 19;
    public static final int SPELL_CHECK_SPAN = 20;
    public static final int SUGGESTION_RANGE_SPAN = 21;
    public static final int EASY_EDIT_SPAN = 22;
    public static final int LOCALE_SPAN = 23;
    public static final int TTS_SPAN = 24;
    public static final int ACCESSIBILITY_CLICKABLE_SPAN = 25;
    public static final int ACCESSIBILITY_URL_SPAN = 26;
    public static final int LINE_BACKGROUND_SPAN = 27;
    public static final int LINE_HEIGHT_SPAN = 28;
    public static final int ACCESSIBILITY_REPLACEMENT_SPAN = 29;
    public static final int LINE_BREAK_CONFIG_SPAN = 30;
    public static final int LAST_SPAN = 30;
    public static final android.os.Parcelable.Creator<java.lang.CharSequence> CHAR_SEQUENCE_CREATOR = null;
    public static final int CAP_MODE_CHARACTERS = 4096;
    public static final int CAP_MODE_WORDS = 8192;
    public static final int CAP_MODE_SENTENCES = 16384;
    @android.annotation.NonNull
    public static java.lang.String getEllipsisString(android.text.TextUtils.TruncateAt p0) { return null; }
    public static void getChars(java.lang.CharSequence p0, int p1, int p2, char[] p3, int p4) {}
    public static int indexOf(java.lang.CharSequence p0, char p1) { return 0; }
    public static int indexOf(java.lang.CharSequence p0, char p1, int p2) { return 0; }
    public static int indexOf(java.lang.CharSequence p0, char p1, int p2, int p3) { return 0; }
    public static int lastIndexOf(java.lang.CharSequence p0, char p1) { return 0; }
    public static int lastIndexOf(java.lang.CharSequence p0, char p1, int p2) { return 0; }
    public static int lastIndexOf(java.lang.CharSequence p0, char p1, int p2, int p3) { return 0; }
    public static int indexOf(java.lang.CharSequence p0, java.lang.CharSequence p1) { return 0; }
    public static int indexOf(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2) { return 0; }
    public static int indexOf(java.lang.CharSequence p0, java.lang.CharSequence p1, int p2, int p3) { return 0; }
    public static boolean regionMatches(java.lang.CharSequence p0, int p1, java.lang.CharSequence p2, int p3, int p4) { return false; }
    public static java.lang.String substring(java.lang.CharSequence p0, int p1, int p2) { return null; }
    public static java.lang.String truncateStringForUtf8Storage(java.lang.String p0, int p1) { return null; }
    public static java.lang.String join(java.lang.CharSequence p0, java.lang.Object[] p1) { return null; }
    public static java.lang.String join(java.lang.CharSequence p0, java.lang.Iterable p1) { return null; }
    public static java.lang.String[] split(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String[] split(java.lang.String p0, java.util.regex.Pattern p1) { return null; }
    public static java.lang.CharSequence stringOrSpannedString(java.lang.CharSequence p0) { return null; }
    public static boolean isEmpty(java.lang.CharSequence p0) { return false; }
    public static java.lang.String nullIfEmpty(java.lang.String p0) { return null; }
    public static java.lang.String emptyIfNull(java.lang.String p0) { return null; }
    public static java.lang.String firstNotEmpty(java.lang.String p0, java.lang.String p1) { return null; }
    public static int length(java.lang.String p0) { return 0; }
    public static java.lang.String safeIntern(java.lang.String p0) { return null; }
    public static int getTrimmedLength(java.lang.CharSequence p0) { return 0; }
    public static boolean equals(java.lang.CharSequence p0, java.lang.CharSequence p1) { return false; }
    @java.lang.Deprecated
    public static java.lang.CharSequence getReverse(java.lang.CharSequence p0, int p1, int p2) { return null; }
    public static void writeToParcel(java.lang.CharSequence p0, android.os.Parcel p1, int p2) {}
    public static void dumpSpans(java.lang.CharSequence p0, android.util.Printer p1, java.lang.String p2) {}
    public static java.lang.CharSequence replace(java.lang.CharSequence p0, java.lang.String[] p1, java.lang.CharSequence[] p2) { return null; }
    public static java.lang.CharSequence expandTemplate(java.lang.CharSequence p0, java.lang.CharSequence... p1) { return null; }
    public static int getOffsetBefore(java.lang.CharSequence p0, int p1) { return 0; }
    public static int getOffsetAfter(java.lang.CharSequence p0, int p1) { return 0; }
    public static void copySpansFrom(android.text.Spanned p0, int p1, int p2, java.lang.Class p3, android.text.Spannable p4, int p5) {}
    @android.annotation.NonNull
    public static java.lang.CharSequence toUpperCase(java.util.Locale p0, java.lang.CharSequence p1, boolean p2) { return null; }
    public static java.lang.CharSequence ellipsize(java.lang.CharSequence p0, android.text.TextPaint p1, float p2, android.text.TextUtils.TruncateAt p3) { return null; }
    public static java.lang.CharSequence ellipsize(java.lang.CharSequence p0, android.text.TextPaint p1, float p2, android.text.TextUtils.TruncateAt p3, boolean p4, android.text.TextUtils.EllipsizeCallback p5) { return null; }
    public static java.lang.CharSequence ellipsize(java.lang.CharSequence p0, android.text.TextPaint p1, float p2, android.text.TextUtils.TruncateAt p3, boolean p4, android.text.TextUtils.EllipsizeCallback p5, android.text.TextDirectionHeuristic p6, java.lang.String p7) { return null; }
    public static java.lang.CharSequence listEllipsize(android.content.Context p0, java.util.List<java.lang.CharSequence> p1, java.lang.String p2, android.text.TextPaint p3, float p4, int p5) { return null; }
    @java.lang.Deprecated
    public static java.lang.CharSequence commaEllipsize(java.lang.CharSequence p0, android.text.TextPaint p1, float p2, java.lang.String p3, java.lang.String p4) { return null; }
    @java.lang.Deprecated
    public static java.lang.CharSequence commaEllipsize(java.lang.CharSequence p0, android.text.TextPaint p1, float p2, java.lang.String p3, java.lang.String p4, android.text.TextDirectionHeuristic p5) { return null; }
    static boolean couldAffectRtl(char p0) { return false; }
    static boolean doesNotNeedBidi(char[] p0, int p1, int p2) { return false; }
    static char[] obtain(int p0) { return null; }
    static char[] obtain$ravenwood(int p0) { return null; }
    static void recycle(char[] p0) {}
    static void recycle$ravenwood(char[] p0) {}
    public static java.lang.String htmlEncode(java.lang.String p0) { return null; }
    public static java.lang.CharSequence concat(java.lang.CharSequence... p0) { return null; }
    public static boolean isGraphic(java.lang.CharSequence p0) { return false; }
    @java.lang.Deprecated
    public static boolean isGraphic(char p0) { return false; }
    public static boolean isDigitsOnly(java.lang.CharSequence p0) { return false; }
    public static boolean isPrintableAscii(char p0) { return false; }
    public static boolean isPrintableAsciiOnly(java.lang.CharSequence p0) { return false; }
    public static int getCapsMode(java.lang.CharSequence p0, int p1, int p2) { return 0; }
    public static boolean delimitedStringContains(java.lang.String p0, char p1, java.lang.String p2) { return false; }
    public static <T extends java.lang.Object> T[] removeEmptySpans(T[] p0, android.text.Spanned p1, java.lang.Class<T> p2) { return null; }
    public static long packRangeInLong(int p0, int p1) { return 0L; }
    public static int unpackRangeStartFromLong(long p0) { return 0; }
    public static int unpackRangeEndFromLong(long p0) { return 0; }
    public static int getLayoutDirectionFromLocale(java.util.Locale p0) { return 0; }
    @android.annotation.NonNull
    public static java.lang.String formatSimple(java.lang.String p0, java.lang.Object... p1) { return null; }
    public static boolean hasStyleSpan(android.text.Spanned p0) { return false; }
    @android.annotation.Nullable
    public static java.lang.CharSequence trimNoCopySpans(java.lang.CharSequence p0) { return null; }
    public static void wrap(java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2) {}
    @android.annotation.Nullable
    public static <T extends java.lang.CharSequence> T trimToParcelableSize(T p0) { return null; }
    @android.annotation.Nullable
    public static <T extends java.lang.CharSequence> T trimToSize(T p0, int p1) { return null; }
    @android.annotation.Nullable
    public static <T extends java.lang.CharSequence> T trimToLengthWithEllipsis(T p0, int p1) { return null; }
    public static boolean isNewline(int p0) { return false; }
    public static boolean isWhitespace(int p0) { return false; }
    public static boolean isWhitespaceExceptNewline(int p0) { return false; }
    public static boolean isPunctuation(int p0) { return false; }
    @android.annotation.Nullable
    public static java.lang.String withoutPrefix(java.lang.String p0, java.lang.String p1) { return null; }
    @android.annotation.NonNull
    public static java.lang.CharSequence makeSafeForPresentation(java.lang.String p0, int p1, float p2, int p3) { return null; }

    public static interface EllipsizeCallback {
        public void ellipsized(int p0, int p1);
    }

    private static class Reverser implements java.lang.CharSequence, android.text.GetChars {
        public Reverser(java.lang.CharSequence p0, int p1, int p2) {}
        public int length() { return 0; }
        public java.lang.CharSequence subSequence(int p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
        public char charAt(int p0) { return 0; }
        public void getChars(int p0, int p1, char[] p2, int p3) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface SafeStringFlags {
    }

    public static class SimpleStringSplitter implements android.text.TextUtils.StringSplitter, java.util.Iterator<java.lang.String> {
        public SimpleStringSplitter(char p0) {}
        public void setString(java.lang.String p0) {}
        public java.util.Iterator<java.lang.String> iterator() { return null; }
        public boolean hasNext() { return false; }
        public java.lang.String next() { return null; }
        public void remove() {}
    }

    public static interface StringSplitter extends java.lang.Iterable<java.lang.String> {
        public void setString(java.lang.String p0);
    }

    private static class StringWithRemovedChars {
        StringWithRemovedChars(java.lang.String p0) {}
        void removeRange(int p0, int p1) {}
        void removeAllCharBefore(int p0) {}
        void removeAllCharAfter(int p0) {}
        public java.lang.String toString() { return null; }
        int length() { return 0; }
        int codePointAt(int p0) { return 0; }
    }

    public static enum TruncateAt {
        START,
        MIDDLE,
        END,
        MARQUEE,
        END_SMALL;
    }
}

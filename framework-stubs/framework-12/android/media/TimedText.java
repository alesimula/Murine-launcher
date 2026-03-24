package android.media;

public final class TimedText {
    private static final int FIRST_PUBLIC_KEY = 1;
    private static final int KEY_DISPLAY_FLAGS = 1;
    private static final int KEY_STYLE_FLAGS = 2;
    private static final int KEY_BACKGROUND_COLOR_RGBA = 3;
    private static final int KEY_HIGHLIGHT_COLOR_RGBA = 4;
    private static final int KEY_SCROLL_DELAY = 5;
    private static final int KEY_WRAP_TEXT = 6;
    private static final int KEY_START_TIME = 7;
    private static final int KEY_STRUCT_BLINKING_TEXT_LIST = 8;
    private static final int KEY_STRUCT_FONT_LIST = 9;
    private static final int KEY_STRUCT_HIGHLIGHT_LIST = 10;
    private static final int KEY_STRUCT_HYPER_TEXT_LIST = 11;
    private static final int KEY_STRUCT_KARAOKE_LIST = 12;
    private static final int KEY_STRUCT_STYLE_LIST = 13;
    private static final int KEY_STRUCT_TEXT_POS = 14;
    private static final int KEY_STRUCT_JUSTIFICATION = 15;
    private static final int KEY_STRUCT_TEXT = 16;
    private static final int LAST_PUBLIC_KEY = 16;
    private static final int FIRST_PRIVATE_KEY = 101;
    private static final int KEY_GLOBAL_SETTING = 101;
    private static final int KEY_LOCAL_SETTING = 102;
    private static final int KEY_START_CHAR = 103;
    private static final int KEY_END_CHAR = 104;
    private static final int KEY_FONT_ID = 105;
    private static final int KEY_FONT_SIZE = 106;
    private static final int KEY_TEXT_COLOR_RGBA = 107;
    private static final int LAST_PRIVATE_KEY = 107;
    private static final java.lang.String TAG = "TimedText";
    private final java.util.HashMap<java.lang.Integer, java.lang.Object> mKeyObjectMap = null;
    private int mDisplayFlags;
    private int mBackgroundColorRGBA;
    private int mHighlightColorRGBA;
    private int mScrollDelay;
    private int mWrapText;
    private java.util.List<android.media.TimedText.CharPos> mBlinkingPosList;
    private java.util.List<android.media.TimedText.CharPos> mHighlightPosList;
    private java.util.List<android.media.TimedText.Karaoke> mKaraokeList;
    private java.util.List<android.media.TimedText.Font> mFontList;
    private java.util.List<android.media.TimedText.Style> mStyleList;
    private java.util.List<android.media.TimedText.HyperText> mHyperTextList;
    private android.graphics.Rect mTextBounds;
    private java.lang.String mTextChars;
    private android.media.TimedText.Justification mJustification;
    public TimedText(android.os.Parcel p0) {}
    public TimedText(java.lang.String p0, android.graphics.Rect p1) {}
    public java.lang.String getText() { return null; }
    public android.graphics.Rect getBounds() { return null; }
    private boolean parseParcel(android.os.Parcel p0) { return false; }
    private void readStyle(android.os.Parcel p0) {}
    private void readFont(android.os.Parcel p0) {}
    private void readHighlight(android.os.Parcel p0) {}
    private void readKaraoke(android.os.Parcel p0) {}
    private void readHyperText(android.os.Parcel p0) {}
    private void readBlinkingText(android.os.Parcel p0) {}
    private boolean isValidKey(int p0) { return false; }
    private boolean containsKey(int p0) { return false; }
    private java.util.Set keySet() { return null; }
    private java.lang.Object getObject(int p0) { return null; }

    public static final class CharPos {
        public final int startChar = 0;
        public final int endChar = 0;
        public CharPos(int p0, int p1) {}
    }

    public static final class Font {
        public final int ID = 0;
        public final java.lang.String name = null;
        public Font(int p0, java.lang.String p1) {}
    }

    public static final class HyperText {
        public final int startChar = 0;
        public final int endChar = 0;
        public final java.lang.String URL = null;
        public final java.lang.String altString = null;
        public HyperText(int p0, int p1, java.lang.String p2, java.lang.String p3) {}
    }

    public static final class Justification {
        public final int horizontalJustification = 0;
        public final int verticalJustification = 0;
        public Justification(int p0, int p1) {}
    }

    public static final class Karaoke {
        public final int startTimeMs = 0;
        public final int endTimeMs = 0;
        public final int startChar = 0;
        public final int endChar = 0;
        public Karaoke(int p0, int p1, int p2, int p3) {}
    }

    public static final class Style {
        public final int startChar = 0;
        public final int endChar = 0;
        public final int fontID = 0;
        public final boolean isBold = false;
        public final boolean isItalic = false;
        public final boolean isUnderlined = false;
        public final int fontSize = 0;
        public final int colorRGBA = 0;
        public Style(int p0, int p1, int p2, boolean p3, boolean p4, boolean p5, int p6, int p7) {}
    }
}

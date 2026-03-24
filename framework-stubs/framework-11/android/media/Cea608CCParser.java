package android.media;

class Cea608CCParser {
    public static final int MAX_ROWS = 15;
    public static final int MAX_COLS = 32;
    private static final java.lang.String TAG = "Cea608CCParser";
    private static final boolean DEBUG = Boolean.valueOf(false);
    private static final int INVALID = -1;
    private static final int RCL = 32;
    private static final int BS = 33;
    private static final int AOF = 34;
    private static final int AON = 35;
    private static final int DER = 36;
    private static final int RU2 = 37;
    private static final int RU3 = 38;
    private static final int RU4 = 39;
    private static final int FON = 40;
    private static final int RDC = 41;
    private static final int TR = 42;
    private static final int RTD = 43;
    private static final int EDM = 44;
    private static final int CR = 45;
    private static final int ENM = 46;
    private static final int EOC = 47;
    private static final char TS = (char)0x00a0;
    private static final int MODE_UNKNOWN = 0;
    private static final int MODE_PAINT_ON = 1;
    private static final int MODE_ROLL_UP = 2;
    private static final int MODE_POP_ON = 3;
    private static final int MODE_TEXT = 4;
    private final android.media.Cea608CCParser.DisplayListener mListener = null;
    private int mMode;
    private int mRollUpSize;
    private int mPrevCtrlCode;
    private android.media.Cea608CCParser.CCMemory mDisplay;
    private android.media.Cea608CCParser.CCMemory mNonDisplay;
    private android.media.Cea608CCParser.CCMemory mTextMem;
    Cea608CCParser(android.media.Cea608CCParser.DisplayListener p0) {}
    public void parse(byte[] p0) {}
    private android.media.Cea608CCParser.CCMemory getMemory() { return null; }
    private boolean handleDisplayableChars(android.media.Cea608CCParser.CCData p0) { return false; }
    private boolean handleMidRowCode(android.media.Cea608CCParser.CCData p0) { return false; }
    private boolean handlePACCode(android.media.Cea608CCParser.CCData p0) { return false; }
    private boolean handleTabOffsets(android.media.Cea608CCParser.CCData p0) { return false; }
    private boolean handleCtrlCode(android.media.Cea608CCParser.CCData p0) { return false; }
    private void updateDisplay() {}
    private void swapMemory() {}

    private static class CCData {
        private final byte mType = 0;
        private final byte mData1 = 0;
        private final byte mData2 = 0;
        private static final java.lang.String[] mCtrlCodeMap = null;
        private static final java.lang.String[] mSpecialCharMap = null;
        private static final java.lang.String[] mSpanishCharMap = null;
        private static final java.lang.String[] mProtugueseCharMap = null;
        static android.media.Cea608CCParser.CCData[] fromByteArray(byte[] p0) { return null; }
        CCData(byte p0, byte p1, byte p2) {}
        int getCtrlCode() { return 0; }
        android.media.Cea608CCParser.StyleCode getMidRow() { return null; }
        android.media.Cea608CCParser.PAC getPAC() { return null; }
        int getTabOffset() { return 0; }
        boolean isDisplayableChar() { return false; }
        java.lang.String getDisplayText() { return null; }
        private java.lang.String ctrlCodeToString(int p0) { return null; }
        private boolean isBasicChar() { return false; }
        private boolean isSpecialChar() { return false; }
        private boolean isExtendedChar() { return false; }
        private char getBasicChar(byte p0) { return 0; }
        private java.lang.String getBasicChars() { return null; }
        private java.lang.String getSpecialChar() { return null; }
        private java.lang.String getExtendedChar() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class CCLineBuilder {
        private final java.lang.StringBuilder mDisplayChars = null;
        private final android.media.Cea608CCParser.StyleCode[] mMidRowStyles = null;
        private final android.media.Cea608CCParser.StyleCode[] mPACStyles = null;
        CCLineBuilder(java.lang.String p0) {}
        void setCharAt(int p0, char p1) {}
        void setMidRowAt(int p0, android.media.Cea608CCParser.StyleCode p1) {}
        void setPACAt(int p0, android.media.Cea608CCParser.PAC p1) {}
        char charAt(int p0) { return 0; }
        int length() { return 0; }
        void applyStyleSpan(android.text.SpannableStringBuilder p0, android.media.Cea608CCParser.StyleCode p1, int p2, int p3) {}
        android.text.SpannableStringBuilder getStyledText(android.view.accessibility.CaptioningManager.CaptionStyle p0) { return null; }
    }

    private static class CCMemory {
        private final java.lang.String mBlankLine = null;
        private final android.media.Cea608CCParser.CCLineBuilder[] mLines = null;
        private int mRow;
        private int mCol;
        CCMemory() {}
        void erase() {}
        void der() {}
        void tab(int p0) {}
        void bs() {}
        void cr() {}
        void rollUp(int p0) {}
        void writeText(java.lang.String p0) {}
        void writeMidRowCode(android.media.Cea608CCParser.StyleCode p0) {}
        void writePAC(android.media.Cea608CCParser.PAC p0) {}
        android.text.SpannableStringBuilder[] getStyledText(android.view.accessibility.CaptioningManager.CaptionStyle p0) { return null; }
        private static int clamp(int p0, int p1, int p2) { return 0; }
        private void moveCursorTo(int p0, int p1) {}
        private void moveCursorToRow(int p0) {}
        private void moveCursorByCol(int p0) {}
        private void moveBaselineTo(int p0, int p1) {}
        private android.media.Cea608CCParser.CCLineBuilder getLineBuffer(int p0) { return null; }
    }

    static interface DisplayListener {
        public void onDisplayChanged(android.text.SpannableStringBuilder[] p0);
        public android.view.accessibility.CaptioningManager.CaptionStyle getCaptionStyle();
    }

    public static class MutableBackgroundColorSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
        private int mColor;
        public MutableBackgroundColorSpan(int p0) { super(); }
        public void setBackgroundColor(int p0) {}
        public int getBackgroundColor() { return 0; }
        public void updateDrawState(android.text.TextPaint p0) {}
    }

    private static class PAC extends android.media.Cea608CCParser.StyleCode {
        final int mRow = 0;
        final int mCol = 0;
        static android.media.Cea608CCParser.PAC fromBytes(byte p0, byte p1) { return null; }
        PAC(int p0, int p1, int p2, int p3) { super(0, 0); }
        boolean isIndentPAC() { return false; }
        int getRow() { return 0; }
        int getCol() { return 0; }
        public java.lang.String toString() { return null; }
    }

    private static class StyleCode {
        static final int COLOR_WHITE = 0;
        static final int COLOR_GREEN = 1;
        static final int COLOR_BLUE = 2;
        static final int COLOR_CYAN = 3;
        static final int COLOR_RED = 4;
        static final int COLOR_YELLOW = 5;
        static final int COLOR_MAGENTA = 6;
        static final int COLOR_INVALID = 7;
        static final int STYLE_ITALICS = 1;
        static final int STYLE_UNDERLINE = 2;
        static final java.lang.String[] mColorMap = null;
        final int mStyle = 0;
        final int mColor = 0;
        static android.media.Cea608CCParser.StyleCode fromByte(byte p0) { return null; }
        StyleCode(int p0, int p1) {}
        boolean isItalics() { return false; }
        boolean isUnderline() { return false; }
        int getColor() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

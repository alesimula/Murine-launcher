package android.media;

class Cea608CCParser {
    public static final int MAX_ROWS = 15;
    public static final int MAX_COLS = 32;
    Cea608CCParser(android.media.Cea608CCParser.DisplayListener p0) {}
    public void parse(byte[] p0) {}

    private static class CCData {
        static android.media.Cea608CCParser.CCData[] fromByteArray(byte[] p0) { return null; }
        CCData(byte p0, byte p1, byte p2) {}
        int getCtrlCode() { return 0; }
        android.media.Cea608CCParser.StyleCode getMidRow() { return null; }
        android.media.Cea608CCParser.PAC getPAC() { return null; }
        int getTabOffset() { return 0; }
        boolean isDisplayableChar() { return false; }
        java.lang.String getDisplayText() { return null; }
        public java.lang.String toString() { return null; }
    }

    private static class CCLineBuilder {
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
    }

    static interface DisplayListener {
        public void onDisplayChanged(android.text.SpannableStringBuilder[] p0);
        public android.view.accessibility.CaptioningManager.CaptionStyle getCaptionStyle();
    }

    public static class MutableBackgroundColorSpan extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {
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

package android.media;

class Cea708CCParser {
    private static final java.lang.String TAG = "Cea708CCParser";
    private static final boolean DEBUG = false;
    private static final java.lang.String MUSIC_NOTE_CHAR = null;
    private final java.lang.StringBuffer mBuffer = null;
    private int mCommand;
    private android.media.Cea708CCParser.DisplayListener mListener;
    public static final int CAPTION_EMIT_TYPE_BUFFER = 1;
    public static final int CAPTION_EMIT_TYPE_CONTROL = 2;
    public static final int CAPTION_EMIT_TYPE_COMMAND_CWX = 3;
    public static final int CAPTION_EMIT_TYPE_COMMAND_CLW = 4;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DSW = 5;
    public static final int CAPTION_EMIT_TYPE_COMMAND_HDW = 6;
    public static final int CAPTION_EMIT_TYPE_COMMAND_TGW = 7;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DLW = 8;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DLY = 9;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DLC = 10;
    public static final int CAPTION_EMIT_TYPE_COMMAND_RST = 11;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SPA = 12;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SPC = 13;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SPL = 14;
    public static final int CAPTION_EMIT_TYPE_COMMAND_SWA = 15;
    public static final int CAPTION_EMIT_TYPE_COMMAND_DFX = 16;
    Cea708CCParser(android.media.Cea708CCParser.DisplayListener p0) {}
    private void emitCaptionEvent(android.media.Cea708CCParser.CaptionEvent p0) {}
    private void emitCaptionBuffer() {}
    public void parse(byte[] p0) {}
    private int parseServiceBlockData(byte[] p0, int p1) { return 0; }
    private int parseC0(byte[] p0, int p1) { return 0; }
    private int parseC1(byte[] p0, int p1) { return 0; }
    private int parseG0(byte[] p0, int p1) { return 0; }
    private int parseG1(byte[] p0, int p1) { return 0; }
    private int parseExt1(byte[] p0, int p1) { return 0; }
    private int parseC2(byte[] p0, int p1) { return 0; }
    private int parseC3(byte[] p0, int p1) { return 0; }
    private int parseG2(byte[] p0, int p1) { return 0; }
    private int parseG3(byte[] p0, int p1) { return 0; }

    static interface DisplayListener {
        public void emitEvent(android.media.Cea708CCParser.CaptionEvent p0);
    }

    private static class Const {
        public static final int CODE_C0_RANGE_START = 0;
        public static final int CODE_C0_RANGE_END = 31;
        public static final int CODE_C1_RANGE_START = 128;
        public static final int CODE_C1_RANGE_END = 159;
        public static final int CODE_G0_RANGE_START = 32;
        public static final int CODE_G0_RANGE_END = 127;
        public static final int CODE_G1_RANGE_START = 160;
        public static final int CODE_G1_RANGE_END = 255;
        public static final int CODE_C2_RANGE_START = 0;
        public static final int CODE_C2_RANGE_END = 31;
        public static final int CODE_C3_RANGE_START = 128;
        public static final int CODE_C3_RANGE_END = 159;
        public static final int CODE_G2_RANGE_START = 32;
        public static final int CODE_G2_RANGE_END = 127;
        public static final int CODE_G3_RANGE_START = 160;
        public static final int CODE_G3_RANGE_END = 255;
        public static final int CODE_C0_SKIP2_RANGE_START = 24;
        public static final int CODE_C0_SKIP2_RANGE_END = 31;
        public static final int CODE_C0_SKIP1_RANGE_START = 16;
        public static final int CODE_C0_SKIP1_RANGE_END = 23;
        public static final int CODE_C2_SKIP0_RANGE_START = 0;
        public static final int CODE_C2_SKIP0_RANGE_END = 7;
        public static final int CODE_C2_SKIP1_RANGE_START = 8;
        public static final int CODE_C2_SKIP1_RANGE_END = 15;
        public static final int CODE_C2_SKIP2_RANGE_START = 16;
        public static final int CODE_C2_SKIP2_RANGE_END = 23;
        public static final int CODE_C2_SKIP3_RANGE_START = 24;
        public static final int CODE_C2_SKIP3_RANGE_END = 31;
        public static final int CODE_C3_SKIP4_RANGE_START = 128;
        public static final int CODE_C3_SKIP4_RANGE_END = 135;
        public static final int CODE_C3_SKIP5_RANGE_START = 136;
        public static final int CODE_C3_SKIP5_RANGE_END = 143;
        public static final int CODE_C0_NUL = 0;
        public static final int CODE_C0_ETX = 3;
        public static final int CODE_C0_BS = 8;
        public static final int CODE_C0_FF = 12;
        public static final int CODE_C0_CR = 13;
        public static final int CODE_C0_HCR = 14;
        public static final int CODE_C0_EXT1 = 16;
        public static final int CODE_C0_P16 = 24;
        public static final int CODE_G0_MUSICNOTE = 127;
        public static final int CODE_G2_TSP = 32;
        public static final int CODE_G2_NBTSP = 33;
        public static final int CODE_G2_BLK = 48;
        public static final int CODE_G3_CC = 160;
        public static final int CODE_C1_CW0 = 128;
        public static final int CODE_C1_CW1 = 129;
        public static final int CODE_C1_CW2 = 130;
        public static final int CODE_C1_CW3 = 131;
        public static final int CODE_C1_CW4 = 132;
        public static final int CODE_C1_CW5 = 133;
        public static final int CODE_C1_CW6 = 134;
        public static final int CODE_C1_CW7 = 135;
        public static final int CODE_C1_CLW = 136;
        public static final int CODE_C1_DSW = 137;
        public static final int CODE_C1_HDW = 138;
        public static final int CODE_C1_TGW = 139;
        public static final int CODE_C1_DLW = 140;
        public static final int CODE_C1_DLY = 141;
        public static final int CODE_C1_DLC = 142;
        public static final int CODE_C1_RST = 143;
        public static final int CODE_C1_SPA = 144;
        public static final int CODE_C1_SPC = 145;
        public static final int CODE_C1_SPL = 146;
        public static final int CODE_C1_SWA = 151;
        public static final int CODE_C1_DF0 = 152;
        public static final int CODE_C1_DF1 = 153;
        public static final int CODE_C1_DF2 = 154;
        public static final int CODE_C1_DF3 = 155;
        public static final int CODE_C1_DF4 = 156;
        public static final int CODE_C1_DF5 = 157;
        public static final int CODE_C1_DF6 = 158;
        public static final int CODE_C1_DF7 = 159;
        private Const() {}
    }

    public static class CaptionWindowAttr {
        public final android.media.Cea708CCParser.CaptionColor fillColor = null;
        public final android.media.Cea708CCParser.CaptionColor borderColor = null;
        public final int borderType = 0;
        public final boolean wordWrap = false;
        public final int printDirection = 0;
        public final int scrollDirection = 0;
        public final int justify = 0;
        public final int effectDirection = 0;
        public final int effectSpeed = 0;
        public final int displayEffect = 0;
        public CaptionWindowAttr(android.media.Cea708CCParser.CaptionColor p0, android.media.Cea708CCParser.CaptionColor p1, int p2, boolean p3, int p4, int p5, int p6, int p7, int p8, int p9) {}
    }

    public static class CaptionWindow {
        public final int id = 0;
        public final boolean visible = false;
        public final boolean rowLock = false;
        public final boolean columnLock = false;
        public final int priority = 0;
        public final boolean relativePositioning = false;
        public final int anchorVertical = 0;
        public final int anchorHorizontal = 0;
        public final int anchorId = 0;
        public final int rowCount = 0;
        public final int columnCount = 0;
        public final int penStyle = 0;
        public final int windowStyle = 0;
        public CaptionWindow(int p0, boolean p1, boolean p2, boolean p3, int p4, boolean p5, int p6, int p7, int p8, int p9, int p10, int p11, int p12) {}
    }

    public static class CaptionPenLocation {
        public final int row = 0;
        public final int column = 0;
        public CaptionPenLocation(int p0, int p1) {}
    }

    public static class CaptionPenColor {
        public final android.media.Cea708CCParser.CaptionColor foregroundColor = null;
        public final android.media.Cea708CCParser.CaptionColor backgroundColor = null;
        public final android.media.Cea708CCParser.CaptionColor edgeColor = null;
        public CaptionPenColor(android.media.Cea708CCParser.CaptionColor p0, android.media.Cea708CCParser.CaptionColor p1, android.media.Cea708CCParser.CaptionColor p2) {}
    }

    public static class CaptionPenAttr {
        public static final int PEN_SIZE_SMALL = 0;
        public static final int PEN_SIZE_STANDARD = 1;
        public static final int PEN_SIZE_LARGE = 2;
        public static final int OFFSET_SUBSCRIPT = 0;
        public static final int OFFSET_NORMAL = 1;
        public static final int OFFSET_SUPERSCRIPT = 2;
        public final int penSize = 0;
        public final int penOffset = 0;
        public final int textTag = 0;
        public final int fontTag = 0;
        public final int edgeType = 0;
        public final boolean underline = false;
        public final boolean italic = false;
        public CaptionPenAttr(int p0, int p1, int p2, int p3, int p4, boolean p5, boolean p6) {}
    }

    public static class CaptionEvent {
        public final int type = 0;
        public final java.lang.Object obj = null;
        public CaptionEvent(int p0, java.lang.Object p1) {}
    }

    public static class CaptionColor {
        public static final int OPACITY_SOLID = 0;
        public static final int OPACITY_FLASH = 1;
        public static final int OPACITY_TRANSLUCENT = 2;
        public static final int OPACITY_TRANSPARENT = 3;
        private static final int[] COLOR_MAP = null;
        private static final int[] OPACITY_MAP = null;
        public final int opacity = 0;
        public final int red = 0;
        public final int green = 0;
        public final int blue = 0;
        public CaptionColor(int p0, int p1, int p2, int p3) {}
        public int getArgbValue() { return 0; }
    }
}

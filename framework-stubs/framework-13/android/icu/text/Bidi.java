package android.icu.text;

public class Bidi {
    public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = 126;
    public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = 127;
    public static final int DIRECTION_LEFT_TO_RIGHT = 0;
    public static final int DIRECTION_RIGHT_TO_LEFT = 1;
    public static final short DO_MIRRORING = 2;
    public static final short INSERT_LRM_FOR_NUMERIC = 4;
    public static final short KEEP_BASE_COMBINING = 1;
    public static final byte LEVEL_DEFAULT_LTR = 126;
    public static final byte LEVEL_DEFAULT_RTL = 127;
    public static final byte LEVEL_OVERRIDE = -128;
    public static final byte LTR = 0;
    public static final int MAP_NOWHERE = -1;
    public static final byte MAX_EXPLICIT_LEVEL = 125;
    public static final byte MIXED = 2;
    public static final byte NEUTRAL = 3;
    public static final int OPTION_DEFAULT = 0;
    public static final int OPTION_INSERT_MARKS = 1;
    public static final int OPTION_REMOVE_CONTROLS = 2;
    public static final int OPTION_STREAMING = 4;
    public static final short OUTPUT_REVERSE = 16;
    public static final short REMOVE_BIDI_CONTROLS = 8;
    public static final short REORDER_DEFAULT = 0;
    public static final short REORDER_GROUP_NUMBERS_WITH_R = 2;
    public static final short REORDER_INVERSE_FOR_NUMBERS_SPECIAL = 6;
    public static final short REORDER_INVERSE_LIKE_DIRECT = 5;
    public static final short REORDER_INVERSE_NUMBERS_AS_L = 4;
    public static final short REORDER_NUMBERS_SPECIAL = 1;
    public static final short REORDER_RUNS_ONLY = 3;
    public static final byte RTL = 1;
    public Bidi() {}
    public Bidi(int p0, int p1) {}
    public Bidi(java.lang.String p0, int p1) {}
    public Bidi(java.text.AttributedCharacterIterator p0) {}
    public Bidi(char[] p0, int p1, byte[] p2, int p3, int p4, int p5) {}
    public void setInverse(boolean p0) {}
    public boolean isInverse() { return false; }
    public void setReorderingMode(int p0) {}
    public int getReorderingMode() { return 0; }
    public void setReorderingOptions(int p0) {}
    public int getReorderingOptions() { return 0; }
    public static byte getBaseDirection(java.lang.CharSequence p0) { return 0; }
    public void setContext(java.lang.String p0, java.lang.String p1) {}
    public void setPara(java.lang.String p0, byte p1, byte[] p2) {}
    public void setPara(char[] p0, byte p1, byte[] p2) {}
    public void setPara(java.text.AttributedCharacterIterator p0) {}
    public void orderParagraphsLTR(boolean p0) {}
    public boolean isOrderParagraphsLTR() { return false; }
    public byte getDirection() { return 0; }
    public java.lang.String getTextAsString() { return null; }
    public char[] getText() { return null; }
    public int getLength() { return 0; }
    public int getProcessedLength() { return 0; }
    public int getResultLength() { return 0; }
    public byte getParaLevel() { return 0; }
    public int countParagraphs() { return 0; }
    public android.icu.text.BidiRun getParagraphByIndex(int p0) { return null; }
    public android.icu.text.BidiRun getParagraph(int p0) { return null; }
    public int getParagraphIndex(int p0) { return 0; }
    public void setCustomClassifier(android.icu.text.BidiClassifier p0) {}
    public android.icu.text.BidiClassifier getCustomClassifier() { return null; }
    public int getCustomizedClass(int p0) { return 0; }
    public android.icu.text.Bidi setLine(int p0, int p1) { return null; }
    public byte getLevelAt(int p0) { return 0; }
    public byte[] getLevels() { return null; }
    public android.icu.text.BidiRun getLogicalRun(int p0) { return null; }
    public int countRuns() { return 0; }
    public android.icu.text.BidiRun getVisualRun(int p0) { return null; }
    public int getVisualIndex(int p0) { return 0; }
    public int getLogicalIndex(int p0) { return 0; }
    public int[] getLogicalMap() { return null; }
    public int[] getVisualMap() { return null; }
    public static int[] reorderLogical(byte[] p0) { return null; }
    public static int[] reorderVisual(byte[] p0) { return null; }
    public static int[] invertMap(int[] p0) { return null; }
    public android.icu.text.Bidi createLineBidi(int p0, int p1) { return null; }
    public boolean isMixed() { return false; }
    public boolean isLeftToRight() { return false; }
    public boolean isRightToLeft() { return false; }
    public boolean baseIsLeftToRight() { return false; }
    public int getBaseLevel() { return 0; }
    public int getRunCount() { return 0; }
    public int getRunLevel(int p0) { return 0; }
    public int getRunStart(int p0) { return 0; }
    public int getRunLimit(int p0) { return 0; }
    public static boolean requiresBidi(char[] p0, int p1, int p2) { return false; }
    public static void reorderVisually(byte[] p0, int p1, java.lang.Object[] p2, int p3, int p4) {}
    public java.lang.String writeReordered(int p0) { return null; }
    public static java.lang.String writeReverse(java.lang.String p0, int p1) { return null; }
}

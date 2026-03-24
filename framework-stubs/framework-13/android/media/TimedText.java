package android.media;

public final class TimedText {
    public TimedText(android.os.Parcel p0) {}
    public TimedText(java.lang.String p0, android.graphics.Rect p1) {}
    public java.lang.String getText() { return null; }
    public android.graphics.Rect getBounds() { return null; }

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

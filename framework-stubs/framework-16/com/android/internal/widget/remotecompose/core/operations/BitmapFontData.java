package com.android.internal.widget.remotecompose.core.operations;

public class BitmapFontData extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    int mId;
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] mFontGlyphs;
    public BitmapFontData(int p0, com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p1) { super(); }
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p2) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph lookupGlyph(java.lang.String p0, int p1) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}

    public static class Glyph {
        public java.lang.String mChars;
        public int mBitmapId;
        public short mMarginLeft;
        public short mMarginTop;
        public short mMarginRight;
        public short mMarginBottom;
        public short mBitmapWidth;
        public short mBitmapHeight;
        public Glyph() {}
        public Glyph(java.lang.String p0, int p1, short p2, short p3, short p4, short p5, short p6, short p7) {}
    }
}

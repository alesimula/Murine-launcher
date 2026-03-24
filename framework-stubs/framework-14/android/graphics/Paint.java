package android.graphics;

public class Paint {
    public int mBidiFlags;
    static final android.graphics.Paint.Style[] sStyleArray = null;
    static final android.graphics.Paint.Cap[] sCapArray = null;
    static final android.graphics.Paint.Join[] sJoinArray = null;
    static final android.graphics.Paint.Align[] sAlignArray = null;
    public static final int ANTI_ALIAS_FLAG = 1;
    public static final int FILTER_BITMAP_FLAG = 2;
    public static final int DITHER_FLAG = 4;
    public static final int UNDERLINE_TEXT_FLAG = 8;
    public static final int STRIKE_THRU_TEXT_FLAG = 16;
    public static final int FAKE_BOLD_TEXT_FLAG = 32;
    public static final int LINEAR_TEXT_FLAG = 64;
    public static final int SUBPIXEL_TEXT_FLAG = 128;
    public static final int DEV_KERN_TEXT_FLAG = 256;
    public static final int LCD_RENDER_TEXT_FLAG = 512;
    public static final int EMBEDDED_BITMAP_TEXT_FLAG = 1024;
    public static final int AUTO_HINTING_TEXT_FLAG = 2048;
    public static final int VERTICAL_TEXT_FLAG = 4096;
    static final int HIDDEN_DEFAULT_PAINT_FLAGS = 1282;
    public static final int HINTING_OFF = 0;
    public static final int HINTING_ON = 1;
    public static final int BIDI_LTR = 0;
    public static final int BIDI_RTL = 1;
    public static final int BIDI_DEFAULT_LTR = 2;
    public static final int BIDI_DEFAULT_RTL = 3;
    public static final int BIDI_FORCE_LTR = 4;
    public static final int BIDI_FORCE_RTL = 5;
    public static final int DIRECTION_LTR = 0;
    public static final int DIRECTION_RTL = 1;
    public static final int CURSOR_AFTER = 0;
    public static final int CURSOR_AT_OR_AFTER = 1;
    public static final int CURSOR_BEFORE = 2;
    public static final int CURSOR_AT_OR_BEFORE = 3;
    public static final int CURSOR_AT = 4;
    public static final int START_HYPHEN_EDIT_NO_EDIT = 0;
    public static final int START_HYPHEN_EDIT_INSERT_HYPHEN = 1;
    public static final int START_HYPHEN_EDIT_INSERT_ZWJ = 2;
    public static final int END_HYPHEN_EDIT_NO_EDIT = 0;
    public static final int END_HYPHEN_EDIT_REPLACE_WITH_HYPHEN = 1;
    public static final int END_HYPHEN_EDIT_INSERT_HYPHEN = 2;
    public static final int END_HYPHEN_EDIT_INSERT_ARMENIAN_HYPHEN = 3;
    public static final int END_HYPHEN_EDIT_INSERT_MAQAF = 4;
    public static final int END_HYPHEN_EDIT_INSERT_UCAS_HYPHEN = 5;
    public static final int END_HYPHEN_EDIT_INSERT_ZWJ_AND_HYPHEN = 6;
    public Paint() {}
    public Paint(int p0) {}
    public Paint(android.graphics.Paint p0) {}
    public void reset() {}
    public void set(android.graphics.Paint p0) {}
    public void setCompatibilityScaling(float p0) {}
    public synchronized long getNativeInstance() { return 0L; }
    public int getBidiFlags() { return 0; }
    public void setBidiFlags(int p0) {}
    public int getFlags() { return 0; }
    public void setFlags(int p0) {}
    public int getHinting() { return 0; }
    public void setHinting(int p0) {}
    public final boolean isAntiAlias() { return false; }
    public void setAntiAlias(boolean p0) {}
    public final boolean isDither() { return false; }
    public void setDither(boolean p0) {}
    public final boolean isLinearText() { return false; }
    public void setLinearText(boolean p0) {}
    public final boolean isSubpixelText() { return false; }
    public void setSubpixelText(boolean p0) {}
    public final boolean isUnderlineText() { return false; }
    public float getUnderlinePosition() { return 0.0f; }
    public float getUnderlineThickness() { return 0.0f; }
    public void setUnderlineText(boolean p0) {}
    public final boolean isStrikeThruText() { return false; }
    public float getStrikeThruPosition() { return 0.0f; }
    public float getStrikeThruThickness() { return 0.0f; }
    public void setStrikeThruText(boolean p0) {}
    public final boolean isFakeBoldText() { return false; }
    public void setFakeBoldText(boolean p0) {}
    public final boolean isFilterBitmap() { return false; }
    public void setFilterBitmap(boolean p0) {}
    public android.graphics.Paint.Style getStyle() { return null; }
    public void setStyle(android.graphics.Paint.Style p0) {}
    public int getColor() { return 0; }
    public long getColorLong() { return 0L; }
    public void setColor(int p0) {}
    public void setColor(long p0) {}
    public int getAlpha() { return 0; }
    public void setAlpha(int p0) {}
    public void setARGB(int p0, int p1, int p2, int p3) {}
    public float getStrokeWidth() { return 0.0f; }
    public void setStrokeWidth(float p0) {}
    public float getStrokeMiter() { return 0.0f; }
    public void setStrokeMiter(float p0) {}
    public android.graphics.Paint.Cap getStrokeCap() { return null; }
    public void setStrokeCap(android.graphics.Paint.Cap p0) {}
    public android.graphics.Paint.Join getStrokeJoin() { return null; }
    public void setStrokeJoin(android.graphics.Paint.Join p0) {}
    public boolean getFillPath(android.graphics.Path p0, android.graphics.Path p1) { return false; }
    public android.graphics.Shader getShader() { return null; }
    public android.graphics.Shader setShader(android.graphics.Shader p0) { return null; }
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public android.graphics.ColorFilter setColorFilter(android.graphics.ColorFilter p0) { return null; }
    public android.graphics.Xfermode getXfermode() { return null; }
    public android.graphics.BlendMode getBlendMode() { return null; }
    public android.graphics.Xfermode setXfermode(android.graphics.Xfermode p0) { return null; }
    public void setBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PathEffect getPathEffect() { return null; }
    public android.graphics.PathEffect setPathEffect(android.graphics.PathEffect p0) { return null; }
    public android.graphics.MaskFilter getMaskFilter() { return null; }
    public android.graphics.MaskFilter setMaskFilter(android.graphics.MaskFilter p0) { return null; }
    public android.graphics.Typeface getTypeface() { return null; }
    public android.graphics.Typeface setTypeface(android.graphics.Typeface p0) { return null; }
    @java.lang.Deprecated
    public android.graphics.Rasterizer getRasterizer() { return null; }
    @java.lang.Deprecated
    public android.graphics.Rasterizer setRasterizer(android.graphics.Rasterizer p0) { return null; }
    public void setShadowLayer(float p0, float p1, float p2, int p3) {}
    public void setShadowLayer(float p0, float p1, float p2, long p3) {}
    public void clearShadowLayer() {}
    public boolean hasShadowLayer() { return false; }
    public float getShadowLayerRadius() { return 0.0f; }
    public float getShadowLayerDx() { return 0.0f; }
    public float getShadowLayerDy() { return 0.0f; }
    public int getShadowLayerColor() { return 0; }
    public long getShadowLayerColorLong() { return 0L; }
    public android.graphics.Paint.Align getTextAlign() { return null; }
    public void setTextAlign(android.graphics.Paint.Align p0) {}
    public java.util.Locale getTextLocale() { return null; }
    public android.os.LocaleList getTextLocales() { return null; }
    public void setTextLocale(java.util.Locale p0) {}
    public void setTextLocales(android.os.LocaleList p0) {}
    public boolean isElegantTextHeight() { return false; }
    public void setElegantTextHeight(boolean p0) {}
    public float getTextSize() { return 0.0f; }
    public void setTextSize(float p0) {}
    public float getTextScaleX() { return 0.0f; }
    public void setTextScaleX(float p0) {}
    public float getTextSkewX() { return 0.0f; }
    public void setTextSkewX(float p0) {}
    public float getLetterSpacing() { return 0.0f; }
    public void setLetterSpacing(float p0) {}
    public float getWordSpacing() { return 0.0f; }
    public void setWordSpacing(float p0) {}
    public java.lang.String getFontFeatureSettings() { return null; }
    public void setFontFeatureSettings(java.lang.String p0) {}
    public java.lang.String getFontVariationSettings() { return null; }
    public boolean setFontVariationSettings(java.lang.String p0) { return false; }
    public int getStartHyphenEdit() { return 0; }
    public int getEndHyphenEdit() { return 0; }
    public void setStartHyphenEdit(int p0) {}
    public void setEndHyphenEdit(int p0) {}
    public float ascent() { return 0.0f; }
    public float descent() { return 0.0f; }
    public float getFontMetrics(android.graphics.Paint.FontMetrics p0) { return 0.0f; }
    public android.graphics.Paint.FontMetrics getFontMetrics() { return null; }
    public void getFontMetricsInt(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, android.graphics.Paint.FontMetricsInt p6) {}
    public void getFontMetricsInt(char[] p0, int p1, int p2, int p3, int p4, boolean p5, android.graphics.Paint.FontMetricsInt p6) {}
    public int getFontMetricsInt(android.graphics.Paint.FontMetricsInt p0) { return 0; }
    public android.graphics.Paint.FontMetricsInt getFontMetricsInt() { return null; }
    public float getFontSpacing() { return 0.0f; }
    public float measureText(char[] p0, int p1, int p2) { return 0.0f; }
    public float measureText(java.lang.String p0, int p1, int p2) { return 0.0f; }
    public float measureText(java.lang.String p0) { return 0.0f; }
    public float measureText(java.lang.CharSequence p0, int p1, int p2) { return 0.0f; }
    public int breakText(char[] p0, int p1, int p2, float p3, float[] p4) { return 0; }
    public int breakText(java.lang.CharSequence p0, int p1, int p2, boolean p3, float p4, float[] p5) { return 0; }
    public int breakText(java.lang.String p0, boolean p1, float p2, float[] p3) { return 0; }
    public int getTextWidths(char[] p0, int p1, int p2, float[] p3) { return 0; }
    public int getTextWidths(java.lang.CharSequence p0, int p1, int p2, float[] p3) { return 0; }
    public int getTextWidths(java.lang.String p0, int p1, int p2, float[] p3) { return 0; }
    public int getTextWidths(java.lang.String p0, float[] p1) { return 0; }
    public float getTextRunAdvances(char[] p0, int p1, int p2, int p3, int p4, boolean p5, float[] p6, int p7) { return 0.0f; }
    public int getTextRunCursor(char[] p0, int p1, int p2, boolean p3, int p4, int p5) { return 0; }
    public int getTextRunCursor(java.lang.CharSequence p0, int p1, int p2, boolean p3, int p4, int p5) { return 0; }
    public int getTextRunCursor(java.lang.String p0, int p1, int p2, boolean p3, int p4, int p5) { return 0; }
    public void getTextPath(char[] p0, int p1, int p2, float p3, float p4, android.graphics.Path p5) {}
    public void getTextPath(java.lang.String p0, int p1, int p2, float p3, float p4, android.graphics.Path p5) {}
    public void getTextBounds(java.lang.String p0, int p1, int p2, android.graphics.Rect p3) {}
    public void getTextBounds(java.lang.CharSequence p0, int p1, int p2, android.graphics.Rect p3) {}
    public void getTextBounds(char[] p0, int p1, int p2, android.graphics.Rect p3) {}
    public boolean hasGlyph(java.lang.String p0) { return false; }
    public float getRunAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, int p6) { return 0.0f; }
    public float getRunAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, int p6) { return 0.0f; }
    public float getRunCharacterAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, int p6, float[] p7, int p8) { return 0.0f; }
    public float getRunCharacterAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, int p6, float[] p7, int p8) { return 0.0f; }
    public int getOffsetForAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, float p6) { return 0; }
    public int getOffsetForAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, float p6) { return 0; }
    public boolean equalsForTextMeasurement(android.graphics.Paint p0) { return false; }

    public static enum Cap {
        BUTT,
        ROUND,
        SQUARE;
        final int nativeInt = 0;
    }

    public static enum Align {
        LEFT,
        CENTER,
        RIGHT;
        final int nativeInt = 0;
    }

    public static class FontMetrics {
        public float top;
        public float ascent;
        public float descent;
        public float bottom;
        public float leading;
        public FontMetrics() {}
    }

    public static enum Style {
        FILL,
        STROKE,
        FILL_AND_STROKE;
        final int nativeInt = 0;
    }

    public static enum Join {
        MITER,
        ROUND,
        BEVEL;
        final int nativeInt = 0;
    }

    public static class FontMetricsInt {
        public int top;
        public int ascent;
        public int descent;
        public int bottom;
        public int leading;
        public FontMetricsInt() {}
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CursorOption {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EndHyphenEdit {
    }

    private static class NoImagePreloadHolder {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PaintFlag {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartHyphenEdit {
    }
}

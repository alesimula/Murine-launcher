package android.graphics;

public class Paint {
    @android.annotation.UnsupportedAppUsage
    private long mNativePaint;
    private long mNativeShader;
    private long mNativeColorFilter;
    private long mColor;
    private android.graphics.ColorFilter mColorFilter;
    private android.graphics.MaskFilter mMaskFilter;
    private android.graphics.PathEffect mPathEffect;
    private android.graphics.Shader mShader;
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    private android.graphics.Typeface mTypeface;
    private android.graphics.Xfermode mXfermode;
    private boolean mHasCompatScaling;
    private float mCompatScaling;
    private float mInvCompatScaling;
    private android.os.LocaleList mLocales;
    private java.lang.String mFontFeatureSettings;
    private java.lang.String mFontVariationSettings;
    private float mShadowLayerRadius;
    private float mShadowLayerDx;
    private float mShadowLayerDy;
    private long mShadowLayerColor;
    private static final java.lang.Object sCacheLock = null;
    private static final java.util.HashMap<java.lang.String, java.lang.Integer> sMinikinLocaleListIdCache = null;
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
    private static final int BIDI_MAX_FLAG_VALUE = 5;
    private static final int BIDI_FLAG_MASK = 7;
    public static final int DIRECTION_LTR = 0;
    public static final int DIRECTION_RTL = 1;
    public static final int CURSOR_AFTER = 0;
    public static final int CURSOR_AT_OR_AFTER = 1;
    public static final int CURSOR_BEFORE = 2;
    public static final int CURSOR_AT_OR_BEFORE = 3;
    public static final int CURSOR_AT = 4;
    private static final int CURSOR_OPT_MAX_VALUE = 4;
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
    private void setClassVariablesFrom(android.graphics.Paint p0) {}
    @android.annotation.UnsupportedAppUsage
    public void setCompatibilityScaling(float p0) {}
    @android.annotation.UnsupportedAppUsage
    public long getNativeInstance() { return 0L; }
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
    private android.graphics.Xfermode installXfermode(android.graphics.Xfermode p0) { return null; }
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
    private void syncTextLocalesWithMinikin() {}
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
    public int getOffsetForAdvance(char[] p0, int p1, int p2, int p3, int p4, boolean p5, float p6) { return 0; }
    public int getOffsetForAdvance(java.lang.CharSequence p0, int p1, int p2, int p3, int p4, boolean p5, float p6) { return 0; }
    public boolean equalsForTextMeasurement(android.graphics.Paint p0) { return false; }
    private static native long nGetNativeFinalizer();
    private static native long nInit();
    private static native long nInitWithPaint(long p0);
    private static native int nBreakText(long p0, char[] p1, int p2, int p3, float p4, int p5, float[] p6);
    private static native int nBreakText(long p0, java.lang.String p1, boolean p2, float p3, int p4, float[] p5);
    private static native float nGetTextAdvances(long p0, char[] p1, int p2, int p3, int p4, int p5, int p6, float[] p7, int p8);
    private static native float nGetTextAdvances(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6, float[] p7, int p8);
    private native int nGetTextRunCursor(long p0, char[] p1, int p2, int p3, int p4, int p5, int p6);
    private native int nGetTextRunCursor(long p0, java.lang.String p1, int p2, int p3, int p4, int p5, int p6);
    private static native void nGetTextPath(long p0, int p1, char[] p2, int p3, int p4, float p5, float p6, long p7);
    private static native void nGetTextPath(long p0, int p1, java.lang.String p2, int p3, int p4, float p5, float p6, long p7);
    private static native void nGetStringBounds(long p0, java.lang.String p1, int p2, int p3, int p4, android.graphics.Rect p5);
    private static native void nGetCharArrayBounds(long p0, char[] p1, int p2, int p3, int p4, android.graphics.Rect p5);
    private static native boolean nHasGlyph(long p0, int p1, java.lang.String p2);
    private static native float nGetRunAdvance(long p0, char[] p1, int p2, int p3, int p4, int p5, boolean p6, int p7);
    private static native int nGetOffsetForAdvance(long p0, char[] p1, int p2, int p3, int p4, int p5, boolean p6, float p7);
    private static native int nSetTextLocales(long p0, java.lang.String p1);
    private static native void nSetFontFeatureSettings(long p0, java.lang.String p1);
    private static native float nGetFontMetrics(long p0, android.graphics.Paint.FontMetrics p1);
    private static native int nGetFontMetricsInt(long p0, android.graphics.Paint.FontMetricsInt p1);
    private static native void nReset(long p0);
    private static native void nSet(long p0, long p1);
    private static native int nGetStyle(long p0);
    private static native void nSetStyle(long p0, int p1);
    private static native int nGetStrokeCap(long p0);
    private static native void nSetStrokeCap(long p0, int p1);
    private static native int nGetStrokeJoin(long p0);
    private static native void nSetStrokeJoin(long p0, int p1);
    private static native boolean nGetFillPath(long p0, long p1, long p2);
    private static native long nSetShader(long p0, long p1);
    private static native long nSetColorFilter(long p0, long p1);
    private static native void nSetXfermode(long p0, int p1);
    private static native long nSetPathEffect(long p0, long p1);
    private static native long nSetMaskFilter(long p0, long p1);
    private static native void nSetTypeface(long p0, long p1);
    private static native int nGetTextAlign(long p0);
    private static native void nSetTextAlign(long p0, int p1);
    private static native void nSetTextLocalesByMinikinLocaleListId(long p0, int p1);
    private static native void nSetShadowLayer(long p0, float p1, float p2, float p3, long p4, long p5);
    private static native boolean nHasShadowLayer(long p0);
    private static native float nGetLetterSpacing(long p0);
    private static native void nSetLetterSpacing(long p0, float p1);
    private static native float nGetWordSpacing(long p0);
    private static native void nSetWordSpacing(long p0, float p1);
    private static native int nGetStartHyphenEdit(long p0);
    private static native int nGetEndHyphenEdit(long p0);
    private static native void nSetStartHyphenEdit(long p0, int p1);
    private static native void nSetEndHyphenEdit(long p0, int p1);
    private static native void nSetStrokeMiter(long p0, float p1);
    private static native float nGetStrokeMiter(long p0);
    private static native void nSetStrokeWidth(long p0, float p1);
    private static native float nGetStrokeWidth(long p0);
    private static native void nSetAlpha(long p0, int p1);
    private static native void nSetDither(long p0, boolean p1);
    private static native int nGetFlags(long p0);
    private static native void nSetFlags(long p0, int p1);
    private static native int nGetHinting(long p0);
    private static native void nSetHinting(long p0, int p1);
    private static native void nSetAntiAlias(long p0, boolean p1);
    private static native void nSetLinearText(long p0, boolean p1);
    private static native void nSetSubpixelText(long p0, boolean p1);
    private static native void nSetUnderlineText(long p0, boolean p1);
    private static native void nSetFakeBoldText(long p0, boolean p1);
    private static native void nSetFilterBitmap(long p0, boolean p1);
    private static native void nSetColor(long p0, long p1, long p2);
    private static native void nSetColor(long p0, int p1);
    private static native void nSetStrikeThruText(long p0, boolean p1);
    private static native boolean nIsElegantTextHeight(long p0);
    private static native void nSetElegantTextHeight(long p0, boolean p1);
    private static native float nGetTextSize(long p0);
    private static native float nGetTextScaleX(long p0);
    private static native void nSetTextScaleX(long p0, float p1);
    private static native float nGetTextSkewX(long p0);
    private static native void nSetTextSkewX(long p0, float p1);
    private static native float nAscent(long p0);
    private static native float nDescent(long p0);
    private static native float nGetUnderlinePosition(long p0);
    private static native float nGetUnderlineThickness(long p0);
    private static native float nGetStrikeThruPosition(long p0);
    private static native float nGetStrikeThruThickness(long p0);
    private static native void nSetTextSize(long p0, float p1);
    private static native boolean nEqualsForTextMeasurement(long p0, long p1);

    public static enum Style {
        FILL,
        STROKE,
        FILL_AND_STROKE;
        final int nativeInt = 0;
        private Style() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StartHyphenEdit {
    }

    private static class NoImagePreloadHolder {
        private NoImagePreloadHolder() {}
    }

    public static enum Join {
        MITER,
        ROUND,
        BEVEL;
        final int nativeInt = 0;
        private Join() {}
    }

    public static class FontMetricsInt {
        public int top;
        public int ascent;
        public int descent;
        public int bottom;
        public int leading;
        public FontMetricsInt() {}
        public java.lang.String toString() { return null; }
    }

    public static class FontMetrics {
        public float top;
        public float ascent;
        public float descent;
        public float bottom;
        public float leading;
        public FontMetrics() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EndHyphenEdit {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CursorOption {
    }

    public static enum Cap {
        BUTT,
        ROUND,
        SQUARE;
        final int nativeInt = 0;
        private Cap() {}
    }

    public static enum Align {
        LEFT,
        CENTER,
        RIGHT;
        final int nativeInt = 0;
        private Align() {}
    }
}

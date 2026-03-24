package com.android.internal.widget.remotecompose.core.operations.paint;

public class PaintBundle implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    @android.annotation.NonNull
    int[] mArray;
    @android.annotation.Nullable
    int[] mOutArray;
    int mPos;
    public static final int TEXT_SIZE = 1;
    public static final int COLOR = 4;
    public static final int STROKE_WIDTH = 5;
    public static final int STROKE_MITER = 6;
    public static final int STROKE_CAP = 7;
    public static final int STYLE = 8;
    public static final int SHADER = 9;
    public static final int IMAGE_FILTER_QUALITY = 10;
    public static final int GRADIENT = 11;
    public static final int ALPHA = 12;
    public static final int COLOR_FILTER = 13;
    public static final int ANTI_ALIAS = 14;
    public static final int STROKE_JOIN = 15;
    public static final int TYPEFACE = 16;
    public static final int FILTER_BITMAP = 17;
    public static final int BLEND_MODE = 18;
    public static final int COLOR_ID = 19;
    public static final int COLOR_FILTER_ID = 20;
    public static final int CLEAR_COLOR_FILTER = 21;
    public static final int BLEND_MODE_CLEAR = 0;
    public static final int BLEND_MODE_SRC = 1;
    public static final int BLEND_MODE_DST = 2;
    public static final int BLEND_MODE_SRC_OVER = 3;
    public static final int BLEND_MODE_DST_OVER = 4;
    public static final int BLEND_MODE_SRC_IN = 5;
    public static final int BLEND_MODE_DST_IN = 6;
    public static final int BLEND_MODE_SRC_OUT = 7;
    public static final int BLEND_MODE_DST_OUT = 8;
    public static final int BLEND_MODE_SRC_ATOP = 9;
    public static final int BLEND_MODE_DST_ATOP = 10;
    public static final int BLEND_MODE_XOR = 11;
    public static final int BLEND_MODE_PLUS = 12;
    public static final int BLEND_MODE_MODULATE = 13;
    public static final int BLEND_MODE_SCREEN = 14;
    public static final int BLEND_MODE_OVERLAY = 15;
    public static final int BLEND_MODE_DARKEN = 16;
    public static final int BLEND_MODE_LIGHTEN = 17;
    public static final int BLEND_MODE_COLOR_DODGE = 18;
    public static final int BLEND_MODE_COLOR_BURN = 19;
    public static final int BLEND_MODE_HARD_LIGHT = 20;
    public static final int BLEND_MODE_SOFT_LIGHT = 21;
    public static final int BLEND_MODE_DIFFERENCE = 22;
    public static final int BLEND_MODE_EXCLUSION = 23;
    public static final int BLEND_MODE_MULTIPLY = 24;
    public static final int BLEND_MODE_HUE = 25;
    public static final int BLEND_MODE_SATURATION = 26;
    public static final int BLEND_MODE_COLOR = 27;
    public static final int BLEND_MODE_LUMINOSITY = 28;
    public static final int BLEND_MODE_NULL = 29;
    public static final int PORTER_MODE_ADD = 30;
    public static final int FONT_NORMAL = 0;
    public static final int FONT_BOLD = 1;
    public static final int FONT_ITALIC = 2;
    public static final int FONT_BOLD_ITALIC = 3;
    public static final int FONT_TYPE_DEFAULT = 0;
    public static final int FONT_TYPE_SANS_SERIF = 1;
    public static final int FONT_TYPE_SERIF = 2;
    public static final int FONT_TYPE_MONOSPACE = 3;
    public static final int STYLE_FILL = 0;
    public static final int STYLE_STROKE = 1;
    public static final int STYLE_FILL_AND_STROKE = 2;
    public static final int LINEAR_GRADIENT = 0;
    public static final int RADIAL_GRADIENT = 1;
    public static final int SWEEP_GRADIENT = 2;
    public PaintBundle() {}
    public void applyPaintChange(com.android.internal.widget.remotecompose.core.PaintContext p0, com.android.internal.widget.remotecompose.core.operations.paint.PaintChanges p1) {}
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    int callRegisterGradient(int p0, int[] p1, int p2, com.android.internal.widget.remotecompose.core.RemoteContext p3, com.android.internal.widget.remotecompose.core.VariableSupport p4) { return 0; }
    int callPrintGradient(int p0, int[] p1, int p2, java.lang.StringBuilder p3) { return 0; }
    int callSetGradient(int p0, int[] p1, int p2, com.android.internal.widget.remotecompose.core.operations.paint.PaintChanges p3) { return 0; }
    public void writeBundle(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void readBundle(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void setLinearGradient(int[] p0, int p1, float[] p2, float p3, float p4, float p5, float p6, int p7) {}
    public void setSweepGradient(int[] p0, int p1, float[] p2, float p3, float p4) {}
    public void setRadialGradient(int[] p0, int p1, float[] p2, float p3, float p4, float p5, int p6) {}
    public void setColorFilter(int p0, int p1) {}
    public void setColorFilterId(int p0, int p1) {}
    public void clearColorFilter() {}
    public void setTextSize(float p0) {}
    public void setTextStyle(int p0, int p1, boolean p2) {}
    public void setStrokeWidth(float p0) {}
    public void setColor(int p0) {}
    public void setColor(int p0, int p1, int p2, int p3) {}
    public void setColor(float p0, float p1, float p2, float p3) {}
    public void setColorId(int p0) {}
    public void setStrokeCap(int p0) {}
    public void setStyle(int p0) {}
    public void setShader(int p0) {}
    public void setAlpha(float p0) {}
    public void setStrokeMiter(float p0) {}
    public void setStrokeJoin(int p0) {}
    public void setFilterBitmap(boolean p0) {}
    public void setBlendMode(int p0) {}
    public void setAntiAlias(boolean p0) {}
    public void clear(long p0) {}
    public void reset() {}
    @android.annotation.NonNull
    public static java.lang.String blendModeString(int p0) { return null; }
    public void registerVars(com.android.internal.widget.remotecompose.core.RemoteContext p0, com.android.internal.widget.remotecompose.core.VariableSupport p1) {}
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    int updateFloatsInGradient(int p0, int[] p1, int[] p2, int p3, com.android.internal.widget.remotecompose.core.RemoteContext p4) { return 0; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}

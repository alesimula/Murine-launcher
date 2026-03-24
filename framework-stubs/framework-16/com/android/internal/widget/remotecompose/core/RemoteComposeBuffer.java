package com.android.internal.widget.remotecompose.core;

public class RemoteComposeBuffer {
    public static final int EASING_CUBIC_STANDARD = 1;
    public static final int EASING_CUBIC_ACCELERATE = 2;
    public static final int EASING_CUBIC_DECELERATE = 3;
    public static final int EASING_CUBIC_LINEAR = 4;
    public static final int EASING_CUBIC_ANTICIPATE = 5;
    public static final int EASING_CUBIC_OVERSHOOT = 6;
    public static final int EASING_CUBIC_CUSTOM = 11;
    public static final int EASING_SPLINE_CUSTOM = 12;
    public static final int EASING_EASE_OUT_BOUNCE = 13;
    public static final int EASING_EASE_OUT_ELASTIC = 14;
    public static final int PAD_AFTER_SPACE = 0;
    public static final int PAD_AFTER_NONE = 1;
    public static final int PAD_AFTER_ZERO = 3;
    public static final int PAD_PRE_SPACE = 0;
    public static final int PAD_PRE_NONE = 4;
    public static final int PAD_PRE_ZERO = 12;
    public RemoteComposeBuffer(com.android.internal.widget.remotecompose.core.RemoteComposeState p0) {}
    public void reset(int p0) {}
    public int getLastComponentId() { return 0; }
    @android.annotation.Nullable
    public com.android.internal.widget.remotecompose.core.Platform getPlatform() { return null; }
    public void setPlatform(com.android.internal.widget.remotecompose.core.Platform p0) {}
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.WireBuffer getBuffer() { return null; }
    public void setBuffer(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public void addHeader(short[] p0, java.lang.Object[] p1) {}
    public void header(int p0, int p1, java.lang.String p2, float p3, long p4) {}
    public void addHeader(int p0, int p1, java.lang.String p2, float p3, long p4) {}
    public void header(int p0, int p1, java.lang.String p2) {}
    public void drawBitmap(java.lang.Object p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, int p9, int p10, java.lang.String p11) {}
    public int mapLookup(int p0, int p1) { return 0; }
    public int addText(java.lang.String p0) { return 0; }
    public void addClickArea(int p0, java.lang.String p1, float p2, float p3, float p4, float p5, java.lang.String p6) {}
    public void setRootContentBehavior(int p0, int p1, int p2, int p3) {}
    public void addDrawArc(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addDrawSector(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addDrawBitmap(java.lang.Object p0, float p1, float p2, float p3, float p4, java.lang.String p5) {}
    public void addDrawBitmap(int p0, float p1, float p2, float p3, float p4, java.lang.String p5) {}
    public void addDrawBitmap(int p0, float p1, float p2, java.lang.String p3) {}
    public void drawScaledBitmap(java.lang.Object p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9, float p10, java.lang.String p11) {}
    public int addBitmap(java.lang.Object p0) { return 0; }
    public int addBitmap(java.lang.Object p0, java.lang.String p1) { return 0; }
    public int addBitmapFont(com.android.internal.widget.remotecompose.core.operations.BitmapFontData.Glyph[] p0) { return 0; }
    public void setBitmapName(int p0, java.lang.String p1) {}
    public void drawScaledBitmap(int p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7, float p8, int p9, float p10, java.lang.String p11) {}
    public void addDrawCircle(float p0, float p1, float p2) {}
    public void addDrawLine(float p0, float p1, float p2, float p3) {}
    public void addDrawOval(float p0, float p1, float p2, float p3) {}
    public void addDrawPath(java.lang.Object p0) {}
    public int pathTween(int p0, int p1, float p2) { return 0; }
    public int pathCreate(float p0, float p1) { return 0; }
    public void pathAppend(int p0, float... p1) {}
    public void addDrawPath(int p0) {}
    public void addDrawRect(float p0, float p1, float p2, float p3) {}
    public void addDrawRoundRect(float p0, float p1, float p2, float p3, float p4, float p5) {}
    public void addDrawTextOnPath(java.lang.String p0, java.lang.Object p1, float p2, float p3) {}
    public void addDrawTextOnPath(int p0, java.lang.Object p1, float p2, float p3) {}
    public void addDrawTextRun(java.lang.String p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7) {}
    public void addDrawTextRun(int p0, int p1, int p2, int p3, int p4, float p5, float p6, boolean p7) {}
    public void addDrawBitmapFontTextRun(int p0, int p1, int p2, int p3, float p4, float p5) {}
    public void drawTextAnchored(java.lang.String p0, float p1, float p2, float p3, float p4, int p5) {}
    public int createTextId(java.lang.String p0) { return 0; }
    public int textMerge(int p0, int p1) { return 0; }
    public int createTextFromFloat(float p0, short p1, short p2, int p3) { return 0; }
    public void drawTextAnchored(int p0, float p1, float p2, float p3, float p4, int p5) {}
    public void addDrawTweenPath(java.lang.Object p0, java.lang.Object p1, float p2, float p3, float p4) {}
    public void addDrawTweenPath(int p0, int p1, float p2, float p3, float p4) {}
    public int addPathData(java.lang.Object p0) { return 0; }
    public void addPaint(com.android.internal.widget.remotecompose.core.operations.paint.PaintBundle p0) {}
    public void inflateFromBuffer(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0) {}
    public static void readNextOperation(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.RemoteComposeBuffer copy() { return null; }
    public void setTheme(int p0) {}
    @android.annotation.NonNull
    static java.lang.String version() { return null; }
    @android.annotation.NonNull
    public static com.android.internal.widget.remotecompose.core.RemoteComposeBuffer fromFile(java.lang.String p0, com.android.internal.widget.remotecompose.core.RemoteComposeState p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public com.android.internal.widget.remotecompose.core.RemoteComposeBuffer fromFile(java.io.File p0, com.android.internal.widget.remotecompose.core.RemoteComposeState p1) throws java.io.IOException { return null; }
    @android.annotation.NonNull
    public static com.android.internal.widget.remotecompose.core.RemoteComposeBuffer fromInputStream(java.io.InputStream p0, com.android.internal.widget.remotecompose.core.RemoteComposeState p1) { return null; }
    @android.annotation.NonNull
    com.android.internal.widget.remotecompose.core.RemoteComposeBuffer copyFromOperations(java.util.ArrayList<com.android.internal.widget.remotecompose.core.Operation> p0, com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p1) { return null; }
    public void write(com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p0, java.io.File p1) {}
    static void read(java.io.File p0, com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p1) throws java.io.IOException {}
    public static void read(java.io.InputStream p0, com.android.internal.widget.remotecompose.core.RemoteComposeBuffer p1) {}
    public void addMatrixSkew(float p0, float p1) {}
    public void addMatrixRestore() {}
    public void addMatrixSave() {}
    public void addMatrixRotate(float p0, float p1, float p2) {}
    public void addMatrixTranslate(float p0, float p1) {}
    public void addMatrixScale(float p0, float p1) {}
    public void addMatrixScale(float p0, float p1, float p2, float p3) {}
    public void addClipPath(int p0) {}
    public void addClipRect(float p0, float p1, float p2, float p3) {}
    public float addFloat(float p0) { return 0.0f; }
    public float reserveFloatVariable() { return 0.0f; }
    public int addInteger(int p0) { return 0; }
    public int addLong(long p0) { return 0; }
    public int addBoolean(boolean p0) { return 0; }
    public float asFloatId(int p0) { return 0.0f; }
    public float addAnimatedFloat(float... p0) { return 0.0f; }
    public void addTouchExpression(float p0, float p1, float p2, float p3, float p4, int p5, float[] p6, int p7, float[] p8, float[] p9) {}
    public float addTouchExpression(float p0, float p1, float p2, float p3, int p4, float[] p5, int p6, float[] p7, float[] p8) { return 0.0f; }
    public float addAnimatedFloat(float[] p0, float[] p1) { return 0.0f; }
    public float textMeasure(int p0, int p1) { return 0.0f; }
    public float textLength(int p0) { return 0.0f; }
    public float addFloatArray(float[] p0) { return 0.0f; }
    public float addFloatList(float[] p0) { return 0.0f; }
    public float addList(int[] p0) { return 0.0f; }
    public float addFloatMap(java.lang.String[] p0, float[] p1) { return 0.0f; }
    public int addMap(java.lang.String[] p0, byte[] p1, int[] p2) { return 0; }
    public int textLookup(float p0, float p1) { return 0; }
    public int textLookup(float p0, int p1) { return 0; }
    public int addIntegerExpression(int p0, int[] p1) { return 0; }
    public int addColor(int p0) { return 0; }
    public short addColorExpression(int p0, int p1, float p2) { return 0; }
    public short addColorExpression(short p0, int p1, float p2) { return 0; }
    public short addColorExpression(int p0, short p1, float p2) { return 0; }
    public short addColorExpression(short p0, short p1, float p2) { return 0; }
    public short addColorExpression(float p0, float p1, float p2) { return 0; }
    public short addColorExpression(int p0, float p1, float p2, float p3) { return 0; }
    public short addColorExpression(float p0, float p1, float p2, float p3) { return 0; }
    @android.annotation.NonNull
    public static float[] packAnimation(float p0, int p1, float[] p2, float p3, float p4) { return null; }
    public void setNamedVariable(int p0, java.lang.String p1, int p2) {}
    public void addComponentStart(int p0, int p1) {}
    public void addComponentStart(int p0) {}
    public void addContainerEnd() {}
    public void addModifierScroll(int p0, float p1, int p2) {}
    public void addModifierScroll(int p0, float p1) {}
    public void addModifierScroll(int p0) {}
    public void addModifierBackground(int p0, int p1) {}
    public void addModifierBorder(float p0, float p1, int p2, int p3) {}
    public void addModifierPadding(float p0, float p1, float p2, float p3) {}
    public void addModifierOffset(float p0, float p1) {}
    public void addModifierZIndex(float p0) {}
    public void addModifierRipple() {}
    public void addModifierMarquee(int p0, int p1, float p2, float p3, float p4, float p5) {}
    public void addModifierGraphicsLayer(java.util.HashMap<java.lang.Integer, java.lang.Object> p0) {}
    public void addRoundClipRectModifier(float p0, float p1, float p2, float p3) {}
    public void addClipRectModifier() {}
    public void addLoopStart(int p0, float p1, float p2, float p3) {}
    public void addLoopEnd() {}
    public void addStateLayout(int p0, int p1, int p2, int p3, int p4) {}
    public void addBoxStart(int p0, int p1, int p2, int p3) {}
    public void addFitBoxStart(int p0, int p1, int p2, int p3) {}
    public void addImage(int p0, int p1, int p2, int p3, float p4) {}
    public void addRowStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addCollapsibleRowStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addColumnStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addCollapsibleColumnStart(int p0, int p1, int p2, int p3, float p4) {}
    public void addCanvasStart(int p0, int p1) {}
    public void addCanvasContentStart(int p0) {}
    public void addRootStart() {}
    public void addContentStart() {}
    public void addCanvasOperationsStart() {}
    public void addRunActionsStart() {}
    public void addComponentWidthValue(int p0) {}
    public void addComponentHeightValue(int p0) {}
    public void addTextComponentStart(int p0, int p1, int p2, int p3, float p4, int p5, float p6, java.lang.String p7, int p8, int p9, int p10) {}
    public int createID(int p0) { return 0; }
    public int nextId() { return 0; }
    public void addImpulse(float p0, float p1) {}
    public void addImpulseProcess() {}
    public void addImpulseEnd() {}
    public void addParticles(int p0, int[] p1, float[][] p2, int p3) {}
    public void addParticlesLoop(int p0, float[] p1, float[][] p2) {}
    public void addParticleLoopEnd() {}
    public void defineFloatFunction(int p0, int[] p1) {}
    public void addEndFloatFunctionDef() {}
    public void callFloatFunction(int p0, float[] p1) {}
    public float bitmapAttribute(int p0, short p1) { return 0.0f; }
    public float textAttribute(int p0, short p1) { return 0.0f; }
    public float timeAttribute(int p0, short p1, int... p2) { return 0.0f; }
    public void drawComponentContent() {}
    public void pathCombine(int p0, int p1, int p2, byte p3) {}
    public void performHaptic(int p0) {}
    public void addConditionalOperations(byte p0, float p1, float p2) {}
    public void addDebugMessage(int p0, float p1, int p2) {}
    public float getColorAttribute(int p0, short p1) { return 0.0f; }
}

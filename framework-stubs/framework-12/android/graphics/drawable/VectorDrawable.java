package android.graphics.drawable;

public class VectorDrawable extends android.graphics.drawable.Drawable {
    private static final java.lang.String LOGTAG = null;
    private static final java.lang.String SHAPE_CLIP_PATH = "clip-path";
    private static final java.lang.String SHAPE_GROUP = "group";
    private static final java.lang.String SHAPE_PATH = "path";
    private static final java.lang.String SHAPE_VECTOR = "vector";
    private android.graphics.drawable.VectorDrawable.VectorDrawableState mVectorState;
    private android.graphics.PorterDuffColorFilter mTintFilter;
    private android.graphics.BlendModeColorFilter mBlendModeColorFilter;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mMutated;
    private int mTargetDensity;
    private int mDpiScaledWidth;
    private int mDpiScaledHeight;
    private android.graphics.Insets mDpiScaledInsets;
    private boolean mDpiScaledDirty;
    private final android.graphics.Rect mTmpBounds = null;
    public VectorDrawable() { super(); }
    private VectorDrawable(android.graphics.drawable.VectorDrawable.VectorDrawableState p0, android.content.res.Resources p1) { super(); }
    private void updateLocalState(android.content.res.Resources p0) {}
    public android.graphics.drawable.Drawable mutate() { return null; }
    public void clearMutated() {}
    java.lang.Object getTargetByName(java.lang.String p0) { return null; }
    public android.graphics.drawable.Drawable.ConstantState getConstantState() { return null; }
    public void draw(android.graphics.Canvas p0) {}
    public int getAlpha() { return 0; }
    public void setAlpha(int p0) {}
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setTintList(android.content.res.ColorStateList p0) {}
    public void setTintBlendMode(android.graphics.BlendMode p0) {}
    public boolean isStateful() { return false; }
    public boolean hasFocusStateSpecified() { return false; }
    protected boolean onStateChange(int[] p0) { return false; }
    private void updateColorFilters(android.graphics.BlendMode p0, android.content.res.ColorStateList p1) {}
    public int getOpacity() { return 0; }
    public int getIntrinsicWidth() { return 0; }
    public int getIntrinsicHeight() { return 0; }
    public android.graphics.Insets getOpticalInsets() { return null; }
    void computeVectorSize() {}
    public boolean canApplyTheme() { return false; }
    public void applyTheme(android.content.res.Resources.Theme p0) {}
    public float getPixelSize() { return 0.0f; }
    public static android.graphics.drawable.VectorDrawable create(android.content.res.Resources p0, int p1) { return null; }
    public void inflate(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    private void updateStateFromTypedArray(android.content.res.TypedArray p0) throws org.xmlpull.v1.XmlPullParserException {}
    private void inflateChildElements(android.content.res.Resources p0, org.xmlpull.v1.XmlPullParser p1, android.util.AttributeSet p2, android.content.res.Resources.Theme p3) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public int getChangingConfigurations() { return 0; }
    void setAllowCaching(boolean p0) {}
    private boolean needMirroring() { return false; }
    public void setAutoMirrored(boolean p0) {}
    public boolean isAutoMirrored() { return false; }
    public long getNativeTree() { return 0L; }
    public void setAntiAlias(boolean p0) {}
    private static native int nDraw(long p0, long p1, long p2, android.graphics.Rect p3, boolean p4, boolean p5);
    private static native boolean nGetFullPathProperties(long p0, byte[] p1, int p2);
    private static native void nSetName(long p0, java.lang.String p1);
    private static native boolean nGetGroupProperties(long p0, float[] p1, int p2);
    private static native void nSetPathString(long p0, java.lang.String p1, int p2);
    private static native long nCreateTree(long p0);
    private static native long nCreateTreeFromCopy(long p0, long p1);
    private static native void nSetRendererViewportSize(long p0, float p1, float p2);
    private static native boolean nSetRootAlpha(long p0, float p1);
    private static native float nGetRootAlpha(long p0);
    private static native void nSetAntiAlias(long p0, boolean p1);
    private static native void nSetAllowCaching(long p0, boolean p1);
    private static native long nCreateFullPath();
    private static native long nCreateFullPath(long p0);
    private static native void nUpdateFullPathProperties(long p0, float p1, int p2, float p3, int p4, float p5, float p6, float p7, float p8, float p9, int p10, int p11, int p12);
    private static native void nUpdateFullPathFillGradient(long p0, long p1);
    private static native void nUpdateFullPathStrokeGradient(long p0, long p1);
    private static native long nCreateClipPath();
    private static native long nCreateClipPath(long p0);
    private static native long nCreateGroup();
    private static native long nCreateGroup(long p0);
    private static native void nUpdateGroupProperties(long p0, float p1, float p2, float p3, float p4, float p5, float p6, float p7);
    private static native void nAddChild(long p0, long p1);
    private static native float nGetRotation(long p0);
    private static native void nSetRotation(long p0, float p1);
    private static native float nGetPivotX(long p0);
    private static native void nSetPivotX(long p0, float p1);
    private static native float nGetPivotY(long p0);
    private static native void nSetPivotY(long p0, float p1);
    private static native float nGetScaleX(long p0);
    private static native void nSetScaleX(long p0, float p1);
    private static native float nGetScaleY(long p0);
    private static native void nSetScaleY(long p0, float p1);
    private static native float nGetTranslateX(long p0);
    private static native void nSetTranslateX(long p0, float p1);
    private static native float nGetTranslateY(long p0);
    private static native void nSetTranslateY(long p0, float p1);
    private static native void nSetPathData(long p0, long p1);
    private static native float nGetStrokeWidth(long p0);
    private static native void nSetStrokeWidth(long p0, float p1);
    private static native int nGetStrokeColor(long p0);
    private static native void nSetStrokeColor(long p0, int p1);
    private static native float nGetStrokeAlpha(long p0);
    private static native void nSetStrokeAlpha(long p0, float p1);
    private static native int nGetFillColor(long p0);
    private static native void nSetFillColor(long p0, int p1);
    private static native float nGetFillAlpha(long p0);
    private static native void nSetFillAlpha(long p0, float p1);
    private static native float nGetTrimPathStart(long p0);
    private static native void nSetTrimPathStart(long p0, float p1);
    private static native float nGetTrimPathEnd(long p0);
    private static native void nSetTrimPathEnd(long p0, float p1);
    private static native float nGetTrimPathOffset(long p0);
    private static native void nSetTrimPathOffset(long p0, float p1);

    private static class VClipPath extends android.graphics.drawable.VectorDrawable.VPath {
        private final long mNativePtr = 0L;
        private static final int NATIVE_ALLOCATION_SIZE = 120;
        public VClipPath() { super(); }
        public VClipPath(android.graphics.drawable.VectorDrawable.VClipPath p0) { super(); }
        public long getNativePtr() { return 0L; }
        public void inflate(android.content.res.Resources p0, android.util.AttributeSet p1, android.content.res.Resources.Theme p2) {}
        public boolean canApplyTheme() { return false; }
        public void applyTheme(android.content.res.Resources.Theme p0) {}
        public boolean onStateChange(int[] p0) { return false; }
        public boolean isStateful() { return false; }
        public boolean hasFocusStateSpecified() { return false; }
        int getNativeSize() { return 0; }
        private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
    }

    static class VFullPath extends android.graphics.drawable.VectorDrawable.VPath {
        private static final int STROKE_WIDTH_INDEX = 0;
        private static final int STROKE_COLOR_INDEX = 1;
        private static final int STROKE_ALPHA_INDEX = 2;
        private static final int FILL_COLOR_INDEX = 3;
        private static final int FILL_ALPHA_INDEX = 4;
        private static final int TRIM_PATH_START_INDEX = 5;
        private static final int TRIM_PATH_END_INDEX = 6;
        private static final int TRIM_PATH_OFFSET_INDEX = 7;
        private static final int STROKE_LINE_CAP_INDEX = 8;
        private static final int STROKE_LINE_JOIN_INDEX = 9;
        private static final int STROKE_MITER_LIMIT_INDEX = 10;
        private static final int FILL_TYPE_INDEX = 11;
        private static final int TOTAL_PROPERTY_COUNT = 12;
        private static final int NATIVE_ALLOCATION_SIZE = 264;
        private static final java.util.HashMap<java.lang.String, java.lang.Integer> sPropertyIndexMap = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Float> STROKE_WIDTH = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Integer> STROKE_COLOR = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Float> STROKE_ALPHA = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Integer> FILL_COLOR = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Float> FILL_ALPHA = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Float> TRIM_PATH_START = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Float> TRIM_PATH_END = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VFullPath, java.lang.Float> TRIM_PATH_OFFSET = null;
        private static final java.util.HashMap<java.lang.String, android.util.Property> sPropertyMap = null;
        private byte[] mPropertyData;
        private int[] mThemeAttrs;
        android.content.res.ComplexColor mStrokeColors;
        android.content.res.ComplexColor mFillColors;
        private final long mNativePtr = 0L;
        public VFullPath() { super(); }
        public VFullPath(android.graphics.drawable.VectorDrawable.VFullPath p0) { super(); }
        android.util.Property getProperty(java.lang.String p0) { return null; }
        int getPropertyIndex(java.lang.String p0) { return 0; }
        public boolean onStateChange(int[] p0) { return false; }
        public boolean isStateful() { return false; }
        public boolean hasFocusStateSpecified() { return false; }
        int getNativeSize() { return 0; }
        public long getNativePtr() { return 0L; }
        public void inflate(android.content.res.Resources p0, android.util.AttributeSet p1, android.content.res.Resources.Theme p2) {}
        private void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
        public boolean canApplyTheme() { return false; }
        public void applyTheme(android.content.res.Resources.Theme p0) {}
        private boolean canComplexColorApplyTheme(android.content.res.ComplexColor p0) { return false; }
        int getStrokeColor() { return 0; }
        void setStrokeColor(int p0) {}
        float getStrokeWidth() { return 0.0f; }
        void setStrokeWidth(float p0) {}
        float getStrokeAlpha() { return 0.0f; }
        void setStrokeAlpha(float p0) {}
        int getFillColor() { return 0; }
        void setFillColor(int p0) {}
        float getFillAlpha() { return 0.0f; }
        void setFillAlpha(float p0) {}
        float getTrimPathStart() { return 0.0f; }
        void setTrimPathStart(float p0) {}
        float getTrimPathEnd() { return 0.0f; }
        void setTrimPathEnd(float p0) {}
        float getTrimPathOffset() { return 0.0f; }
        void setTrimPathOffset(float p0) {}
    }

    static class VGroup extends android.graphics.drawable.VectorDrawable.VObject {
        private static final int ROTATION_INDEX = 0;
        private static final int PIVOT_X_INDEX = 1;
        private static final int PIVOT_Y_INDEX = 2;
        private static final int SCALE_X_INDEX = 3;
        private static final int SCALE_Y_INDEX = 4;
        private static final int TRANSLATE_X_INDEX = 5;
        private static final int TRANSLATE_Y_INDEX = 6;
        private static final int TRANSFORM_PROPERTY_COUNT = 7;
        private static final int NATIVE_ALLOCATION_SIZE = 100;
        private static final java.util.HashMap<java.lang.String, java.lang.Integer> sPropertyIndexMap = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VGroup, java.lang.Float> TRANSLATE_X = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VGroup, java.lang.Float> TRANSLATE_Y = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VGroup, java.lang.Float> SCALE_X = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VGroup, java.lang.Float> SCALE_Y = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VGroup, java.lang.Float> PIVOT_X = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VGroup, java.lang.Float> PIVOT_Y = null;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VGroup, java.lang.Float> ROTATION = null;
        private static final java.util.HashMap<java.lang.String, android.util.Property> sPropertyMap = null;
        private float[] mTransform;
        private final java.util.ArrayList<android.graphics.drawable.VectorDrawable.VObject> mChildren = null;
        private boolean mIsStateful;
        private int mChangingConfigurations;
        private int[] mThemeAttrs;
        private java.lang.String mGroupName;
        private final long mNativePtr = 0L;
        static int getPropertyIndex(java.lang.String p0) { return 0; }
        public VGroup(android.graphics.drawable.VectorDrawable.VGroup p0, android.util.ArrayMap<java.lang.String, java.lang.Object> p1) { super(); }
        public VGroup() { super(); }
        android.util.Property getProperty(java.lang.String p0) { return null; }
        public java.lang.String getGroupName() { return null; }
        public void addChild(android.graphics.drawable.VectorDrawable.VObject p0) {}
        public void setTree(com.android.internal.util.VirtualRefBasePtr p0) {}
        public long getNativePtr() { return 0L; }
        public void inflate(android.content.res.Resources p0, android.util.AttributeSet p1, android.content.res.Resources.Theme p2) {}
        void updateStateFromTypedArray(android.content.res.TypedArray p0) {}
        public boolean onStateChange(int[] p0) { return false; }
        public boolean isStateful() { return false; }
        public boolean hasFocusStateSpecified() { return false; }
        int getNativeSize() { return 0; }
        public boolean canApplyTheme() { return false; }
        public void applyTheme(android.content.res.Resources.Theme p0) {}
        public float getRotation() { return 0.0f; }
        public void setRotation(float p0) {}
        public float getPivotX() { return 0.0f; }
        public void setPivotX(float p0) {}
        public float getPivotY() { return 0.0f; }
        public void setPivotY(float p0) {}
        public float getScaleX() { return 0.0f; }
        public void setScaleX(float p0) {}
        public float getScaleY() { return 0.0f; }
        public void setScaleY(float p0) {}
        public float getTranslateX() { return 0.0f; }
        public void setTranslateX(float p0) {}
        public float getTranslateY() { return 0.0f; }
        public void setTranslateY(float p0) {}
    }

    static abstract class VObject {
        com.android.internal.util.VirtualRefBasePtr mTreePtr;
        VObject() {}
        boolean isTreeValid() { return false; }
        void setTree(com.android.internal.util.VirtualRefBasePtr p0) {}
        abstract long getNativePtr();
        abstract void inflate(android.content.res.Resources p0, android.util.AttributeSet p1, android.content.res.Resources.Theme p2);
        abstract boolean canApplyTheme();
        abstract void applyTheme(android.content.res.Resources.Theme p0);
        abstract boolean onStateChange(int[] p0);
        abstract boolean isStateful();
        abstract boolean hasFocusStateSpecified();
        abstract int getNativeSize();
        abstract android.util.Property getProperty(java.lang.String p0);
    }

    static abstract class VPath extends android.graphics.drawable.VectorDrawable.VObject {
        protected android.util.PathParser.PathData mPathData;
        java.lang.String mPathName;
        int mChangingConfigurations;
        private static final android.util.Property<android.graphics.drawable.VectorDrawable.VPath, android.util.PathParser.PathData> PATH_DATA = null;
        android.util.Property getProperty(java.lang.String p0) { return null; }
        public VPath() { super(); }
        public VPath(android.graphics.drawable.VectorDrawable.VPath p0) { super(); }
        public java.lang.String getPathName() { return null; }
        public android.util.PathParser.PathData getPathData() { return null; }
        public void setPathData(android.util.PathParser.PathData p0) {}
    }

    static class VectorDrawableState extends android.graphics.drawable.Drawable.ConstantState {
        int[] mThemeAttrs;
        int mChangingConfigurations;
        android.content.res.ColorStateList mTint;
        android.graphics.BlendMode mBlendMode;
        boolean mAutoMirrored;
        int mBaseWidth;
        int mBaseHeight;
        float mViewportWidth;
        float mViewportHeight;
        android.graphics.Insets mOpticalInsets;
        java.lang.String mRootName;
        android.graphics.drawable.VectorDrawable.VGroup mRootGroup;
        com.android.internal.util.VirtualRefBasePtr mNativeTree;
        int mDensity;
        final android.util.ArrayMap<java.lang.String, java.lang.Object> mVGTargetsMap = null;
        int[] mCachedThemeAttrs;
        android.content.res.ColorStateList mCachedTint;
        android.graphics.BlendMode mCachedBlendMode;
        boolean mCachedAutoMirrored;
        boolean mCacheDirty;
        int mLastSWCachePixelCount;
        int mLastHWCachePixelCount;
        static final android.util.Property<android.graphics.drawable.VectorDrawable.VectorDrawableState, java.lang.Float> ALPHA = null;
        private int mAllocationOfAllNodes;
        private static final int NATIVE_ALLOCATION_SIZE = 316;
        android.util.Property getProperty(java.lang.String p0) { return null; }
        public VectorDrawableState(android.graphics.drawable.VectorDrawable.VectorDrawableState p0) { super(); }
        private void createNativeTree(android.graphics.drawable.VectorDrawable.VGroup p0) {}
        private void createNativeTreeFromCopy(android.graphics.drawable.VectorDrawable.VectorDrawableState p0, android.graphics.drawable.VectorDrawable.VGroup p1) {}
        void onTreeConstructionFinished() {}
        long getNativeRenderer() { return 0L; }
        public boolean canReuseCache() { return false; }
        public void updateCacheStates() {}
        public void applyTheme(android.content.res.Resources.Theme p0) {}
        public boolean canApplyTheme() { return false; }
        public android.graphics.drawable.Drawable newDrawable() { return null; }
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources p0) { return null; }
        public int getChangingConfigurations() { return 0; }
        public boolean isStateful() { return false; }
        public boolean hasFocusStateSpecified() { return false; }
        void setViewportSize(float p0, float p1) {}
        public final boolean setDensity(int p0) { return false; }
        private void applyDensityScaling(int p0, int p1) {}
        public boolean onStateChange(int[] p0) { return false; }
        public void finalize() throws java.lang.Throwable {}
        public boolean setAlpha(float p0) { return false; }
        public float getAlpha() { return 0.0f; }
    }
}

package android.graphics.drawable;

public class VectorDrawable extends android.graphics.drawable.Drawable {
    public VectorDrawable() { super(); }
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
    public int getChangingConfigurations() { return 0; }
    void setAllowCaching(boolean p0) {}
    public void setAutoMirrored(boolean p0) {}
    public boolean isAutoMirrored() { return false; }
    public long getNativeTree() { return 0L; }
    public void setAntiAlias(boolean p0) {}

    private static class VClipPath extends android.graphics.drawable.VectorDrawable.VPath {
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
        android.util.Property getProperty(java.lang.String p0) { return null; }
        public VectorDrawableState(android.graphics.drawable.VectorDrawable.VectorDrawableState p0) { super(); }
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
        public boolean onStateChange(int[] p0) { return false; }
        public void finalize() throws java.lang.Throwable {}
        public boolean setAlpha(float p0) { return false; }
        public float getAlpha() { return 0.0f; }
    }

    static class VFullPath extends android.graphics.drawable.VectorDrawable.VPath {
        android.content.res.ComplexColor mStrokeColors;
        android.content.res.ComplexColor mFillColors;
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
        public boolean canApplyTheme() { return false; }
        public void applyTheme(android.content.res.Resources.Theme p0) {}
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
        android.util.Property getProperty(java.lang.String p0) { return null; }
        public VPath() { super(); }
        public VPath(android.graphics.drawable.VectorDrawable.VPath p0) { super(); }
        public java.lang.String getPathName() { return null; }
        public android.util.PathParser.PathData getPathData() { return null; }
        public void setPathData(android.util.PathParser.PathData p0) {}
    }
}

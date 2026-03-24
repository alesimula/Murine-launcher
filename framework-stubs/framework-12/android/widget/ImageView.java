package android.widget;

@android.widget.RemoteViews.RemoteView
public class ImageView extends android.view.View {
    private static final java.lang.String LOG_TAG = "ImageView";
    private android.net.Uri mUri;
    private int mResource;
    private android.graphics.Matrix mMatrix;
    private android.widget.ImageView.ScaleType mScaleType;
    private boolean mHaveFrame;
    private boolean mAdjustViewBounds;
    private int mMaxWidth;
    private int mMaxHeight;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mHasColorFilter;
    private android.graphics.Xfermode mXfermode;
    private boolean mHasXfermode;
    private int mAlpha;
    private boolean mHasAlpha;
    private final int mViewAlphaScale = 0;
    private android.graphics.drawable.Drawable mDrawable;
    private android.graphics.drawable.BitmapDrawable mRecycleableBitmapDrawable;
    private android.content.res.ColorStateList mDrawableTintList;
    private android.graphics.BlendMode mDrawableBlendMode;
    private boolean mHasDrawableTint;
    private boolean mHasDrawableBlendMode;
    private int[] mState;
    private boolean mMergeState;
    private int mLevel;
    private int mDrawableWidth;
    private int mDrawableHeight;
    private android.graphics.Matrix mDrawMatrix;
    private final android.graphics.RectF mTempSrc = null;
    private final android.graphics.RectF mTempDst = null;
    private boolean mCropToPadding;
    private int mBaseline;
    private boolean mBaselineAlignBottom;
    private static boolean sCompatDone;
    private static boolean sCompatAdjustViewBounds;
    private static boolean sCompatUseCorrectStreamDensity;
    private static boolean sCompatDrawableVisibilityDispatch;
    private static final android.widget.ImageView.ScaleType[] sScaleTypeArray = null;
    private static final android.graphics.Matrix.ScaleToFit[] sS2FArray = null;
    public ImageView(android.content.Context p0) { super((android.content.Context)null); }
    public ImageView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ImageView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ImageView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void initImageView() {}
    protected boolean verifyDrawable(android.graphics.drawable.Drawable p0) { return false; }
    public void jumpDrawablesToCurrentState() {}
    public void invalidateDrawable(android.graphics.drawable.Drawable p0) {}
    public boolean hasOverlappingRendering() { return false; }
    public void onPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) {}
    public boolean getAdjustViewBounds() { return false; }
    @android.view.RemotableViewMethod
    public void setAdjustViewBounds(boolean p0) {}
    public int getMaxWidth() { return 0; }
    @android.view.RemotableViewMethod
    public void setMaxWidth(int p0) {}
    public int getMaxHeight() { return 0; }
    @android.view.RemotableViewMethod
    public void setMaxHeight(int p0) {}
    public android.graphics.drawable.Drawable getDrawable() { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setImageResourceAsync")
    public void setImageResource(int p0) {}
    public java.lang.Runnable setImageResourceAsync(int p0) { return null; }
    @android.view.RemotableViewMethod(asyncImpl="setImageURIAsync")
    public void setImageURI(android.net.Uri p0) {}
    public java.lang.Runnable setImageURIAsync(android.net.Uri p0) { return null; }
    public void setImageDrawable(android.graphics.drawable.Drawable p0) {}
    @android.view.RemotableViewMethod(asyncImpl="setImageIconAsync")
    public void setImageIcon(android.graphics.drawable.Icon p0) {}
    public java.lang.Runnable setImageIconAsync(android.graphics.drawable.Icon p0) { return null; }
    @android.view.RemotableViewMethod
    public void setImageTintList(android.content.res.ColorStateList p0) {}
    public android.content.res.ColorStateList getImageTintList() { return null; }
    public void setImageTintMode(android.graphics.PorterDuff.Mode p0) {}
    @android.view.RemotableViewMethod
    public void setImageTintBlendMode(android.graphics.BlendMode p0) {}
    public android.graphics.PorterDuff.Mode getImageTintMode() { return null; }
    public android.graphics.BlendMode getImageTintBlendMode() { return null; }
    private void applyImageTint() {}
    @android.view.RemotableViewMethod
    public void setImageBitmap(android.graphics.Bitmap p0) {}
    public void setImageState(int[] p0, boolean p1) {}
    public void setSelected(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setImageLevel(int p0) {}
    public void setScaleType(android.widget.ImageView.ScaleType p0) {}
    public android.widget.ImageView.ScaleType getScaleType() { return null; }
    public android.graphics.Matrix getImageMatrix() { return null; }
    public void setImageMatrix(android.graphics.Matrix p0) {}
    public boolean getCropToPadding() { return false; }
    public void setCropToPadding(boolean p0) {}
    private void resolveUri() {}
    private android.graphics.drawable.Drawable getDrawableFromUri(android.net.Uri p0) { return null; }
    public int[] onCreateDrawableState(int p0) { return null; }
    private void updateDrawable(android.graphics.drawable.Drawable p0) {}
    private void resizeFromDrawable() {}
    public void onRtlPropertiesChanged(int p0) {}
    private static android.graphics.Matrix.ScaleToFit scaleTypeToScaleToFit(android.widget.ImageView.ScaleType p0) { return null; }
    protected void onMeasure(int p0, int p1) {}
    private int resolveAdjustedSize(int p0, int p1, int p2) { return 0; }
    protected boolean setFrame(int p0, int p1, int p2, int p3) { return false; }
    private void configureBounds() {}
    protected void drawableStateChanged() {}
    public void drawableHotspotChanged(float p0, float p1) {}
    public void animateTransform(android.graphics.Matrix p0) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    @android.view.ViewDebug.ExportedProperty(category="layout")
    public int getBaseline() { return 0; }
    public void setBaseline(int p0) {}
    public void setBaselineAlignBottom(boolean p0) {}
    public boolean getBaselineAlignBottom() { return false; }
    public final void setColorFilter(int p0, android.graphics.PorterDuff.Mode p1) {}
    @android.view.RemotableViewMethod
    public final void setColorFilter(int p0) {}
    public final void clearColorFilter() {}
    public final void setXfermode(android.graphics.Xfermode p0) {}
    public android.graphics.ColorFilter getColorFilter() { return null; }
    public void setColorFilter(android.graphics.ColorFilter p0) {}
    public int getImageAlpha() { return 0; }
    @android.view.RemotableViewMethod
    public void setImageAlpha(int p0) {}
    @java.lang.Deprecated
    @android.view.RemotableViewMethod
    public void setAlpha(int p0) {}
    private void applyXfermode() {}
    private void applyColorFilter() {}
    private void applyAlpha() {}
    public boolean isOpaque() { return false; }
    private boolean isFilledByImage() { return false; }
    public void onVisibilityAggregated(boolean p0) {}
    @android.view.RemotableViewMethod
    public void setVisibility(int p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public boolean isDefaultFocusHighlightNeeded(android.graphics.drawable.Drawable p0, android.graphics.drawable.Drawable p1) { return false; }

    private class ImageDrawableCallback implements java.lang.Runnable {
        private final android.graphics.drawable.Drawable drawable = null;
        private final android.net.Uri uri = null;
        private final int resource = 0;
        ImageDrawableCallback(android.widget.ImageView p0, android.graphics.drawable.Drawable p1, android.net.Uri p2, int p3) {}
        public void run() {}
    }

    public static enum ScaleType {
        MATRIX,
        FIT_XY,
        FIT_START,
        FIT_CENTER,
        FIT_END,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE;
        final int nativeInt = 0;
        private ScaleType() {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.widget.ImageView> {
        private boolean mPropertiesMapped;
        private int mAdjustViewBoundsId;
        private int mBaselineId;
        private int mBaselineAlignBottomId;
        private int mBlendModeId;
        private int mCropToPaddingId;
        private int mMaxHeightId;
        private int mMaxWidthId;
        private int mScaleTypeId;
        private int mSrcId;
        private int mTintId;
        private int mTintModeId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.widget.ImageView p0, android.view.inspector.PropertyReader p1) {}
    }
}

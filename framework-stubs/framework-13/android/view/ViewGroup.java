package android.view;

public abstract class ViewGroup extends android.view.View implements android.view.ViewParent, android.view.ViewManager {
    protected java.util.ArrayList<android.view.View> mDisappearingChildren;
    protected android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    android.view.View mFocusedInCluster;
    android.graphics.RectF mInvalidateRegion;
    android.view.animation.Transformation mInvalidationTransformation;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="CLIP_CHILDREN"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="CLIP_TO_PADDING"), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="PADDING_NOT_NULL")}, formatToHexString=true)
    protected int mGroupFlags;
    static final int FLAG_CLIP_CHILDREN = 1;
    static final int FLAG_INVALIDATE_REQUIRED = 4;
    static final int FLAG_ANIMATION_DONE = 16;
    static final int FLAG_OPTIMIZE_INVALIDATE = 128;
    static final int FLAG_CLEAR_TRANSFORMATION = 256;
    protected static final int FLAG_USE_CHILD_DRAWING_ORDER = 1024;
    protected static final int FLAG_SUPPORT_STATIC_TRANSFORMATIONS = 2048;
    public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
    public static final int FOCUS_AFTER_DESCENDANTS = 262144;
    public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
    protected static final int FLAG_DISALLOW_INTERCEPT = 524288;
    static final int FLAG_IS_TRANSITION_GROUP = 16777216;
    static final int FLAG_IS_TRANSITION_GROUP_SET = 33554432;
    static final int FLAG_TOUCHSCREEN_BLOCKS_FOCUS = 67108864;
    protected int mPersistentDrawingCache;
    @java.lang.Deprecated
    public static final int PERSISTENT_NO_CACHE = 0;
    @java.lang.Deprecated
    public static final int PERSISTENT_ANIMATION_CACHE = 1;
    @java.lang.Deprecated
    public static final int PERSISTENT_SCROLLING_CACHE = 2;
    @java.lang.Deprecated
    public static final int PERSISTENT_ALL_CACHES = 3;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    public static int LAYOUT_MODE_DEFAULT;
    protected static final int CLIP_TO_PADDING_MASK = 34;
    boolean mSuppressLayout;
    android.graphics.Paint mCachePaint;
    int mChildUnhandledKeyListeners;
    public ViewGroup(android.content.Context p0) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    @android.view.ViewDebug.ExportedProperty(category="focus", mapping={@android.view.ViewDebug.IntToString(from=131072, to="FOCUS_BEFORE_DESCENDANTS"), @android.view.ViewDebug.IntToString(from=262144, to="FOCUS_AFTER_DESCENDANTS"), @android.view.ViewDebug.IntToString(from=393216, to="FOCUS_BLOCK_DESCENDANTS")})
    public int getDescendantFocusability() { return 0; }
    public void setDescendantFocusability(int p0) {}
    void handleFocusGainInternal(int p0, android.graphics.Rect p1) {}
    public void requestChildFocus(android.view.View p0, android.view.View p1) {}
    void setDefaultFocus(android.view.View p0) {}
    void clearDefaultFocus(android.view.View p0) {}
    boolean hasDefaultFocus() { return false; }
    void clearFocusedInCluster(android.view.View p0) {}
    void clearFocusedInCluster() {}
    public void focusableViewAvailable(android.view.View p0) {}
    public boolean showContextMenuForChild(android.view.View p0) { return false; }
    public final boolean isShowingContextMenuWithCoords() { return false; }
    public boolean showContextMenuForChild(android.view.View p0, float p1, float p2) { return false; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1) { return null; }
    public android.view.ActionMode startActionModeForChild(android.view.View p0, android.view.ActionMode.Callback p1, int p2) { return null; }
    public boolean dispatchActivityResult(java.lang.String p0, int p1, int p2, android.content.Intent p3) { return false; }
    public android.view.View focusSearch(android.view.View p0, int p1) { return null; }
    public boolean requestChildRectangleOnScreen(android.view.View p0, android.graphics.Rect p1, boolean p2) { return false; }
    public boolean requestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public boolean onRequestSendAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public boolean onRequestSendAccessibilityEventInternal(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) { return false; }
    public void childHasTransientStateChanged(android.view.View p0, boolean p1) {}
    public boolean hasTransientState() { return false; }
    public boolean dispatchUnhandledMove(android.view.View p0, int p1) { return false; }
    public void clearChildFocus(android.view.View p0) {}
    public void clearFocus() {}
    void unFocus(android.view.View p0) {}
    public android.view.View getFocusedChild() { return null; }
    android.view.View getDeepestFocusedChild() { return null; }
    public boolean hasFocus() { return false; }
    public android.view.View findFocus() { return null; }
    boolean hasFocusable(boolean p0, boolean p1) { return false; }
    boolean hasFocusableChild(boolean p0) { return false; }
    public void addFocusables(java.util.ArrayList<android.view.View> p0, int p1, int p2) {}
    public void addKeyboardNavigationClusters(java.util.Collection<android.view.View> p0, int p1) {}
    public void setTouchscreenBlocksFocus(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="focus")
    public boolean getTouchscreenBlocksFocus() { return false; }
    boolean shouldBlockFocusForTouchscreen() { return false; }
    public void findViewsWithText(java.util.ArrayList<android.view.View> p0, java.lang.CharSequence p1, int p2) {}
    public android.view.View findViewByAccessibilityIdTraversal(int p0) { return null; }
    public android.view.View findViewByAutofillIdTraversal(int p0) { return null; }
    public void dispatchWindowFocusChanged(boolean p0) {}
    public void addTouchables(java.util.ArrayList<android.view.View> p0) {}
    public void makeOptionalFitsSystemWindows() {}
    public void makeFrameworkOptionalFitsSystemWindows() {}
    public void dispatchDisplayHint(int p0) {}
    protected void onChildVisibilityChanged(android.view.View p0, int p1, int p2) {}
    protected void dispatchVisibilityChanged(android.view.View p0, int p1) {}
    public void dispatchWindowVisibilityChanged(int p0) {}
    boolean dispatchVisibilityAggregated(boolean p0) { return false; }
    public void dispatchConfigurationChanged(android.content.res.Configuration p0) {}
    public void recomputeViewAttributes(android.view.View p0) {}
    void dispatchCollectViewAttributes(android.view.View.AttachInfo p0, int p1) {}
    public void bringChildToFront(android.view.View p0) {}
    boolean dispatchDragEnterExitInPreN(android.view.DragEvent p0) { return false; }
    public boolean dispatchDragEvent(android.view.DragEvent p0) { return false; }
    android.view.View findFrontmostDroppableChildAt(float p0, float p1, android.graphics.PointF p2) { return null; }
    boolean notifyChildOfDragStart(android.view.View p0) { return false; }
    @java.lang.Deprecated
    public void dispatchWindowSystemUiVisiblityChanged(int p0) {}
    @java.lang.Deprecated
    public void dispatchSystemUiVisibilityChanged(int p0) {}
    boolean updateLocalSystemUiVisibility(int p0, int p1) { return false; }
    public boolean dispatchKeyEventPreIme(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent p0) { return false; }
    public boolean dispatchTrackballEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchCapturedPointerEvent(android.view.MotionEvent p0) { return false; }
    public void dispatchPointerCaptureChanged(boolean p0) {}
    public android.view.PointerIcon onResolvePointerIcon(android.view.MotionEvent p0, int p1) { return null; }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    boolean dispatchTooltipHoverEvent(android.view.MotionEvent p0) { return false; }
    protected boolean hasHoveredChild() { return false; }
    protected boolean pointInHoveredChild(android.view.MotionEvent p0) { return false; }
    public void addChildrenForAccessibility(java.util.ArrayList<android.view.View> p0) {}
    public boolean onInterceptHoverEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchGenericPointerEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent p0) { return false; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public java.util.ArrayList<android.view.View> buildTouchDispatchChildList() { return null; }
    protected boolean isTransformedTouchPointInView(float p0, float p1, android.view.View p2, android.graphics.PointF p3) { return false; }
    public void transformPointToViewLocal(float[] p0, android.view.View p1) {}
    public void setMotionEventSplittingEnabled(boolean p0) {}
    public boolean isMotionEventSplittingEnabled() { return false; }
    public boolean isTransitionGroup() { return false; }
    public void setTransitionGroup(boolean p0) {}
    public void requestDisallowInterceptTouchEvent(boolean p0) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean requestFocus(int p0, android.graphics.Rect p1) { return false; }
    protected boolean onRequestFocusInDescendants(int p0, android.graphics.Rect p1) { return false; }
    public boolean restoreDefaultFocus() { return false; }
    public boolean restoreFocusInCluster(int p0) { return false; }
    public boolean restoreFocusNotInCluster() { return false; }
    public void dispatchStartTemporaryDetach() {}
    public void dispatchFinishTemporaryDetach() {}
    void dispatchAttachedToWindow(android.view.View.AttachInfo p0, int p1) {}
    void dispatchScreenStateChanged(int p0) {}
    void dispatchMovedToDisplay(android.view.Display p0, android.content.res.Configuration p1) {}
    public boolean dispatchPopulateAccessibilityEventInternal(android.view.accessibility.AccessibilityEvent p0) { return false; }
    public void dispatchProvideStructure(android.view.ViewStructure p0) {}
    public void dispatchProvideAutofillStructure(android.view.ViewStructure p0, int p1) {}
    public void dispatchProvideContentCaptureStructure() {}
    public void resetSubtreeAutofillIds() {}
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void addExtraDataToAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0, java.lang.String p1, android.os.Bundle p2) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void notifySubtreeAccessibilityStateChanged(android.view.View p0, android.view.View p1, int p2) {}
    public void notifySubtreeAccessibilityStateChangedIfNeeded() {}
    void resetSubtreeAccessibilityStateChanged() {}
    int getNumChildrenForAccessibility() { return 0; }
    public boolean onNestedPrePerformAccessibilityAction(android.view.View p0, int p1, android.os.Bundle p2) { return false; }
    void dispatchDetachedFromWindow() {}
    protected void internalSetPadding(int p0, int p1, int p2, int p3) {}
    protected void dispatchSaveInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchFreezeSelfOnly(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> p0) {}
    protected void dispatchThawSelfOnly(android.util.SparseArray<android.os.Parcelable> p0) {}
    @java.lang.Deprecated
    protected void setChildrenDrawingCacheEnabled(boolean p0) {}
    public android.graphics.Bitmap createSnapshot(android.view.ViewDebug.CanvasProvider p0, boolean p1) { return null; }
    boolean isLayoutModeOptical() { return false; }
    android.graphics.Insets computeOpticalInsets() { return null; }
    protected void onDebugDrawMargins(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    protected void onDebugDraw(android.graphics.Canvas p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public android.view.ViewGroupOverlay getOverlay() { return null; }
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    public final int getChildDrawingOrder(int p0) { return 0; }
    java.util.ArrayList<android.view.View> buildOrderedChildList() { return null; }
    protected void dispatchGetDisplayList() {}
    protected boolean drawChild(android.graphics.Canvas p0, android.view.View p1, long p2) { return false; }
    void getScrollIndicatorBounds(android.graphics.Rect p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean getClipChildren() { return false; }
    public void setClipChildren(boolean p0) {}
    public void setClipToPadding(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    public boolean getClipToPadding() { return false; }
    public void dispatchSetSelected(boolean p0) {}
    public void dispatchSetActivated(boolean p0) {}
    protected void dispatchSetPressed(boolean p0) {}
    public void dispatchDrawableHotspotChanged(float p0, float p1) {}
    void dispatchCancelPendingInputEvents() {}
    protected void setStaticTransformationsEnabled(boolean p0) {}
    protected boolean getChildStaticTransformation(android.view.View p0, android.view.animation.Transformation p1) { return false; }
    android.view.animation.Transformation getChildTransformation() { return null; }
    protected <T extends android.view.View> T findViewTraversal(int p0) { return null; }
    protected <T extends android.view.View> T findViewWithTagTraversal(java.lang.Object p0) { return null; }
    protected <T extends android.view.View> T findViewByPredicateTraversal(java.util.function.Predicate<android.view.View> p0, android.view.View p1) { return null; }
    public void addTransientView(android.view.View p0, int p1) {}
    public void removeTransientView(android.view.View p0) {}
    public int getTransientViewCount() { return 0; }
    public int getTransientViewIndex(int p0) { return 0; }
    public android.view.View getTransientView(int p0) { return null; }
    public void addView(android.view.View p0) {}
    public void addView(android.view.View p0, int p1) {}
    public void addView(android.view.View p0, int p1, int p2) {}
    public void addView(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void updateViewLayout(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams p0) { return false; }
    public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener p0) {}
    void dispatchViewAdded(android.view.View p0) {}
    public void onViewAdded(android.view.View p0) {}
    void dispatchViewRemoved(android.view.View p0) {}
    public void onViewRemoved(android.view.View p0) {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void destroyHardwareResources() {}
    protected boolean addViewInLayout(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) { return false; }
    protected boolean addViewInLayout(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3) { return false; }
    protected void cleanupLayoutState(android.view.View p0) {}
    protected void attachLayoutAnimationParameters(android.view.View p0, android.view.ViewGroup.LayoutParams p1, int p2, int p3) {}
    public void removeView(android.view.View p0) {}
    public void removeViewInLayout(android.view.View p0) {}
    public void removeViewsInLayout(int p0, int p1) {}
    public void removeViewAt(int p0) {}
    public void removeViews(int p0, int p1) {}
    public void setLayoutTransition(android.animation.LayoutTransition p0) {}
    public android.animation.LayoutTransition getLayoutTransition() { return null; }
    public void removeAllViews() {}
    public void removeAllViewsInLayout() {}
    protected void removeDetachedView(android.view.View p0, boolean p1) {}
    protected void attachViewToParent(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    protected void detachViewFromParent(android.view.View p0) {}
    protected void detachViewFromParent(int p0) {}
    protected void detachViewsFromParent(int p0, int p1) {}
    protected void detachAllViewsFromParent() {}
    public void onDescendantInvalidated(android.view.View p0, android.view.View p1) {}
    @java.lang.Deprecated
    public final void invalidateChild(android.view.View p0, android.graphics.Rect p1) {}
    @java.lang.Deprecated
    public android.view.ViewParent invalidateChildInParent(int[] p0, android.graphics.Rect p1) { return null; }
    public final void offsetDescendantRectToMyCoords(android.view.View p0, android.graphics.Rect p1) {}
    public final void offsetRectIntoDescendantCoords(android.view.View p0, android.graphics.Rect p1) {}
    void offsetRectBetweenParentAndChild(android.view.View p0, android.graphics.Rect p1, boolean p2, boolean p3) {}
    public void offsetChildrenTopAndBottom(int p0) {}
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2) { return false; }
    public boolean getChildVisibleRect(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2, boolean p3) { return false; }
    public final void layout(int p0, int p1, int p2, int p3) {}
    protected abstract void onLayout(boolean p0, int p1, int p2, int p3, int p4);
    protected boolean canAnimate() { return false; }
    public void startLayoutAnimation() {}
    public void scheduleLayoutAnimation() {}
    public void setLayoutAnimation(android.view.animation.LayoutAnimationController p0) {}
    public android.view.animation.LayoutAnimationController getLayoutAnimation() { return null; }
    @java.lang.Deprecated
    public boolean isAnimationCacheEnabled() { return false; }
    @java.lang.Deprecated
    public void setAnimationCacheEnabled(boolean p0) {}
    @java.lang.Deprecated
    public boolean isAlwaysDrawnWithCacheEnabled() { return false; }
    @java.lang.Deprecated
    public void setAlwaysDrawnWithCacheEnabled(boolean p0) {}
    @java.lang.Deprecated
    protected boolean isChildrenDrawnWithCacheEnabled() { return false; }
    @java.lang.Deprecated
    protected void setChildrenDrawnWithCacheEnabled(boolean p0) {}
    @android.view.ViewDebug.ExportedProperty(category="drawing")
    protected boolean isChildrenDrawingOrderEnabled() { return false; }
    protected void setChildrenDrawingOrderEnabled(boolean p0) {}
    @java.lang.Deprecated
    @android.view.ViewDebug.ExportedProperty(category="drawing", mapping={@android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=1, to="ANIMATION"), @android.view.ViewDebug.IntToString(from=2, to="SCROLLING"), @android.view.ViewDebug.IntToString(from=3, to="ALL")})
    public int getPersistentDrawingCache() { return 0; }
    @java.lang.Deprecated
    public void setPersistentDrawingCache(int p0) {}
    void invalidateInheritedLayoutMode(int p0) {}
    public int getLayoutMode() { return 0; }
    public void setLayoutMode(int p0) {}
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams p0) { return null; }
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() { return null; }
    protected void debug(int p0) {}
    public int indexOfChild(android.view.View p0) { return 0; }
    public int getChildCount() { return 0; }
    public android.view.View getChildAt(int p0) { return null; }
    protected void measureChildren(int p0, int p1) {}
    protected void measureChild(android.view.View p0, int p1, int p2) {}
    protected void measureChildWithMargins(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public static int getChildMeasureSpec(int p0, int p1, int p2) { return 0; }
    public void clearDisappearingChildren() {}
    void finishAnimatingView(android.view.View p0, android.view.animation.Animation p1) {}
    boolean isViewTransitioning(android.view.View p0) { return false; }
    public void startViewTransition(android.view.View p0) {}
    public void endViewTransition(android.view.View p0) {}
    public void suppressLayout(boolean p0) {}
    public boolean isLayoutSuppressed() { return false; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void requestTransparentRegion(android.view.View p0) {}
    public void subtractObscuredTouchableRegion(android.graphics.Region p0, android.view.View p1) {}
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    public void setWindowInsetsAnimationCallback(android.view.WindowInsetsAnimation.Callback p0) {}
    public boolean hasWindowInsetsAnimationCallback() { return false; }
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0) {}
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1) { return null; }
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1) { return null; }
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    public void dispatchScrollCaptureSearch(android.graphics.Rect p0, android.graphics.Point p1, java.util.function.Consumer<android.view.ScrollCaptureTarget> p2) {}
    public android.view.animation.Animation.AnimationListener getLayoutAnimationListener() { return null; }
    protected void drawableStateChanged() {}
    public void jumpDrawablesToCurrentState() {}
    protected int[] onCreateDrawableState(int p0) { return null; }
    public void setAddStatesFromChildren(boolean p0) {}
    public boolean addStatesFromChildren() { return false; }
    public void childDrawableStateChanged(android.view.View p0) {}
    public void setLayoutAnimationListener(android.view.animation.Animation.AnimationListener p0) {}
    public void requestTransitionStart(android.animation.LayoutTransition p0) {}
    public boolean resolveRtlPropertiesIfNeeded() { return false; }
    public boolean resolveLayoutDirection() { return false; }
    public boolean resolveTextDirection() { return false; }
    public boolean resolveTextAlignment() { return false; }
    public void resolvePadding() {}
    protected void resolveDrawables() {}
    public void resolveLayoutParams() {}
    public void resetResolvedLayoutDirection() {}
    public void resetResolvedTextDirection() {}
    public void resetResolvedTextAlignment() {}
    public void resetResolvedPadding() {}
    protected void resetResolvedDrawables() {}
    public boolean shouldDelayChildPressedState() { return false; }
    public boolean onStartNestedScroll(android.view.View p0, android.view.View p1, int p2) { return false; }
    public void onNestedScrollAccepted(android.view.View p0, android.view.View p1, int p2) {}
    public void onStopNestedScroll(android.view.View p0) {}
    public void onNestedScroll(android.view.View p0, int p1, int p2, int p3, int p4) {}
    public void onNestedPreScroll(android.view.View p0, int p1, int p2, int[] p3) {}
    public boolean onNestedFling(android.view.View p0, float p1, float p2, boolean p3) { return false; }
    public boolean onNestedPreFling(android.view.View p0, float p1, float p2) { return false; }
    public int getNestedScrollAxes() { return 0; }
    protected void onSetLayoutParams(android.view.View p0, android.view.ViewGroup.LayoutParams p1) {}
    public void captureTransitioningViews(java.util.List<android.view.View> p0) {}
    public void findNamedViews(java.util.Map<java.lang.String, android.view.View> p0) {}
    boolean hasUnhandledKeyListener() { return false; }
    void incrementChildUnhandledKeyListeners() {}
    void decrementChildUnhandledKeyListeners() {}
    android.view.View dispatchUnhandledKeyEvent(android.view.KeyEvent p0) { return null; }
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public final void onDescendantUnbufferedRequested() {}
    public void dispatchCreateViewTranslationRequest(java.util.Map<android.view.autofill.AutofillId, long[]> p0, int[] p1, android.view.translation.TranslationCapability p2, java.util.List<android.view.translation.ViewTranslationRequest> p3) {}
    public android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcherForChild(android.view.View p0, android.view.View p1) { return null; }

    static class ChildListForAccessibility {
        ChildListForAccessibility() {}
        public static android.view.ViewGroup.ChildListForAccessibility obtain(android.view.ViewGroup p0, boolean p1) { return null; }
        public void recycle() {}
        public int getChildCount() { return 0; }
        public android.view.View getChildAt(int p0) { return null; }
    }

    private static class ChildListForAutoFillOrContentCapture extends java.util.ArrayList<android.view.View> {
        public static android.view.ViewGroup.ChildListForAutoFillOrContentCapture obtain() { return null; }
        public void recycle() {}
    }

    private static final class HoverTarget {
        public android.view.View child;
        public android.view.ViewGroup.HoverTarget next;
        public static android.view.ViewGroup.HoverTarget obtain(android.view.View p0) { return null; }
        public void recycle() {}
    }

    public static class LayoutParams {
        @java.lang.Deprecated
        public static final int FILL_PARENT = -1;
        public static final int MATCH_PARENT = -1;
        public static final int WRAP_CONTENT = -2;
        @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="MATCH_PARENT"), @android.view.ViewDebug.IntToString(from=-2, to="WRAP_CONTENT")})
        public int width;
        @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="MATCH_PARENT"), @android.view.ViewDebug.IntToString(from=-2, to="WRAP_CONTENT")})
        public int height;
        public android.view.animation.LayoutAnimationController.AnimationParameters layoutAnimationParameters;
        public LayoutParams(android.content.Context p0, android.util.AttributeSet p1) {}
        public LayoutParams(int p0, int p1) {}
        public LayoutParams(android.view.ViewGroup.LayoutParams p0) {}
        LayoutParams() {}
        protected void setBaseAttributes(android.content.res.TypedArray p0, int p1, int p2) {}
        public void resolveLayoutDirection(int p0) {}
        public java.lang.String debug(java.lang.String p0) { return null; }
        public void onDebugDraw(android.view.View p0, android.graphics.Canvas p1, android.graphics.Paint p2) {}
        protected static java.lang.String sizeToString(int p0) { return null; }
        void encode(android.view.ViewHierarchyEncoder p0) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    }

    public static class MarginLayoutParams extends android.view.ViewGroup.LayoutParams {
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int leftMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int topMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int rightMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        public int bottomMargin;
        public static final int DEFAULT_MARGIN_RELATIVE = -2147483648;
        @android.view.ViewDebug.ExportedProperty(category="layout", flagMapping={@android.view.ViewDebug.FlagToString(mask=3, equals=3, name="LAYOUT_DIRECTION"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="LEFT_MARGIN_UNDEFINED_MASK"), @android.view.ViewDebug.FlagToString(mask=8, equals=8, name="RIGHT_MARGIN_UNDEFINED_MASK"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="RTL_COMPATIBILITY_MODE_MASK"), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="NEED_RESOLUTION_MASK")}, formatToHexString=true)
        byte mMarginFlags;
        public MarginLayoutParams(android.content.Context p0, android.util.AttributeSet p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public MarginLayoutParams(int p0, int p1) { super((android.view.ViewGroup.LayoutParams)null); }
        public MarginLayoutParams(android.view.ViewGroup.MarginLayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public MarginLayoutParams(android.view.ViewGroup.LayoutParams p0) { super((android.view.ViewGroup.LayoutParams)null); }
        public final void copyMarginsFrom(android.view.ViewGroup.MarginLayoutParams p0) {}
        public void setMargins(int p0, int p1, int p2, int p3) {}
        public void setMarginsRelative(int p0, int p1, int p2, int p3) {}
        public void setMarginStart(int p0) {}
        public int getMarginStart() { return 0; }
        public void setMarginEnd(int p0) {}
        public int getMarginEnd() { return 0; }
        public boolean isMarginRelative() { return false; }
        public void setLayoutDirection(int p0) {}
        public int getLayoutDirection() { return 0; }
        public void resolveLayoutDirection(int p0) {}
        public boolean isLayoutRtl() { return false; }
        public void onDebugDraw(android.view.View p0, android.graphics.Canvas p1, android.graphics.Paint p2) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    }

    public static interface OnHierarchyChangeListener {
        public void onChildViewAdded(android.view.View p0, android.view.View p1);
        public void onChildViewRemoved(android.view.View p0, android.view.View p1);
    }

    private static final class TouchTarget {
        public static final int ALL_POINTER_IDS = -1;
        public android.view.View child;
        public int pointerIdBits;
        public android.view.ViewGroup.TouchTarget next;
        public static android.view.ViewGroup.TouchTarget obtain(android.view.View p0, int p1) { return null; }
        public void recycle() {}
    }

    static class ViewLocationHolder implements java.lang.Comparable<android.view.ViewGroup.ViewLocationHolder> {
        public static final int COMPARISON_STRATEGY_STRIPE = 1;
        public static final int COMPARISON_STRATEGY_LOCATION = 2;
        public android.view.View mView;
        ViewLocationHolder() {}
        public static android.view.ViewGroup.ViewLocationHolder obtain(android.view.ViewGroup p0, android.view.View p1) { return null; }
        public static void setComparisonStrategy(int p0) {}
        public void recycle() {}
        public int compareTo(android.view.ViewGroup.ViewLocationHolder p0) { return 0; }
    }
}

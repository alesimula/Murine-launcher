package android.view;

public abstract class ViewGroup extends android.view.View implements android.view.ViewParent, android.view.ViewManager {
    private static final java.lang.String TAG = "ViewGroup";
    private static final boolean DBG = false;
    protected java.util.ArrayList<android.view.View> mDisappearingChildren;
    protected android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
    private android.view.View mFocused;
    private android.view.View mDefaultFocus;
    android.view.View mFocusedInCluster;
    private android.view.animation.Transformation mChildTransformation;
    android.graphics.RectF mInvalidateRegion;
    android.view.animation.Transformation mInvalidationTransformation;
    private android.view.View mCurrentDragChild;
    private android.view.DragEvent mCurrentDragStartEvent;
    private boolean mIsInterestedInDrag;
    private java.util.HashSet<android.view.View> mChildrenInterestedInDrag;
    private android.graphics.PointF mLocalPoint;
    private float[] mTempPosition;
    private android.graphics.Point mTempPoint;
    private android.graphics.Rect mTempRect;
    private int[] mTempLocation;
    private android.view.animation.LayoutAnimationController mLayoutAnimationController;
    private android.view.animation.Animation.AnimationListener mAnimationListener;
    private android.view.ViewGroup.TouchTarget mFirstTouchTarget;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private long mLastTouchDownTime;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private int mLastTouchDownIndex;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private float mLastTouchDownX;
    @android.view.ViewDebug.ExportedProperty(category="events")
    private float mLastTouchDownY;
    private android.view.ViewGroup.HoverTarget mFirstHoverTarget;
    private boolean mHoveredSelf;
    private android.view.View mTooltipHoverTarget;
    private boolean mTooltipHoveredSelf;
    @android.view.ViewDebug.ExportedProperty(flagMapping={@android.view.ViewDebug.FlagToString(mask=1, equals=1, name="CLIP_CHILDREN"), @android.view.ViewDebug.FlagToString(mask=2, equals=2, name="CLIP_TO_PADDING"), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="PADDING_NOT_NULL")}, formatToHexString=true)
    protected int mGroupFlags;
    private int mLayoutMode;
    static final int FLAG_CLIP_CHILDREN = 1;
    private static final int FLAG_CLIP_TO_PADDING = 2;
    static final int FLAG_INVALIDATE_REQUIRED = 4;
    private static final int FLAG_RUN_ANIMATION = 8;
    static final int FLAG_ANIMATION_DONE = 16;
    private static final int FLAG_PADDING_NOT_NULL = 32;
    @java.lang.Deprecated
    private static final int FLAG_ANIMATION_CACHE = 64;
    static final int FLAG_OPTIMIZE_INVALIDATE = 128;
    static final int FLAG_CLEAR_TRANSFORMATION = 256;
    private static final int FLAG_NOTIFY_ANIMATION_LISTENER = 512;
    protected static final int FLAG_USE_CHILD_DRAWING_ORDER = 1024;
    protected static final int FLAG_SUPPORT_STATIC_TRANSFORMATIONS = 2048;
    private static final int FLAG_ADD_STATES_FROM_CHILDREN = 8192;
    @java.lang.Deprecated
    private static final int FLAG_ALWAYS_DRAWN_WITH_CACHE = 16384;
    @java.lang.Deprecated
    private static final int FLAG_CHILDREN_DRAWN_WITH_CACHE = 32768;
    private static final int FLAG_NOTIFY_CHILDREN_ON_DRAWABLE_STATE_CHANGE = 65536;
    private static final int FLAG_MASK_FOCUSABILITY = 393216;
    public static final int FOCUS_BEFORE_DESCENDANTS = 131072;
    public static final int FOCUS_AFTER_DESCENDANTS = 262144;
    public static final int FOCUS_BLOCK_DESCENDANTS = 393216;
    private static final int[] DESCENDANT_FOCUSABILITY_FLAGS = null;
    protected static final int FLAG_DISALLOW_INTERCEPT = 524288;
    private static final int FLAG_SPLIT_MOTION_EVENTS = 2097152;
    private static final int FLAG_PREVENT_DISPATCH_ATTACHED_TO_WINDOW = 4194304;
    private static final int FLAG_LAYOUT_MODE_WAS_EXPLICITLY_SET = 8388608;
    static final int FLAG_IS_TRANSITION_GROUP = 16777216;
    static final int FLAG_IS_TRANSITION_GROUP_SET = 33554432;
    static final int FLAG_TOUCHSCREEN_BLOCKS_FOCUS = 67108864;
    private static final int FLAG_START_ACTION_MODE_FOR_CHILD_IS_TYPED = 134217728;
    private static final int FLAG_START_ACTION_MODE_FOR_CHILD_IS_NOT_TYPED = 268435456;
    private static final int FLAG_SHOW_CONTEXT_MENU_WITH_COORDS = 536870912;
    protected int mPersistentDrawingCache;
    @java.lang.Deprecated
    public static final int PERSISTENT_NO_CACHE = 0;
    @java.lang.Deprecated
    public static final int PERSISTENT_ANIMATION_CACHE = 1;
    @java.lang.Deprecated
    public static final int PERSISTENT_SCROLLING_CACHE = 2;
    @java.lang.Deprecated
    public static final int PERSISTENT_ALL_CACHES = 3;
    private static final int LAYOUT_MODE_UNDEFINED = -1;
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;
    public static int LAYOUT_MODE_DEFAULT;
    protected static final int CLIP_TO_PADDING_MASK = 34;
    private static final int CHILD_LEFT_INDEX = 0;
    private static final int CHILD_TOP_INDEX = 1;
    private android.view.View[] mChildren;
    private int mChildrenCount;
    boolean mSuppressLayout;
    private boolean mLayoutCalledWhileSuppressed;
    private static final int ARRAY_INITIAL_CAPACITY = 12;
    private static final int ARRAY_CAPACITY_INCREMENT = 12;
    private static float[] sDebugLines;
    android.graphics.Paint mCachePaint;
    private android.animation.LayoutTransition mTransition;
    private java.util.ArrayList<android.view.View> mTransitioningViews;
    private java.util.ArrayList<android.view.View> mVisibilityChangingChildren;
    private java.util.ArrayList<android.view.View> mPreSortedChildren;
    @android.view.ViewDebug.ExportedProperty(category="layout")
    private int mChildCountWithTransientState;
    private int mNestedScrollAxes;
    private java.util.List<java.lang.Integer> mTransientIndices;
    private java.util.List<android.view.View> mTransientViews;
    int mChildUnhandledKeyListeners;
    private int mInsetsAnimationDispatchMode;
    private static final android.view.ActionMode SENTINEL_ACTION_MODE = null;
    private android.animation.LayoutTransition.TransitionListener mLayoutTransitionListener;
    public ViewGroup(android.content.Context p0) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public ViewGroup(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    private void initViewGroup() {}
    private void initFromAttributes(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) {}
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
    private void setTouchscreenBlocksFocusNoRefocus(boolean p0) {}
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
    private android.graphics.PointF getLocalPoint() { return null; }
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
    private android.view.PointerIcon dispatchResolvePointerIcon(android.view.MotionEvent p0, int p1, android.view.View p2) { return null; }
    private int getAndVerifyPreorderedIndex(int p0, int p1, boolean p2) { return 0; }
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    private void exitHoverTargets() {}
    private void cancelHoverTarget(android.view.View p0) {}
    boolean dispatchTooltipHoverEvent(android.view.MotionEvent p0) { return false; }
    private boolean dispatchTooltipHoverEvent(android.view.MotionEvent p0, android.view.View p1) { return false; }
    private void exitTooltipHoverTargets() {}
    protected boolean hasHoveredChild() { return false; }
    protected boolean pointInHoveredChild(android.view.MotionEvent p0) { return false; }
    public void addChildrenForAccessibility(java.util.ArrayList<android.view.View> p0) {}
    public boolean onInterceptHoverEvent(android.view.MotionEvent p0) { return false; }
    private static android.view.MotionEvent obtainMotionEventNoHistoryOrSelf(android.view.MotionEvent p0) { return null; }
    protected boolean dispatchGenericPointerEvent(android.view.MotionEvent p0) { return false; }
    protected boolean dispatchGenericFocusedEvent(android.view.MotionEvent p0) { return false; }
    private boolean dispatchTransformedGenericPointerEvent(android.view.MotionEvent p0, android.view.View p1) { return false; }
    private android.view.MotionEvent getTransformedMotionEvent(android.view.MotionEvent p0, android.view.View p1) { return null; }
    public boolean dispatchTouchEvent(android.view.MotionEvent p0) { return false; }
    public java.util.ArrayList<android.view.View> buildTouchDispatchChildList() { return null; }
    private android.view.View findChildWithAccessibilityFocus() { return null; }
    private void resetTouchState() {}
    private static boolean resetCancelNextUpFlag(android.view.View p0) { return false; }
    private void clearTouchTargets() {}
    private void cancelAndClearTouchTargets(android.view.MotionEvent p0) {}
    private android.view.ViewGroup.TouchTarget getTouchTarget(android.view.View p0) { return null; }
    private android.view.ViewGroup.TouchTarget addTouchTarget(android.view.View p0, int p1) { return null; }
    private void removePointersFromTouchTargets(int p0) {}
    private void cancelTouchTarget(android.view.View p0) {}
    private android.graphics.Rect getTempRect() { return null; }
    private float[] getTempLocationF() { return null; }
    private android.graphics.Point getTempPoint() { return null; }
    protected boolean isTransformedTouchPointInView(float p0, float p1, android.view.View p2, android.graphics.PointF p3) { return false; }
    public void transformPointToViewLocal(float[] p0, android.view.View p1) {}
    private boolean dispatchTransformedTouchEvent(android.view.MotionEvent p0, boolean p1, android.view.View p2, int p3) { return false; }
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
    private boolean restoreFocusInClusterInternal(int p0) { return false; }
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
    private android.view.ViewGroup.ChildListForAutoFillOrContentCapture getChildrenForAutofill(int p0) { return null; }
    private void populateChildrenForAutofill(java.util.ArrayList<android.view.View> p0, int p1) {}
    private android.view.ViewGroup.ChildListForAutoFillOrContentCapture getChildrenForContentCapture() { return null; }
    private void populateChildrenForContentCapture(java.util.ArrayList<android.view.View> p0) {}
    private static android.view.View getAndVerifyPreorderedView(java.util.ArrayList<android.view.View> p0, android.view.View[] p1, int p2) { return null; }
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
    private static void fillRect(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5) {}
    private static int sign(int p0) { return 0; }
    private static void drawCorner(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5, int p6) {}
    private static void drawRectCorners(android.graphics.Canvas p0, int p1, int p2, int p3, int p4, android.graphics.Paint p5, int p6, int p7) {}
    private static void fillDifference(android.graphics.Canvas p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7, int p8, android.graphics.Paint p9) {}
    protected void onDebugDrawMargins(android.graphics.Canvas p0, android.graphics.Paint p1) {}
    protected void onDebugDraw(android.graphics.Canvas p0) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public android.view.ViewGroupOverlay getOverlay() { return null; }
    protected int getChildDrawingOrder(int p0, int p1) { return 0; }
    public final int getChildDrawingOrder(int p0) { return 0; }
    private boolean hasChildWithZ() { return false; }
    java.util.ArrayList<android.view.View> buildOrderedChildList() { return null; }
    private void notifyAnimationListener() {}
    protected void dispatchGetDisplayList() {}
    private void recreateChildDisplayList(android.view.View p0) {}
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
    private void clearCachedLayoutMode() {}
    protected void onAttachedToWindow() {}
    protected void onDetachedFromWindow() {}
    protected void destroyHardwareResources() {}
    protected boolean addViewInLayout(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) { return false; }
    protected boolean addViewInLayout(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3) { return false; }
    protected void cleanupLayoutState(android.view.View p0) {}
    private void addViewInner(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3) {}
    private void touchAccessibilityNodeProviderIfNeeded(android.view.View p0) {}
    private void addInArray(android.view.View p0, int p1) {}
    private void removeFromArray(int p0) {}
    private void removeFromArray(int p0, int p1) {}
    private void bindLayoutAnimation(android.view.View p0) {}
    protected void attachLayoutAnimationParameters(android.view.View p0, android.view.ViewGroup.LayoutParams p1, int p2, int p3) {}
    public void removeView(android.view.View p0) {}
    public void removeViewInLayout(android.view.View p0) {}
    public void removeViewsInLayout(int p0, int p1) {}
    public void removeViewAt(int p0) {}
    public void removeViews(int p0, int p1) {}
    private boolean removeViewInternal(android.view.View p0) { return false; }
    private void removeViewInternal(int p0, android.view.View p1) {}
    public void setLayoutTransition(android.animation.LayoutTransition p0) {}
    public android.animation.LayoutTransition getLayoutTransition() { return null; }
    private void removeViewsInternal(int p0, int p1) {}
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
    private boolean hasBooleanFlag(int p0) { return false; }
    private void setBooleanFlag(int p0, boolean p1) {}
    @java.lang.Deprecated
    @android.view.ViewDebug.ExportedProperty(category="drawing", mapping={@android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=1, to="ANIMATION"), @android.view.ViewDebug.IntToString(from=2, to="SCROLLING"), @android.view.ViewDebug.IntToString(from=3, to="ALL")})
    public int getPersistentDrawingCache() { return 0; }
    @java.lang.Deprecated
    public void setPersistentDrawingCache(int p0) {}
    private void setLayoutMode(int p0, boolean p1) {}
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
    private void addDisappearingView(android.view.View p0) {}
    void finishAnimatingView(android.view.View p0, android.view.animation.Animation p1) {}
    boolean isViewTransitioning(android.view.View p0) { return false; }
    public void startViewTransition(android.view.View p0) {}
    public void endViewTransition(android.view.View p0) {}
    public void suppressLayout(boolean p0) {}
    public boolean isLayoutSuppressed() { return false; }
    public boolean gatherTransparentRegion(android.graphics.Region p0) { return false; }
    public void requestTransparentRegion(android.view.View p0) {}
    public void subtractObscuredTouchableRegion(android.graphics.Region p0, android.view.View p1) {}
    private static void applyOpToRegionByBounds(android.graphics.Region p0, android.view.View p1, android.graphics.Region.Op p2) {}
    public android.view.WindowInsets dispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    private android.view.WindowInsets brokenDispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    private android.view.WindowInsets newDispatchApplyWindowInsets(android.view.WindowInsets p0) { return null; }
    public void setWindowInsetsAnimationCallback(android.view.WindowInsetsAnimation.Callback p0) {}
    public boolean hasWindowInsetsAnimationCallback() { return false; }
    public void dispatchWindowInsetsAnimationPrepare(android.view.WindowInsetsAnimation p0) {}
    public android.view.WindowInsetsAnimation.Bounds dispatchWindowInsetsAnimationStart(android.view.WindowInsetsAnimation p0, android.view.WindowInsetsAnimation.Bounds p1) { return null; }
    public android.view.WindowInsets dispatchWindowInsetsAnimationProgress(android.view.WindowInsets p0, java.util.List<android.view.WindowInsetsAnimation> p1) { return null; }
    public void dispatchWindowInsetsAnimationEnd(android.view.WindowInsetsAnimation p0) {}
    private void dispatchTransformedScrollCaptureSearch(android.view.View p0, android.graphics.Rect p1, android.graphics.Point p2, java.util.Queue<android.view.ScrollCaptureTarget> p3) {}
    public void dispatchScrollCaptureSearch(android.graphics.Rect p0, android.graphics.Point p1, java.util.Queue<android.view.ScrollCaptureTarget> p2) {}
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
    private static void drawRect(android.graphics.Canvas p0, android.graphics.Paint p1, int p2, int p3, int p4, int p5) {}
    protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}
    public final void onDescendantUnbufferedRequested() {}

    static class ChildListForAccessibility {
        private static final int MAX_POOL_SIZE = 32;
        private static final android.util.Pools.SynchronizedPool<android.view.ViewGroup.ChildListForAccessibility> sPool = null;
        private final java.util.ArrayList<android.view.View> mChildren = null;
        private final java.util.ArrayList<android.view.ViewGroup.ViewLocationHolder> mHolders = null;
        ChildListForAccessibility() {}
        public static android.view.ViewGroup.ChildListForAccessibility obtain(android.view.ViewGroup p0, boolean p1) { return null; }
        public void recycle() {}
        public int getChildCount() { return 0; }
        public android.view.View getChildAt(int p0) { return null; }
        private void init(android.view.ViewGroup p0, boolean p1) {}
        private void sort(java.util.ArrayList<android.view.ViewGroup.ViewLocationHolder> p0) {}
        private void clear() {}
    }

    private static class ChildListForAutoFillOrContentCapture extends java.util.ArrayList<android.view.View> {
        private static final int MAX_POOL_SIZE = 32;
        private static final android.util.Pools.SimplePool<android.view.ViewGroup.ChildListForAutoFillOrContentCapture> sPool = null;
        private ChildListForAutoFillOrContentCapture() { super(); }
        public static android.view.ViewGroup.ChildListForAutoFillOrContentCapture obtain() { return null; }
        public void recycle() {}
    }

    private static final class HoverTarget {
        private static final int MAX_RECYCLED = 32;
        private static final java.lang.Object sRecycleLock = null;
        private static android.view.ViewGroup.HoverTarget sRecycleBin;
        private static int sRecycledCount;
        public android.view.View child;
        public android.view.ViewGroup.HoverTarget next;
        private HoverTarget() {}
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

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.view.ViewGroup.LayoutParams> {
            private boolean mPropertiesMapped;
            private int mLayout_heightId;
            private int mLayout_widthId;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.view.ViewGroup.LayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
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
        @android.view.ViewDebug.ExportedProperty(category="layout")
        private int startMargin;
        @android.view.ViewDebug.ExportedProperty(category="layout")
        private int endMargin;
        public static final int DEFAULT_MARGIN_RELATIVE = -2147483648;
        @android.view.ViewDebug.ExportedProperty(category="layout", flagMapping={@android.view.ViewDebug.FlagToString(mask=3, equals=3, name="LAYOUT_DIRECTION"), @android.view.ViewDebug.FlagToString(mask=4, equals=4, name="LEFT_MARGIN_UNDEFINED_MASK"), @android.view.ViewDebug.FlagToString(mask=8, equals=8, name="RIGHT_MARGIN_UNDEFINED_MASK"), @android.view.ViewDebug.FlagToString(mask=16, equals=16, name="RTL_COMPATIBILITY_MODE_MASK"), @android.view.ViewDebug.FlagToString(mask=32, equals=32, name="NEED_RESOLUTION_MASK")}, formatToHexString=true)
        byte mMarginFlags;
        private static final int LAYOUT_DIRECTION_MASK = 3;
        private static final int LEFT_MARGIN_UNDEFINED_MASK = 4;
        private static final int RIGHT_MARGIN_UNDEFINED_MASK = 8;
        private static final int RTL_COMPATIBILITY_MODE_MASK = 16;
        private static final int NEED_RESOLUTION_MASK = 32;
        private static final int DEFAULT_MARGIN_RESOLVED = 0;
        private static final int UNDEFINED_MARGIN = -2147483648;
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
        private void doResolveMargins() {}
        public boolean isLayoutRtl() { return false; }
        public void onDebugDraw(android.view.View p0, android.graphics.Canvas p1, android.graphics.Paint p2) {}
        protected void encodeProperties(android.view.ViewHierarchyEncoder p0) {}

        public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.view.ViewGroup.MarginLayoutParams> {
            private boolean mPropertiesMapped;
            private int mLayout_marginBottomId;
            private int mLayout_marginLeftId;
            private int mLayout_marginRightId;
            private int mLayout_marginTopId;
            public InspectionCompanion() {}
            public void mapProperties(android.view.inspector.PropertyMapper p0) {}
            public void readProperties(android.view.ViewGroup.MarginLayoutParams p0, android.view.inspector.PropertyReader p1) {}
        }
    }

    public static interface OnHierarchyChangeListener {
        public void onChildViewAdded(android.view.View p0, android.view.View p1);
        public void onChildViewRemoved(android.view.View p0, android.view.View p1);
    }

    private static final class TouchTarget {
        private static final int MAX_RECYCLED = 32;
        private static final java.lang.Object sRecycleLock = null;
        private static android.view.ViewGroup.TouchTarget sRecycleBin;
        private static int sRecycledCount;
        public static final int ALL_POINTER_IDS = -1;
        public android.view.View child;
        public int pointerIdBits;
        public android.view.ViewGroup.TouchTarget next;
        private TouchTarget() {}
        public static android.view.ViewGroup.TouchTarget obtain(android.view.View p0, int p1) { return null; }
        public void recycle() {}
    }

    static class ViewLocationHolder implements java.lang.Comparable<android.view.ViewGroup.ViewLocationHolder> {
        private static final int MAX_POOL_SIZE = 32;
        private static final android.util.Pools.SynchronizedPool<android.view.ViewGroup.ViewLocationHolder> sPool = null;
        public static final int COMPARISON_STRATEGY_STRIPE = 1;
        public static final int COMPARISON_STRATEGY_LOCATION = 2;
        private static int sComparisonStrategy;
        private final android.graphics.Rect mLocation = null;
        private android.view.ViewGroup mRoot;
        public android.view.View mView;
        private int mLayoutDirection;
        ViewLocationHolder() {}
        public static android.view.ViewGroup.ViewLocationHolder obtain(android.view.ViewGroup p0, android.view.View p1) { return null; }
        public static void setComparisonStrategy(int p0) {}
        public void recycle() {}
        public int compareTo(android.view.ViewGroup.ViewLocationHolder p0) { return 0; }
        private static int compareBoundsOfTree(android.view.ViewGroup.ViewLocationHolder p0, android.view.ViewGroup.ViewLocationHolder p1) { return 0; }
        private void init(android.view.ViewGroup p0, android.view.View p1) {}
        private void clear() {}
    }

    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<android.view.ViewGroup> {
        private boolean mPropertiesMapped;
        private int mAddStatesFromChildrenId;
        private int mAlwaysDrawnWithCacheId;
        private int mAnimationCacheId;
        private int mClipChildrenId;
        private int mClipToPaddingId;
        private int mDescendantFocusabilityId;
        private int mLayoutAnimationId;
        private int mLayoutModeId;
        private int mPersistentDrawingCacheId;
        private int mSplitMotionEventsId;
        private int mTouchscreenBlocksFocusId;
        private int mTransitionGroupId;
        public InspectionCompanion() {}
        public void mapProperties(android.view.inspector.PropertyMapper p0) {}
        public void readProperties(android.view.ViewGroup p0, android.view.inspector.PropertyReader p1) {}
    }
}

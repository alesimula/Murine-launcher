package android.view.accessibility;

public class AccessibilityNodeInfo implements android.os.Parcelable {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "AccessibilityNodeInfo";
    public static final int UNDEFINED_CONNECTION_ID = -1;
    public static final int UNDEFINED_SELECTION_INDEX = -1;
    public static final int UNDEFINED_ITEM_ID = 2147483647;
    public static final int ROOT_ITEM_ID = 2147483646;
    public static final long UNDEFINED_NODE_ID = Long.valueOf(0L);
    public static final long ROOT_NODE_ID = Long.valueOf(0L);
    public static final int FLAG_PREFETCH_PREDECESSORS = 1;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_DESCENDANTS = 4;
    public static final int FLAG_INCLUDE_NOT_IMPORTANT_VIEWS = 8;
    public static final int FLAG_REPORT_VIEW_IDS = 16;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_SET_TEXT = 2097152;
    public static final int LAST_LEGACY_STANDARD_ACTION = 2097152;
    private static final int ACTION_TYPE_MASK = -16777216;
    public static final java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final java.lang.String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final java.lang.String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final java.lang.String ACTION_ARGUMENT_ACCESSIBLE_CLICKABLE_SPAN = "android.view.accessibility.action.ACTION_ARGUMENT_ACCESSIBLE_CLICKABLE_SPAN";
    public static final int FOCUS_INPUT = 1;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final java.lang.String EXTRA_DATA_REQUESTED_KEY = "android.view.accessibility.AccessibilityNodeInfo.extra_data_requested";
    private static final int BOOLEAN_PROPERTY_CHECKABLE = 1;
    private static final int BOOLEAN_PROPERTY_CHECKED = 2;
    private static final int BOOLEAN_PROPERTY_FOCUSABLE = 4;
    private static final int BOOLEAN_PROPERTY_FOCUSED = 8;
    private static final int BOOLEAN_PROPERTY_SELECTED = 16;
    private static final int BOOLEAN_PROPERTY_CLICKABLE = 32;
    private static final int BOOLEAN_PROPERTY_LONG_CLICKABLE = 64;
    private static final int BOOLEAN_PROPERTY_ENABLED = 128;
    private static final int BOOLEAN_PROPERTY_PASSWORD = 256;
    private static final int BOOLEAN_PROPERTY_SCROLLABLE = 512;
    private static final int BOOLEAN_PROPERTY_ACCESSIBILITY_FOCUSED = 1024;
    private static final int BOOLEAN_PROPERTY_VISIBLE_TO_USER = 2048;
    private static final int BOOLEAN_PROPERTY_EDITABLE = 4096;
    private static final int BOOLEAN_PROPERTY_OPENS_POPUP = 8192;
    private static final int BOOLEAN_PROPERTY_DISMISSABLE = 16384;
    private static final int BOOLEAN_PROPERTY_MULTI_LINE = 32768;
    private static final int BOOLEAN_PROPERTY_CONTENT_INVALID = 65536;
    private static final int BOOLEAN_PROPERTY_CONTEXT_CLICKABLE = 131072;
    private static final int BOOLEAN_PROPERTY_IMPORTANCE = 262144;
    private static final int BOOLEAN_PROPERTY_SCREEN_READER_FOCUSABLE = 524288;
    private static final int BOOLEAN_PROPERTY_IS_SHOWING_HINT = 1048576;
    private static final int BOOLEAN_PROPERTY_IS_HEADING = 2097152;
    private static final int BOOLEAN_PROPERTY_IS_TEXT_ENTRY_KEY = 4194304;
    private static final long VIRTUAL_DESCENDANT_ID_MASK = -4294967296L;
    private static final int VIRTUAL_DESCENDANT_ID_SHIFT = 32;
    private static java.util.concurrent.atomic.AtomicInteger sNumInstancesInUse;
    private static final int MAX_POOL_SIZE = 50;
    private static final android.util.Pools.SynchronizedPool<android.view.accessibility.AccessibilityNodeInfo> sPool = null;
    private static final android.view.accessibility.AccessibilityNodeInfo DEFAULT = null;
    @android.annotation.UnsupportedAppUsage
    private boolean mSealed;
    private int mWindowId;
    @android.annotation.UnsupportedAppUsage
    private long mSourceNodeId;
    private long mParentNodeId;
    private long mLabelForId;
    private long mLabeledById;
    private long mTraversalBefore;
    private long mTraversalAfter;
    private int mBooleanProperties;
    private final android.graphics.Rect mBoundsInParent = null;
    private final android.graphics.Rect mBoundsInScreen = null;
    private int mDrawingOrderInParent;
    private java.lang.CharSequence mPackageName;
    private java.lang.CharSequence mClassName;
    private java.lang.CharSequence mOriginalText;
    private java.lang.CharSequence mText;
    private java.lang.CharSequence mHintText;
    private java.lang.CharSequence mError;
    private java.lang.CharSequence mPaneTitle;
    private java.lang.CharSequence mContentDescription;
    private java.lang.CharSequence mTooltipText;
    private java.lang.String mViewIdResourceName;
    private java.util.ArrayList<java.lang.String> mExtraDataKeys;
    @android.annotation.UnsupportedAppUsage
    private android.util.LongArray mChildNodeIds;
    private java.util.ArrayList<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> mActions;
    private int mMaxTextLength;
    private int mMovementGranularities;
    private int mTextSelectionStart;
    private int mTextSelectionEnd;
    private int mInputType;
    private int mLiveRegion;
    private android.os.Bundle mExtras;
    private int mConnectionId;
    private android.view.accessibility.AccessibilityNodeInfo.RangeInfo mRangeInfo;
    private android.view.accessibility.AccessibilityNodeInfo.CollectionInfo mCollectionInfo;
    private android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo mCollectionItemInfo;
    private android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo mTouchDelegateInfo;
    public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo> CREATOR = null;
    @android.annotation.UnsupportedAppUsage
    public static int getAccessibilityViewId(long p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int getVirtualDescendantId(long p0) { return 0; }
    public static long makeNodeId(int p0, int p1) { return 0L; }
    private AccessibilityNodeInfo() {}
    AccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void setSource(android.view.View p0) {}
    public void setSource(android.view.View p0, int p1) {}
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo focusSearch(int p0) { return null; }
    public int getWindowId() { return 0; }
    @android.annotation.UnsupportedAppUsage
    public boolean refresh(android.os.Bundle p0, boolean p1) { return false; }
    public boolean refresh() { return false; }
    public boolean refreshWithExtraData(java.lang.String p0, android.os.Bundle p1) { return false; }
    public android.util.LongArray getChildNodeIds() { return null; }
    public long getChildId(int p0) { return 0L; }
    public int getChildCount() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo getChild(int p0) { return null; }
    public void addChild(android.view.View p0) {}
    public void addChildUnchecked(android.view.View p0) {}
    public boolean removeChild(android.view.View p0) { return false; }
    public void addChild(android.view.View p0, int p1) {}
    private void addChildInternal(android.view.View p0, int p1, boolean p2) {}
    public boolean removeChild(android.view.View p0, int p1) { return false; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getActionList() { return null; }
    @java.lang.Deprecated
    public int getActions() { return 0; }
    public void addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) {}
    private void addActionUnchecked(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) {}
    @java.lang.Deprecated
    public void addAction(int p0) {}
    @java.lang.Deprecated
    public void removeAction(int p0) {}
    public boolean removeAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) { return false; }
    public void removeAllActions() {}
    public android.view.accessibility.AccessibilityNodeInfo getTraversalBefore() { return null; }
    public void setTraversalBefore(android.view.View p0) {}
    public void setTraversalBefore(android.view.View p0, int p1) {}
    public android.view.accessibility.AccessibilityNodeInfo getTraversalAfter() { return null; }
    public void setTraversalAfter(android.view.View p0) {}
    public void setTraversalAfter(android.view.View p0, int p1) {}
    public java.util.List<java.lang.String> getAvailableExtraData() { return null; }
    public void setAvailableExtraData(java.util.List<java.lang.String> p0) {}
    public void setMaxTextLength(int p0) {}
    public int getMaxTextLength() { return 0; }
    public void setMovementGranularities(int p0) {}
    public int getMovementGranularities() { return 0; }
    public boolean performAction(int p0) { return false; }
    public boolean performAction(int p0, android.os.Bundle p1) { return false; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String p0) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(java.lang.String p0) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getParent() { return null; }
    public long getParentNodeId() { return 0L; }
    public void setParent(android.view.View p0) {}
    public void setParent(android.view.View p0, int p1) {}
    @java.lang.Deprecated
    public void getBoundsInParent(android.graphics.Rect p0) {}
    @java.lang.Deprecated
    public void setBoundsInParent(android.graphics.Rect p0) {}
    public void getBoundsInScreen(android.graphics.Rect p0) {}
    public android.graphics.Rect getBoundsInScreen() { return null; }
    public void setBoundsInScreen(android.graphics.Rect p0) {}
    public boolean isCheckable() { return false; }
    public void setCheckable(boolean p0) {}
    public boolean isChecked() { return false; }
    public void setChecked(boolean p0) {}
    public boolean isFocusable() { return false; }
    public void setFocusable(boolean p0) {}
    public boolean isFocused() { return false; }
    public void setFocused(boolean p0) {}
    public boolean isVisibleToUser() { return false; }
    public void setVisibleToUser(boolean p0) {}
    public boolean isAccessibilityFocused() { return false; }
    public void setAccessibilityFocused(boolean p0) {}
    public boolean isSelected() { return false; }
    public void setSelected(boolean p0) {}
    public boolean isClickable() { return false; }
    public void setClickable(boolean p0) {}
    public boolean isLongClickable() { return false; }
    public void setLongClickable(boolean p0) {}
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public boolean isPassword() { return false; }
    public void setPassword(boolean p0) {}
    public boolean isScrollable() { return false; }
    public void setScrollable(boolean p0) {}
    public boolean isEditable() { return false; }
    public void setEditable(boolean p0) {}
    public void setPaneTitle(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getPaneTitle() { return null; }
    public int getDrawingOrder() { return 0; }
    public void setDrawingOrder(int p0) {}
    public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo getCollectionInfo() { return null; }
    public void setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo p0) {}
    public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo getCollectionItemInfo() { return null; }
    public void setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo p0) {}
    public android.view.accessibility.AccessibilityNodeInfo.RangeInfo getRangeInfo() { return null; }
    public void setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo p0) {}
    public boolean isContentInvalid() { return false; }
    public void setContentInvalid(boolean p0) {}
    public boolean isContextClickable() { return false; }
    public void setContextClickable(boolean p0) {}
    public int getLiveRegion() { return 0; }
    public void setLiveRegion(int p0) {}
    public boolean isMultiLine() { return false; }
    public void setMultiLine(boolean p0) {}
    public boolean canOpenPopup() { return false; }
    public void setCanOpenPopup(boolean p0) {}
    public boolean isDismissable() { return false; }
    public void setDismissable(boolean p0) {}
    public boolean isImportantForAccessibility() { return false; }
    public void setImportantForAccessibility(boolean p0) {}
    public boolean isScreenReaderFocusable() { return false; }
    public void setScreenReaderFocusable(boolean p0) {}
    public boolean isShowingHintText() { return false; }
    public void setShowingHintText(boolean p0) {}
    public boolean isHeading() { return false; }
    public void setHeading(boolean p0) {}
    public boolean isTextEntryKey() { return false; }
    public void setTextEntryKey(boolean p0) {}
    public java.lang.CharSequence getPackageName() { return null; }
    public void setPackageName(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getClassName() { return null; }
    public void setClassName(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getText() { return null; }
    public java.lang.CharSequence getOriginalText() { return null; }
    public void setText(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getHintText() { return null; }
    public void setHintText(java.lang.CharSequence p0) {}
    public void setError(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getError() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public void setContentDescription(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getTooltipText() { return null; }
    public void setTooltipText(java.lang.CharSequence p0) {}
    public void setLabelFor(android.view.View p0) {}
    public void setLabelFor(android.view.View p0, int p1) {}
    public android.view.accessibility.AccessibilityNodeInfo getLabelFor() { return null; }
    public void setLabeledBy(android.view.View p0) {}
    public void setLabeledBy(android.view.View p0, int p1) {}
    public android.view.accessibility.AccessibilityNodeInfo getLabeledBy() { return null; }
    public void setViewIdResourceName(java.lang.String p0) {}
    public java.lang.String getViewIdResourceName() { return null; }
    public int getTextSelectionStart() { return 0; }
    public int getTextSelectionEnd() { return 0; }
    public void setTextSelection(int p0, int p1) {}
    public int getInputType() { return 0; }
    public void setInputType(int p0) {}
    public android.os.Bundle getExtras() { return null; }
    public boolean hasExtras() { return false; }
    public android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() { return null; }
    public void setTouchDelegateInfo(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo p0) {}
    private boolean getBooleanProperty(int p0) { return false; }
    private void setBooleanProperty(int p0, boolean p1) {}
    public void setConnectionId(int p0) {}
    public int getConnectionId() { return 0; }
    public int describeContents() { return 0; }
    public void setSourceNodeId(long p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public long getSourceNodeId() { return 0L; }
    @android.annotation.UnsupportedAppUsage
    public void setSealed(boolean p0) {}
    @android.annotation.UnsupportedAppUsage
    public boolean isSealed() { return false; }
    protected void enforceSealed() {}
    private void enforceValidFocusDirection(int p0) {}
    private void enforceValidFocusType(int p0) {}
    protected void enforceNotSealed() {}
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View p0) { return null; }
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View p0, int p1) { return null; }
    public static android.view.accessibility.AccessibilityNodeInfo obtain() { return null; }
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.accessibility.AccessibilityNodeInfo p0) { return null; }
    public void recycle() {}
    public static void setNumInstancesInUseCounter(java.util.concurrent.atomic.AtomicInteger p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelNoRecycle(android.os.Parcel p0, int p1) {}
    private void init(android.view.accessibility.AccessibilityNodeInfo p0) {}
    private void initFromParcel(android.os.Parcel p0) {}
    private void clear() {}
    private static boolean isDefaultStandardAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) { return false; }
    private static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getActionSingleton(int p0) { return null; }
    private static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getActionSingletonBySerializationFlag(long p0) { return null; }
    private void addStandardActions(long p0) {}
    private static java.lang.String getActionSymbolicName(int p0) { return null; }
    private static java.lang.String getMovementGranularitySymbolicName(int p0) { return null; }
    private static boolean canPerformRequestOverConnection(int p0, int p1, long p2) { return false; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private static android.view.accessibility.AccessibilityNodeInfo getNodeForAccessibilityId(int p0, int p1, long p2) { return null; }
    public static java.lang.String idToString(long p0) { return null; }
    private static java.lang.String idItemToString(int p0) { return null; }

    public static final class TouchDelegateInfo implements android.os.Parcelable {
        private android.util.ArrayMap<android.graphics.Region, java.lang.Long> mTargetMap;
        private int mConnectionId;
        private int mWindowId;
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo> CREATOR = null;
        public TouchDelegateInfo(java.util.Map<android.graphics.Region, android.view.View> p0) {}
        TouchDelegateInfo(android.util.ArrayMap<android.graphics.Region, java.lang.Long> p0, boolean p1) {}
        private void setConnectionId(int p0) {}
        private void setWindowId(int p0) {}
        public int getRegionCount() { return 0; }
        public android.graphics.Region getRegionAt(int p0) { return null; }
        public android.view.accessibility.AccessibilityNodeInfo getTargetForRegion(android.graphics.Region p0) { return null; }
        public long getAccessibilityIdForRegion(android.graphics.Region p0) { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class RangeInfo {
        private static final int MAX_POOL_SIZE = 10;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_PERCENT = 2;
        private static final android.util.Pools.SynchronizedPool<android.view.accessibility.AccessibilityNodeInfo.RangeInfo> sPool = null;
        private int mType;
        private float mMin;
        private float mMax;
        private float mCurrent;
        public static android.view.accessibility.AccessibilityNodeInfo.RangeInfo obtain(android.view.accessibility.AccessibilityNodeInfo.RangeInfo p0) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.RangeInfo obtain(int p0, float p1, float p2, float p3) { return null; }
        private RangeInfo(int p0, float p1, float p2, float p3) {}
        public int getType() { return 0; }
        public float getMin() { return 0.0f; }
        public float getMax() { return 0.0f; }
        public float getCurrent() { return 0.0f; }
        void recycle() {}
        private void clear() {}
    }

    public static final class CollectionItemInfo {
        private static final int MAX_POOL_SIZE = 20;
        private static final android.util.Pools.SynchronizedPool<android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo> sPool = null;
        private boolean mHeading;
        private int mColumnIndex;
        private int mRowIndex;
        private int mColumnSpan;
        private int mRowSpan;
        private boolean mSelected;
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo p0) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int p0, int p1, int p2, int p3, boolean p4) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int p0, int p1, int p2, int p3, boolean p4, boolean p5) { return null; }
        private CollectionItemInfo(int p0, int p1, int p2, int p3, boolean p4, boolean p5) {}
        public int getColumnIndex() { return 0; }
        public int getRowIndex() { return 0; }
        public int getColumnSpan() { return 0; }
        public int getRowSpan() { return 0; }
        public boolean isHeading() { return false; }
        public boolean isSelected() { return false; }
        void recycle() {}
        private void clear() {}
    }

    public static final class CollectionInfo {
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public static final int SELECTION_MODE_MULTIPLE = 2;
        private static final int MAX_POOL_SIZE = 20;
        private static final android.util.Pools.SynchronizedPool<android.view.accessibility.AccessibilityNodeInfo.CollectionInfo> sPool = null;
        private int mRowCount;
        private int mColumnCount;
        private boolean mHierarchical;
        private int mSelectionMode;
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo p0) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int p0, int p1, boolean p2) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int p0, int p1, boolean p2, int p3) { return null; }
        private CollectionInfo(int p0, int p1, boolean p2, int p3) {}
        public int getRowCount() { return 0; }
        public int getColumnCount() { return 0; }
        public boolean isHierarchical() { return false; }
        public int getSelectionMode() { return 0; }
        void recycle() {}
        private void clear() {}
    }

    public static final class AccessibilityAction {
        public static final android.util.ArraySet<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> sStandardActions = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SELECT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_SELECTION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLICK = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_LONG_CLICK = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_ACCESSIBILITY_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CLEAR_ACCESSIBILITY_FOCUS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_AT_MOVEMENT_GRANULARITY = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_NEXT_HTML_ELEMENT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PREVIOUS_HTML_ELEMENT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_FORWARD = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_BACKWARD = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COPY = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PASTE = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CUT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_SELECTION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_EXPAND = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_COLLAPSE = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DISMISS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_TEXT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_ON_SCREEN = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_TO_POSITION = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_UP = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_LEFT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_DOWN = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_RIGHT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_UP = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_DOWN = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_LEFT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PAGE_RIGHT = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_CONTEXT_CLICK = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SET_PROGRESS = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_MOVE_WINDOW = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_TOOLTIP = null;
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_HIDE_TOOLTIP = null;
        private final int mActionId = 0;
        private final java.lang.CharSequence mLabel = null;
        public long mSerializationFlag;
        public AccessibilityAction(int p0, java.lang.CharSequence p1) {}
        private AccessibilityAction(int p0) {}
        public int getId() { return 0; }
        public java.lang.CharSequence getLabel() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
    }
}

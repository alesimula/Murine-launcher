package android.view.accessibility;

public class AccessibilityNodeInfo implements android.os.Parcelable {
    public static final int UNDEFINED_CONNECTION_ID = -1;
    public static final int UNDEFINED_SELECTION_INDEX = -1;
    public static final int UNDEFINED_ITEM_ID = 2147483647;
    public static final int ROOT_ITEM_ID = 2147483646;
    public static final int LEASHED_ITEM_ID = 2147483645;
    public static final long UNDEFINED_NODE_ID = Long.valueOf(0L);
    public static final long ROOT_NODE_ID = Long.valueOf(0L);
    public static final long LEASHED_NODE_ID = Long.valueOf(0L);
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FLAG_PREFETCH_MASK = 63;
    public static final int FLAG_PREFETCH_DESCENDANTS_MASK = 28;
    @android.annotation.SuppressLint("MinMaxConstant")
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    public static final int FLAG_SERVICE_REQUESTS_INCLUDE_NOT_IMPORTANT_VIEWS = 128;
    public static final int FLAG_SERVICE_REQUESTS_REPORT_VIEW_IDS = 256;
    public static final int FLAG_SERVICE_IS_ACCESSIBILITY_TOOL = 512;
    public static final int FLAG_REPORT_MASK = 896;
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
    public static final java.lang.String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final java.lang.String ACTION_ARGUMENT_DIRECTION_INT = "android.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    @android.annotation.FlaggedApi("android.view.accessibility.granular_scrolling")
    public static final java.lang.String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "android.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
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
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final java.lang.String EXTRA_DATA_RENDERING_INFO_KEY = "android.view.accessibility.extra.DATA_RENDERING_INFO_KEY";
    public static final java.lang.String EXTRA_DATA_REQUESTED_KEY = "android.view.accessibility.AccessibilityNodeInfo.extra_data_requested";
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo> CREATOR = null;
    public static int getAccessibilityViewId(long p0) { return 0; }
    public static int getVirtualDescendantId(long p0) { return 0; }
    public static long makeNodeId(int p0, int p1) { return 0L; }
    public AccessibilityNodeInfo() {}
    public AccessibilityNodeInfo(android.view.View p0) {}
    public AccessibilityNodeInfo(android.view.View p0, int p1) {}
    public AccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public void setSource(android.view.View p0) {}
    public void setSource(android.view.View p0, int p1) {}
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int p0) { return null; }
    public android.view.accessibility.AccessibilityNodeInfo focusSearch(int p0) { return null; }
    public int getWindowId() { return 0; }
    public boolean refresh(android.os.Bundle p0, boolean p1) { return false; }
    public boolean refresh() { return false; }
    public boolean refreshWithExtraData(java.lang.String p0, android.os.Bundle p1) { return false; }
    public android.util.LongArray getChildNodeIds() { return null; }
    public long getChildId(int p0) { return 0L; }
    public int getChildCount() { return 0; }
    public android.view.accessibility.AccessibilityNodeInfo getChild(int p0) { return null; }
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo getChild(int p0, int p1) { return null; }
    public void addChild(android.view.View p0) {}
    public void addChild(android.os.IBinder p0) {}
    public void addChildUnchecked(android.view.View p0) {}
    public boolean removeChild(android.view.View p0) { return false; }
    public boolean removeChild(android.os.IBinder p0) { return false; }
    public void addChild(android.view.View p0, int p1) {}
    public boolean removeChild(android.view.View p0, int p1) { return false; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> getActionList() { return null; }
    @java.lang.Deprecated
    public int getActions() { return 0; }
    public void addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction p0) {}
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
    public void setMinDurationBetweenContentChanges(java.time.Duration p0) {}
    @android.annotation.NonNull
    public java.time.Duration getMinDurationBetweenContentChanges() { return null; }
    public boolean performAction(int p0) { return false; }
    public boolean performAction(int p0, android.os.Bundle p1) { return false; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText(java.lang.String p0) { return null; }
    public java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId(java.lang.String p0) { return null; }
    public android.view.accessibility.AccessibilityWindowInfo getWindow() { return null; }
    public android.view.accessibility.AccessibilityNodeInfo getParent() { return null; }
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo getParent(int p0) { return null; }
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
    public void getBoundsInWindow(android.graphics.Rect p0) {}
    @android.annotation.NonNull
    public android.graphics.Rect getBoundsInWindow() { return null; }
    public void setBoundsInWindow(android.graphics.Rect p0) {}
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
    @android.annotation.FlaggedApi("android.view.accessibility.granular_scrolling")
    public boolean isGranularScrollingSupported() { return false; }
    @android.annotation.FlaggedApi("android.view.accessibility.granular_scrolling")
    public void setGranularScrollingSupported(boolean p0) {}
    public boolean isTextSelectable() { return false; }
    public void setTextSelectable(boolean p0) {}
    public boolean hasRequestInitialAccessibilityFocus() { return false; }
    public void setRequestInitialAccessibilityFocus(boolean p0) {}
    public boolean isEditable() { return false; }
    public void setEditable(boolean p0) {}
    public boolean isAccessibilityDataSensitive() { return false; }
    public void setAccessibilityDataSensitive(boolean p0) {}
    public void setPaneTitle(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getPaneTitle() { return null; }
    public int getDrawingOrder() { return 0; }
    public void setDrawingOrder(int p0) {}
    public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo getCollectionInfo() { return null; }
    public void setCollectionInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo p0) {}
    public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo getCollectionItemInfo() { return null; }
    public void setCollectionItemInfo(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo p0) {}
    public android.view.accessibility.AccessibilityNodeInfo.RangeInfo getRangeInfo() { return null; }
    public void setRangeInfo(android.view.accessibility.AccessibilityNodeInfo.RangeInfo p0) {}
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() { return null; }
    public void setExtraRenderingInfo(android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo p0) {}
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
    @android.annotation.Nullable
    public java.lang.CharSequence getStateDescription() { return null; }
    public java.lang.CharSequence getContentDescription() { return null; }
    public void setStateDescription(java.lang.CharSequence p0) {}
    public void setContentDescription(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
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
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo getTouchDelegateInfo() { return null; }
    public void setTouchDelegateInfo(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo p0) {}
    public void setConnectionId(int p0) {}
    public int getConnectionId() { return 0; }
    public int describeContents() { return 0; }
    public void setSourceNodeId(long p0, int p1) {}
    public long getSourceNodeId() { return 0L; }
    public void setUniqueId(java.lang.String p0) {}
    @android.annotation.Nullable
    public java.lang.String getUniqueId() { return null; }
    public void setContainerTitle(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getContainerTitle() { return null; }
    public void setLeashedParent(android.os.IBinder p0, int p1) {}
    @android.annotation.Nullable
    public android.os.IBinder getLeashedParent() { return null; }
    public long getLeashedParentNodeId() { return 0L; }
    public void setQueryFromAppProcessEnabled(android.view.View p0, boolean p1) {}
    public void setSealed(boolean p0) {}
    public boolean isSealed() { return false; }
    protected void enforceSealed() {}
    protected void enforceNotSealed() {}
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View p0) { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.View p0, int p1) { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain() { return null; }
    @java.lang.Deprecated
    public static android.view.accessibility.AccessibilityNodeInfo obtain(android.view.accessibility.AccessibilityNodeInfo p0) { return null; }
    @java.lang.Deprecated
    public void recycle() {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void writeToParcelNoRecycle(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    public static java.lang.String idToString(long p0) { return null; }

    public static final class AccessibilityAction implements android.os.Parcelable {
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
        @android.annotation.NonNull
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SCROLL_IN_DIRECTION = null;
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
        @android.annotation.NonNull
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_PRESS_AND_HOLD = null;
        @android.annotation.NonNull
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_IME_ENTER = null;
        @android.annotation.NonNull
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_START = null;
        @android.annotation.NonNull
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_DROP = null;
        @android.annotation.NonNull
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_DRAG_CANCEL = null;
        @android.annotation.NonNull
        public static final android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction ACTION_SHOW_TEXT_SUGGESTIONS = null;
        public long mSerializationFlag;
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> CREATOR = null;
        public AccessibilityAction(int p0, java.lang.CharSequence p1) {}
        public int getId() { return 0; }
        public java.lang.CharSequence getLabel() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
        public java.lang.String toString() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }

    public static final class CollectionInfo {
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public static final int SELECTION_MODE_MULTIPLE = 2;
        @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
        public static final int UNDEFINED = -1;
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo p0) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int p0, int p1, boolean p2) { return null; }
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionInfo obtain(int p0, int p1, boolean p2, int p3) { return null; }
        public CollectionInfo(int p0, int p1, boolean p2) {}
        public CollectionInfo(int p0, int p1, boolean p2, int p3) {}
        public CollectionInfo(int p0, int p1, boolean p2, int p3, int p4, int p5) {}
        public int getRowCount() { return 0; }
        public int getColumnCount() { return 0; }
        public boolean isHierarchical() { return false; }
        public int getSelectionMode() { return 0; }
        @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
        public int getItemCount() { return 0; }
        @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
        public int getImportantForAccessibilityItemCount() { return 0; }
        @java.lang.Deprecated
        void recycle() {}

        @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
        public static final class Builder {
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public Builder() {}
            @android.annotation.NonNull
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setRowCount(int p0) { return null; }
            @android.annotation.NonNull
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setColumnCount(int p0) { return null; }
            @android.annotation.NonNull
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setHierarchical(boolean p0) { return null; }
            @android.annotation.NonNull
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setSelectionMode(int p0) { return null; }
            @android.annotation.NonNull
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setItemCount(int p0) { return null; }
            @android.annotation.NonNull
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder setImportantForAccessibilityItemCount(int p0) { return null; }
            @android.annotation.NonNull
            @android.annotation.FlaggedApi("android.view.accessibility.collection_info_item_counts")
            public android.view.accessibility.AccessibilityNodeInfo.CollectionInfo build() { return null; }
        }
    }

    public static final class CollectionItemInfo {
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo p0) { return null; }
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int p0, int p1, int p2, int p3, boolean p4) { return null; }
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(int p0, int p1, int p2, int p3, boolean p4, boolean p5) { return null; }
        @java.lang.Deprecated
        @android.annotation.NonNull
        public static android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo obtain(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, int p5, boolean p6, boolean p7) { return null; }
        public CollectionItemInfo(int p0, int p1, int p2, int p3, boolean p4) {}
        public CollectionItemInfo(int p0, int p1, int p2, int p3, boolean p4, boolean p5) {}
        public CollectionItemInfo(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4, int p5, boolean p6, boolean p7) {}
        public int getColumnIndex() { return 0; }
        public int getRowIndex() { return 0; }
        public int getColumnSpan() { return 0; }
        public int getRowSpan() { return 0; }
        public boolean isHeading() { return false; }
        public boolean isSelected() { return false; }
        @android.annotation.Nullable
        public java.lang.String getRowTitle() { return null; }
        @android.annotation.Nullable
        public java.lang.String getColumnTitle() { return null; }
        @java.lang.Deprecated
        void recycle() {}

        public static final class Builder {
            public Builder() {}
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setHeading(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnIndex(int p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowIndex(int p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnSpan(int p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowSpan(int p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setSelected(boolean p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setRowTitle(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder setColumnTitle(java.lang.String p0) { return null; }
            @android.annotation.NonNull
            public android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo build() { return null; }
        }
    }

    public static final class ExtraRenderingInfo {
        @java.lang.Deprecated
        @android.annotation.NonNull
        public static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo obtain() { return null; }
        @android.annotation.Nullable
        public android.util.Size getLayoutSize() { return null; }
        public void setLayoutSize(int p0, int p1) {}
        public float getTextSizeInPx() { return 0.0f; }
        public void setTextSizeInPx(float p0) {}
        public int getTextSizeUnit() { return 0; }
        public void setTextSizeUnit(int p0) {}
        @java.lang.Deprecated
        void recycle() {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface PrefetchingStrategy {
    }

    public static final class RangeInfo {
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_PERCENT = 2;
        @java.lang.Deprecated
        public static android.view.accessibility.AccessibilityNodeInfo.RangeInfo obtain(int p0, float p1, float p2, float p3) { return null; }
        public RangeInfo(int p0, float p1, float p2, float p3) {}
        public int getType() { return 0; }
        public float getMin() { return 0.0f; }
        public float getMax() { return 0.0f; }
        public float getCurrent() { return 0.0f; }
        @java.lang.Deprecated
        void recycle() {}
    }

    public static final class TouchDelegateInfo implements android.os.Parcelable {
        @android.annotation.NonNull
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo> CREATOR = null;
        public TouchDelegateInfo(java.util.Map<android.graphics.Region, android.view.View> p0) {}
        TouchDelegateInfo(android.util.ArrayMap<android.graphics.Region, java.lang.Long> p0, boolean p1) {}
        public int getRegionCount() { return 0; }
        @android.annotation.NonNull
        public android.graphics.Region getRegionAt(int p0) { return null; }
        @android.annotation.Nullable
        public android.view.accessibility.AccessibilityNodeInfo getTargetForRegion(android.graphics.Region p0) { return null; }
        public long getAccessibilityIdForRegion(android.graphics.Region p0) { return 0L; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

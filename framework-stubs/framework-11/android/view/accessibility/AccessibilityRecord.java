package android.view.accessibility;

public class AccessibilityRecord {
    protected static final boolean DEBUG_CONCISE_TOSTRING = false;
    private static final int UNDEFINED = -1;
    private static final int PROPERTY_CHECKED = 1;
    private static final int PROPERTY_ENABLED = 2;
    private static final int PROPERTY_PASSWORD = 4;
    private static final int PROPERTY_FULL_SCREEN = 128;
    private static final int PROPERTY_SCROLLABLE = 256;
    private static final int PROPERTY_IMPORTANT_FOR_ACCESSIBILITY = 512;
    private static final int GET_SOURCE_PREFETCH_FLAGS = 7;
    private static final int MAX_POOL_SIZE = 10;
    private static final java.lang.Object sPoolLock = null;
    private static android.view.accessibility.AccessibilityRecord sPool;
    private static int sPoolSize;
    private android.view.accessibility.AccessibilityRecord mNext;
    private boolean mIsInPool;
    boolean mSealed;
    int mBooleanProperties;
    int mCurrentItemIndex;
    int mItemCount;
    int mFromIndex;
    int mToIndex;
    int mScrollX;
    int mScrollY;
    int mScrollDeltaX;
    int mScrollDeltaY;
    int mMaxScrollX;
    int mMaxScrollY;
    int mAddedCount;
    int mRemovedCount;
    long mSourceNodeId;
    int mSourceWindowId;
    java.lang.CharSequence mClassName;
    java.lang.CharSequence mContentDescription;
    java.lang.CharSequence mBeforeText;
    android.os.Parcelable mParcelableData;
    final java.util.List<java.lang.CharSequence> mText = null;
    int mConnectionId;
    public AccessibilityRecord() {}
    public AccessibilityRecord(android.view.accessibility.AccessibilityRecord p0) {}
    public void setSource(android.view.View p0) {}
    public void setSource(android.view.View p0, int p1) {}
    public void setSourceNodeId(long p0) {}
    public android.view.accessibility.AccessibilityNodeInfo getSource() { return null; }
    public void setWindowId(int p0) {}
    public int getWindowId() { return 0; }
    public boolean isChecked() { return false; }
    public void setChecked(boolean p0) {}
    public boolean isEnabled() { return false; }
    public void setEnabled(boolean p0) {}
    public boolean isPassword() { return false; }
    public void setPassword(boolean p0) {}
    public boolean isFullScreen() { return false; }
    public void setFullScreen(boolean p0) {}
    public boolean isScrollable() { return false; }
    public void setScrollable(boolean p0) {}
    public boolean isImportantForAccessibility() { return false; }
    public void setImportantForAccessibility(boolean p0) {}
    public int getItemCount() { return 0; }
    public void setItemCount(int p0) {}
    public int getCurrentItemIndex() { return 0; }
    public void setCurrentItemIndex(int p0) {}
    public int getFromIndex() { return 0; }
    public void setFromIndex(int p0) {}
    public int getToIndex() { return 0; }
    public void setToIndex(int p0) {}
    public int getScrollX() { return 0; }
    public void setScrollX(int p0) {}
    public int getScrollY() { return 0; }
    public void setScrollY(int p0) {}
    public int getScrollDeltaX() { return 0; }
    public void setScrollDeltaX(int p0) {}
    public int getScrollDeltaY() { return 0; }
    public void setScrollDeltaY(int p0) {}
    public int getMaxScrollX() { return 0; }
    public void setMaxScrollX(int p0) {}
    public int getMaxScrollY() { return 0; }
    public void setMaxScrollY(int p0) {}
    public int getAddedCount() { return 0; }
    public void setAddedCount(int p0) {}
    public int getRemovedCount() { return 0; }
    public void setRemovedCount(int p0) {}
    public java.lang.CharSequence getClassName() { return null; }
    public void setClassName(java.lang.CharSequence p0) {}
    public java.util.List<java.lang.CharSequence> getText() { return null; }
    public java.lang.CharSequence getBeforeText() { return null; }
    public void setBeforeText(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getContentDescription() { return null; }
    public void setContentDescription(java.lang.CharSequence p0) {}
    public android.os.Parcelable getParcelableData() { return null; }
    public void setParcelableData(android.os.Parcelable p0) {}
    public long getSourceNodeId() { return 0L; }
    public void setConnectionId(int p0) {}
    public void setSealed(boolean p0) {}
    boolean isSealed() { return false; }
    void enforceSealed() {}
    void enforceNotSealed() {}
    private boolean getBooleanProperty(int p0) { return false; }
    private void setBooleanProperty(int p0, boolean p1) {}
    public static android.view.accessibility.AccessibilityRecord obtain(android.view.accessibility.AccessibilityRecord p0) { return null; }
    public static android.view.accessibility.AccessibilityRecord obtain() { return null; }
    public void recycle() {}
    void init(android.view.accessibility.AccessibilityRecord p0) {}
    void clear() {}
    public java.lang.String toString() { return null; }
    java.lang.StringBuilder appendTo(java.lang.StringBuilder p0) { return null; }
    private void appendUnless(boolean p0, int p1, java.lang.StringBuilder p2) {}
    private static java.lang.String singleBooleanPropertyToString(int p0) { return null; }
    private void append(java.lang.StringBuilder p0, java.lang.String p1, int p2) {}
    private void append(java.lang.StringBuilder p0, java.lang.String p1, java.lang.Object p2) {}
    private java.lang.StringBuilder appendPropName(java.lang.StringBuilder p0, java.lang.String p1) { return null; }
}

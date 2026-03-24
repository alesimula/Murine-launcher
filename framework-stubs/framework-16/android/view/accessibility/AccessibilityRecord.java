package android.view.accessibility;

public class AccessibilityRecord {
    protected static final boolean DEBUG_CONCISE_TOSTRING = false;
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
    int mSourceDisplayId;
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
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo getSource() { return null; }
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo getSource(int p0) { return null; }
    public void setDisplayId(int p0) {}
    public int getDisplayId() { return 0; }
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
    boolean isAccessibilityDataSensitive() { return false; }
    void setAccessibilityDataSensitive(boolean p0) {}
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
    @android.annotation.Nullable
    public java.lang.CharSequence getClassName() { return null; }
    public void setClassName(java.lang.CharSequence p0) {}
    @android.annotation.NonNull
    public java.util.List<java.lang.CharSequence> getText() { return null; }
    @android.annotation.Nullable
    public java.lang.CharSequence getBeforeText() { return null; }
    public void setBeforeText(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getContentDescription() { return null; }
    public void setContentDescription(java.lang.CharSequence p0) {}
    @android.annotation.Nullable
    public android.os.Parcelable getParcelableData() { return null; }
    public void setParcelableData(android.os.Parcelable p0) {}
    public long getSourceNodeId() { return 0L; }
    public void setConnectionId(int p0) {}
    public void setSealed(boolean p0) {}
    boolean isSealed() { return false; }
    void enforceSealed() {}
    void enforceNotSealed() {}
    @java.lang.Deprecated
    @android.annotation.NonNull
    public static android.view.accessibility.AccessibilityRecord obtain(android.view.accessibility.AccessibilityRecord p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.NonNull
    public static android.view.accessibility.AccessibilityRecord obtain() { return null; }
    @java.lang.Deprecated
    public void recycle() {}
    void init(android.view.accessibility.AccessibilityRecord p0) {}
    void clear() {}
    public java.lang.String toString() { return null; }
    java.lang.StringBuilder appendTo(java.lang.StringBuilder p0) { return null; }
}

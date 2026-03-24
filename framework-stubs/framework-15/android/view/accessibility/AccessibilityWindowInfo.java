package android.view.accessibility;

public final class AccessibilityWindowInfo implements android.os.Parcelable {
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_SYSTEM = 3;
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    @android.annotation.FlaggedApi("android.view.accessibility.add_type_window_control")
    public static final int TYPE_WINDOW_CONTROL = 7;
    public static final int ACTIVE_WINDOW_ID = 2147483647;
    public static final int UNDEFINED_CONNECTION_ID = -1;
    public static final int UNDEFINED_WINDOW_ID = -1;
    public static final int ANY_WINDOW_ID = -2;
    public static final int PICTURE_IN_PICTURE_ACTION_REPLACER_WINDOW_ID = -3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityWindowInfo> CREATOR = null;
    public AccessibilityWindowInfo() {}
    public AccessibilityWindowInfo(android.view.accessibility.AccessibilityWindowInfo p0) {}
    @android.annotation.Nullable
    public java.lang.CharSequence getTitle() { return null; }
    public void setTitle(java.lang.CharSequence p0) {}
    public int getType() { return 0; }
    public void setType(int p0) {}
    public int getLayer() { return 0; }
    public void setLayer(int p0) {}
    public android.view.accessibility.AccessibilityNodeInfo getRoot() { return null; }
    @android.annotation.Nullable
    public android.view.accessibility.AccessibilityNodeInfo getRoot(int p0) { return null; }
    public void setAnchorId(long p0) {}
    public android.view.accessibility.AccessibilityNodeInfo getAnchor() { return null; }
    public void setPictureInPicture(boolean p0) {}
    public boolean isInPictureInPictureMode() { return false; }
    public android.view.accessibility.AccessibilityWindowInfo getParent() { return null; }
    public void setParentId(int p0) {}
    public int getId() { return 0; }
    public void setId(int p0) {}
    public int getTaskId() { return 0; }
    public void setTaskId(int p0) {}
    public void setConnectionId(int p0) {}
    public void getRegionInScreen(android.graphics.Region p0) {}
    public void setRegionInScreen(android.graphics.Region p0) {}
    public void getBoundsInScreen(android.graphics.Rect p0) {}
    public boolean isActive() { return false; }
    public void setActive(boolean p0) {}
    public boolean isFocused() { return false; }
    public void setFocused(boolean p0) {}
    public boolean isAccessibilityFocused() { return false; }
    public void setAccessibilityFocused(boolean p0) {}
    public int getChildCount() { return 0; }
    public android.view.accessibility.AccessibilityWindowInfo getChild(int p0) { return null; }
    public void addChild(int p0) {}
    public void setDisplayId(int p0) {}
    public int getDisplayId() { return 0; }
    public void setTransitionTimeMillis(long p0) {}
    public long getTransitionTimeMillis() { return 0L; }
    public void setLocales(android.os.LocaleList p0) {}
    @android.annotation.NonNull
    public android.os.LocaleList getLocales() { return null; }
    public static android.view.accessibility.AccessibilityWindowInfo obtain() { return null; }
    public static android.view.accessibility.AccessibilityWindowInfo obtain(android.view.accessibility.AccessibilityWindowInfo p0) { return null; }
    public static void setNumInstancesInUseCounter(java.util.concurrent.atomic.AtomicInteger p0) {}
    public void recycle() {}
    public boolean refresh() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public java.lang.String toString() { return null; }
    public static java.lang.String typeToString(int p0) { return null; }
    public int differenceFrom(android.view.accessibility.AccessibilityWindowInfo p0) { return 0; }

    public static final class WindowListSparseArray extends android.util.SparseArray<java.util.List<android.view.accessibility.AccessibilityWindowInfo>> implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.view.accessibility.AccessibilityWindowInfo.WindowListSparseArray> CREATOR = null;
        public WindowListSparseArray() { super(); }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

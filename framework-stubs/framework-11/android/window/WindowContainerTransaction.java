package android.window;

public final class WindowContainerTransaction implements android.os.Parcelable {
    private final android.util.ArrayMap<android.os.IBinder, android.window.WindowContainerTransaction.Change> mChanges = null;
    private final java.util.ArrayList<android.window.WindowContainerTransaction.HierarchyOp> mHierarchyOps = null;
    public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction> CREATOR = null;
    public WindowContainerTransaction() {}
    private WindowContainerTransaction(android.os.Parcel p0) {}
    private android.window.WindowContainerTransaction.Change getOrCreateChange(android.os.IBinder p0) { return null; }
    public android.window.WindowContainerTransaction setBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setAppBounds(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setScreenSizeDp(android.window.WindowContainerToken p0, int p1, int p2) { return null; }
    public android.window.WindowContainerTransaction scheduleFinishEnterPip(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setBoundsChangeTransaction(android.window.WindowContainerToken p0, android.view.SurfaceControl.Transaction p1) { return null; }
    public android.window.WindowContainerTransaction setBoundsChangeTransaction(android.window.WindowContainerToken p0, android.graphics.Rect p1) { return null; }
    public android.window.WindowContainerTransaction setActivityWindowingMode(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction setWindowingMode(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction setFocusable(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setHidden(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public android.window.WindowContainerTransaction setSmallestScreenWidthDp(android.window.WindowContainerToken p0, int p1) { return null; }
    public android.window.WindowContainerTransaction reparent(android.window.WindowContainerToken p0, android.window.WindowContainerToken p1, boolean p2) { return null; }
    public android.window.WindowContainerTransaction reorder(android.window.WindowContainerToken p0, boolean p1) { return null; }
    public void merge(android.window.WindowContainerTransaction p0, boolean p1) {}
    public java.util.Map<android.os.IBinder, android.window.WindowContainerTransaction.Change> getChanges() { return null; }
    public java.util.List<android.window.WindowContainerTransaction.HierarchyOp> getHierarchyOps() { return null; }
    public java.lang.String toString() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    public static class Change implements android.os.Parcelable {
        public static final int CHANGE_FOCUSABLE = 1;
        public static final int CHANGE_BOUNDS_TRANSACTION = 2;
        public static final int CHANGE_PIP_CALLBACK = 4;
        public static final int CHANGE_HIDDEN = 8;
        public static final int CHANGE_BOUNDS_TRANSACTION_RECT = 16;
        private final android.content.res.Configuration mConfiguration = null;
        private boolean mFocusable;
        private boolean mHidden;
        private int mChangeMask;
        private int mConfigSetMask;
        @android.app.WindowConfiguration.WindowConfig
        private int mWindowSetMask;
        private android.graphics.Rect mPinnedBounds;
        private android.view.SurfaceControl.Transaction mBoundsChangeTransaction;
        private android.graphics.Rect mBoundsChangeSurfaceBounds;
        private int mActivityWindowingMode;
        private int mWindowingMode;
        public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction.Change> CREATOR = null;
        public Change() {}
        protected Change(android.os.Parcel p0) {}
        public void merge(android.window.WindowContainerTransaction.Change p0, boolean p1) {}
        public int getWindowingMode() { return 0; }
        public int getActivityWindowingMode() { return 0; }
        public android.content.res.Configuration getConfiguration() { return null; }
        public boolean getFocusable() { return false; }
        public boolean getHidden() { return false; }
        public int getChangeMask() { return 0; }
        public int getConfigSetMask() { return 0; }
        @android.app.WindowConfiguration.WindowConfig
        public int getWindowSetMask() { return 0; }
        public android.graphics.Rect getEnterPipBounds() { return null; }
        public android.view.SurfaceControl.Transaction getBoundsChangeTransaction() { return null; }
        public android.graphics.Rect getBoundsChangeSurfaceBounds() { return null; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }

    public static class HierarchyOp implements android.os.Parcelable {
        private final android.os.IBinder mContainer = null;
        private final android.os.IBinder mReparent = null;
        private final boolean mToTop = false;
        public static final android.os.Parcelable.Creator<android.window.WindowContainerTransaction.HierarchyOp> CREATOR = null;
        public HierarchyOp(android.os.IBinder p0, android.os.IBinder p1, boolean p2) {}
        public HierarchyOp(android.os.IBinder p0, boolean p1) {}
        public HierarchyOp(android.window.WindowContainerTransaction.HierarchyOp p0) {}
        protected HierarchyOp(android.os.Parcel p0) {}
        public boolean isReparent() { return false; }
        public android.os.IBinder getNewParent() { return null; }
        public android.os.IBinder getContainer() { return null; }
        public boolean getToTop() { return false; }
        public java.lang.String toString() { return null; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public int describeContents() { return 0; }
    }
}

package com.android.internal.widget;

final class GapWorker implements java.lang.Runnable {
    static final java.lang.ThreadLocal<com.android.internal.widget.GapWorker> sGapWorker = null;
    java.util.ArrayList<com.android.internal.widget.RecyclerView> mRecyclerViews;
    long mPostTimeNs;
    long mFrameIntervalNs;
    private java.util.ArrayList<com.android.internal.widget.GapWorker.Task> mTasks;
    static java.util.Comparator<com.android.internal.widget.GapWorker.Task> sTaskComparator;
    GapWorker() {}
    public void add(com.android.internal.widget.RecyclerView p0) {}
    public void remove(com.android.internal.widget.RecyclerView p0) {}
    void postFromTraversal(com.android.internal.widget.RecyclerView p0, int p1, int p2) {}
    private void buildTaskList() {}
    static boolean isPrefetchPositionAttached(com.android.internal.widget.RecyclerView p0, int p1) { return false; }
    private com.android.internal.widget.RecyclerView.ViewHolder prefetchPositionWithDeadline(com.android.internal.widget.RecyclerView p0, int p1, long p2) { return null; }
    private void prefetchInnerRecyclerViewWithDeadline(com.android.internal.widget.RecyclerView p0, long p1) {}
    private void flushTaskWithDeadline(com.android.internal.widget.GapWorker.Task p0, long p1) {}
    private void flushTasksWithDeadline(long p0) {}
    void prefetch(long p0) {}
    public void run() {}

    static class LayoutPrefetchRegistryImpl implements com.android.internal.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry {
        int mPrefetchDx;
        int mPrefetchDy;
        int[] mPrefetchArray;
        int mCount;
        LayoutPrefetchRegistryImpl() {}
        void setPrefetchVector(int p0, int p1) {}
        void collectPrefetchPositionsFromView(com.android.internal.widget.RecyclerView p0, boolean p1) {}
        public void addPosition(int p0, int p1) {}
        boolean lastPrefetchIncludedPosition(int p0) { return false; }
        void clearPrefetchPositions() {}
    }

    static class Task {
        public boolean immediate;
        public int viewVelocity;
        public int distanceToItem;
        public com.android.internal.widget.RecyclerView view;
        public int position;
        Task() {}
        public void clear() {}
    }
}

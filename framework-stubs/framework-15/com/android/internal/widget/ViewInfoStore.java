package com.android.internal.widget;

class ViewInfoStore {
    final android.util.ArrayMap<com.android.internal.widget.RecyclerView.ViewHolder, com.android.internal.widget.ViewInfoStore.InfoRecord> mLayoutHolderMap = null;
    final android.util.LongSparseArray<com.android.internal.widget.RecyclerView.ViewHolder> mOldChangedHolders = null;
    ViewInfoStore() {}
    void clear() {}
    void addToPreLayout(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1) {}
    boolean isDisappearing(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
    @android.annotation.Nullable
    com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPreLayout(com.android.internal.widget.RecyclerView.ViewHolder p0) { return null; }
    @android.annotation.Nullable
    com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo popFromPostLayout(com.android.internal.widget.RecyclerView.ViewHolder p0) { return null; }
    void addToOldChangeHolders(long p0, com.android.internal.widget.RecyclerView.ViewHolder p1) {}
    void addToAppearedInPreLayoutHolders(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1) {}
    boolean isInPreLayout(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
    com.android.internal.widget.RecyclerView.ViewHolder getFromOldChangeHolders(long p0) { return null; }
    void addToPostLayout(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1) {}
    void addToDisappearedInLayout(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    void removeFromDisappearedInLayout(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    void process(com.android.internal.widget.ViewInfoStore.ProcessCallback p0) {}
    void removeViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    void onDetach() {}
    public void onViewDetached(com.android.internal.widget.RecyclerView.ViewHolder p0) {}

    static class InfoRecord {
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_APPEAR = 2;
        static final int FLAG_PRE = 4;
        static final int FLAG_POST = 8;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_PRE_AND_POST = 12;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        int flags;
        @android.annotation.Nullable
        com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo preInfo;
        @android.annotation.Nullable
        com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo postInfo;
        static android.util.Pools.Pool<com.android.internal.widget.ViewInfoStore.InfoRecord> sPool;
        static com.android.internal.widget.ViewInfoStore.InfoRecord obtain() { return null; }
        static void recycle(com.android.internal.widget.ViewInfoStore.InfoRecord p0) {}
        static void drainCache() {}
    }

    static interface ProcessCallback {
        public void processDisappeared(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public void processAppeared(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public void processPersistent(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2);
        public void unused(com.android.internal.widget.RecyclerView.ViewHolder p0);
    }
}

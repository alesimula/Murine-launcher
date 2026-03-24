package com.android.internal.widget;

class AdapterHelper implements com.android.internal.widget.OpReorderer.Callback {
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    final java.util.ArrayList<com.android.internal.widget.AdapterHelper.UpdateOp> mPendingUpdates = null;
    final java.util.ArrayList<com.android.internal.widget.AdapterHelper.UpdateOp> mPostponedList = null;
    final com.android.internal.widget.AdapterHelper.Callback mCallback = null;
    java.lang.Runnable mOnItemProcessedCallback;
    final boolean mDisableRecycler = false;
    final com.android.internal.widget.OpReorderer mOpReorderer = null;
    AdapterHelper(com.android.internal.widget.AdapterHelper.Callback p0) {}
    AdapterHelper(com.android.internal.widget.AdapterHelper.Callback p0, boolean p1) {}
    com.android.internal.widget.AdapterHelper addUpdateOp(com.android.internal.widget.AdapterHelper.UpdateOp... p0) { return null; }
    void reset() {}
    void preProcess() {}
    void consumePostponedUpdates() {}
    void dispatchFirstPassAndUpdateViewHolders(com.android.internal.widget.AdapterHelper.UpdateOp p0, int p1) {}
    boolean hasPendingUpdates() { return false; }
    boolean hasAnyUpdateTypes(int p0) { return false; }
    int findPositionOffset(int p0) { return 0; }
    int findPositionOffset(int p0, int p1) { return 0; }
    boolean onItemRangeChanged(int p0, int p1, java.lang.Object p2) { return false; }
    boolean onItemRangeInserted(int p0, int p1) { return false; }
    boolean onItemRangeRemoved(int p0, int p1) { return false; }
    boolean onItemRangeMoved(int p0, int p1, int p2) { return false; }
    void consumeUpdatesInOnePass() {}
    public int applyPendingUpdatesToPosition(int p0) { return 0; }
    boolean hasUpdates() { return false; }
    public com.android.internal.widget.AdapterHelper.UpdateOp obtainUpdateOp(int p0, int p1, int p2, java.lang.Object p3) { return null; }
    public void recycleUpdateOp(com.android.internal.widget.AdapterHelper.UpdateOp p0) {}
    void recycleUpdateOpsAndClearList(java.util.List<com.android.internal.widget.AdapterHelper.UpdateOp> p0) {}

    static interface Callback {
        public com.android.internal.widget.RecyclerView.ViewHolder findViewHolder(int p0);
        public void offsetPositionsForRemovingInvisible(int p0, int p1);
        public void offsetPositionsForRemovingLaidOutOrNewView(int p0, int p1);
        public void markViewHoldersUpdated(int p0, int p1, java.lang.Object p2);
        public void onDispatchFirstPass(com.android.internal.widget.AdapterHelper.UpdateOp p0);
        public void onDispatchSecondPass(com.android.internal.widget.AdapterHelper.UpdateOp p0);
        public void offsetPositionsForAdd(int p0, int p1);
        public void offsetPositionsForMove(int p0, int p1);
    }

    static class UpdateOp {
        static final int ADD = 1;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        int cmd;
        int positionStart;
        java.lang.Object payload;
        int itemCount;
        UpdateOp(int p0, int p1, int p2, java.lang.Object p3) {}
        java.lang.String cmdToString() { return null; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
    }
}

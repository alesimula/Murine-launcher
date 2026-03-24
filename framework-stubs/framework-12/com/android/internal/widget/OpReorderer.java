package com.android.internal.widget;

class OpReorderer {
    final com.android.internal.widget.OpReorderer.Callback mCallback = null;
    OpReorderer(com.android.internal.widget.OpReorderer.Callback p0) {}
    void reorderOps(java.util.List<com.android.internal.widget.AdapterHelper.UpdateOp> p0) {}
    private void swapMoveOp(java.util.List<com.android.internal.widget.AdapterHelper.UpdateOp> p0, int p1, int p2) {}
    void swapMoveRemove(java.util.List<com.android.internal.widget.AdapterHelper.UpdateOp> p0, int p1, com.android.internal.widget.AdapterHelper.UpdateOp p2, int p3, com.android.internal.widget.AdapterHelper.UpdateOp p4) {}
    private void swapMoveAdd(java.util.List<com.android.internal.widget.AdapterHelper.UpdateOp> p0, int p1, com.android.internal.widget.AdapterHelper.UpdateOp p2, int p3, com.android.internal.widget.AdapterHelper.UpdateOp p4) {}
    void swapMoveUpdate(java.util.List<com.android.internal.widget.AdapterHelper.UpdateOp> p0, int p1, com.android.internal.widget.AdapterHelper.UpdateOp p2, int p3, com.android.internal.widget.AdapterHelper.UpdateOp p4) {}
    private int getLastMoveOutOfOrder(java.util.List<com.android.internal.widget.AdapterHelper.UpdateOp> p0) { return 0; }

    static interface Callback {
        public com.android.internal.widget.AdapterHelper.UpdateOp obtainUpdateOp(int p0, int p1, int p2, java.lang.Object p3);
        public void recycleUpdateOp(com.android.internal.widget.AdapterHelper.UpdateOp p0);
    }
}

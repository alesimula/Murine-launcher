package com.android.internal.widget;

public class DefaultItemAnimator extends com.android.internal.widget.SimpleItemAnimator {
    java.util.ArrayList<java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder>> mAdditionsList;
    java.util.ArrayList<java.util.ArrayList<com.android.internal.widget.DefaultItemAnimator.MoveInfo>> mMovesList;
    java.util.ArrayList<java.util.ArrayList<com.android.internal.widget.DefaultItemAnimator.ChangeInfo>> mChangesList;
    java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mAddAnimations;
    java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mMoveAnimations;
    java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mRemoveAnimations;
    java.util.ArrayList<com.android.internal.widget.RecyclerView.ViewHolder> mChangeAnimations;
    public DefaultItemAnimator() { super(); }
    public void runPendingAnimations() {}
    public boolean animateRemove(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
    public boolean animateAdd(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
    void animateAddImpl(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public boolean animateMove(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1, int p2, int p3, int p4) { return false; }
    void animateMoveImpl(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1, int p2, int p3, int p4) {}
    public boolean animateChange(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, int p3, int p4, int p5) { return false; }
    void animateChangeImpl(com.android.internal.widget.DefaultItemAnimator.ChangeInfo p0) {}
    public void endAnimation(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public boolean isRunning() { return false; }
    void dispatchFinishedWhenDone() {}
    public void endAnimations() {}
    void cancelAll(java.util.List<com.android.internal.widget.RecyclerView.ViewHolder> p0) {}
    public boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0, java.util.List<java.lang.Object> p1) { return false; }

    private static class ChangeInfo {
        public com.android.internal.widget.RecyclerView.ViewHolder oldHolder;
        public com.android.internal.widget.RecyclerView.ViewHolder newHolder;
        public int fromX;
        public int fromY;
        public int toX;
        public int toY;
        ChangeInfo(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, int p3, int p4, int p5) {}
        public java.lang.String toString() { return null; }
    }

    private static class MoveInfo {
        public com.android.internal.widget.RecyclerView.ViewHolder holder;
        public int fromX;
        public int fromY;
        public int toX;
        public int toY;
        MoveInfo(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1, int p2, int p3, int p4) {}
    }
}

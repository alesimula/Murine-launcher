package com.android.internal.widget;

public abstract class SimpleItemAnimator extends com.android.internal.widget.RecyclerView.ItemAnimator {
    boolean mSupportsChangeAnimations;
    public SimpleItemAnimator() { super(); }
    public boolean getSupportsChangeAnimations() { return false; }
    public void setSupportsChangeAnimations(boolean p0) {}
    public boolean canReuseUpdatedViewHolder(com.android.internal.widget.RecyclerView.ViewHolder p0) { return false; }
    public boolean animateDisappearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2) { return false; }
    public boolean animateAppearance(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2) { return false; }
    public boolean animatePersistence(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2) { return false; }
    public boolean animateChange(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p2, com.android.internal.widget.RecyclerView.ItemAnimator.ItemHolderInfo p3) { return false; }
    public abstract boolean animateRemove(com.android.internal.widget.RecyclerView.ViewHolder p0);
    public abstract boolean animateAdd(com.android.internal.widget.RecyclerView.ViewHolder p0);
    public abstract boolean animateMove(com.android.internal.widget.RecyclerView.ViewHolder p0, int p1, int p2, int p3, int p4);
    public abstract boolean animateChange(com.android.internal.widget.RecyclerView.ViewHolder p0, com.android.internal.widget.RecyclerView.ViewHolder p1, int p2, int p3, int p4, int p5);
    public final void dispatchRemoveFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public final void dispatchMoveFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public final void dispatchAddFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public final void dispatchChangeFinished(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) {}
    public final void dispatchRemoveStarting(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public final void dispatchMoveStarting(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public final void dispatchAddStarting(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public final void dispatchChangeStarting(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) {}
    public void onRemoveStarting(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void onRemoveFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void onAddStarting(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void onAddFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void onMoveStarting(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void onMoveFinished(com.android.internal.widget.RecyclerView.ViewHolder p0) {}
    public void onChangeStarting(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) {}
    public void onChangeFinished(com.android.internal.widget.RecyclerView.ViewHolder p0, boolean p1) {}
}

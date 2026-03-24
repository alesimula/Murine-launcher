package com.android.internal.widget;

class ChildHelper {
    final com.android.internal.widget.ChildHelper.Callback mCallback = null;
    final com.android.internal.widget.ChildHelper.Bucket mBucket = null;
    final java.util.List<android.view.View> mHiddenViews = null;
    ChildHelper(com.android.internal.widget.ChildHelper.Callback p0) {}
    void addView(android.view.View p0, boolean p1) {}
    void addView(android.view.View p0, int p1, boolean p2) {}
    void removeView(android.view.View p0) {}
    void removeViewAt(int p0) {}
    android.view.View getChildAt(int p0) { return null; }
    void removeAllViewsUnfiltered() {}
    android.view.View findHiddenNonRemovedView(int p0) { return null; }
    void attachViewToParent(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2, boolean p3) {}
    int getChildCount() { return 0; }
    int getUnfilteredChildCount() { return 0; }
    android.view.View getUnfilteredChildAt(int p0) { return null; }
    void detachViewFromParent(int p0) {}
    int indexOfChild(android.view.View p0) { return 0; }
    boolean isHidden(android.view.View p0) { return false; }
    void hide(android.view.View p0) {}
    void unhide(android.view.View p0) {}
    public java.lang.String toString() { return null; }
    boolean removeViewIfHidden(android.view.View p0) { return false; }

    static class Bucket {
        static final int BITS_PER_WORD = 64;
        static final long LAST_BIT = -9223372036854775808L;
        long mData;
        com.android.internal.widget.ChildHelper.Bucket mNext;
        Bucket() {}
        void set(int p0) {}
        void clear(int p0) {}
        boolean get(int p0) { return false; }
        void reset() {}
        void insert(int p0, boolean p1) {}
        boolean remove(int p0) { return false; }
        int countOnesBefore(int p0) { return 0; }
        public java.lang.String toString() { return null; }
    }

    static interface Callback {
        public int getChildCount();
        public void addView(android.view.View p0, int p1);
        public int indexOfChild(android.view.View p0);
        public void removeViewAt(int p0);
        public android.view.View getChildAt(int p0);
        public void removeAllViews();
        public com.android.internal.widget.RecyclerView.ViewHolder getChildViewHolder(android.view.View p0);
        public void attachViewToParent(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2);
        public void detachViewFromParent(int p0);
        public void onEnteredHiddenState(android.view.View p0);
        public void onLeftHiddenState(android.view.View p0);
    }
}

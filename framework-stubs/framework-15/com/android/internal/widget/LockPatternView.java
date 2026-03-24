package com.android.internal.widget;

public class LockPatternView extends android.view.View {
    public static final int VIRTUAL_BASE_VIEW_ID = 1;
    public static final boolean DEBUG_A11Y = false;
    public LockPatternView(android.content.Context p0) { super((android.content.Context)null); }
    public LockPatternView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public com.android.internal.widget.LockPatternView.CellState[][] getCellStates() { return null; }
    public boolean isInStealthMode() { return false; }
    public void setInStealthMode(boolean p0) {}
    public void setFadePattern(boolean p0) {}
    public void setOnPatternListener(com.android.internal.widget.LockPatternView.OnPatternListener p0) {}
    public void setPattern(com.android.internal.widget.LockPatternView.DisplayMode p0, java.util.List<com.android.internal.widget.LockPatternView.Cell> p1) {}
    public void setDisplayMode(com.android.internal.widget.LockPatternView.DisplayMode p0) {}
    public void startCellStateAnimation(com.android.internal.widget.LockPatternView.CellState p0, float p1, float p2, float p3, float p4, float p5, float p6, long p7, long p8, android.view.animation.Interpolator p9, java.lang.Runnable p10) {}
    public void clearPattern() {}
    public void fadeClearPattern() {}
    protected boolean dispatchHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean isEmpty() { return false; }
    public void disableInput() {}
    public void enableInput() {}
    protected void onSizeChanged(int p0, int p1, int p2, int p3) {}
    protected void onMeasure(int p0, int p1) {}
    public boolean onHoverEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    public void setColors(int p0, int p1, int p2) {}
    protected void onDraw(android.graphics.Canvas p0) {}
    protected android.os.Parcelable onSaveInstanceState() { return null; }
    protected void onRestoreInstanceState(android.os.Parcelable p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}

    public static final class Cell {
        final int row = 0;
        final int column = 0;
        public int getRow() { return 0; }
        public int getColumn() { return 0; }
        public static com.android.internal.widget.LockPatternView.Cell of(int p0, int p1) { return null; }
        public java.lang.String toString() { return null; }
    }

    public static class CellState {
        int row;
        int col;
        boolean hwAnimating;
        android.graphics.CanvasProperty<java.lang.Float> hwRadius;
        android.graphics.CanvasProperty<java.lang.Float> hwCenterX;
        android.graphics.CanvasProperty<java.lang.Float> hwCenterY;
        android.graphics.CanvasProperty<android.graphics.Paint> hwPaint;
        float radius;
        float translationY;
        float alpha;
        float activationAnimationProgress;
        public float lineEndX;
        public float lineEndY;
        @android.annotation.Nullable
        android.animation.Animator activationAnimator;
        public CellState() {}
    }

    public static enum DisplayMode {
        Correct,
        Animate,
        Wrong;
    }

    public static interface OnPatternListener {
        public void onPatternStart();
        public void onPatternCleared();
        public void onPatternCellAdded(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0);
        public void onPatternDetected(java.util.List<com.android.internal.widget.LockPatternView.Cell> p0);
    }

    private final class PatternExploreByTouchHelper extends com.android.internal.widget.ExploreByTouchHelper {
        public PatternExploreByTouchHelper(com.android.internal.widget.LockPatternView p0, android.view.View p1) { super(null); }
        protected int getVirtualViewAt(float p0, float p1) { return 0; }
        protected void getVisibleVirtualViews(android.util.IntArray p0) {}
        protected void onPopulateEventForVirtualView(int p0, android.view.accessibility.AccessibilityEvent p1) {}
        public void onPopulateAccessibilityEvent(android.view.View p0, android.view.accessibility.AccessibilityEvent p1) {}
        protected void onPopulateNodeForVirtualView(int p0, android.view.accessibility.AccessibilityNodeInfo p1) {}
        protected boolean onPerformActionForVirtualView(int p0, int p1, android.os.Bundle p2) { return false; }
        boolean onItemClicked(int p0) { return false; }

        class VirtualViewContainer {
            java.lang.CharSequence description;
            public VirtualViewContainer(com.android.internal.widget.LockPatternView.PatternExploreByTouchHelper p0, java.lang.CharSequence p1) {}
        }
    }

    private static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<com.android.internal.widget.LockPatternView.SavedState> CREATOR = null;
        SavedState() { super((android.os.Parcel)null); }
        public java.lang.String getSerializedPattern() { return null; }
        public int getDisplayMode() { return 0; }
        public boolean isInputEnabled() { return false; }
        public boolean isInStealthMode() { return false; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
    }
}

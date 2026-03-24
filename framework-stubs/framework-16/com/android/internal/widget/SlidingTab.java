package com.android.internal.widget;

public class SlidingTab extends android.view.ViewGroup {
    public SlidingTab(android.content.Context p0) { super((android.content.Context)null); }
    public SlidingTab(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    protected void onMeasure(int p0, int p1) {}
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public void reset(boolean p0) {}
    public void setVisibility(int p0) {}
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    void startAnimating(boolean p0) {}
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void setLeftTabResources(int p0, int p1, int p2, int p3) {}
    public void setLeftHintText(int p0) {}
    public void setRightTabResources(int p0, int p1, int p2, int p3) {}
    public void setRightHintText(int p0) {}
    public void setHoldAfterTrigger(boolean p0, boolean p1) {}
    public void setOnTriggerListener(com.android.internal.widget.SlidingTab.OnTriggerListener p0) {}
    protected void onVisibilityChanged(android.view.View p0, int p1) {}

    public static interface OnTriggerListener {
        public static final int NO_HANDLE = 0;
        public static final int LEFT_HANDLE = 1;
        public static final int RIGHT_HANDLE = 2;
        public void onTrigger(android.view.View p0, int p1);
        public void onGrabbedStateChange(android.view.View p0, int p1);
    }

    private static class Slider {
        public static final int ALIGN_LEFT = 0;
        public static final int ALIGN_RIGHT = 1;
        public static final int ALIGN_TOP = 2;
        public static final int ALIGN_BOTTOM = 3;
        public static final int ALIGN_UNKNOWN = 4;
        Slider(android.view.ViewGroup p0, int p1, int p2, int p3) {}
        void setIcon(int p0) {}
        void setTabBackgroundResource(int p0) {}
        void setBarBackgroundResource(int p0) {}
        void setHintText(int p0) {}
        void hide() {}
        void show(boolean p0) {}
        void setState(int p0) {}
        void showTarget() {}
        void reset(boolean p0) {}
        void setTarget(int p0) {}
        void layout(int p0, int p1, int p2, int p3, int p4) {}
        public void updateDrawableStates() {}
        public void measure(int p0, int p1) {}
        public int getTabWidth() { return 0; }
        public int getTabHeight() { return 0; }
        public void startAnimation(android.view.animation.Animation p0, android.view.animation.Animation p1) {}
        public void hideTarget() {}
    }
}

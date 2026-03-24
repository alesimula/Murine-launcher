package android.widget;

@android.widget.RemoteViews.RemoteView
public class StackView extends android.widget.AdapterViewAnimator {
    public StackView(android.content.Context p0) { super((android.content.Context)null); }
    public StackView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public StackView(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public StackView(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    void transformViewForTransition(int p0, int p1, android.view.View p2, boolean p3) {}
    @android.view.RemotableViewMethod
    public void showNext() {}
    @android.view.RemotableViewMethod
    public void showPrevious() {}
    void showOnly(int p0, boolean p1) {}
    void updateClickFeedback() {}
    void showTapFeedback(android.view.View p0) {}
    void hideTapFeedback(android.view.View p0) {}
    android.widget.FrameLayout getFrameForChild() { return null; }
    void applyTransformForChildAtIndex(android.view.View p0, int p1) {}
    protected void dispatchDraw(android.graphics.Canvas p0) {}
    public boolean onGenericMotionEvent(android.view.MotionEvent p0) { return false; }
    public boolean onInterceptTouchEvent(android.view.MotionEvent p0) { return false; }
    public boolean onTouchEvent(android.view.MotionEvent p0) { return false; }
    android.widget.StackView.LayoutParams createOrReuseLayoutParams(android.view.View p0) { return null; }
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {}
    public void advance() {}
    protected void onMeasure(int p0, int p1) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    public boolean performAccessibilityActionInternal(int p0, android.os.Bundle p1) { return false; }

    private static class HolographicHelper {
        HolographicHelper(android.content.Context p0) {}
        android.graphics.Bitmap createClickOutline(android.view.View p0, int p1) { return null; }
        android.graphics.Bitmap createResOutline(android.view.View p0, int p1) { return null; }
        android.graphics.Bitmap createOutline(android.view.View p0, int p1, int p2) { return null; }
        void drawOutline(android.graphics.Canvas p0, android.graphics.Bitmap p1) {}
    }

    class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int horizontalOffset;
        int verticalOffset;
        android.view.View mView;
        LayoutParams(android.widget.StackView p0, android.view.View p1) { super((android.view.ViewGroup.LayoutParams)null); }
        LayoutParams(android.widget.StackView p0, android.content.Context p1, android.util.AttributeSet p2) { super((android.view.ViewGroup.LayoutParams)null); }
        void invalidateGlobalRegion(android.view.View p0, android.graphics.Rect p1) {}
        android.graphics.Rect getInvalidateRect() { return null; }
        void resetInvalidateRect() {}
        public void setVerticalOffset(int p0) {}
        public void setHorizontalOffset(int p0) {}
        public void setOffsets(int p0, int p1) {}
    }

    private static class StackFrame extends android.widget.FrameLayout {
        java.lang.ref.WeakReference<android.animation.ObjectAnimator> transformAnimator;
        java.lang.ref.WeakReference<android.animation.ObjectAnimator> sliderAnimator;
        public StackFrame(android.content.Context p0) { super((android.content.Context)null); }
        void setTransformAnimator(android.animation.ObjectAnimator p0) {}
        void setSliderAnimator(android.animation.ObjectAnimator p0) {}
        boolean cancelTransformAnimator() { return false; }
        boolean cancelSliderAnimator() { return false; }
    }

    private class StackSlider {
        android.view.View mView;
        float mYProgress;
        float mXProgress;
        static final int NORMAL_MODE = 0;
        static final int BEGINNING_OF_STACK_MODE = 1;
        static final int END_OF_STACK_MODE = 2;
        int mMode;
        public StackSlider(android.widget.StackView p0) {}
        public StackSlider(android.widget.StackView p0, android.widget.StackView.StackSlider p1) {}
        void setView(android.view.View p0) {}
        public void setYProgress(float p0) {}
        public void setXProgress(float p0) {}
        void setMode(int p0) {}
        float getDurationForNeutralPosition() { return 0.0f; }
        float getDurationForOffscreenPosition() { return 0.0f; }
        float getDurationForNeutralPosition(float p0) { return 0.0f; }
        float getDurationForOffscreenPosition(float p0) { return 0.0f; }
        public float getYProgress() { return 0.0f; }
        public float getXProgress() { return 0.0f; }
    }
}

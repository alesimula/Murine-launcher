package android.widget;

public class ViewAnimator extends android.widget.FrameLayout {
    int mWhichChild;
    boolean mFirstTime;
    boolean mAnimateFirstTime;
    android.view.animation.Animation mInAnimation;
    android.view.animation.Animation mOutAnimation;
    public ViewAnimator(android.content.Context p0) { super((android.content.Context)null); }
    public ViewAnimator(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    @android.view.RemotableViewMethod
    public void setDisplayedChild(int p0) {}
    public int getDisplayedChild() { return 0; }
    @android.view.RemotableViewMethod
    public void showNext() {}
    @android.view.RemotableViewMethod
    public void showPrevious() {}
    void showOnly(int p0, boolean p1) {}
    void showOnly(int p0) {}
    public void addView(android.view.View p0, int p1, android.view.ViewGroup.LayoutParams p2) {}
    public void removeAllViews() {}
    public void removeView(android.view.View p0) {}
    public void removeViewAt(int p0) {}
    public void removeViewInLayout(android.view.View p0) {}
    public void removeViews(int p0, int p1) {}
    public void removeViewsInLayout(int p0, int p1) {}
    public android.view.View getCurrentView() { return null; }
    public android.view.animation.Animation getInAnimation() { return null; }
    public void setInAnimation(android.view.animation.Animation p0) {}
    public android.view.animation.Animation getOutAnimation() { return null; }
    public void setOutAnimation(android.view.animation.Animation p0) {}
    public void setInAnimation(android.content.Context p0, int p1) {}
    public void setOutAnimation(android.content.Context p0, int p1) {}
    public boolean getAnimateFirstView() { return false; }
    public void setAnimateFirstView(boolean p0) {}
    public int getBaseline() { return 0; }
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
}

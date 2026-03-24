package android.widget;

public class RatingBar extends android.widget.AbsSeekBar {
    public RatingBar(android.content.Context p0, android.util.AttributeSet p1, int p2) { super((android.content.Context)null); }
    public RatingBar(android.content.Context p0, android.util.AttributeSet p1, int p2, int p3) { super((android.content.Context)null); }
    public RatingBar(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    public RatingBar(android.content.Context p0) { super((android.content.Context)null); }
    public void setOnRatingBarChangeListener(android.widget.RatingBar.OnRatingBarChangeListener p0) {}
    public android.widget.RatingBar.OnRatingBarChangeListener getOnRatingBarChangeListener() { return null; }
    public void setIsIndicator(boolean p0) {}
    public boolean isIndicator() { return false; }
    public void setNumStars(int p0) {}
    public int getNumStars() { return 0; }
    public void setRating(float p0) {}
    public float getRating() { return 0.0f; }
    public void setStepSize(float p0) {}
    public float getStepSize() { return 0.0f; }
    android.graphics.drawable.shapes.Shape getDrawableShape() { return null; }
    void onProgressRefresh(float p0, boolean p1, int p2) {}
    protected synchronized void onMeasure(int p0, int p1) {}
    void onStartTrackingTouch() {}
    void onStopTrackingTouch() {}
    void onKeyChange() {}
    void dispatchRatingChange(boolean p0) {}
    public synchronized void setMax(int p0) {}
    public java.lang.CharSequence getAccessibilityClassName() { return null; }
    public void onInitializeAccessibilityNodeInfoInternal(android.view.accessibility.AccessibilityNodeInfo p0) {}
    boolean canUserSetProgress() { return false; }

    public static interface OnRatingBarChangeListener {
        public void onRatingChanged(android.widget.RatingBar p0, float p1, boolean p2);
    }
}

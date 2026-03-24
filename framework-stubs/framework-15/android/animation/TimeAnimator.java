package android.animation;

public class TimeAnimator extends android.animation.ValueAnimator {
    public TimeAnimator() { super(); }
    public void start() {}
    boolean animateBasedOnTime(long p0) { return false; }
    public void setCurrentPlayTime(long p0) {}
    public void setTimeListener(android.animation.TimeAnimator.TimeListener p0) {}
    void animateValue(float p0) {}
    void initAnimation() {}

    public static interface TimeListener {
        public void onTimeUpdate(android.animation.TimeAnimator p0, long p1, long p2);
    }
}

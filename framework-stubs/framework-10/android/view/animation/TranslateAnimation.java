package android.view.animation;

public class TranslateAnimation extends android.view.animation.Animation {
    private int mFromXType;
    private int mToXType;
    private int mFromYType;
    private int mToYType;
    @android.annotation.UnsupportedAppUsage
    protected float mFromXValue;
    @android.annotation.UnsupportedAppUsage
    protected float mToXValue;
    @android.annotation.UnsupportedAppUsage
    protected float mFromYValue;
    @android.annotation.UnsupportedAppUsage
    protected float mToYValue;
    protected float mFromXDelta;
    protected float mToXDelta;
    protected float mFromYDelta;
    protected float mToYDelta;
    public TranslateAnimation(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public TranslateAnimation(float p0, float p1, float p2, float p3) { super(); }
    public TranslateAnimation(int p0, float p1, int p2, float p3, int p4, float p5, int p6, float p7) { super(); }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public void initialize(int p0, int p1, int p2, int p3) {}
}

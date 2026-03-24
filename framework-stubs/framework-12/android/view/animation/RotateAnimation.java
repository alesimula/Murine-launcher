package android.view.animation;

public class RotateAnimation extends android.view.animation.Animation {
    private float mFromDegrees;
    private float mToDegrees;
    private int mPivotXType;
    private int mPivotYType;
    private float mPivotXValue;
    private float mPivotYValue;
    private float mPivotX;
    private float mPivotY;
    public RotateAnimation(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public RotateAnimation(float p0, float p1) { super(); }
    public RotateAnimation(float p0, float p1, float p2, float p3) { super(); }
    public RotateAnimation(float p0, float p1, int p2, float p3, int p4, float p5) { super(); }
    private void initializePivotPoint() {}
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public void initialize(int p0, int p1, int p2, int p3) {}
}

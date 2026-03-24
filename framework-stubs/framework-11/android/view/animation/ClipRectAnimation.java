package android.view.animation;

public class ClipRectAnimation extends android.view.animation.Animation {
    protected final android.graphics.Rect mFromRect = null;
    protected final android.graphics.Rect mToRect = null;
    private int mFromLeftType;
    private int mFromTopType;
    private int mFromRightType;
    private int mFromBottomType;
    private int mToLeftType;
    private int mToTopType;
    private int mToRightType;
    private int mToBottomType;
    private float mFromLeftValue;
    private float mFromTopValue;
    private float mFromRightValue;
    private float mFromBottomValue;
    private float mToLeftValue;
    private float mToTopValue;
    private float mToRightValue;
    private float mToBottomValue;
    public ClipRectAnimation(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public ClipRectAnimation(android.graphics.Rect p0, android.graphics.Rect p1) { super(); }
    public ClipRectAnimation(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) { super(); }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public boolean willChangeTransformationMatrix() { return false; }
    public void initialize(int p0, int p1, int p2, int p3) {}
}

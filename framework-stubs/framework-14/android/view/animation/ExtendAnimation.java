package android.view.animation;

public class ExtendAnimation extends android.view.animation.Animation {
    protected android.graphics.Insets mFromInsets;
    protected android.graphics.Insets mToInsets;
    public ExtendAnimation(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public ExtendAnimation(android.graphics.Insets p0, android.graphics.Insets p1) { super(); }
    public ExtendAnimation(int p0, int p1, int p2, int p3, int p4, int p5, int p6, int p7) { super(); }
    protected void applyTransformation(float p0, android.view.animation.Transformation p1) {}
    public boolean willChangeTransformationMatrix() { return false; }
    public boolean hasExtension() { return false; }
    public void initialize(int p0, int p1, int p2, int p3) {}
}

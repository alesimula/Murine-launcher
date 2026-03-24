package android.transition;

public class ArcMotion extends android.transition.PathMotion {
    private static final float DEFAULT_MIN_ANGLE_DEGREES = 0.0f;
    private static final float DEFAULT_MAX_ANGLE_DEGREES = 70.0f;
    private static final float DEFAULT_MAX_TANGENT = Float.valueOf(0.0f);
    private float mMinimumHorizontalAngle;
    private float mMinimumVerticalAngle;
    private float mMaximumAngle;
    private float mMinimumHorizontalTangent;
    private float mMinimumVerticalTangent;
    private float mMaximumTangent;
    public ArcMotion() { super(); }
    public ArcMotion(android.content.Context p0, android.util.AttributeSet p1) { super(); }
    public void setMinimumHorizontalAngle(float p0) {}
    public float getMinimumHorizontalAngle() { return 0.0f; }
    public void setMinimumVerticalAngle(float p0) {}
    public float getMinimumVerticalAngle() { return 0.0f; }
    public void setMaximumAngle(float p0) {}
    public float getMaximumAngle() { return 0.0f; }
    private static float toTangent(float p0) { return 0.0f; }
    public android.graphics.Path getPath(float p0, float p1, float p2, float p3) { return null; }
}

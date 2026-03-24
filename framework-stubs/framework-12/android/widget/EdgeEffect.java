package android.widget;

public class EdgeEffect {
    public static final long USE_STRETCH_EDGE_EFFECT_BY_DEFAULT = 171228096L;
    public static final android.graphics.BlendMode DEFAULT_BLEND_MODE = null;
    private static final int TYPE_NONE = -1;
    private static final int TYPE_GLOW = 0;
    private static final int TYPE_STRETCH = 1;
    private static final double VELOCITY_THRESHOLD = 0.01;
    private static final float LINEAR_VELOCITY_TAKE_OVER = 200.0f;
    private static final double VALUE_THRESHOLD = 0.001;
    private static final double LINEAR_DISTANCE_TAKE_OVER = 8.0;
    private static final double NATURAL_FREQUENCY = 24.657;
    private static final double DAMPING_RATIO = 0.98;
    private static final float ON_ABSORB_VELOCITY_ADJUSTMENT = 13.0f;
    private static final float LINEAR_STRETCH_INTENSITY = 0.01600000075995922f;
    private static final float EXP_STRETCH_INTENSITY = 0.01600000075995922f;
    private static final float SCROLL_DIST_AFFECTED_BY_EXP_STRETCH = 0.33000001311302185f;
    private static final java.lang.String TAG = "EdgeEffect";
    private static final int RECEDE_TIME = 600;
    private static final int PULL_TIME = 167;
    private static final int PULL_DECAY_TIME = 2000;
    private static final float MAX_ALPHA = 0.15000000596046448f;
    private static final float GLOW_ALPHA_START = 0.09000000357627869f;
    private static final float MAX_GLOW_SCALE = 2.0f;
    private static final float PULL_GLOW_BEGIN = 0.0f;
    private static final int MIN_VELOCITY = 100;
    private static final int MAX_VELOCITY = 10000;
    private static final float EPSILON = 0.0010000000474974513f;
    private static final double ANGLE = 0.5235987755982988;
    private static final float SIN = Float.valueOf(0.0f);
    private static final float COS = Float.valueOf(0.0f);
    private static final float RADIUS_FACTOR = 0.6000000238418579f;
    private float mGlowAlpha;
    private float mGlowScaleY;
    private float mDistance;
    private float mVelocity;
    private float mGlowAlphaStart;
    private float mGlowAlphaFinish;
    private float mGlowScaleYStart;
    private float mGlowScaleYFinish;
    private long mStartTime;
    private float mDuration;
    private final android.view.animation.Interpolator mInterpolator = null;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PULL = 1;
    private static final int STATE_ABSORB = 2;
    private static final int STATE_RECEDE = 3;
    private static final int STATE_PULL_DECAY = 4;
    private static final float PULL_DISTANCE_ALPHA_GLOW_FACTOR = 0.800000011920929f;
    private static final int VELOCITY_GLOW_FACTOR = 6;
    private int mState;
    private float mPullDistance;
    private final android.graphics.Rect mBounds = null;
    private float mWidth;
    private float mHeight;
    private final android.graphics.Paint mPaint = null;
    private float mRadius;
    private float mBaseGlowScale;
    private float mDisplacement;
    private float mTargetDisplacement;
    private int mEdgeEffectType;
    private android.graphics.Matrix mTmpMatrix;
    private float[] mTmpPoints;
    public EdgeEffect(android.content.Context p0) {}
    public EdgeEffect(android.content.Context p0, android.util.AttributeSet p1) {}
    private int getCurrentEdgeEffectBehavior() { return 0; }
    public void setSize(int p0, int p1) {}
    public boolean isFinished() { return false; }
    public void finish() {}
    public void onPull(float p0) {}
    public void onPull(float p0, float p1) {}
    public float onPullDistance(float p0, float p1) { return 0.0f; }
    public float getDistance() { return 0.0f; }
    public void onRelease() {}
    public void onAbsorb(int p0) {}
    public void setColor(int p0) {}
    public void setBlendMode(android.graphics.BlendMode p0) {}
    public int getColor() { return 0; }
    public android.graphics.BlendMode getBlendMode() { return null; }
    public boolean draw(android.graphics.Canvas p0) { return false; }
    private float min(float p0, float p1, float p2, float p3) { return 0.0f; }
    private float max(float p0, float p1, float p2, float p3) { return 0.0f; }
    public int getMaxHeight() { return 0; }
    private void update() {}
    private void updateSpring() {}
    private float calculateDistanceFromGlowValues(float p0, float p1) { return 0.0f; }
    private boolean isAtEquilibrium() { return false; }
    private float dampStretchVector(float p0) { return 0.0f; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EdgeEffectType {
    }
}

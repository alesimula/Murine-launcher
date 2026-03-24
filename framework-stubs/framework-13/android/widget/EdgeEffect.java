package android.widget;

public class EdgeEffect {
    public static final long USE_STRETCH_EDGE_EFFECT_BY_DEFAULT = 171228096L;
    public static final android.graphics.BlendMode DEFAULT_BLEND_MODE = null;
    public EdgeEffect(android.content.Context p0) {}
    public EdgeEffect(android.content.Context p0, android.util.AttributeSet p1) {}
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
    public int getMaxHeight() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface EdgeEffectType {
    }
}

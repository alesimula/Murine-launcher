package android.animation;

public class KeyframeSet implements android.animation.Keyframes {
    int mNumKeyframes;
    android.animation.Keyframe mFirstKeyframe;
    android.animation.Keyframe mLastKeyframe;
    android.animation.TimeInterpolator mInterpolator;
    java.util.List<android.animation.Keyframe> mKeyframes;
    android.animation.TypeEvaluator mEvaluator;
    public KeyframeSet(android.animation.Keyframe... p0) {}
    public java.util.List<android.animation.Keyframe> getKeyframes() { return null; }
    public static android.animation.KeyframeSet ofInt(int... p0) { return null; }
    public static android.animation.KeyframeSet ofFloat(float... p0) { return null; }
    public static android.animation.KeyframeSet ofKeyframe(android.animation.Keyframe... p0) { return null; }
    public static android.animation.KeyframeSet ofObject(java.lang.Object... p0) { return null; }
    public static android.animation.PathKeyframes ofPath(android.graphics.Path p0) { return null; }
    public static android.animation.PathKeyframes ofPath(android.graphics.Path p0, float p1) { return null; }
    public void setEvaluator(android.animation.TypeEvaluator p0) {}
    public java.lang.Class getType() { return null; }
    public android.animation.KeyframeSet clone() { return null; }
    public java.lang.Object getValue(float p0) { return null; }
    public java.lang.String toString() { return null; }
}

package android.animation;

public interface Keyframes extends java.lang.Cloneable {
    public void setEvaluator(android.animation.TypeEvaluator p0);
    public java.lang.Class getType();
    public java.lang.Object getValue(float p0);
    public java.util.List<android.animation.Keyframe> getKeyframes();
    public android.animation.Keyframes clone();

    public static interface FloatKeyframes extends android.animation.Keyframes {
        public float getFloatValue(float p0);
    }

    public static interface IntKeyframes extends android.animation.Keyframes {
        public int getIntValue(float p0);
    }
}

package android.animation;

public abstract class Keyframe implements java.lang.Cloneable {
    boolean mHasValue;
    boolean mValueWasSetOnStart;
    float mFraction;
    java.lang.Class mValueType;
    private android.animation.TimeInterpolator mInterpolator;
    public Keyframe() {}
    public static android.animation.Keyframe ofInt(float p0, int p1) { return null; }
    public static android.animation.Keyframe ofInt(float p0) { return null; }
    public static android.animation.Keyframe ofFloat(float p0, float p1) { return null; }
    public static android.animation.Keyframe ofFloat(float p0) { return null; }
    public static android.animation.Keyframe ofObject(float p0, java.lang.Object p1) { return null; }
    public static android.animation.Keyframe ofObject(float p0) { return null; }
    public boolean hasValue() { return false; }
    boolean valueWasSetOnStart() { return false; }
    void setValueWasSetOnStart(boolean p0) {}
    public abstract java.lang.Object getValue();
    public abstract void setValue(java.lang.Object p0);
    public float getFraction() { return 0.0f; }
    public void setFraction(float p0) {}
    public android.animation.TimeInterpolator getInterpolator() { return null; }
    public void setInterpolator(android.animation.TimeInterpolator p0) {}
    public java.lang.Class getType() { return null; }
    public abstract android.animation.Keyframe clone();

    static class FloatKeyframe extends android.animation.Keyframe {
        float mValue;
        FloatKeyframe(float p0, float p1) { super(); }
        FloatKeyframe(float p0) { super(); }
        public float getFloatValue() { return 0.0f; }
        public java.lang.Object getValue() { return null; }
        public void setValue(java.lang.Object p0) {}
        public android.animation.Keyframe.FloatKeyframe clone() { return null; }
    }

    static class IntKeyframe extends android.animation.Keyframe {
        int mValue;
        IntKeyframe(float p0, int p1) { super(); }
        IntKeyframe(float p0) { super(); }
        public int getIntValue() { return 0; }
        public java.lang.Object getValue() { return null; }
        public void setValue(java.lang.Object p0) {}
        public android.animation.Keyframe.IntKeyframe clone() { return null; }
    }

    static class ObjectKeyframe extends android.animation.Keyframe {
        java.lang.Object mValue;
        ObjectKeyframe(float p0, java.lang.Object p1) { super(); }
        public java.lang.Object getValue() { return null; }
        public void setValue(java.lang.Object p0) {}
        public android.animation.Keyframe.ObjectKeyframe clone() { return null; }
    }
}

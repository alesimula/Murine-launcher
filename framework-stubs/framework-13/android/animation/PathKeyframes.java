package android.animation;

public class PathKeyframes implements android.animation.Keyframes {
    public PathKeyframes(android.graphics.Path p0) {}
    public PathKeyframes(android.graphics.Path p0, float p1) {}
    public java.util.ArrayList<android.animation.Keyframe> getKeyframes() { return null; }
    public java.lang.Object getValue(float p0) { return null; }
    public void setEvaluator(android.animation.TypeEvaluator p0) {}
    public java.lang.Class getType() { return null; }
    public android.animation.Keyframes clone() { return null; }
    public android.animation.Keyframes.FloatKeyframes createXFloatKeyframes() { return null; }
    public android.animation.Keyframes.FloatKeyframes createYFloatKeyframes() { return null; }
    public android.animation.Keyframes.IntKeyframes createXIntKeyframes() { return null; }
    public android.animation.Keyframes.IntKeyframes createYIntKeyframes() { return null; }

    static abstract class FloatKeyframesBase extends android.animation.PathKeyframes.SimpleKeyframes implements android.animation.Keyframes.FloatKeyframes {
        FloatKeyframesBase() { super(); }
        public java.lang.Class getType() { return null; }
        public java.lang.Object getValue(float p0) { return null; }
    }

    static abstract class IntKeyframesBase extends android.animation.PathKeyframes.SimpleKeyframes implements android.animation.Keyframes.IntKeyframes {
        IntKeyframesBase() { super(); }
        public java.lang.Class getType() { return null; }
        public java.lang.Object getValue(float p0) { return null; }
    }

    private static abstract class SimpleKeyframes implements android.animation.Keyframes {
        public void setEvaluator(android.animation.TypeEvaluator p0) {}
        public java.util.ArrayList<android.animation.Keyframe> getKeyframes() { return null; }
        public android.animation.Keyframes clone() { return null; }
    }
}

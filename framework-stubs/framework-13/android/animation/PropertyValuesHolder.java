package android.animation;

public class PropertyValuesHolder implements java.lang.Cloneable {
    java.lang.String mPropertyName;
    protected android.util.Property mProperty;
    java.lang.reflect.Method mSetter;
    java.lang.Class mValueType;
    android.animation.Keyframes mKeyframes;
    final java.lang.Object[] mTmpValueArray = null;
    public static android.animation.PropertyValuesHolder ofInt(java.lang.String p0, int... p1) { return null; }
    public static android.animation.PropertyValuesHolder ofInt(android.util.Property<?, java.lang.Integer> p0, int... p1) { return null; }
    public static android.animation.PropertyValuesHolder ofMultiInt(java.lang.String p0, int[][] p1) { return null; }
    public static android.animation.PropertyValuesHolder ofMultiInt(java.lang.String p0, android.graphics.Path p1) { return null; }
    @java.lang.SafeVarargs
    public static <V extends java.lang.Object> android.animation.PropertyValuesHolder ofMultiInt(java.lang.String p0, android.animation.TypeConverter<V, int[]> p1, android.animation.TypeEvaluator<V> p2, V... p3) { return null; }
    public static <T extends java.lang.Object> android.animation.PropertyValuesHolder ofMultiInt(java.lang.String p0, android.animation.TypeConverter<T, int[]> p1, android.animation.TypeEvaluator<T> p2, android.animation.Keyframe... p3) { return null; }
    public static android.animation.PropertyValuesHolder ofFloat(java.lang.String p0, float... p1) { return null; }
    public static android.animation.PropertyValuesHolder ofFloat(android.util.Property<?, java.lang.Float> p0, float... p1) { return null; }
    public static android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String p0, float[][] p1) { return null; }
    public static android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String p0, android.graphics.Path p1) { return null; }
    @java.lang.SafeVarargs
    public static <V extends java.lang.Object> android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String p0, android.animation.TypeConverter<V, float[]> p1, android.animation.TypeEvaluator<V> p2, V... p3) { return null; }
    public static <T extends java.lang.Object> android.animation.PropertyValuesHolder ofMultiFloat(java.lang.String p0, android.animation.TypeConverter<T, float[]> p1, android.animation.TypeEvaluator<T> p2, android.animation.Keyframe... p3) { return null; }
    public static android.animation.PropertyValuesHolder ofObject(java.lang.String p0, android.animation.TypeEvaluator p1, java.lang.Object... p2) { return null; }
    public static android.animation.PropertyValuesHolder ofObject(java.lang.String p0, android.animation.TypeConverter<android.graphics.PointF, ?> p1, android.graphics.Path p2) { return null; }
    @java.lang.SafeVarargs
    public static <V extends java.lang.Object> android.animation.PropertyValuesHolder ofObject(android.util.Property p0, android.animation.TypeEvaluator<V> p1, V... p2) { return null; }
    @java.lang.SafeVarargs
    public static <T extends java.lang.Object, V extends java.lang.Object> android.animation.PropertyValuesHolder ofObject(android.util.Property<?, V> p0, android.animation.TypeConverter<T, V> p1, android.animation.TypeEvaluator<T> p2, T... p3) { return null; }
    public static <V extends java.lang.Object> android.animation.PropertyValuesHolder ofObject(android.util.Property<?, V> p0, android.animation.TypeConverter<android.graphics.PointF, V> p1, android.graphics.Path p2) { return null; }
    public static android.animation.PropertyValuesHolder ofKeyframe(java.lang.String p0, android.animation.Keyframe... p1) { return null; }
    public static android.animation.PropertyValuesHolder ofKeyframe(android.util.Property p0, android.animation.Keyframe... p1) { return null; }
    static android.animation.PropertyValuesHolder ofKeyframes(java.lang.String p0, android.animation.Keyframes p1) { return null; }
    static android.animation.PropertyValuesHolder ofKeyframes(android.util.Property p0, android.animation.Keyframes p1) { return null; }
    public void setIntValues(int... p0) {}
    public void setFloatValues(float... p0) {}
    public void setKeyframes(android.animation.Keyframe... p0) {}
    public void setObjectValues(java.lang.Object... p0) {}
    public void setConverter(android.animation.TypeConverter p0) {}
    void setupSetter(java.lang.Class p0) {}
    void setupSetterAndGetter(java.lang.Object p0) {}
    void setupStartValue(java.lang.Object p0) {}
    void setupEndValue(java.lang.Object p0) {}
    public android.animation.PropertyValuesHolder clone() { return null; }
    void setAnimatedValue(java.lang.Object p0) {}
    void init() {}
    public void setEvaluator(android.animation.TypeEvaluator p0) {}
    void calculateValue(float p0) {}
    public void setPropertyName(java.lang.String p0) {}
    public void setProperty(android.util.Property p0) {}
    public java.lang.String getPropertyName() { return null; }
    java.lang.Object getAnimatedValue() { return null; }
    public void getPropertyValues(android.animation.PropertyValuesHolder.PropertyValues p0) {}
    public java.lang.Class getValueType() { return null; }
    public java.lang.String toString() { return null; }
    static java.lang.String getMethodName(java.lang.String p0, java.lang.String p1) { return null; }

    static class FloatPropertyValuesHolder extends android.animation.PropertyValuesHolder {
        long mJniSetter;
        android.animation.Keyframes.FloatKeyframes mFloatKeyframes;
        float mFloatAnimatedValue;
        public FloatPropertyValuesHolder(java.lang.String p0, android.animation.Keyframes.FloatKeyframes p1) { super(); }
        public FloatPropertyValuesHolder(android.util.Property p0, android.animation.Keyframes.FloatKeyframes p1) { super(); }
        public FloatPropertyValuesHolder(java.lang.String p0, float... p1) { super(); }
        public FloatPropertyValuesHolder(android.util.Property p0, float... p1) { super(); }
        public void setProperty(android.util.Property p0) {}
        public void setFloatValues(float... p0) {}
        void calculateValue(float p0) {}
        java.lang.Object getAnimatedValue() { return null; }
        public android.animation.PropertyValuesHolder.FloatPropertyValuesHolder clone() { return null; }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }

    static class IntPropertyValuesHolder extends android.animation.PropertyValuesHolder {
        long mJniSetter;
        android.animation.Keyframes.IntKeyframes mIntKeyframes;
        int mIntAnimatedValue;
        public IntPropertyValuesHolder(java.lang.String p0, android.animation.Keyframes.IntKeyframes p1) { super(); }
        public IntPropertyValuesHolder(android.util.Property p0, android.animation.Keyframes.IntKeyframes p1) { super(); }
        public IntPropertyValuesHolder(java.lang.String p0, int... p1) { super(); }
        public IntPropertyValuesHolder(android.util.Property p0, int... p1) { super(); }
        public void setProperty(android.util.Property p0) {}
        public void setIntValues(int... p0) {}
        void calculateValue(float p0) {}
        java.lang.Object getAnimatedValue() { return null; }
        public android.animation.PropertyValuesHolder.IntPropertyValuesHolder clone() { return null; }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }

    static class MultiFloatValuesHolder extends android.animation.PropertyValuesHolder {
        public MultiFloatValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, java.lang.Object... p3) { super(); }
        public MultiFloatValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, android.animation.Keyframes p3) { super(); }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetterAndGetter(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }

    static class MultiIntValuesHolder extends android.animation.PropertyValuesHolder {
        public MultiIntValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, java.lang.Object... p3) { super(); }
        public MultiIntValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, android.animation.Keyframes p3) { super(); }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetterAndGetter(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }

    private static class PointFToFloatArray extends android.animation.TypeConverter<android.graphics.PointF, float[]> {
        public PointFToFloatArray() { super(null, null); }
        public float[] convert(android.graphics.PointF p0) { return null; }
    }

    private static class PointFToIntArray extends android.animation.TypeConverter<android.graphics.PointF, int[]> {
        public PointFToIntArray() { super(null, null); }
        public int[] convert(android.graphics.PointF p0) { return null; }
    }

    public static class PropertyValues {
        public java.lang.String propertyName;
        public java.lang.Class type;
        public java.lang.Object startValue;
        public java.lang.Object endValue;
        public android.animation.PropertyValuesHolder.PropertyValues.DataSource dataSource;
        public PropertyValues() {}
        public java.lang.String toString() { return null; }

        public static interface DataSource {
            public java.lang.Object getValueAtFraction(float p0);
        }
    }
}

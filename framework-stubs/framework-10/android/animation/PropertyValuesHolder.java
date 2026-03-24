package android.animation;

public class PropertyValuesHolder implements java.lang.Cloneable {
    java.lang.String mPropertyName;
    protected android.util.Property mProperty;
    java.lang.reflect.Method mSetter;
    private java.lang.reflect.Method mGetter;
    java.lang.Class mValueType;
    android.animation.Keyframes mKeyframes;
    private static final android.animation.TypeEvaluator sIntEvaluator = null;
    private static final android.animation.TypeEvaluator sFloatEvaluator = null;
    private static java.lang.Class[] FLOAT_VARIANTS;
    private static java.lang.Class[] INTEGER_VARIANTS;
    private static java.lang.Class[] DOUBLE_VARIANTS;
    private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> sSetterPropertyMap = null;
    private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> sGetterPropertyMap = null;
    final java.lang.Object[] mTmpValueArray = null;
    private android.animation.TypeEvaluator mEvaluator;
    private java.lang.Object mAnimatedValue;
    private android.animation.TypeConverter mConverter;
    private PropertyValuesHolder(java.lang.String p0) {}
    private PropertyValuesHolder(android.util.Property p0) {}
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
    private java.lang.reflect.Method getPropertyFunction(java.lang.Class p0, java.lang.String p1, java.lang.Class p2) { return null; }
    private java.lang.reflect.Method setupSetterOrGetter(java.lang.Class p0, java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.reflect.Method>> p1, java.lang.String p2, java.lang.Class p3) { return null; }
    void setupSetter(java.lang.Class p0) {}
    private void setupGetter(java.lang.Class p0) {}
    void setupSetterAndGetter(java.lang.Object p0) {}
    private java.lang.Object convertBack(java.lang.Object p0) { return null; }
    private void setupValue(java.lang.Object p0, android.animation.Keyframe p1) {}
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
    private static native long nGetIntMethod(java.lang.Class p0, java.lang.String p1);
    private static native long nGetFloatMethod(java.lang.Class p0, java.lang.String p1);
    private static native long nGetMultipleIntMethod(java.lang.Class p0, java.lang.String p1, int p2);
    private static native long nGetMultipleFloatMethod(java.lang.Class p0, java.lang.String p1, int p2);
    private static native void nCallIntMethod(java.lang.Object p0, long p1, int p2);
    private static native void nCallFloatMethod(java.lang.Object p0, long p1, float p2);
    private static native void nCallTwoIntMethod(java.lang.Object p0, long p1, int p2, int p3);
    private static native void nCallFourIntMethod(java.lang.Object p0, long p1, int p2, int p3, int p4, int p5);
    private static native void nCallMultipleIntMethod(java.lang.Object p0, long p1, int[] p2);
    private static native void nCallTwoFloatMethod(java.lang.Object p0, long p1, float p2, float p3);
    private static native void nCallFourFloatMethod(java.lang.Object p0, long p1, float p2, float p3, float p4, float p5);
    private static native void nCallMultipleFloatMethod(java.lang.Object p0, long p1, float[] p2);

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

    private static class PointFToIntArray extends android.animation.TypeConverter<android.graphics.PointF, int[]> {
        private int[] mCoordinates;
        public PointFToIntArray() { super(null, null); }
        public int[] convert(android.graphics.PointF p0) { return null; }
    }

    private static class PointFToFloatArray extends android.animation.TypeConverter<android.graphics.PointF, float[]> {
        private float[] mCoordinates;
        public PointFToFloatArray() { super(null, null); }
        public float[] convert(android.graphics.PointF p0) { return null; }
    }

    static class MultiIntValuesHolder extends android.animation.PropertyValuesHolder {
        private long mJniSetter;
        private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.Long>> sJNISetterPropertyMap = null;
        public MultiIntValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, java.lang.Object... p3) { super((java.lang.String)null); }
        public MultiIntValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, android.animation.Keyframes p3) { super((java.lang.String)null); }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetterAndGetter(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }

    static class MultiFloatValuesHolder extends android.animation.PropertyValuesHolder {
        private long mJniSetter;
        private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.Long>> sJNISetterPropertyMap = null;
        public MultiFloatValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, java.lang.Object... p3) { super((java.lang.String)null); }
        public MultiFloatValuesHolder(java.lang.String p0, android.animation.TypeConverter p1, android.animation.TypeEvaluator p2, android.animation.Keyframes p3) { super((java.lang.String)null); }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetterAndGetter(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }

    static class IntPropertyValuesHolder extends android.animation.PropertyValuesHolder {
        private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.Long>> sJNISetterPropertyMap = null;
        long mJniSetter;
        private android.util.IntProperty mIntProperty;
        android.animation.Keyframes.IntKeyframes mIntKeyframes;
        int mIntAnimatedValue;
        public IntPropertyValuesHolder(java.lang.String p0, android.animation.Keyframes.IntKeyframes p1) { super((java.lang.String)null); }
        public IntPropertyValuesHolder(android.util.Property p0, android.animation.Keyframes.IntKeyframes p1) { super((java.lang.String)null); }
        public IntPropertyValuesHolder(java.lang.String p0, int... p1) { super((java.lang.String)null); }
        public IntPropertyValuesHolder(android.util.Property p0, int... p1) { super((java.lang.String)null); }
        public void setProperty(android.util.Property p0) {}
        public void setIntValues(int... p0) {}
        void calculateValue(float p0) {}
        java.lang.Object getAnimatedValue() { return null; }
        public android.animation.PropertyValuesHolder.IntPropertyValuesHolder clone() { return null; }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }

    static class FloatPropertyValuesHolder extends android.animation.PropertyValuesHolder {
        private static final java.util.HashMap<java.lang.Class, java.util.HashMap<java.lang.String, java.lang.Long>> sJNISetterPropertyMap = null;
        long mJniSetter;
        private android.util.FloatProperty mFloatProperty;
        android.animation.Keyframes.FloatKeyframes mFloatKeyframes;
        float mFloatAnimatedValue;
        public FloatPropertyValuesHolder(java.lang.String p0, android.animation.Keyframes.FloatKeyframes p1) { super((java.lang.String)null); }
        public FloatPropertyValuesHolder(android.util.Property p0, android.animation.Keyframes.FloatKeyframes p1) { super((java.lang.String)null); }
        public FloatPropertyValuesHolder(java.lang.String p0, float... p1) { super((java.lang.String)null); }
        public FloatPropertyValuesHolder(android.util.Property p0, float... p1) { super((java.lang.String)null); }
        public void setProperty(android.util.Property p0) {}
        public void setFloatValues(float... p0) {}
        void calculateValue(float p0) {}
        java.lang.Object getAnimatedValue() { return null; }
        public android.animation.PropertyValuesHolder.FloatPropertyValuesHolder clone() { return null; }
        void setAnimatedValue(java.lang.Object p0) {}
        void setupSetter(java.lang.Class p0) {}
    }
}

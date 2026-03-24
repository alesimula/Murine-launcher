package com.android.internal.widget.remotecompose.core.operations.utilities.easing;

public class FloatAnimation extends com.android.internal.widget.remotecompose.core.operations.utilities.easing.Easing implements com.android.internal.widget.remotecompose.core.serialize.Serializable {
    float[] mSpec;
    com.android.internal.widget.remotecompose.core.operations.utilities.easing.Easing mEasingCurve;
    float mOffset;
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public FloatAnimation(float... p0) { super(); }
    public FloatAnimation(int p0, float p1, float[] p2, float p3, float p4) { super(); }
    @android.annotation.NonNull
    public static float[] packToFloatArray(float p0, int p1, float[] p2, float p3, float p4) { return null; }
    public static java.lang.String unpackAnimationToString(float[] p0) { return null; }
    public void setAnimationDescription(float[] p0) {}
    public float getDuration() { return 0.0f; }
    public void setInitialValue(float p0) {}
    float wrapDistance(float p0, float p1, float p2) { return 0.0f; }
    public void setTargetValue(float p0) {}
    public float getTargetValue() { return 0.0f; }
    public float get(float p0) { return 0.0f; }
    public float getDiff(float p0) { return 0.0f; }
    public boolean isPropagate() { return false; }
    public float getInitialValue() { return 0.0f; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}

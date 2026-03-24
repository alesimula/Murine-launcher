package com.android.internal.widget.remotecompose.core.operations;

public class TouchExpression extends com.android.internal.widget.remotecompose.core.Operation implements com.android.internal.widget.remotecompose.core.operations.ComponentData, com.android.internal.widget.remotecompose.core.VariableSupport, com.android.internal.widget.remotecompose.core.TouchListener, com.android.internal.widget.remotecompose.core.serialize.Serializable {
    public float[] mSrcExp;
    int mMode;
    float mMax;
    float mMin;
    float mOutMax;
    float mOutMin;
    float mValue;
    boolean mUnmodified;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression mExp;
    public static final int MAX_EXPRESSION_SIZE = 32;
    float mMaxTime;
    float mMaxAcceleration;
    float mMaxVelocity;
    int mStopMode;
    boolean mWrapMode;
    float[] mNotches;
    float[] mStopSpec;
    float[] mOutStopSpec;
    int mTouchEffects;
    float mVelocityId;
    public static final int STOP_GENTLY = 0;
    public static final int STOP_ENDS = 2;
    public static final int STOP_INSTANTLY = 1;
    public static final int STOP_NOTCHES_EVEN = 3;
    public static final int STOP_NOTCHES_PERCENTS = 4;
    public static final int STOP_NOTCHES_ABSOLUTE = 5;
    public static final int STOP_ABSOLUTE_POS = 6;
    float mLastValue;
    float mScrLeft;
    float mScrRight;
    float mScrTop;
    float mScrBottom;
    @android.annotation.Nullable
    com.android.internal.widget.remotecompose.core.operations.layout.Component mComponent;
    float mValueAtDown;
    float mDownTouchValue;
    public TouchExpression(int p0, float[] p1, float p2, float p3, float p4, int p5, float p6, int p7, float[] p8, float[] p9) { super(); }
    public void updateVariables(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void registerListening(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    void haptic(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    void crossNotchCheck(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void setComponent(com.android.internal.widget.remotecompose.core.operations.layout.Component p0) {}
    public void apply(com.android.internal.widget.remotecompose.core.RemoteContext p0) {}
    public void touchDown(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    public void touchUp(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2, float p3, float p4) {}
    public void touchDrag(com.android.internal.widget.remotecompose.core.RemoteContext p0, float p1, float p2) {}
    public void write(com.android.internal.widget.remotecompose.core.WireBuffer p0) {}
    public java.lang.String toString() { return null; }
    @android.annotation.NonNull
    public static java.lang.String name() { return null; }
    public static int id() { return 0; }
    public static void apply(com.android.internal.widget.remotecompose.core.WireBuffer p0, int p1, float p2, float p3, float p4, float p5, int p6, float[] p7, int p8, float[] p9, float[] p10) {}
    public static void read(com.android.internal.widget.remotecompose.core.WireBuffer p0, java.util.List<com.android.internal.widget.remotecompose.core.Operation> p1) {}
    public static void documentation(com.android.internal.widget.remotecompose.core.documentation.DocumentationBuilder p0) {}
    @android.annotation.NonNull
    public java.lang.String deepToString(java.lang.String p0) { return null; }
    public void serialize(com.android.internal.widget.remotecompose.core.serialize.MapSerializer p0) {}
}

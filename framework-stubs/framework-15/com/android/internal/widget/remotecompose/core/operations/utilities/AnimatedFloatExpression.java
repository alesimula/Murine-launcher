package com.android.internal.widget.remotecompose.core.operations.utilities;

public class AnimatedFloatExpression {
    static com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.String> sNames;
    public static final int OFFSET = 256;
    public static final float ADD = Float.valueOf(0.0f);
    public static final float SUB = Float.valueOf(0.0f);
    public static final float MUL = Float.valueOf(0.0f);
    public static final float DIV = Float.valueOf(0.0f);
    public static final float MOD = Float.valueOf(0.0f);
    public static final float MIN = Float.valueOf(0.0f);
    public static final float MAX = Float.valueOf(0.0f);
    public static final float POW = Float.valueOf(0.0f);
    public static final float SQRT = Float.valueOf(0.0f);
    public static final float ABS = Float.valueOf(0.0f);
    public static final float SIGN = Float.valueOf(0.0f);
    public static final float COPY_SIGN = Float.valueOf(0.0f);
    public static final float EXP = Float.valueOf(0.0f);
    public static final float FLOOR = Float.valueOf(0.0f);
    public static final float LOG = Float.valueOf(0.0f);
    public static final float LN = Float.valueOf(0.0f);
    public static final float ROUND = Float.valueOf(0.0f);
    public static final float SIN = Float.valueOf(0.0f);
    public static final float COS = Float.valueOf(0.0f);
    public static final float TAN = Float.valueOf(0.0f);
    public static final float ASIN = Float.valueOf(0.0f);
    public static final float ACOS = Float.valueOf(0.0f);
    public static final float ATAN = Float.valueOf(0.0f);
    public static final float ATAN2 = Float.valueOf(0.0f);
    public static final float MAD = Float.valueOf(0.0f);
    public static final float IFELSE = Float.valueOf(0.0f);
    public static final float CLAMP = Float.valueOf(0.0f);
    public static final float CBRT = Float.valueOf(0.0f);
    public static final float DEG = Float.valueOf(0.0f);
    public static final float RAD = Float.valueOf(0.0f);
    public static final float CEIL = Float.valueOf(0.0f);
    public static final float LAST_OP = 31.0f;
    public static final float VAR1 = Float.valueOf(0.0f);
    public static final float VAR2 = Float.valueOf(0.0f);
    float[] mStack;
    float[] mLocalStack;
    float[] mVar;
    com.android.internal.widget.remotecompose.core.operations.utilities.AnimatedFloatExpression.Op[] mOps;
    static final int[] NO_OF_OPS = null;
    public AnimatedFloatExpression() {}
    public static boolean isMathOperator(float p0) { return false; }
    public float eval(float[] p0, float... p1) { return 0.0f; }
    public float eval(float[] p0, int p1, float... p2) { return 0.0f; }
    public float evalDB(float[] p0, float... p1) { return 0.0f; }
    public static java.lang.String toMathName(float p0) { return null; }
    public static java.lang.String toString(float[] p0, java.lang.String[] p1) { return null; }
    static java.lang.String toString(float[] p0, int p1) { return null; }
    static boolean infix(int p0) { return false; }
    public static float asNan(int p0) { return 0.0f; }
    public static int fromNaN(float p0) { return 0; }

    static interface Op {
        public int eval(int p0);
    }
}

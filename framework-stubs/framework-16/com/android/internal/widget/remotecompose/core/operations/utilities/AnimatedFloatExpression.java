package com.android.internal.widget.remotecompose.core.operations.utilities;

public class AnimatedFloatExpression {
    @android.annotation.NonNull
    static com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.String> sNames;
    public static final int OFFSET = 3211264;
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
    public static final float A_DEREF = Float.valueOf(0.0f);
    public static final float A_MAX = Float.valueOf(0.0f);
    public static final float A_MIN = Float.valueOf(0.0f);
    public static final float A_SUM = Float.valueOf(0.0f);
    public static final float A_AVG = Float.valueOf(0.0f);
    public static final float A_LEN = Float.valueOf(0.0f);
    public static final float A_SPLINE = Float.valueOf(0.0f);
    public static final float RAND = Float.valueOf(0.0f);
    public static final float RAND_SEED = Float.valueOf(0.0f);
    public static final float NOISE_FROM = Float.valueOf(0.0f);
    public static final float RAND_IN_RANGE = Float.valueOf(0.0f);
    public static final float SQUARE_SUM = Float.valueOf(0.0f);
    public static final float STEP = Float.valueOf(0.0f);
    public static final float SQUARE = Float.valueOf(0.0f);
    public static final float DUP = Float.valueOf(0.0f);
    public static final float HYPOT = Float.valueOf(0.0f);
    public static final float SWAP = Float.valueOf(0.0f);
    public static final float LERP = Float.valueOf(0.0f);
    public static final float SMOOTH_STEP = Float.valueOf(0.0f);
    public static final int LAST_OP = 3211314;
    public static final float VAR1 = Float.valueOf(0.0f);
    public static final float VAR2 = Float.valueOf(0.0f);
    public static final float VAR3 = Float.valueOf(0.0f);
    @android.annotation.NonNull
    float[] mStack;
    @android.annotation.NonNull
    float[] mLocalStack;
    @android.annotation.NonNull
    float[] mVar;
    @android.annotation.Nullable
    com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess mCollectionsAccess;
    com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<com.android.internal.widget.remotecompose.core.operations.utilities.easing.MonotonicSpline> mSplineMap;
    static final int[] NO_OF_OPS = null;
    public AnimatedFloatExpression() {}
    public static boolean isMathOperator(float p0) { return false; }
    public float eval(float[] p0, float... p1) { return 0.0f; }
    public float eval(com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess p0, float[] p1, int p2, float... p3) { return 0.0f; }
    public float eval(com.android.internal.widget.remotecompose.core.operations.utilities.CollectionsAccess p0, float[] p1, int p2) { return 0.0f; }
    public float eval(float[] p0, int p1, float... p2) { return 0.0f; }
    public float evalDB(float[] p0, float... p1) { return 0.0f; }
    @android.annotation.Nullable
    public static java.lang.String toMathName(float p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String toString(float[] p0, java.lang.String[] p1) { return null; }
    static java.lang.String toString(float[] p0, int p1) { return null; }
    static boolean infix(int p0) { return false; }
    public static float asNan(int p0) { return 0.0f; }
    public static int fromNaN(float p0) { return 0; }
    int opEval(int p0, int p1) { return 0; }

    static interface Op {
        public int eval(int p0);
    }
}

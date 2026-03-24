package com.android.internal.widget.remotecompose.core.operations.utilities;

public class IntegerExpressionEvaluator {
    @android.annotation.NonNull
    static com.android.internal.widget.remotecompose.core.operations.utilities.IntMap<java.lang.String> sNames;
    public static final int OFFSET = 65536;
    public static final int I_ADD = 65537;
    public static final int I_SUB = 65538;
    public static final int I_MUL = 65539;
    public static final int I_DIV = 65540;
    public static final int I_MOD = 65541;
    public static final int I_SHL = 65542;
    public static final int I_SHR = 65543;
    public static final int I_USHR = 65544;
    public static final int I_OR = 65545;
    public static final int I_AND = 65546;
    public static final int I_XOR = 65547;
    public static final int I_COPY_SIGN = 65548;
    public static final int I_MIN = 65549;
    public static final int I_MAX = 65550;
    public static final int I_NEG = 65551;
    public static final int I_ABS = 65552;
    public static final int I_INCR = 65553;
    public static final int I_DECR = 65554;
    public static final int I_NOT = 65555;
    public static final int I_SIGN = 65556;
    public static final int I_CLAMP = 65557;
    public static final int I_IFELSE = 65558;
    public static final int I_MAD = 65559;
    public static final float LAST_OP = 25.0f;
    public static final int I_VAR1 = 65560;
    public static final int I_VAR2 = 65561;
    @android.annotation.NonNull
    int[] mStack;
    @android.annotation.NonNull
    int[] mLocalStack;
    @android.annotation.NonNull
    int[] mVar;
    static final int[] NO_OF_OPS = null;
    public IntegerExpressionEvaluator() {}
    public int eval(int p0, int[] p1, int... p2) { return 0; }
    public int eval(int p0, int[] p1, int p2, int... p3) { return 0; }
    public int evalDB(int p0, int[] p1, int... p2) { return 0; }
    int opEval(int p0, int p1) { return 0; }
    @android.annotation.Nullable
    public static java.lang.String toMathName(int p0) { return null; }
    @android.annotation.NonNull
    public static java.lang.String toString(int p0, int[] p1, java.lang.String[] p2) { return null; }
    @android.annotation.NonNull
    public static java.lang.String toString(int p0, int[] p1) { return null; }
    @android.annotation.NonNull
    public static java.lang.String toStringInfix(int p0, int[] p1) { return null; }
    @android.annotation.NonNull
    static java.lang.String toString(int p0, int[] p1, int p2) { return null; }
    static boolean infix(int p0) { return false; }
    public static boolean isOperation(int p0, int p1) { return false; }

    static interface Op {
        public int eval(int p0);
    }
}

package com.android.internal.widget.remotecompose.core.operations.utilities;

public class NanMap {
    public static final int MOVE = 3145728;
    public static final int LINE = 3145729;
    public static final int QUADRATIC = 3145730;
    public static final int CONIC = 3145731;
    public static final int CUBIC = 3145732;
    public static final int CLOSE = 3145733;
    public static final int DONE = 3145734;
    public static final float MOVE_NAN = Float.valueOf(0.0f);
    public static final float LINE_NAN = Float.valueOf(0.0f);
    public static final float QUADRATIC_NAN = Float.valueOf(0.0f);
    public static final float CONIC_NAN = Float.valueOf(0.0f);
    public static final float CUBIC_NAN = Float.valueOf(0.0f);
    public static final float CLOSE_NAN = Float.valueOf(0.0f);
    public static final float DONE_NAN = Float.valueOf(0.0f);
    public static final int START_VAR = 1048618;
    public static final int START_ARRAY = 2097194;
    public static final int TYPE_SYSTEM = 0;
    public static final int TYPE_VARIABLE = 1;
    public static final int TYPE_ARRAY = 2;
    public static final int TYPE_OPERATION = 3;
    public static final int ID_REGION_MASK = 7340032;
    public static final int ID_REGION_ARRAY = 2097152;
    public NanMap() {}
    public static boolean isSystemVariable(float p0) { return false; }
    public static boolean isNormalVariable(float p0) { return false; }
    public static boolean isDataVariable(float p0) { return false; }
    public static boolean isOperationVariable(float p0) { return false; }
    public static int fromNaN(float p0) { return 0; }
    public static float asNan(int p0) { return 0.0f; }
}

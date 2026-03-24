package android.neuralnetworks;

public final class Enums {
    public static final int DATA_CLASS_UNKNOWN = 0;
    public static final int DATA_CLASS_OTHER = 1;
    public static final int DATA_CLASS_FLOAT32 = 2;
    public static final int DATA_CLASS_FLOAT16 = 3;
    public static final int DATA_CLASS_QUANT = 4;
    public static final int DATA_CLASS_MIXED = 5;
    public static final int MODE_UNKNOWN = 0;
    public static final int MODE_ASYNC = 1;
    public static final int MODE_SYNC = 2;
    public static final int MODE_BURST = 3;
    public static final int MODE_ASYNC_WITH_DEPS = 4;
    public static final int RESULT_CODE_NO_ERROR = 0;
    public static final int RESULT_CODE_OUT_OF_MEMORY = 1;
    public static final int RESULT_CODE_INCOMPLETE = 2;
    public static final int RESULT_CODE_UNEXPECTED_NULL = 3;
    public static final int RESULT_CODE_BAD_DATA = 4;
    public static final int RESULT_CODE_OP_FAILED = 5;
    public static final int RESULT_CODE_BAD_STATE = 6;
    public static final int RESULT_CODE_UNMAPPABLE = 7;
    public static final int RESULT_CODE_OUTPUT_INSUFFICIENT_SIZE = 8;
    public static final int RESULT_CODE_UNAVAILABLE_DEVICE = 9;
    public static final int RESULT_CODE_MISSED_DEADLINE_TRANSIENT = 10;
    public static final int RESULT_CODE_MISSED_DEADLINE_PERSISTENT = 11;
    public static final int RESULT_CODE_RESOURCE_EXHAUSTED_TRANSIENT = 12;
    public static final int RESULT_CODE_RESOURCE_EXHAUSTED_PERSISTENT = 13;
    public static final int RESULT_CODE_DEAD_OBJECT = 14;
    public Enums() {}
}

package android.pdf;

public final class PdfEnums {
    public static final int RESPONSE_UNKNOWN = 0;
    public static final int RESPONSE_SUCCESS = 1;
    public static final int RESPONSE_FAILURE = 2;
    public static final int API_TYPE_UNKNOWN = 0;
    public static final int API_TYPE_SELECT_CONTENT = 1;
    public static final int API_TYPE_TEXT_PAGE_OBJECT = 2;
    public static final int API_TYPE_IMAGE_PAGE_OBJECT = 3;
    public static final int API_TYPE_PATH_PAGE_OBJECT = 4;
    public static final int API_TYPE_FREE_TEXT_ANNOTATION = 5;
    public static final int API_TYPE_HIGHLIGHT_ANNOTATION = 6;
    public static final int API_TYPE_STAMP_ANNOTATION = 7;
    public static final int OPERATION_TYPE_UNKNOWN = 0;
    public static final int OPERATION_TYPE_ADD = 1;
    public static final int OPERATION_TYPE_REMOVE = 2;
    public static final int OPERATION_TYPE_UPDATE = 3;
    public static final int OPERATION_TYPE_LIST = 4;
    public static final int OPERATION_TYPE_GET_TOP_PAGE_OBJECT_AT_POS = 5;
    public static final int UNKNOWN_TYPE = 0;
    public static final int LINEARIZED_TYPE = 1;
    public static final int NON_LINEARIZED_TYPE = 2;
    public static final int RESULT_UNKNOWN = 0;
    public static final int RESULT_LOADED = 1;
    public static final int RESULT_ERROR = 2;
    public static final int RESULT_WRONG_PASSWORD = 3;
    public PdfEnums() {}
}

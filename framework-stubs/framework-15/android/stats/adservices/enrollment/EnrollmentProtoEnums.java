package android.stats.adservices.enrollment;

public final class EnrollmentProtoEnums {
    public static final int UNKNOWN_TRANSACTION_TYPE = 0;
    public static final int READ_TRANSACTION_TYPE = 1;
    public static final int WRITE_TRANSACTION_TYPE = 2;
    public static final int UNKNOWN_DATA_FILE_GROUP_STATUS = 0;
    public static final int DOWNLOADED_DATA_FILE_GROUP_STATUS = 1;
    public static final int PENDING_DATA_FILE_GROUP_STATUS = 2;
    public static final int PENDING_CUSTOM_VALIDATION = 3;
    public static final int UNKNOWN_ERROR_CAUSE = 0;
    public static final int ENROLLMENT_NOT_FOUND_ERROR_CAUSE = 1;
    public static final int ENROLLMENT_BLOCKLISTED_ERROR_CAUSE = 2;
    public static final int UNKNOWN_TRANSACTION_STATUS = 0;
    public static final int SUCCESS_TRANSACTION_STATUS = 1;
    public static final int DB_NOT_FOUND_TRANSACTION_STATUS = 2;
    public static final int INVALID_INPUT_TRANSACTION_STATUS = 3;
    public static final int INVALID_OUTPUT_TRANSACTION_STATUS = 4;
    public static final int MATCH_NOT_FOUND_TRANSACTION_STATUS = 5;
    public static final int DATASTORE_EXCEPTION_TRANSACTION_STATUS = 6;
    public static final int UNKNOWN_TYPE = 0;
    public static final int INSERT_TRANSACTION_TYPE = 1;
    public static final int DELETE_TRANSACTION_TYPE = 2;
    public static final int DELETE_ALL_TRANSACTION_TYPE = 3;
    public static final int OVERWRITE_DATA_TRANSACTION_TYPE = 4;
    public static final int GET_ENROLLMENT_DATA_TRANSACTION_TYPE = 5;
    public static final int GET_ALL_ENROLLMENT_DATA_TRANSACTION_TYPE = 6;
    public static final int GET_ENROLLMENT_DATA_FROM_SDK_NAME_TRANSACTION_TYPE = 7;
    public static final int GET_ENROLLMENT_DATA_FROM_MEASUREMENT_URL_TRANSACTION_TYPE = 8;
    public static final int GET_ALL_FLEDGE_ENROLLED_ADTECHS_TRANSACTION_TYPE = 9;
    public static final int GET_ENROLLMENT_DATA_FOR_FLEDGE_BY_ADTECH_IDENTIFIER_TRANSACTION_TYPE = 10;
    public static final int GET_ENROLLMENT_DATA_FOR_FLEDGE_BY_MATCHING_ADTECH_IDENTIFIER_TRANSACTION_TYPE = 11;
    public static final int GET_ALL_PAS_ENROLLED_ADTECHS_TRANSACTION_TYPE = 12;
    public static final int GET_ENROLLMENT_DATA_FOR_PAS_BY_ADTECH_IDENTIFIER_TRANSACTION_TYPE = 13;
    public static final int GET_ENROLLMENT_DATA_FOR_PAS_BY_MATCHING_ADTECH_IDENTIFIER_TRANSACTION_TYPE = 14;
    public EnrollmentProtoEnums() {}
}

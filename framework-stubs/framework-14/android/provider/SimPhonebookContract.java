package android.provider;

public final class SimPhonebookContract {
    public static final java.lang.String AUTHORITY = "com.android.simphonebook";
    public static final android.net.Uri AUTHORITY_URI = null;
    public static final java.lang.String SUBSCRIPTION_ID_PATH_SEGMENT = "subid";
    public static java.lang.String getEfUriPath(int p0) { return null; }

    public static final class SimRecords {
        public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";
        public static final java.lang.String ELEMENTARY_FILE_TYPE = "elementary_file_type";
        public static final java.lang.String RECORD_NUMBER = "record_number";
        public static final java.lang.String NAME = "name";
        public static final java.lang.String PHONE_NUMBER = "phone_number";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sim-contact_v2";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/sim-contact_v2";
        public static final int ERROR_NAME_UNSUPPORTED = -1;
        public static final java.lang.String GET_ENCODED_NAME_LENGTH_METHOD_NAME = "get_encoded_name_length";
        public static final java.lang.String EXTRA_ENCODED_NAME_LENGTH = "android.provider.extra.ENCODED_NAME_LENGTH";
        @android.annotation.SystemApi
        public static final java.lang.String QUERY_ARG_PIN2 = "android:query-arg-pin2";
        public static android.net.Uri getContentUri(int p0, int p1) { return null; }
        public static android.net.Uri getItemUri(int p0, int p1, int p2) { return null; }
        public static int getEncodedNameLength(android.content.ContentResolver p0, java.lang.String p1) { return 0; }
    }

    public static final class ElementaryFiles {
        public static final java.lang.String SLOT_INDEX = "slot_index";
        public static final java.lang.String SUBSCRIPTION_ID = "subscription_id";
        public static final java.lang.String EF_TYPE = "ef_type";
        public static final java.lang.String MAX_RECORDS = "max_records";
        public static final java.lang.String RECORD_COUNT = "record_count";
        public static final java.lang.String NAME_MAX_LENGTH = "name_max_length";
        public static final java.lang.String PHONE_NUMBER_MAX_LENGTH = "phone_number_max_length";
        public static final int EF_UNKNOWN = 0;
        public static final int EF_ADN = 1;
        public static final int EF_FDN = 2;
        public static final int EF_SDN = 3;
        public static final java.lang.String PATH_SEGMENT_EF_ADN = "adn";
        public static final java.lang.String PATH_SEGMENT_EF_FDN = "fdn";
        public static final java.lang.String PATH_SEGMENT_EF_SDN = "sdn";
        public static final java.lang.String CONTENT_TYPE = "vnd.android.cursor.dir/sim-elementary-file";
        public static final java.lang.String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/sim-elementary-file";
        public static final java.lang.String ELEMENTARY_FILES_PATH_SEGMENT = "elementary_files";
        public static final android.net.Uri CONTENT_URI = null;
        public static android.net.Uri getItemUri(int p0, int p1) { return null; }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public static @interface EfType {
        }
    }
}

package android.provider;

@android.annotation.SystemApi
public class SearchIndexablesContract {
    public static final java.lang.String PROVIDER_INTERFACE = "android.content.action.SEARCH_INDEXABLES_PROVIDER";
    public static final java.lang.String INDEXABLES_XML_RES = "indexables_xml_res";
    public static final java.lang.String INDEXABLES_XML_RES_PATH = "settings/indexables_xml_res";
    public static final java.lang.String INDEXABLES_RAW = "indexables_raw";
    public static final java.lang.String INDEXABLES_RAW_PATH = "settings/indexables_raw";
    public static final java.lang.String NON_INDEXABLES_KEYS = "non_indexables_key";
    public static final java.lang.String SITE_MAP_PAIRS_KEYS = "site_map_pairs";
    public static final java.lang.String NON_INDEXABLES_KEYS_PATH = "settings/non_indexables_key";
    public static final java.lang.String SITE_MAP_PAIRS_PATH = "settings/site_map_pairs";
    public static final java.lang.String SLICE_URI_PAIRS = "slice_uri_pairs";
    public static final java.lang.String SLICE_URI_PAIRS_PATH = "settings/slice_uri_pairs";
    public static final java.lang.String DYNAMIC_INDEXABLES_RAW = "dynamic_indexables_raw";
    public static final java.lang.String DYNAMIC_INDEXABLES_RAW_PATH = "settings/dynamic_indexables_raw";
    public static final java.lang.String[] INDEXABLES_XML_RES_COLUMNS = null;
    public static final int COLUMN_INDEX_XML_RES_RANK = 0;
    public static final int COLUMN_INDEX_XML_RES_RESID = 1;
    public static final int COLUMN_INDEX_XML_RES_CLASS_NAME = 2;
    public static final int COLUMN_INDEX_XML_RES_ICON_RESID = 3;
    public static final int COLUMN_INDEX_XML_RES_INTENT_ACTION = 4;
    public static final int COLUMN_INDEX_XML_RES_INTENT_TARGET_PACKAGE = 5;
    public static final int COLUMN_INDEX_XML_RES_INTENT_TARGET_CLASS = 6;
    public static final java.lang.String[] INDEXABLES_RAW_COLUMNS = null;
    public static final java.lang.String[] SITE_MAP_COLUMNS = null;
    public static final int COLUMN_INDEX_RAW_RANK = 0;
    public static final int COLUMN_INDEX_RAW_TITLE = 1;
    public static final int COLUMN_INDEX_RAW_SUMMARY_ON = 2;
    public static final int COLUMN_INDEX_RAW_SUMMARY_OFF = 3;
    public static final int COLUMN_INDEX_RAW_ENTRIES = 4;
    public static final int COLUMN_INDEX_RAW_KEYWORDS = 5;
    public static final int COLUMN_INDEX_RAW_SCREEN_TITLE = 6;
    public static final int COLUMN_INDEX_RAW_CLASS_NAME = 7;
    public static final int COLUMN_INDEX_RAW_ICON_RESID = 8;
    public static final int COLUMN_INDEX_RAW_INTENT_ACTION = 9;
    public static final int COLUMN_INDEX_RAW_INTENT_TARGET_PACKAGE = 10;
    public static final int COLUMN_INDEX_RAW_INTENT_TARGET_CLASS = 11;
    public static final int COLUMN_INDEX_RAW_KEY = 12;
    public static final int COLUMN_INDEX_RAW_USER_ID = 13;
    public static final int COLUMN_INDEX_RAW_PAYLOAD_TYPE = 14;
    public static final int COLUMN_INDEX_RAW_PAYLOAD = 15;
    public static final java.lang.String[] NON_INDEXABLES_KEYS_COLUMNS = null;
    public static final int COLUMN_INDEX_NON_INDEXABLE_KEYS_KEY_VALUE = 0;
    public static final java.lang.String[] SLICE_URI_PAIRS_COLUMNS = null;
    public SearchIndexablesContract() {}

    public static class BaseColumns {
        public static final java.lang.String COLUMN_RANK = "rank";
        public static final java.lang.String COLUMN_CLASS_NAME = "className";
        public static final java.lang.String COLUMN_ICON_RESID = "iconResId";
        public static final java.lang.String COLUMN_INTENT_ACTION = "intentAction";
        public static final java.lang.String COLUMN_INTENT_TARGET_PACKAGE = "intentTargetPackage";
        public static final java.lang.String COLUMN_INTENT_TARGET_CLASS = "intentTargetClass";
    }

    public static final class NonIndexableKey extends android.provider.SearchIndexablesContract.BaseColumns {
        public static final java.lang.String MIME_TYPE = "vnd.android.cursor.dir/non_indexables_key";
        public static final java.lang.String COLUMN_KEY_VALUE = "key";
    }

    public static final class RawData extends android.provider.SearchIndexablesContract.BaseColumns {
        public static final java.lang.String MIME_TYPE = "vnd.android.cursor.dir/indexables_raw";
        public static final java.lang.String COLUMN_TITLE = "title";
        public static final java.lang.String COLUMN_SUMMARY_ON = "summaryOn";
        public static final java.lang.String COLUMN_SUMMARY_OFF = "summaryOff";
        public static final java.lang.String COLUMN_ENTRIES = "entries";
        public static final java.lang.String COLUMN_KEYWORDS = "keywords";
        public static final java.lang.String COLUMN_SCREEN_TITLE = "screenTitle";
        public static final java.lang.String COLUMN_KEY = "key";
        public static final java.lang.String COLUMN_USER_ID = "user_id";
        public static final java.lang.String PAYLOAD_TYPE = "payload_type";
        public static final java.lang.String PAYLOAD = "payload";
    }

    public static final class SiteMapColumns {
        public static final java.lang.String PARENT_CLASS = "parent_class";
        public static final java.lang.String CHILD_CLASS = "child_class";
        public static final java.lang.String PARENT_TITLE = "parent_title";
        public static final java.lang.String CHILD_TITLE = "child_title";
        public SiteMapColumns() {}
    }

    public static final class SliceUriPairColumns {
        public static final java.lang.String KEY = "key";
        public static final java.lang.String SLICE_URI = "slice_uri";
    }

    public static final class XmlResource extends android.provider.SearchIndexablesContract.BaseColumns {
        public static final java.lang.String MIME_TYPE = "vnd.android.cursor.dir/indexables_xml_res";
        public static final java.lang.String COLUMN_XML_RESID = "xmlResId";
    }
}

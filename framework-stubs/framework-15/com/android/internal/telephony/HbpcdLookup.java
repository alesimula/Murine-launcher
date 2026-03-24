package com.android.internal.telephony;

public class HbpcdLookup {
    public static final java.lang.String AUTHORITY = "hbpcd_lookup";
    public static final android.net.Uri CONTENT_URI = null;
    public static final java.lang.String PATH_MCC_IDD = "idd";
    public static final java.lang.String PATH_MCC_LOOKUP_TABLE = "lookup";
    public static final java.lang.String PATH_MCC_SID_CONFLICT = "conflict";
    public static final java.lang.String PATH_MCC_SID_RANGE = "range";
    public static final java.lang.String PATH_NANP_AREA_CODE = "nanp";
    public static final java.lang.String PATH_ARBITRARY_MCC_SID_MATCH = "arbitrary";
    public static final java.lang.String PATH_USERADD_COUNTRY = "useradd";
    public static final java.lang.String ID = "_id";
    public static final int IDINDEX = 0;
    public HbpcdLookup() {}

    public static class ArbitraryMccSidMatch implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "MCC ASC";
        public static final java.lang.String MCC = "MCC";
        public static final java.lang.String SID = "SID";
        public ArbitraryMccSidMatch() {}
    }

    public static class MccIdd implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "MCC ASC";
        public static final java.lang.String MCC = "MCC";
        public static final java.lang.String IDD = "IDD";
        public MccIdd() {}
    }

    public static class MccLookup implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "MCC ASC";
        public static final java.lang.String MCC = "MCC";
        public static final java.lang.String COUNTRY_CODE = "Country_Code";
        public static final java.lang.String COUNTRY_NAME = "Country_Name";
        public static final java.lang.String NDD = "NDD";
        public static final java.lang.String NANPS = "NANPS";
        public static final java.lang.String GMT_OFFSET_LOW = "GMT_Offset_Low";
        public static final java.lang.String GMT_OFFSET_HIGH = "GMT_Offset_High";
        public static final java.lang.String GMT_DST_LOW = "GMT_DST_Low";
        public static final java.lang.String GMT_DST_HIGH = "GMT_DST_High";
        public MccLookup() {}
    }

    public static class MccSidConflicts implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "MCC ASC";
        public static final java.lang.String MCC = "MCC";
        public static final java.lang.String SID_CONFLICT = "SID_Conflict";
        public MccSidConflicts() {}
    }

    public static class MccSidRange implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "MCC ASC";
        public static final java.lang.String MCC = "MCC";
        public static final java.lang.String RANGE_LOW = "SID_Range_Low";
        public static final java.lang.String RANGE_HIGH = "SID_Range_High";
        public MccSidRange() {}
    }

    public static class NanpAreaCode implements android.provider.BaseColumns {
        public static final android.net.Uri CONTENT_URI = null;
        public static final java.lang.String DEFAULT_SORT_ORDER = "Area_Code ASC";
        public static final java.lang.String AREA_CODE = "Area_Code";
        public NanpAreaCode() {}
    }
}

package com.android.internal.telephony;

public class SmsNumberUtils {
    private static final java.lang.String TAG = "SmsNumberUtils";
    private static final boolean DBG = Boolean.valueOf(false);
    private static final java.lang.String PLUS_SIGN = "+";
    private static final int NANP_SHORT_LENGTH = 7;
    private static final int NANP_MEDIUM_LENGTH = 10;
    private static final int NANP_LONG_LENGTH = 11;
    private static final int NANP_CC = 1;
    private static final java.lang.String NANP_NDD = "1";
    private static final java.lang.String NANP_IDD = "011";
    private static final int MIN_COUNTRY_AREA_LOCAL_LENGTH = 10;
    private static final int GSM_UMTS_NETWORK = 0;
    private static final int CDMA_HOME_NETWORK = 1;
    private static final int CDMA_ROAMING_NETWORK = 2;
    private static final int NP_NONE = 0;
    private static final int NP_NANP_BEGIN = 1;
    private static final int NP_NANP_LOCAL = 1;
    private static final int NP_NANP_AREA_LOCAL = 2;
    private static final int NP_NANP_NDD_AREA_LOCAL = 3;
    private static final int NP_NANP_NBPCD_CC_AREA_LOCAL = 4;
    private static final int NP_NANP_LOCALIDD_CC_AREA_LOCAL = 5;
    private static final int NP_NANP_NBPCD_HOMEIDD_CC_AREA_LOCAL = 6;
    private static final int NP_INTERNATIONAL_BEGIN = 100;
    private static final int NP_NBPCD_HOMEIDD_CC_AREA_LOCAL = 100;
    private static final int NP_HOMEIDD_CC_AREA_LOCAL = 101;
    private static final int NP_NBPCD_CC_AREA_LOCAL = 102;
    private static final int NP_LOCALIDD_CC_AREA_LOCAL = 103;
    private static final int NP_CC_AREA_LOCAL = 104;
    private static int[] ALL_COUNTRY_CODES;
    private static int MAX_COUNTRY_CODES_LENGTH;
    private static java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> IDDS_MAPS;
    public SmsNumberUtils() {}
    private static java.lang.String formatNumber(android.content.Context p0, java.lang.String p1, java.lang.String p2, int p3) { return null; }
    private static java.util.ArrayList<java.lang.String> getAllIDDs(android.content.Context p0, java.lang.String p1) { return null; }
    private static int checkNANP(com.android.internal.telephony.SmsNumberUtils.NumberEntry p0, java.util.ArrayList<java.lang.String> p1) { return 0; }
    private static boolean isNANP(java.lang.String p0) { return false; }
    private static boolean isTwoToNine(char p0) { return false; }
    private static int checkInternationalNumberPlan(android.content.Context p0, com.android.internal.telephony.SmsNumberUtils.NumberEntry p1, java.util.ArrayList<java.lang.String> p2, java.lang.String p3) { return 0; }
    private static int getCountryCode(android.content.Context p0, java.lang.String p1) { return 0; }
    private static int[] getAllCountryCodes(android.content.Context p0) { return null; }
    private static boolean inExceptionListForNpCcAreaLocal(com.android.internal.telephony.SmsNumberUtils.NumberEntry p0) { return false; }
    private static java.lang.String getNumberPlanType(int p0) { return null; }
    public static java.lang.String filterDestAddr(android.content.Context p0, int p1, java.lang.String p2) { return null; }
    private static int getNetworkType(android.telephony.TelephonyManager p0) { return 0; }
    private static boolean isInternationalRoaming(android.telephony.TelephonyManager p0) { return false; }
    private static boolean needToConvert(android.content.Context p0, int p1) { return false; }
    private static java.lang.String pii(java.lang.String p0, java.lang.Object p1) { return null; }
    private static java.lang.String secureHash(byte[] p0) { return null; }

    private static class NumberEntry {
        public java.lang.String number;
        public java.lang.String IDD;
        public int countryCode;
        public NumberEntry(java.lang.String p0) {}
    }
}

package com.android.internal.telephony;

public final class MccTable {
    static final java.lang.String LOG_TAG = "MccTable";
    static java.util.ArrayList<com.android.internal.telephony.MccTable.MccEntry> sTable;
    public static final java.util.Map<java.util.Locale, java.util.Locale> FALLBACKS = null;
    public MccTable() {}
    public static com.android.internal.telephony.MccTable.MccEntry entryForMcc(int p0) { return null; }
    public static java.lang.String countryCodeForMcc(int p0) { return null; }
    public static java.lang.String countryCodeForMcc(java.lang.String p0) { return null; }
    public static java.lang.String geoCountryCodeForMccMnc(com.android.internal.telephony.MccTable.MccMnc p0) { return null; }
    public static int smallestDigitsMccForMnc(int p0) { return 0; }
    public static void updateMccMncConfiguration(android.content.Context p0, java.lang.String p1) {}

    public static class MccEntry implements java.lang.Comparable<com.android.internal.telephony.MccTable.MccEntry> {
        final int mMcc = 0;
        public final java.lang.String mIso = null;
        final int mSmallestDigitsMnc = 0;
        MccEntry(int p0, java.lang.String p1, int p2) {}
        public int compareTo(com.android.internal.telephony.MccTable.MccEntry p0) { return 0; }
    }

    public static class MccMnc {
        public final java.lang.String mcc = null;
        public final java.lang.String mnc = null;
        public static com.android.internal.telephony.MccTable.MccMnc fromOperatorNumeric(java.lang.String p0) { return null; }
        public MccMnc(java.lang.String p0, java.lang.String p1) {}
        public boolean equals(java.lang.Object p0) { return false; }
        public int hashCode() { return 0; }
        public java.lang.String toString() { return null; }
    }
}

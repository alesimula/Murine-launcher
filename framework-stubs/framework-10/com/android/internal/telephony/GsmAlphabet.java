package com.android.internal.telephony;

public class GsmAlphabet {
    private static final java.lang.String TAG = "GSM";
    public static final byte GSM_EXTENDED_ESCAPE = 27;
    public static final int UDH_SEPTET_COST_LENGTH = 1;
    public static final int UDH_SEPTET_COST_ONE_SHIFT_TABLE = 4;
    public static final int UDH_SEPTET_COST_TWO_SHIFT_TABLES = 7;
    public static final int UDH_SEPTET_COST_CONCATENATED_MESSAGE = 6;
    @android.annotation.UnsupportedAppUsage
    private static final android.util.SparseIntArray[] sCharsToGsmTables = null;
    @android.annotation.UnsupportedAppUsage
    private static final android.util.SparseIntArray[] sCharsToShiftTables = null;
    @android.annotation.UnsupportedAppUsage
    private static int[] sEnabledSingleShiftTables;
    @android.annotation.UnsupportedAppUsage
    private static int[] sEnabledLockingShiftTables;
    @android.annotation.UnsupportedAppUsage
    private static int sHighestEnabledSingleShiftCode;
    private static boolean sDisableCountryEncodingCheck;
    @android.annotation.UnsupportedAppUsage
    private static final java.lang.String[] sLanguageTables = null;
    @android.annotation.UnsupportedAppUsage
    private static final java.lang.String[] sLanguageShiftTables = null;
    private GsmAlphabet() {}
    @android.annotation.UnsupportedAppUsage
    public static int charToGsm(char p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int charToGsm(char p0, boolean p1) throws com.android.internal.telephony.EncodeException { return 0; }
    public static int charToGsmExtended(char p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static char gsmToChar(int p0) { return 0; }
    public static char gsmExtendedToChar(int p0) { return 0; }
    public static byte[] stringToGsm7BitPackedWithHeader(java.lang.String p0, byte[] p1) throws com.android.internal.telephony.EncodeException { return null; }
    @android.annotation.UnsupportedAppUsage
    public static byte[] stringToGsm7BitPackedWithHeader(java.lang.String p0, byte[] p1, int p2, int p3) throws com.android.internal.telephony.EncodeException { return null; }
    @android.annotation.UnsupportedAppUsage
    public static byte[] stringToGsm7BitPacked(java.lang.String p0) throws com.android.internal.telephony.EncodeException { return null; }
    public static byte[] stringToGsm7BitPacked(java.lang.String p0, int p1, int p2) throws com.android.internal.telephony.EncodeException { return null; }
    @android.annotation.UnsupportedAppUsage
    public static byte[] stringToGsm7BitPacked(java.lang.String p0, int p1, boolean p2, int p3, int p4) throws com.android.internal.telephony.EncodeException { return null; }
    @android.annotation.UnsupportedAppUsage
    private static void packSmsChar(byte[] p0, int p1, int p2) {}
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String gsm7BitPackedToString(byte[] p0, int p1, int p2) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String gsm7BitPackedToString(byte[] p0, int p1, int p2, int p3, int p4, int p5) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String gsm8BitUnpackedToString(byte[] p0, int p1, int p2) { return null; }
    @android.annotation.UnsupportedAppUsage(maxTargetSdk=28, trackingBug=115609023L)
    public static java.lang.String gsm8BitUnpackedToString(byte[] p0, int p1, int p2, java.lang.String p3) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static byte[] stringToGsm8BitPacked(java.lang.String p0) { return null; }
    public static void stringToGsm8BitUnpackedField(java.lang.String p0, byte[] p1, int p2, int p3) {}
    public static int countGsmSeptets(char p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static int countGsmSeptets(char p0, boolean p1) throws com.android.internal.telephony.EncodeException { return 0; }
    public static boolean isGsmSeptets(char p0) { return false; }
    public static int countGsmSeptetsUsingTables(java.lang.CharSequence p0, boolean p1, int p2, int p3) { return 0; }
    public static com.android.internal.telephony.GsmAlphabet.TextEncodingDetails countGsmSeptets(java.lang.CharSequence p0, boolean p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static int findGsmSeptetLimitIndex(java.lang.String p0, int p1, int p2, int p3, int p4) { return 0; }
    public static synchronized void setEnabledSingleShiftTables(int[] p0) {}
    public static synchronized void setEnabledLockingShiftTables(int[] p0) {}
    public static synchronized int[] getEnabledSingleShiftTables() { return null; }
    public static synchronized int[] getEnabledLockingShiftTables() { return null; }
    private static void enableCountrySpecificEncodings() {}

    public static class TextEncodingDetails {
        @android.annotation.UnsupportedAppUsage
        public int msgCount;
        @android.annotation.UnsupportedAppUsage
        public int codeUnitCount;
        @android.annotation.UnsupportedAppUsage
        public int codeUnitsRemaining;
        @android.annotation.UnsupportedAppUsage
        public int codeUnitSize;
        @android.annotation.UnsupportedAppUsage
        public int languageTable;
        @android.annotation.UnsupportedAppUsage
        public int languageShiftTable;
        public TextEncodingDetails() {}
        public java.lang.String toString() { return null; }
    }

    private static class LanguagePairCount {
        @android.annotation.UnsupportedAppUsage
        final int languageCode = 0;
        @android.annotation.UnsupportedAppUsage
        final int[] septetCounts = null;
        @android.annotation.UnsupportedAppUsage
        final int[] unencodableCounts = null;
        @android.annotation.UnsupportedAppUsage
        LanguagePairCount(int p0) {}
    }
}

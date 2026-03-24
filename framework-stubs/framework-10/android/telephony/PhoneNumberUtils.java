package android.telephony;

public class PhoneNumberUtils {
    public static final int BCD_EXTENDED_TYPE_EF_ADN = 1;
    public static final int BCD_EXTENDED_TYPE_CALLED_PARTY = 2;
    public static final char PAUSE = ',';
    public static final char WAIT = ';';
    public static final char WILD = 'N';
    private static final java.lang.String CLIR_ON = "*31#";
    private static final java.lang.String CLIR_OFF = "#31#";
    public static final int TOA_International = 145;
    public static final int TOA_Unknown = 129;
    static final java.lang.String LOG_TAG = "PhoneNumberUtils";
    private static final boolean DBG = false;
    private static final java.lang.String BCD_EF_ADN_EXTENDED = "*#,N;";
    private static final java.lang.String BCD_CALLED_PARTY_EXTENDED = "*#abc";
    private static final java.util.regex.Pattern GLOBAL_PHONE_NUMBER_PATTERN = null;
    public static final int FORMAT_UNKNOWN = 0;
    public static final int FORMAT_NANP = 1;
    public static final int FORMAT_JAPAN = 2;
    private static final java.lang.String[] NANP_COUNTRIES = null;
    private static final java.lang.String KOREA_ISO_COUNTRY_CODE = "KR";
    private static final java.lang.String JAPAN_ISO_COUNTRY_CODE = "JP";
    private static final int NANP_STATE_DIGIT = 1;
    private static final int NANP_STATE_PLUS = 2;
    private static final int NANP_STATE_ONE = 3;
    private static final int NANP_STATE_DASH = 4;
    @android.annotation.UnsupportedAppUsage
    static final int MIN_MATCH = 7;
    private static final android.util.SparseIntArray KEYPAD_MAP = null;
    private static final char PLUS_SIGN_CHAR = '+';
    private static final java.lang.String PLUS_SIGN_STRING = "+";
    private static final java.lang.String NANP_IDP_STRING = "011";
    private static final int NANP_LENGTH = 10;
    private static final boolean[] COUNTRY_CALLING_CALL = null;
    private static final int CCC_LENGTH = Integer.valueOf(0);
    private static java.lang.String[] sConvertToEmergencyMap;
    public PhoneNumberUtils() {}
    public static boolean isISODigit(char p0) { return false; }
    public static final boolean is12Key(char p0) { return false; }
    public static final boolean isDialable(char p0) { return false; }
    public static final boolean isReallyDialable(char p0) { return false; }
    public static final boolean isNonSeparator(char p0) { return false; }
    public static final boolean isStartsPostDial(char p0) { return false; }
    private static boolean isPause(char p0) { return false; }
    private static boolean isToneWait(char p0) { return false; }
    private static boolean isSeparator(char p0) { return false; }
    public static java.lang.String getNumberFromIntent(android.content.Intent p0, android.content.Context p1) { return null; }
    public static java.lang.String extractNetworkPortion(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String extractNetworkPortionAlt(java.lang.String p0) { return null; }
    public static java.lang.String stripSeparators(java.lang.String p0) { return null; }
    public static java.lang.String convertAndStrip(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String convertPreDial(java.lang.String p0) { return null; }
    private static int minPositive(int p0, int p1) { return 0; }
    private static void log(java.lang.String p0) {}
    private static int indexOfLastNetworkChar(java.lang.String p0) { return 0; }
    public static java.lang.String extractPostDialPortion(java.lang.String p0) { return null; }
    public static boolean compare(java.lang.String p0, java.lang.String p1) { return false; }
    public static boolean compare(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean compare(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean compareLoosely(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean compareStrictly(java.lang.String p0, java.lang.String p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean compareStrictly(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    public static java.lang.String toCallerIDMinMatch(java.lang.String p0) { return null; }
    public static java.lang.String getStrippedReversed(java.lang.String p0) { return null; }
    private static java.lang.String internalGetStrippedReversed(java.lang.String p0, int p1) { return null; }
    public static java.lang.String stringFromStringAndTOA(java.lang.String p0, int p1) { return null; }
    public static int toaFromString(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public static java.lang.String calledPartyBCDToString(byte[] p0, int p1, int p2) { return null; }
    public static java.lang.String calledPartyBCDToString(byte[] p0, int p1, int p2, int p3) { return null; }
    private static void internalCalledPartyBCDFragmentToString(java.lang.StringBuilder p0, byte[] p1, int p2, int p3, int p4) {}
    @java.lang.Deprecated
    public static java.lang.String calledPartyBCDFragmentToString(byte[] p0, int p1, int p2) { return null; }
    public static java.lang.String calledPartyBCDFragmentToString(byte[] p0, int p1, int p2, int p3) { return null; }
    private static char bcdToChar(byte p0, int p1) { return 0; }
    private static int charToBCD(char p0, int p1) { return 0; }
    public static boolean isWellFormedSmsAddress(java.lang.String p0) { return false; }
    public static boolean isGlobalPhoneNumber(java.lang.String p0) { return false; }
    private static boolean isDialable(java.lang.String p0) { return false; }
    private static boolean isNonSeparator(java.lang.String p0) { return false; }
    public static byte[] networkPortionToCalledPartyBCD(java.lang.String p0) { return null; }
    public static byte[] networkPortionToCalledPartyBCDWithLength(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static byte[] numberToCalledPartyBCD(java.lang.String p0) { return null; }
    public static byte[] numberToCalledPartyBCD(java.lang.String p0, int p1) { return null; }
    private static byte[] numberToCalledPartyBCDHelper(java.lang.String p0, boolean p1, int p2) { return null; }
    @java.lang.Deprecated
    public static java.lang.String formatNumber(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String formatNumber(java.lang.String p0, int p1) { return null; }
    @java.lang.Deprecated
    public static int getFormatTypeForLocale(java.util.Locale p0) { return 0; }
    @java.lang.Deprecated
    public static void formatNumber(android.text.Editable p0, int p1) {}
    @java.lang.Deprecated
    public static void formatNanpNumber(android.text.Editable p0) {}
    @java.lang.Deprecated
    public static void formatJapaneseNumber(android.text.Editable p0) {}
    private static void removeDashes(android.text.Editable p0) {}
    public static java.lang.String formatNumberToE164(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String formatNumberToRFC3966(java.lang.String p0, java.lang.String p1) { return null; }
    private static java.lang.String formatNumberInternal(java.lang.String p0, java.lang.String p1, com.android.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat p2) { return null; }
    public static boolean isInternationalNumber(java.lang.String p0, java.lang.String p1) { return false; }
    public static java.lang.String formatNumber(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String formatNumber(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static java.lang.String normalizeNumber(java.lang.String p0) { return null; }
    public static java.lang.String replaceUnicodeDigits(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static boolean isEmergencyNumber(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isEmergencyNumber(int p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public static boolean isPotentialEmergencyNumber(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isPotentialEmergencyNumber(int p0, java.lang.String p1) { return false; }
    private static boolean isEmergencyNumberInternal(java.lang.String p0, boolean p1) { return false; }
    private static boolean isEmergencyNumberInternal(int p0, java.lang.String p1, boolean p2) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isEmergencyNumber(java.lang.String p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public static boolean isEmergencyNumber(int p0, java.lang.String p1, java.lang.String p2) { return false; }
    @java.lang.Deprecated
    public static boolean isPotentialEmergencyNumber(java.lang.String p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public static boolean isPotentialEmergencyNumber(int p0, java.lang.String p1, java.lang.String p2) { return false; }
    private static boolean isEmergencyNumberInternal(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    private static boolean isEmergencyNumberInternal(int p0, java.lang.String p1, java.lang.String p2, boolean p3) { return false; }
    @java.lang.Deprecated
    public static boolean isLocalEmergencyNumber(android.content.Context p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isLocalEmergencyNumber(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isPotentialLocalEmergencyNumber(android.content.Context p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static boolean isPotentialLocalEmergencyNumber(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    private static boolean isLocalEmergencyNumberInternal(java.lang.String p0, android.content.Context p1, boolean p2) { return false; }
    private static boolean isLocalEmergencyNumberInternal(int p0, java.lang.String p1, android.content.Context p2, boolean p3) { return false; }
    public static boolean isVoiceMailNumber(java.lang.String p0) { return false; }
    public static boolean isVoiceMailNumber(int p0, java.lang.String p1) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isVoiceMailNumber(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    public static java.lang.String convertKeypadLettersToDigits(java.lang.String p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String cdmaCheckAndProcessPlusCode(java.lang.String p0) { return null; }
    public static java.lang.String cdmaCheckAndProcessPlusCodeForSms(java.lang.String p0) { return null; }
    public static java.lang.String cdmaCheckAndProcessPlusCodeByNumberFormat(java.lang.String p0, int p1, int p2) { return null; }
    public static java.lang.CharSequence createTtsSpannable(java.lang.CharSequence p0) { return null; }
    public static void addTtsSpan(android.text.Spannable p0, int p1, int p2) {}
    @java.lang.Deprecated
    @android.annotation.UnsupportedAppUsage
    public static java.lang.CharSequence ttsSpanAsPhoneNumber(java.lang.CharSequence p0) { return null; }
    @java.lang.Deprecated
    public static void ttsSpanAsPhoneNumber(android.text.Spannable p0, int p1, int p2) {}
    public static android.text.style.TtsSpan createTtsSpan(java.lang.String p0) { return null; }
    private static java.lang.String splitAtNonNumerics(java.lang.CharSequence p0) { return null; }
    private static java.lang.String getCurrentIdp(boolean p0) { return null; }
    private static boolean isTwoToNine(char p0) { return false; }
    private static int getFormatTypeFromCountryCode(java.lang.String p0) { return 0; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isNanp(java.lang.String p0) { return false; }
    private static boolean isOneNanp(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static boolean isUriNumber(java.lang.String p0) { return false; }
    @android.annotation.UnsupportedAppUsage
    public static java.lang.String getUsernameFromUriNumber(java.lang.String p0) { return null; }
    public static android.net.Uri convertSipUriToTelUri(android.net.Uri p0) { return null; }
    private static java.lang.String processPlusCode(java.lang.String p0, boolean p1) { return null; }
    private static int findDialableIndexFromPostDialStr(java.lang.String p0) { return 0; }
    private static java.lang.String appendPwCharBackToOrigDialStr(int p0, java.lang.String p1, java.lang.String p2) { return null; }
    private static boolean matchIntlPrefix(java.lang.String p0, int p1) { return false; }
    private static boolean matchIntlPrefixAndCC(java.lang.String p0, int p1) { return false; }
    private static boolean matchTrunkPrefix(java.lang.String p0, int p1) { return false; }
    private static boolean isCountryCallingCode(int p0) { return false; }
    private static int tryGetISODigit(char p0) { return 0; }
    private static android.telephony.PhoneNumberUtils.CountryCallingCodeAndNewIndex tryGetCountryCallingCodeAndNewIndex(java.lang.String p0, boolean p1) { return null; }
    private static int tryGetTrunkPrefixOmittedIndex(java.lang.String p0, int p1) { return 0; }
    private static boolean checkPrefixIsIgnorable(java.lang.String p0, int p1, int p2) { return false; }
    private static int getDefaultVoiceSubId() { return 0; }
    public static java.lang.String convertToEmergencyNumber(android.content.Context p0, java.lang.String p1) { return null; }

    private static class CountryCallingCodeAndNewIndex {
        public final int countryCallingCode = 0;
        public final int newIndex = 0;
        public CountryCallingCodeAndNewIndex(int p0, int p1) {}
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BcdExtendType {
    }
}

package android.telephony;

public class PhoneNumberUtils {
    public static final int BCD_EXTENDED_TYPE_EF_ADN = 1;
    public static final int BCD_EXTENDED_TYPE_CALLED_PARTY = 2;
    public static final char PAUSE = ',';
    public static final char WAIT = ';';
    public static final char WILD = 'N';
    public static final int TOA_International = 145;
    public static final int TOA_Unknown = 129;
    static final java.lang.String LOG_TAG = "PhoneNumberUtils";
    public static final int FORMAT_UNKNOWN = 0;
    public static final int FORMAT_NANP = 1;
    public static final int FORMAT_JAPAN = 2;
    public PhoneNumberUtils() {}
    public static boolean isISODigit(char p0) { return false; }
    public static final boolean is12Key(char p0) { return false; }
    public static final boolean isDialable(char p0) { return false; }
    public static final boolean isReallyDialable(char p0) { return false; }
    public static final boolean isNonSeparator(char p0) { return false; }
    public static final boolean isStartsPostDial(char p0) { return false; }
    public static int getMinMatchForTest() { return 0; }
    public static void setMinMatchForTest(int p0) {}
    public static java.lang.String getNumberFromIntent(android.content.Intent p0, android.content.Context p1) { return null; }
    public static java.lang.String extractNetworkPortion(java.lang.String p0) { return null; }
    public static java.lang.String extractNetworkPortionAlt(java.lang.String p0) { return null; }
    public static java.lang.String stripSeparators(java.lang.String p0) { return null; }
    public static java.lang.String convertAndStrip(java.lang.String p0) { return null; }
    public static java.lang.String convertPreDial(java.lang.String p0) { return null; }
    public static java.lang.String extractPostDialPortion(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static boolean compare(java.lang.String p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public static boolean compare(android.content.Context p0, java.lang.String p1, java.lang.String p2) { return false; }
    public static boolean compare(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    public static boolean compareLoosely(java.lang.String p0, java.lang.String p1) { return false; }
    public static boolean compareStrictly(java.lang.String p0, java.lang.String p1) { return false; }
    public static boolean compareStrictly(java.lang.String p0, java.lang.String p1, boolean p2) { return false; }
    public static java.lang.String toCallerIDMinMatch(java.lang.String p0) { return null; }
    public static java.lang.String getStrippedReversed(java.lang.String p0) { return null; }
    public static java.lang.String stringFromStringAndTOA(java.lang.String p0, int p1) { return null; }
    public static int toaFromString(java.lang.String p0) { return 0; }
    @java.lang.Deprecated
    public static java.lang.String calledPartyBCDToString(byte[] p0, int p1, int p2) { return null; }
    public static java.lang.String calledPartyBCDToString(byte[] p0, int p1, int p2, int p3) { return null; }
    @java.lang.Deprecated
    public static java.lang.String calledPartyBCDFragmentToString(byte[] p0, int p1, int p2) { return null; }
    public static java.lang.String calledPartyBCDFragmentToString(byte[] p0, int p1, int p2, int p3) { return null; }
    public static boolean isWellFormedSmsAddress(java.lang.String p0) { return false; }
    public static boolean isGlobalPhoneNumber(java.lang.String p0) { return false; }
    public static byte[] networkPortionToCalledPartyBCD(java.lang.String p0) { return null; }
    public static byte[] networkPortionToCalledPartyBCDWithLength(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static byte[] numberToCalledPartyBCD(java.lang.String p0) { return null; }
    public static byte[] numberToCalledPartyBCD(java.lang.String p0, int p1) { return null; }
    @java.lang.Deprecated
    public static java.lang.String formatNumber(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static java.lang.String formatNumber(java.lang.String p0, int p1) { return null; }
    @java.lang.Deprecated
    public static int getFormatTypeForLocale(java.util.Locale p0) { return 0; }
    @java.lang.Deprecated
    public static void formatNumber(android.text.Editable p0, int p1) {}
    @java.lang.Deprecated
    public static void formatNanpNumber(android.text.Editable p0) {}
    @java.lang.Deprecated
    public static void formatJapaneseNumber(android.text.Editable p0) {}
    public static java.lang.String formatNumberToE164(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String formatNumberToRFC3966(java.lang.String p0, java.lang.String p1) { return null; }
    public static boolean isInternationalNumber(java.lang.String p0, java.lang.String p1) { return false; }
    public static java.lang.String formatNumber(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String formatNumber(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }
    public static java.lang.String normalizeNumber(java.lang.String p0) { return null; }
    public static java.lang.String replaceUnicodeDigits(java.lang.String p0) { return null; }
    @java.lang.Deprecated
    public static boolean isEmergencyNumber(java.lang.String p0) { return false; }
    @java.lang.Deprecated
    public static boolean isEmergencyNumber(int p0, java.lang.String p1) { return false; }
    @java.lang.Deprecated
    public static boolean isLocalEmergencyNumber(android.content.Context p0, java.lang.String p1) { return false; }
    public static boolean isVoiceMailNumber(java.lang.String p0) { return false; }
    public static boolean isVoiceMailNumber(int p0, java.lang.String p1) { return false; }
    @android.annotation.SystemApi
    public static boolean isVoiceMailNumber(android.content.Context p0, int p1, java.lang.String p2) { return false; }
    public static java.lang.String convertKeypadLettersToDigits(java.lang.String p0) { return null; }
    public static java.lang.String cdmaCheckAndProcessPlusCode(java.lang.String p0) { return null; }
    public static java.lang.String cdmaCheckAndProcessPlusCodeForSms(java.lang.String p0) { return null; }
    public static java.lang.String cdmaCheckAndProcessPlusCodeByNumberFormat(java.lang.String p0, int p1, int p2) { return null; }
    public static java.lang.CharSequence createTtsSpannable(java.lang.CharSequence p0) { return null; }
    public static void addTtsSpan(android.text.Spannable p0, int p1, int p2) {}
    @java.lang.Deprecated
    public static java.lang.CharSequence ttsSpanAsPhoneNumber(java.lang.CharSequence p0) { return null; }
    @java.lang.Deprecated
    public static void ttsSpanAsPhoneNumber(android.text.Spannable p0, int p1, int p2) {}
    public static android.text.style.TtsSpan createTtsSpan(java.lang.String p0) { return null; }
    public static boolean isNanp(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    public static boolean isUriNumber(java.lang.String p0) { return false; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    public static java.lang.String getUsernameFromUriNumber(java.lang.String p0) { return null; }
    public static android.net.Uri convertSipUriToTelUri(android.net.Uri p0) { return null; }
    public static java.lang.String convertToEmergencyNumber(android.content.Context p0, java.lang.String p1) { return null; }
    public static boolean areSamePhoneNumber(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return false; }
    @android.annotation.FlaggedApi("com.android.internal.telephony.flags.enable_wps_check_api_flag")
    public static boolean isWpsCallNumber(java.lang.String p0) { return false; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface BcdExtendType {
    }

    private static class CountryCallingCodeAndNewIndex {
        public final int countryCallingCode = 0;
        public final int newIndex = 0;
        public CountryCallingCodeAndNewIndex(int p0, int p1) {}
    }
}

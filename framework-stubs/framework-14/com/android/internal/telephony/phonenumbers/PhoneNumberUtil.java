package com.android.internal.telephony.phonenumbers;

public class PhoneNumberUtil {
    static final int REGEX_FLAGS = 66;
    static final int MAX_LENGTH_FOR_NSN = 17;
    static final int MAX_LENGTH_COUNTRY_CODE = 3;
    static final char PLUS_SIGN = '+';
    static final java.lang.String VALID_PUNCTUATION = "-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～";
    static final java.lang.String PLUS_CHARS = "+＋";
    static final java.util.regex.Pattern PLUS_CHARS_PATTERN = null;
    static final java.util.regex.Pattern SECOND_NUMBER_START_PATTERN = null;
    static final java.util.regex.Pattern UNWANTED_END_CHAR_PATTERN = null;
    static final java.lang.String EXTN_PATTERNS_FOR_MATCHING = null;
    static final java.util.regex.Pattern NON_DIGITS_PATTERN = null;
    public static final java.lang.String REGION_CODE_FOR_NON_GEO_ENTITY = "001";
    PhoneNumberUtil(com.android.internal.telephony.phonenumbers.metadata.source.MetadataSource p0, java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> p1) {}
    static java.lang.CharSequence extractPossibleNumber(java.lang.CharSequence p0) { return null; }
    static boolean isViablePhoneNumber(java.lang.CharSequence p0) { return false; }
    static java.lang.StringBuilder normalize(java.lang.StringBuilder p0) { return null; }
    public static java.lang.String normalizeDigitsOnly(java.lang.CharSequence p0) { return null; }
    static java.lang.StringBuilder normalizeDigits(java.lang.CharSequence p0, boolean p1) { return null; }
    public static java.lang.String normalizeDiallableCharsOnly(java.lang.CharSequence p0) { return null; }
    public static java.lang.String convertAlphaCharactersInNumber(java.lang.CharSequence p0) { return null; }
    public int getLengthOfGeographicalAreaCode(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return 0; }
    public int getLengthOfNationalDestinationCode(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return 0; }
    public static java.lang.String getCountryMobileToken(int p0) { return null; }
    static synchronized void setInstance(com.android.internal.telephony.phonenumbers.PhoneNumberUtil p0) {}
    public java.util.Set<java.lang.String> getSupportedRegions() { return null; }
    public java.util.Set<java.lang.Integer> getSupportedGlobalNetworkCallingCodes() { return null; }
    public java.util.Set<java.lang.Integer> getSupportedCallingCodes() { return null; }
    public java.util.Set<com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType> getSupportedTypesForRegion(java.lang.String p0) { return null; }
    public java.util.Set<com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType> getSupportedTypesForNonGeoEntity(int p0) { return null; }
    public static synchronized com.android.internal.telephony.phonenumbers.PhoneNumberUtil getInstance() { return null; }
    public static com.android.internal.telephony.phonenumbers.PhoneNumberUtil createInstance(com.android.internal.telephony.phonenumbers.MetadataLoader p0) { return null; }
    static boolean formattingRuleHasFirstGroupOnly(java.lang.String p0) { return false; }
    public boolean isNumberGeographical(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public boolean isNumberGeographical(com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType p0, int p1) { return false; }
    public java.lang.String format(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberFormat p1) { return null; }
    public void format(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberFormat p1, java.lang.StringBuilder p2) {}
    public java.lang.String formatByPattern(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberFormat p1, java.util.List<com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat> p2) { return null; }
    public java.lang.String formatNationalNumberWithCarrierCode(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.CharSequence p1) { return null; }
    public java.lang.String formatNationalNumberWithPreferredCarrierCode(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.CharSequence p1) { return null; }
    public java.lang.String formatNumberForMobileDialing(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1, boolean p2) { return null; }
    public java.lang.String formatOutOfCountryCallingNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return null; }
    public java.lang.String formatInOriginalFormat(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return null; }
    public java.lang.String formatOutOfCountryKeepingAlphaChars(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return null; }
    public java.lang.String getNationalSignificantNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return null; }
    com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat chooseFormattingPatternForNumber(java.util.List<com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat> p0, java.lang.String p1) { return null; }
    java.lang.String formatNsnUsingPattern(java.lang.String p0, com.android.internal.telephony.phonenumbers.Phonemetadata.NumberFormat p1, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberFormat p2) { return null; }
    public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber getExampleNumber(java.lang.String p0) { return null; }
    public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber getInvalidExampleNumber(java.lang.String p0) { return null; }
    public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber getExampleNumberForType(java.lang.String p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType p1) { return null; }
    public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber getExampleNumberForType(com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType p0) { return null; }
    public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber getExampleNumberForNonGeoEntity(int p0) { return null; }
    com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc getNumberDescByType(com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType p1) { return null; }
    public com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType getNumberType(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return null; }
    com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForRegion(java.lang.String p0) { return null; }
    com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int p0) { return null; }
    boolean isNumberMatchingDesc(java.lang.String p0, com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneNumberDesc p1) { return false; }
    public boolean isValidNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public boolean isValidNumberForRegion(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.String p1) { return false; }
    public java.lang.String getRegionCodeForNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return null; }
    public java.lang.String getRegionCodeForCountryCode(int p0) { return null; }
    public java.util.List<java.lang.String> getRegionCodesForCountryCode(int p0) { return null; }
    public int getCountryCodeForRegion(java.lang.String p0) { return 0; }
    public java.lang.String getNddPrefixForRegion(java.lang.String p0, boolean p1) { return null; }
    public boolean isNANPACountry(java.lang.String p0) { return false; }
    public boolean isAlphaNumber(java.lang.CharSequence p0) { return false; }
    public boolean isPossibleNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public boolean isPossibleNumberForType(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType p1) { return false; }
    public com.android.internal.telephony.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberWithReason(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return null; }
    public com.android.internal.telephony.phonenumbers.PhoneNumberUtil.ValidationResult isPossibleNumberForTypeWithReason(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.PhoneNumberType p1) { return null; }
    public boolean isPossibleNumber(java.lang.CharSequence p0, java.lang.String p1) { return false; }
    public boolean truncateTooLongNumber(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public com.android.internal.telephony.phonenumbers.AsYouTypeFormatter getAsYouTypeFormatter(java.lang.String p0) { return null; }
    int extractCountryCode(java.lang.StringBuilder p0, java.lang.StringBuilder p1) { return 0; }
    int maybeExtractCountryCode(java.lang.CharSequence p0, com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata p1, java.lang.StringBuilder p2, boolean p3, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p4) throws com.android.internal.telephony.phonenumbers.NumberParseException { return 0; }
    com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber.CountryCodeSource maybeStripInternationalPrefixAndNormalize(java.lang.StringBuilder p0, java.lang.String p1) { return null; }
    boolean maybeStripNationalPrefixAndCarrierCode(java.lang.StringBuilder p0, com.android.internal.telephony.phonenumbers.Phonemetadata.PhoneMetadata p1, java.lang.StringBuilder p2) { return false; }
    java.lang.String maybeStripExtension(java.lang.StringBuilder p0) { return null; }
    public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber parse(java.lang.CharSequence p0, java.lang.String p1) throws com.android.internal.telephony.phonenumbers.NumberParseException { return null; }
    public void parse(java.lang.CharSequence p0, java.lang.String p1, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p2) throws com.android.internal.telephony.phonenumbers.NumberParseException {}
    public com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber parseAndKeepRawInput(java.lang.CharSequence p0, java.lang.String p1) throws com.android.internal.telephony.phonenumbers.NumberParseException { return null; }
    public void parseAndKeepRawInput(java.lang.CharSequence p0, java.lang.String p1, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p2) throws com.android.internal.telephony.phonenumbers.NumberParseException {}
    public java.lang.Iterable<com.android.internal.telephony.phonenumbers.PhoneNumberMatch> findNumbers(java.lang.CharSequence p0, java.lang.String p1) { return null; }
    public java.lang.Iterable<com.android.internal.telephony.phonenumbers.PhoneNumberMatch> findNumbers(java.lang.CharSequence p0, java.lang.String p1, com.android.internal.telephony.phonenumbers.PhoneNumberUtil.Leniency p2, long p3) { return null; }
    static void setItalianLeadingZerosForPhoneNumber(java.lang.CharSequence p0, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p1) {}
    public com.android.internal.telephony.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p1) { return null; }
    public com.android.internal.telephony.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch(java.lang.CharSequence p0, java.lang.CharSequence p1) { return null; }
    public com.android.internal.telephony.phonenumbers.PhoneNumberUtil.MatchType isNumberMatch(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.CharSequence p1) { return null; }
    public boolean canBeInternationallyDialled(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0) { return false; }
    public boolean isMobileNumberPortableRegion(java.lang.String p0) { return false; }

    public static enum Leniency {
        POSSIBLE,
        VALID,
        STRICT_GROUPING,
        EXACT_GROUPING;
        boolean verify(com.android.internal.telephony.phonenumbers.Phonenumber.PhoneNumber p0, java.lang.CharSequence p1, com.android.internal.telephony.phonenumbers.PhoneNumberUtil p2, com.android.internal.telephony.phonenumbers.PhoneNumberMatcher p3) { return false; }
    }

    public static enum MatchType {
        NOT_A_NUMBER,
        NO_MATCH,
        SHORT_NSN_MATCH,
        NSN_MATCH,
        EXACT_MATCH;
    }

    public static enum PhoneNumberFormat {
        E164,
        INTERNATIONAL,
        NATIONAL,
        RFC3966;
    }

    public static enum PhoneNumberType {
        FIXED_LINE,
        MOBILE,
        FIXED_LINE_OR_MOBILE,
        TOLL_FREE,
        PREMIUM_RATE,
        SHARED_COST,
        VOIP,
        PERSONAL_NUMBER,
        PAGER,
        UAN,
        VOICEMAIL,
        UNKNOWN;
    }

    public static enum ValidationResult {
        IS_POSSIBLE,
        IS_POSSIBLE_LOCAL_ONLY,
        INVALID_COUNTRY_CODE,
        TOO_SHORT,
        INVALID_LENGTH,
        TOO_LONG;
    }
}

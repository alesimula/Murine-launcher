package android.webkit;

class FindAddress {
    private static final int MIN_ADDRESS_WORDS = 4;
    private static final int MAX_ADDRESS_WORDS = 14;
    private static final int MAX_ADDRESS_LINES = 5;
    private static final int kMaxAddressNameWordLength = 25;
    private static final int MAX_LOCATION_NAME_DISTANCE = 5;
    private static final android.webkit.FindAddress.ZipRange[] sStateZipCodeRanges = null;
    private static final java.lang.String NL = "\n\r  ";
    private static final java.lang.String SP = "\t                　";
    private static final java.lang.String WS = "\t                　\n\r  ";
    private static final java.lang.String WORD_DELIM = ",*•\t                　\n\r  ";
    private static final java.lang.String WORD_END = "(?=[,*•\t                　\n\r  ]|$)";
    private static final java.util.regex.Pattern sWordRe = null;
    private static final java.lang.String HOUSE_POST_DELIM = ",\"'\t                　\n\r  ";
    private static final java.lang.String HOUSE_END = "(?=[,\"'\t                　\n\r  ]|$)";
    private static final java.lang.String HOUSE_PRE_DELIM = ":,\"'\t                　\n\r  ";
    private static final java.lang.String HOUSE_COMPONENT = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final java.util.regex.Pattern sHouseNumberRe = null;
    private static final java.util.regex.Pattern sStateRe = null;
    private static final java.util.regex.Pattern sLocationNameRe = null;
    private static final java.util.regex.Pattern sSuffixedNumberRe = null;
    private static final java.util.regex.Pattern sZipCodeRe = null;
    FindAddress() {}
    private static boolean checkHouseNumber(java.lang.String p0) { return false; }
    private static java.util.regex.MatchResult matchHouseNumber(java.lang.String p0, int p1) { return null; }
    private static java.util.regex.MatchResult matchState(java.lang.String p0, int p1) { return null; }
    private static boolean isValidZipCode(java.lang.String p0, java.util.regex.MatchResult p1) { return false; }
    private static boolean isValidLocationName(java.lang.String p0) { return false; }
    private static int attemptMatch(java.lang.String p0, java.util.regex.MatchResult p1) { return 0; }
    static java.lang.String findAddress(java.lang.String p0) { return null; }

    static class ZipRange {
        int mLow;
        int mHigh;
        int mException1;
        int mException2;
        ZipRange(int p0, int p1, int p2, int p3) {}
        boolean matches(java.lang.String p0) { return false; }
    }
}

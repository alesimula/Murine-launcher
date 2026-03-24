package android.net;

public class UrlQuerySanitizer {
    private final java.util.HashMap<java.lang.String, android.net.UrlQuerySanitizer.ValueSanitizer> mSanitizers = null;
    private final java.util.HashMap<java.lang.String, java.lang.String> mEntries = null;
    private final java.util.ArrayList<android.net.UrlQuerySanitizer.ParameterValuePair> mEntriesList = null;
    private boolean mAllowUnregisteredParamaters;
    private boolean mPreferFirstRepeatedParameter;
    private android.net.UrlQuerySanitizer.ValueSanitizer mUnregisteredParameterValueSanitizer;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sAllIllegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sAllButNulLegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sAllButWhitespaceLegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sURLLegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sUrlAndSpaceLegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sAmpLegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sAmpAndSpaceLegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sSpaceLegal = null;
    private static final android.net.UrlQuerySanitizer.ValueSanitizer sAllButNulAndAngleBracketsLegal = null;
    private static final java.util.regex.Pattern plusOrPercent = null;
    public android.net.UrlQuerySanitizer.ValueSanitizer getUnregisteredParameterValueSanitizer() { return null; }
    public void setUnregisteredParameterValueSanitizer(android.net.UrlQuerySanitizer.ValueSanitizer p0) {}
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getAllIllegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getAllButNulLegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getAllButWhitespaceLegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getUrlLegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getUrlAndSpaceLegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getAmpLegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getAmpAndSpaceLegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getSpaceLegal() { return null; }
    public static final android.net.UrlQuerySanitizer.ValueSanitizer getAllButNulAndAngleBracketsLegal() { return null; }
    public UrlQuerySanitizer() {}
    public UrlQuerySanitizer(java.lang.String p0) {}
    public void parseUrl(java.lang.String p0) {}
    public void parseQuery(java.lang.String p0) {}
    public java.util.Set<java.lang.String> getParameterSet() { return null; }
    public java.util.List<android.net.UrlQuerySanitizer.ParameterValuePair> getParameterList() { return null; }
    public boolean hasParameter(java.lang.String p0) { return false; }
    public java.lang.String getValue(java.lang.String p0) { return null; }
    public void registerParameter(java.lang.String p0, android.net.UrlQuerySanitizer.ValueSanitizer p1) {}
    public void registerParameters(java.lang.String[] p0, android.net.UrlQuerySanitizer.ValueSanitizer p1) {}
    public void setAllowUnregisteredParamaters(boolean p0) {}
    public boolean getAllowUnregisteredParamaters() { return false; }
    public void setPreferFirstRepeatedParameter(boolean p0) {}
    public boolean getPreferFirstRepeatedParameter() { return false; }
    protected void parseEntry(java.lang.String p0, java.lang.String p1) {}
    protected void addSanitizedEntry(java.lang.String p0, java.lang.String p1) {}
    public android.net.UrlQuerySanitizer.ValueSanitizer getValueSanitizer(java.lang.String p0) { return null; }
    public android.net.UrlQuerySanitizer.ValueSanitizer getEffectiveValueSanitizer(java.lang.String p0) { return null; }
    public java.lang.String unescape(java.lang.String p0) { return null; }
    protected boolean isHexDigit(char p0) { return false; }
    protected int decodeHexDigit(char p0) { return 0; }
    protected void clear() {}

    public static interface ValueSanitizer {
        public java.lang.String sanitize(java.lang.String p0);
    }

    public class ParameterValuePair {
        public java.lang.String mParameter;
        public java.lang.String mValue;
        public ParameterValuePair(android.net.UrlQuerySanitizer p0, java.lang.String p1, java.lang.String p2) {}
    }

    public static class IllegalCharacterValueSanitizer implements android.net.UrlQuerySanitizer.ValueSanitizer {
        private int mFlags;
        public static final int SPACE_OK = 1;
        public static final int OTHER_WHITESPACE_OK = 2;
        public static final int NON_7_BIT_ASCII_OK = 4;
        public static final int DQUOTE_OK = 8;
        public static final int SQUOTE_OK = 16;
        public static final int LT_OK = 32;
        public static final int GT_OK = 64;
        public static final int AMP_OK = 128;
        public static final int PCT_OK = 256;
        public static final int NUL_OK = 512;
        public static final int SCRIPT_URL_OK = 1024;
        public static final int ALL_OK = 2047;
        public static final int ALL_WHITESPACE_OK = 3;
        public static final int ALL_ILLEGAL = 0;
        public static final int ALL_BUT_NUL_LEGAL = 1535;
        public static final int ALL_BUT_WHITESPACE_LEGAL = 1532;
        public static final int URL_LEGAL = 404;
        public static final int URL_AND_SPACE_LEGAL = 405;
        public static final int AMP_LEGAL = 128;
        public static final int AMP_AND_SPACE_LEGAL = 129;
        public static final int SPACE_LEGAL = 1;
        public static final int ALL_BUT_NUL_AND_ANGLE_BRACKETS_LEGAL = 1439;
        private static final java.lang.String JAVASCRIPT_PREFIX = "javascript:";
        private static final java.lang.String VBSCRIPT_PREFIX = "vbscript:";
        private static final int MIN_SCRIPT_PREFIX_LENGTH = Integer.valueOf(0);
        public IllegalCharacterValueSanitizer(int p0) {}
        public java.lang.String sanitize(java.lang.String p0) { return null; }
        private java.lang.String trimWhitespace(java.lang.String p0) { return null; }
        private boolean isWhitespace(char p0) { return false; }
        private boolean characterIsLegal(char p0) { return false; }
    }
}

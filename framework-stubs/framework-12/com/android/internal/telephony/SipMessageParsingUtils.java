package com.android.internal.telephony;

public class SipMessageParsingUtils {
    private static final java.lang.String TAG = "SipMessageParsingUtils";
    private static final java.lang.String[] SIP_REQUEST_METHODS = null;
    private static final java.lang.String SIP_VERSION_2 = "SIP/2.0";
    private static final java.lang.String HEADER_KEY_VALUE_SEPARATOR = ":";
    private static final java.lang.String SUBHEADER_VALUE_SEPARATOR = ",";
    private static final java.lang.String PARAM_SEPARATOR = ";";
    private static final java.lang.String PARAM_KEY_VALUE_SEPARATOR = "=";
    private static final java.lang.String BRANCH_PARAM_KEY = "branch";
    private static final java.lang.String VIA_SIP_HEADER_KEY = "via";
    private static final java.lang.String VIA_SIP_HEADER_KEY_COMPACT = "v";
    private static final java.lang.String CALL_ID_SIP_HEADER_KEY = "call-id";
    private static final java.lang.String CALL_ID_SIP_HEADER_KEY_COMPACT = "i";
    private static final java.lang.String FROM_HEADER_KEY = "from";
    private static final java.lang.String FROM_HEADER_KEY_COMPACT = "f";
    private static final java.lang.String TO_HEADER_KEY = "to";
    private static final java.lang.String TO_HEADER_KEY_COMPACT = "t";
    private static final java.lang.String TAG_PARAM_KEY = "tag";
    private static final java.lang.String ACCEPT_CONTACT_HEADER_KEY = "accept-contact";
    private static final java.lang.String ACCEPT_CONTACT_HEADER_KEY_COMPACT = "a";
    public SipMessageParsingUtils() {}
    public static boolean isSipRequest(java.lang.String p0) { return false; }
    public static boolean isSipResponse(java.lang.String p0) { return false; }
    public static java.lang.String getTransactionId(java.lang.String p0) { return null; }
    private static java.lang.String getParameterValue(java.lang.String p0, java.lang.String p1) { return null; }
    public static java.lang.String getCallId(java.lang.String p0) { return null; }
    public static java.lang.String getFromTag(java.lang.String p0) { return null; }
    public static java.lang.String getToTag(java.lang.String p0) { return null; }
    public static java.lang.String[] splitStartLineAndVerify(java.lang.String p0) { return null; }
    public static java.util.Set<java.lang.String> getAcceptContactFeatureTags(java.lang.String p0) { return null; }
    private static java.lang.String[] splitParamValue(java.lang.String p0) { return null; }
    private static boolean isStartLineMalformed(java.lang.String[] p0) { return false; }
    private static boolean verifySipRequest(java.lang.String[] p0) { return false; }
    private static boolean verifySipResponse(java.lang.String[] p0) { return false; }
    public static java.util.List<android.util.Pair<java.lang.String, java.lang.String>> parseHeaders(java.lang.String p0, boolean p1, java.lang.String... p2) { return null; }
    private static java.lang.String removeLeadingWhitespace(java.lang.String p0) { return null; }
}

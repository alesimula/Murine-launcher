package android.content;

public class IntentFilter implements android.os.Parcelable {
    private static final java.lang.String AGLOB_STR = "aglob";
    private static final java.lang.String SGLOB_STR = "sglob";
    private static final java.lang.String PREFIX_STR = "prefix";
    private static final java.lang.String SUFFIX_STR = "suffix";
    private static final java.lang.String LITERAL_STR = "literal";
    private static final java.lang.String PATH_STR = "path";
    private static final java.lang.String PORT_STR = "port";
    private static final java.lang.String HOST_STR = "host";
    private static final java.lang.String AUTH_STR = "auth";
    private static final java.lang.String SSP_STR = "ssp";
    private static final java.lang.String SCHEME_STR = "scheme";
    private static final java.lang.String STATIC_TYPE_STR = "staticType";
    private static final java.lang.String TYPE_STR = "type";
    private static final java.lang.String GROUP_STR = "group";
    private static final java.lang.String CAT_STR = "cat";
    private static final java.lang.String NAME_STR = "name";
    private static final java.lang.String ACTION_STR = "action";
    private static final java.lang.String AUTO_VERIFY_STR = "autoVerify";
    public static final int SYSTEM_HIGH_PRIORITY = 1000;
    public static final int SYSTEM_LOW_PRIORITY = -1000;
    public static final int MATCH_CATEGORY_MASK = 268369920;
    public static final int MATCH_ADJUSTMENT_MASK = 65535;
    public static final int MATCH_ADJUSTMENT_NORMAL = 32768;
    public static final int MATCH_CATEGORY_EMPTY = 1048576;
    public static final int MATCH_CATEGORY_SCHEME = 2097152;
    public static final int MATCH_CATEGORY_HOST = 3145728;
    public static final int MATCH_CATEGORY_PORT = 4194304;
    public static final int MATCH_CATEGORY_PATH = 5242880;
    public static final int MATCH_CATEGORY_SCHEME_SPECIFIC_PART = 5767168;
    public static final int MATCH_CATEGORY_TYPE = 6291456;
    public static final int NO_MATCH_TYPE = -1;
    public static final int NO_MATCH_DATA = -2;
    public static final int NO_MATCH_ACTION = -3;
    public static final int NO_MATCH_CATEGORY = -4;
    public static final java.lang.String SCHEME_HTTP = "http";
    public static final java.lang.String SCHEME_HTTPS = "https";
    public static final java.lang.String SCHEME_PACKAGE = "package";
    public static final java.lang.String WILDCARD = "*";
    public static final java.lang.String WILDCARD_PATH = "/*";
    private int mPriority;
    private int mOrder;
    private final java.util.ArrayList<java.lang.String> mActions = null;
    private java.util.ArrayList<java.lang.String> mCategories;
    private java.util.ArrayList<java.lang.String> mDataSchemes;
    private java.util.ArrayList<android.os.PatternMatcher> mDataSchemeSpecificParts;
    private java.util.ArrayList<android.content.IntentFilter.AuthorityEntry> mDataAuthorities;
    private java.util.ArrayList<android.os.PatternMatcher> mDataPaths;
    private java.util.ArrayList<java.lang.String> mStaticDataTypes;
    private java.util.ArrayList<java.lang.String> mDataTypes;
    private java.util.ArrayList<java.lang.String> mMimeGroups;
    private boolean mHasStaticPartialTypes;
    private boolean mHasDynamicPartialTypes;
    private static final int STATE_VERIFY_AUTO = 1;
    private static final int STATE_NEED_VERIFY = 16;
    private static final int STATE_NEED_VERIFY_CHECKED = 256;
    private static final int STATE_VERIFIED = 4096;
    private int mVerifyState;
    public static final int VISIBILITY_NONE = 0;
    public static final int VISIBILITY_EXPLICIT = 1;
    public static final int VISIBILITY_IMPLICIT = 2;
    private int mInstantAppVisibility;
    public static final android.os.Parcelable.Creator<android.content.IntentFilter> CREATOR = null;
    private static int findStringInSet(java.lang.String[] p0, java.lang.String p1, int[] p2, int p3) { return 0; }
    private static java.lang.String[] addStringToSet(java.lang.String[] p0, java.lang.String p1, int[] p2, int p3) { return null; }
    private static java.lang.String[] removeStringFromSet(java.lang.String[] p0, java.lang.String p1, int[] p2, int p3) { return null; }
    public static android.content.IntentFilter create(java.lang.String p0, java.lang.String p1) { return null; }
    public IntentFilter() {}
    public IntentFilter(java.lang.String p0) {}
    public IntentFilter(java.lang.String p0, java.lang.String p1) throws android.content.IntentFilter.MalformedMimeTypeException {}
    public IntentFilter(android.content.IntentFilter p0) {}
    public final void setPriority(int p0) {}
    public final int getPriority() { return 0; }
    @android.annotation.SystemApi
    public final void setOrder(int p0) {}
    @android.annotation.SystemApi
    public final int getOrder() { return 0; }
    public final void setAutoVerify(boolean p0) {}
    public final boolean getAutoVerify() { return false; }
    public final boolean handleAllWebDataURI() { return false; }
    public final boolean handlesWebUris(boolean p0) { return false; }
    public final boolean needsVerification() { return false; }
    public final boolean isVerified() { return false; }
    public void setVerified(boolean p0) {}
    public void setVisibilityToInstantApp(int p0) {}
    public int getVisibilityToInstantApp() { return 0; }
    public boolean isVisibleToInstantApp() { return false; }
    public boolean isExplicitlyVisibleToInstantApp() { return false; }
    public boolean isImplicitlyVisibleToInstantApp() { return false; }
    public final void addAction(java.lang.String p0) {}
    public final int countActions() { return 0; }
    public final java.lang.String getAction(int p0) { return null; }
    public final boolean hasAction(java.lang.String p0) { return false; }
    public final boolean matchAction(java.lang.String p0) { return false; }
    private boolean matchAction(java.lang.String p0, boolean p1, java.util.Collection<java.lang.String> p2) { return false; }
    public final java.util.Iterator<java.lang.String> actionsIterator() { return null; }
    public final void addDataType(java.lang.String p0) throws android.content.IntentFilter.MalformedMimeTypeException {}
    public final void addDynamicDataType(java.lang.String p0) throws android.content.IntentFilter.MalformedMimeTypeException {}
    private void processMimeType(java.lang.String p0, java.util.function.BiConsumer<java.lang.String, java.lang.Boolean> p1) throws android.content.IntentFilter.MalformedMimeTypeException {}
    public final void clearDynamicDataTypes() {}
    public int countStaticDataTypes() { return 0; }
    public final boolean hasDataType(java.lang.String p0) { return false; }
    public final boolean hasExactDataType(java.lang.String p0) { return false; }
    public final boolean hasExactDynamicDataType(java.lang.String p0) { return false; }
    public final boolean hasExactStaticDataType(java.lang.String p0) { return false; }
    public final int countDataTypes() { return 0; }
    public final java.lang.String getDataType(int p0) { return null; }
    public final java.util.Iterator<java.lang.String> typesIterator() { return null; }
    public final java.util.List<java.lang.String> dataTypes() { return null; }
    public final void addMimeGroup(java.lang.String p0) {}
    public final boolean hasMimeGroup(java.lang.String p0) { return false; }
    public final java.lang.String getMimeGroup(int p0) { return null; }
    public final int countMimeGroups() { return 0; }
    public final java.util.Iterator<java.lang.String> mimeGroupsIterator() { return null; }
    public final void addDataScheme(java.lang.String p0) {}
    public final int countDataSchemes() { return 0; }
    public final java.lang.String getDataScheme(int p0) { return null; }
    public final boolean hasDataScheme(java.lang.String p0) { return false; }
    public final java.util.Iterator<java.lang.String> schemesIterator() { return null; }
    public final void addDataSchemeSpecificPart(java.lang.String p0, int p1) {}
    public final void addDataSchemeSpecificPart(android.os.PatternMatcher p0) {}
    public final int countDataSchemeSpecificParts() { return 0; }
    public final android.os.PatternMatcher getDataSchemeSpecificPart(int p0) { return null; }
    public final boolean hasDataSchemeSpecificPart(java.lang.String p0) { return false; }
    private boolean hasDataSchemeSpecificPart(java.lang.String p0, boolean p1) { return false; }
    public final boolean hasDataSchemeSpecificPart(android.os.PatternMatcher p0) { return false; }
    public final java.util.Iterator<android.os.PatternMatcher> schemeSpecificPartsIterator() { return null; }
    public final void addDataAuthority(java.lang.String p0, java.lang.String p1) {}
    public final void addDataAuthority(android.content.IntentFilter.AuthorityEntry p0) {}
    public final int countDataAuthorities() { return 0; }
    public final android.content.IntentFilter.AuthorityEntry getDataAuthority(int p0) { return null; }
    public final boolean hasDataAuthority(android.net.Uri p0) { return false; }
    public final boolean hasDataAuthority(android.content.IntentFilter.AuthorityEntry p0) { return false; }
    public final java.util.Iterator<android.content.IntentFilter.AuthorityEntry> authoritiesIterator() { return null; }
    public final void addDataPath(java.lang.String p0, int p1) {}
    public final void addDataPath(android.os.PatternMatcher p0) {}
    public final int countDataPaths() { return 0; }
    public final android.os.PatternMatcher getDataPath(int p0) { return null; }
    public final boolean hasDataPath(java.lang.String p0) { return false; }
    private boolean hasDataPath(java.lang.String p0, boolean p1) { return false; }
    public final boolean hasDataPath(android.os.PatternMatcher p0) { return false; }
    public final java.util.Iterator<android.os.PatternMatcher> pathsIterator() { return null; }
    public final int matchDataAuthority(android.net.Uri p0) { return 0; }
    public final int matchDataAuthority(android.net.Uri p0, boolean p1) { return 0; }
    public final int matchData(java.lang.String p0, java.lang.String p1, android.net.Uri p2) { return 0; }
    private int matchData(java.lang.String p0, java.lang.String p1, android.net.Uri p2, boolean p3) { return 0; }
    public final void addCategory(java.lang.String p0) {}
    public final int countCategories() { return 0; }
    public final java.lang.String getCategory(int p0) { return null; }
    public final boolean hasCategory(java.lang.String p0) { return false; }
    public final java.util.Iterator<java.lang.String> categoriesIterator() { return null; }
    public final java.lang.String matchCategories(java.util.Set<java.lang.String> p0) { return null; }
    public final int match(android.content.ContentResolver p0, android.content.Intent p1, boolean p2, java.lang.String p3) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5, boolean p6, java.util.Collection<java.lang.String> p7) { return 0; }
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    private void writeDataTypesToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    private void writeDataTypeToXml(org.xmlpull.v1.XmlSerializer p0, java.lang.String p1, java.lang.String p2) throws java.io.IOException {}
    public void readFromXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public final int describeContents() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean debugCheck() { return false; }
    public IntentFilter(android.os.Parcel p0) {}
    private boolean hasPartialTypes() { return false; }
    private final boolean findMimeType(java.lang.String p0) { return false; }
    public java.util.ArrayList<java.lang.String> getHostsList() { return null; }
    public java.lang.String[] getHosts() { return null; }

    public static final class AuthorityEntry {
        private final java.lang.String mOrigHost = null;
        private final java.lang.String mHost = null;
        private final boolean mWild = false;
        private final int mPort = 0;
        public AuthorityEntry(java.lang.String p0, java.lang.String p1) {}
        AuthorityEntry(android.os.Parcel p0) {}
        void writeToParcel(android.os.Parcel p0) {}
        void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
        public java.lang.String getHost() { return null; }
        public int getPort() { return 0; }
        public boolean match(android.content.IntentFilter.AuthorityEntry p0) { return false; }
        public boolean equals(java.lang.Object p0) { return false; }
        public int match(android.net.Uri p0) { return 0; }
        public int match(android.net.Uri p0, boolean p1) { return 0; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstantAppVisibility {
    }

    public static class MalformedMimeTypeException extends android.util.AndroidException {
        public MalformedMimeTypeException() { super(); }
        public MalformedMimeTypeException(java.lang.String p0) { super(); }
    }
}

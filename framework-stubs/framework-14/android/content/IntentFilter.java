package android.content;

public class IntentFilter implements android.os.Parcelable {
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
    public static final int NO_MATCH_EXTRAS = -5;
    public static final java.lang.String SCHEME_HTTP = "http";
    public static final java.lang.String SCHEME_HTTPS = "https";
    public static final java.lang.String SCHEME_PACKAGE = "package";
    public static final java.lang.String WILDCARD = "*";
    public static final java.lang.String WILDCARD_PATH = "/*";
    public static final int VISIBILITY_NONE = 0;
    public static final int VISIBILITY_EXPLICIT = 1;
    public static final int VISIBILITY_IMPLICIT = 2;
    public static final android.os.Parcelable.Creator<android.content.IntentFilter> CREATOR = null;
    public static android.content.IntentFilter create(java.lang.String p0, java.lang.String p1) { return null; }
    public IntentFilter() {}
    public IntentFilter(java.lang.String p0) {}
    public IntentFilter(java.lang.String p0, java.lang.String p1) throws android.content.IntentFilter.MalformedMimeTypeException {}
    public IntentFilter(android.content.IntentFilter p0) {}
    public java.lang.String toLongString() { return null; }
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
    public final java.util.Iterator<java.lang.String> actionsIterator() { return null; }
    public final void addDataType(java.lang.String p0) throws android.content.IntentFilter.MalformedMimeTypeException {}
    public final void addDynamicDataType(java.lang.String p0) throws android.content.IntentFilter.MalformedMimeTypeException {}
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
    public final boolean hasDataPath(android.os.PatternMatcher p0) { return false; }
    public final java.util.Iterator<android.os.PatternMatcher> pathsIterator() { return null; }
    public final int matchDataAuthority(android.net.Uri p0) { return 0; }
    public final int matchDataAuthority(android.net.Uri p0, boolean p1) { return 0; }
    public final int matchData(java.lang.String p0, java.lang.String p1, android.net.Uri p2) { return 0; }
    public final void addCategory(java.lang.String p0) {}
    public final int countCategories() { return 0; }
    public final java.lang.String getCategory(int p0) { return null; }
    public final boolean hasCategory(java.lang.String p0) { return false; }
    public final java.util.Iterator<java.lang.String> categoriesIterator() { return null; }
    public final java.lang.String matchCategories(java.util.Set<java.lang.String> p0) { return null; }
    public final void addExtra(java.lang.String p0, int p1) {}
    public final int getIntExtra(java.lang.String p0) { return 0; }
    public final void addExtra(java.lang.String p0, int[] p1) {}
    public final int[] getIntArrayExtra(java.lang.String p0) { return null; }
    public final void addExtra(java.lang.String p0, long p1) {}
    public final long getLongExtra(java.lang.String p0) { return 0L; }
    public final void addExtra(java.lang.String p0, long[] p1) {}
    public final long[] getLongArrayExtra(java.lang.String p0) { return null; }
    public final void addExtra(java.lang.String p0, double p1) {}
    public final double getDoubleExtra(java.lang.String p0) { return 0.0; }
    public final void addExtra(java.lang.String p0, double[] p1) {}
    public final double[] getDoubleArrayExtra(java.lang.String p0) { return null; }
    public final void addExtra(java.lang.String p0, java.lang.String p1) {}
    public final java.lang.String getStringExtra(java.lang.String p0) { return null; }
    public final void addExtra(java.lang.String p0, java.lang.String[] p1) {}
    public final java.lang.String[] getStringArrayExtra(java.lang.String p0) { return null; }
    public final void addExtra(java.lang.String p0, boolean p1) {}
    public final boolean getBooleanExtra(java.lang.String p0) { return false; }
    public final void addExtra(java.lang.String p0, boolean[] p1) {}
    public final boolean[] getBooleanArrayExtra(java.lang.String p0) { return null; }
    public final boolean hasExtra(java.lang.String p0) { return false; }
    public final void setExtras(android.os.PersistableBundle p0) {}
    public final android.os.PersistableBundle getExtras() { return null; }
    public java.util.function.Predicate<android.content.Intent> asPredicate() { return null; }
    public java.util.function.Predicate<android.content.Intent> asPredicateWithTypeResolution(android.content.ContentResolver p0) { return null; }
    public final int match(android.content.ContentResolver p0, android.content.Intent p1, boolean p2, java.lang.String p3) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5, boolean p6, java.util.Collection<java.lang.String> p7) { return 0; }
    public final int match(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.net.Uri p3, java.util.Set<java.lang.String> p4, java.lang.String p5, boolean p6, java.util.Collection<java.lang.String> p7, android.os.Bundle p8) { return 0; }
    public void writeToXml(org.xmlpull.v1.XmlSerializer p0) throws java.io.IOException {}
    public void readFromXml(org.xmlpull.v1.XmlPullParser p0) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {}
    public void dumpDebug(android.util.proto.ProtoOutputStream p0, long p1) {}
    public void dump(android.util.Printer p0, java.lang.String p1) {}
    public final int describeContents() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean debugCheck() { return false; }
    public boolean checkDataPathAndSchemeSpecificParts() { return false; }
    public IntentFilter(android.os.Parcel p0) {}
    public java.util.ArrayList<java.lang.String> getHostsList() { return null; }
    public java.lang.String[] getHosts() { return null; }
    public static boolean filterEquals(android.content.IntentFilter p0, android.content.IntentFilter p1) { return false; }

    public static final class AuthorityEntry {
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

    public static class MalformedMimeTypeException extends android.util.AndroidException {
        public MalformedMimeTypeException() { super(); }
        public MalformedMimeTypeException(java.lang.String p0) { super(); }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface InstantAppVisibility {
    }
}

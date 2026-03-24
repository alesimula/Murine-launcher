package android.content;

public class SyncAdaptersCache extends android.content.pm.RegisteredServicesCache<android.content.SyncAdapterType> {
    private static final java.lang.String TAG = "Account";
    private static final java.lang.String SERVICE_INTERFACE = "android.content.SyncAdapter";
    private static final java.lang.String SERVICE_META_DATA = "android.content.SyncAdapter";
    private static final java.lang.String ATTRIBUTES_NAME = "sync-adapter";
    private static final android.content.SyncAdaptersCache.MySerializer sSerializer = null;
    private android.util.SparseArray<android.util.ArrayMap<java.lang.String, java.lang.String[]>> mAuthorityToSyncAdapters;
    @android.annotation.UnsupportedAppUsage
    public SyncAdaptersCache(android.content.Context p0) { super(null, null, null, null, null); }
    public android.content.SyncAdapterType parseServiceAttributes(android.content.res.Resources p0, java.lang.String p1, android.util.AttributeSet p2) { return null; }
    protected void onServicesChangedLocked(int p0) {}
    public java.lang.String[] getSyncAdapterPackagesForAuthority(java.lang.String p0, int p1) { return null; }
    protected void onUserRemoved(int p0) {}

    static class MySerializer implements android.content.pm.XmlSerializerAndParser<android.content.SyncAdapterType> {
        MySerializer() {}
        public void writeAsXml(android.content.SyncAdapterType p0, org.xmlpull.v1.XmlSerializer p1) throws java.io.IOException {}
        public android.content.SyncAdapterType createFromXml(org.xmlpull.v1.XmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    }
}

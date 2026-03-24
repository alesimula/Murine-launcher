package android.content;

public class SyncAdaptersCache extends android.content.pm.RegisteredServicesCache<android.content.SyncAdapterType> {
    public SyncAdaptersCache(android.content.Context p0) { super(null, null, null, null, null); }
    public android.content.SyncAdapterType parseServiceAttributes(android.content.res.Resources p0, java.lang.String p1, android.util.AttributeSet p2) { return null; }
    protected void onServicesChangedLocked(int p0) {}
    public java.lang.String[] getSyncAdapterPackagesForAuthority(java.lang.String p0, int p1) { return null; }
    protected void onUserRemoved(int p0) {}

    static class MySerializer implements android.content.pm.XmlSerializerAndParser<android.content.SyncAdapterType> {
        MySerializer() {}
        public void writeAsXml(android.content.SyncAdapterType p0, com.android.modules.utils.TypedXmlSerializer p1) throws java.io.IOException {}
        public android.content.SyncAdapterType createFromXml(com.android.modules.utils.TypedXmlPullParser p0) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException { return null; }
    }
}

package android.provider;

@android.annotation.SystemApi
public abstract class SearchIndexablesProvider extends android.content.ContentProvider {
    public SearchIndexablesProvider() { super(); }
    public void attachInfo(android.content.Context p0, android.content.pm.ProviderInfo p1) {}
    public android.database.Cursor query(android.net.Uri p0, java.lang.String[] p1, java.lang.String p2, java.lang.String[] p3, java.lang.String p4) { return null; }
    public abstract android.database.Cursor queryXmlResources(java.lang.String[] p0);
    public abstract android.database.Cursor queryRawData(java.lang.String[] p0);
    public abstract android.database.Cursor queryNonIndexableKeys(java.lang.String[] p0);
    public android.database.Cursor querySiteMapPairs() { return null; }
    public android.database.Cursor querySliceUriPairs() { return null; }
    public android.database.Cursor queryDynamicRawData(java.lang.String[] p0) { return null; }
    public java.lang.String getType(android.net.Uri p0) { return null; }
    public final android.net.Uri insert(android.net.Uri p0, android.content.ContentValues p1) { return null; }
    public final int delete(android.net.Uri p0, java.lang.String p1, java.lang.String[] p2) { return 0; }
    public final int update(android.net.Uri p0, android.content.ContentValues p1, java.lang.String p2, java.lang.String[] p3) { return 0; }
}

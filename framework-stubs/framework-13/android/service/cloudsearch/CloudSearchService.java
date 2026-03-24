package android.service.cloudsearch;

@android.annotation.SystemApi
public abstract class CloudSearchService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.cloudsearch.CloudSearchService";
    public CloudSearchService() { super(); }
    public void onCreate() {}
    public abstract void onSearch(android.app.cloudsearch.SearchRequest p0);
    public final void returnResults(java.lang.String p0, android.app.cloudsearch.SearchResponse p1) {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
}

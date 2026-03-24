package android.app.cloudsearch;

@android.annotation.SystemApi
public class CloudSearchManager {
    public CloudSearchManager() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.MANAGE_CLOUDSEARCH")
    public void search(android.app.cloudsearch.SearchRequest p0, java.util.concurrent.Executor p1, android.app.cloudsearch.CloudSearchManager.CallBack p2) {}

    public static interface CallBack {
        public void onSearchSucceeded(android.app.cloudsearch.SearchRequest p0, android.app.cloudsearch.SearchResponse p1);
        public void onSearchFailed(android.app.cloudsearch.SearchRequest p0, android.app.cloudsearch.SearchResponse p1);
    }

    private final class CallBackWrapper extends android.app.cloudsearch.ICloudSearchManagerCallback.Stub {
        CallBackWrapper(android.app.cloudsearch.CloudSearchManager p0, android.app.cloudsearch.SearchRequest p1, android.app.cloudsearch.CloudSearchManager.CallBack p2, java.util.concurrent.Executor p3) { super(); }
        public void onSearchSucceeded(android.app.cloudsearch.SearchResponse p0) {}
        public void onSearchFailed(android.app.cloudsearch.SearchResponse p0) {}
    }
}

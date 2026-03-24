package android.service.search;

@android.annotation.SystemApi
public abstract class SearchUiService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.search.SearchUiService";
    public SearchUiService() { super(); }
    public void onCreate() {}
    @android.annotation.NonNull
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    @java.lang.Deprecated
    public void onCreateSearchSession(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1) {}
    public void onSearchSessionCreated(android.app.search.SearchContext p0, android.app.search.SearchSessionId p1) {}
    public abstract void onQuery(android.app.search.SearchSessionId p0, android.app.search.Query p1, java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>> p2);
    public abstract void onNotifyEvent(android.app.search.SearchSessionId p0, android.app.search.Query p1, android.app.search.SearchTargetEvent p2);
    public void onStartUpdateEmptyQueryResult() {}
    public void onStopUpdateEmptyQueryResult() {}
    public abstract void onDestroy(android.app.search.SearchSessionId p0);
    public final void updateEmptyQueryResult(android.app.search.SearchSessionId p0, java.util.List<android.app.search.SearchTarget> p1) {}

    private static final class CallbackWrapper implements java.util.function.Consumer<java.util.List<android.app.search.SearchTarget>>, android.os.IBinder.DeathRecipient {
        CallbackWrapper(android.app.search.ISearchCallback p0, java.util.function.Consumer<android.service.search.SearchUiService.CallbackWrapper> p1) {}
        public boolean isCallback(android.app.search.ISearchCallback p0) { return false; }
        public void accept(java.util.List<android.app.search.SearchTarget> p0) {}
        public void destroy() {}
        public void binderDied() {}
    }
}

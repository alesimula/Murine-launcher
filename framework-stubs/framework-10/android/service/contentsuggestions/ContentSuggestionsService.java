package android.service.contentsuggestions;

@android.annotation.SystemApi
public abstract class ContentSuggestionsService extends android.app.Service {
    private static final java.lang.String TAG = null;
    private android.os.Handler mHandler;
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentsuggestions.ContentSuggestionsService";
    private final android.service.contentsuggestions.IContentSuggestionsService mInterface = null;
    public ContentSuggestionsService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onProcessContextImage(int p0, android.graphics.Bitmap p1, android.os.Bundle p2);
    public abstract void onSuggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback p1);
    public abstract void onClassifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback p1);
    public abstract void onNotifyInteraction(java.lang.String p0, android.os.Bundle p1);
    private android.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback wrapSelectionsCallback(android.app.contentsuggestions.ISelectionsCallback p0) { return null; }
    private android.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback wrapClassificationCallback(android.app.contentsuggestions.IClassificationsCallback p0) { return null; }
}

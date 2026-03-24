package android.service.contentsuggestions;

@android.annotation.SystemApi
public abstract class ContentSuggestionsService extends android.app.Service {
    public static final java.lang.String SERVICE_INTERFACE = "android.service.contentsuggestions.ContentSuggestionsService";
    public ContentSuggestionsService() { super(); }
    public void onCreate() {}
    public final android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract void onProcessContextImage(int p0, android.graphics.Bitmap p1, android.os.Bundle p2);
    public abstract void onSuggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback p1);
    public abstract void onClassifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback p1);
    public abstract void onNotifyInteraction(java.lang.String p0, android.os.Bundle p1);
}

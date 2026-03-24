package android.service.settings.suggestions;

@android.annotation.SystemApi
public abstract class SuggestionService extends android.app.Service {
    public SuggestionService() { super(); }
    public android.os.IBinder onBind(android.content.Intent p0) { return null; }
    public abstract java.util.List<android.service.settings.suggestions.Suggestion> onGetSuggestions();
    public abstract void onSuggestionDismissed(android.service.settings.suggestions.Suggestion p0);
    public abstract void onSuggestionLaunched(android.service.settings.suggestions.Suggestion p0);
}

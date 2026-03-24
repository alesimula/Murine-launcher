package android.app.contentsuggestions;

@android.annotation.SystemApi
public final class ContentSuggestionsManager {
    public static final java.lang.String EXTRA_BITMAP = "android.contentsuggestions.extra.BITMAP";
    private static final java.lang.String TAG = null;
    private static final int SYNC_CALLS_TIMEOUT_MS = 5000;
    private final android.app.contentsuggestions.IContentSuggestionsManager mService = null;
    private final int mUser = 0;
    public ContentSuggestionsManager(int p0, android.app.contentsuggestions.IContentSuggestionsManager p1) {}
    public void provideContextImage(android.graphics.Bitmap p0, android.os.Bundle p1) {}
    public void provideContextImage(int p0, android.os.Bundle p1) {}
    public void suggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, java.util.concurrent.Executor p1, android.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback p2) {}
    public void classifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, java.util.concurrent.Executor p1, android.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback p2) {}
    public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) {}
    public boolean isEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.MANAGE_CONTENT_SUGGESTIONS")
    public void resetTemporaryService(int p0) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_CONTENT_SUGGESTIONS")
    public void setTemporaryService(int p0, java.lang.String p1, int p2) {}
    @android.annotation.RequiresPermission("android.permission.MANAGE_CONTENT_SUGGESTIONS")
    public void setDefaultServiceEnabled(int p0, boolean p1) {}

    public static interface ClassificationsCallback {
        public void onContentClassificationsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentClassification> p1);
    }

    private static final class ClassificationsCallbackWrapper extends android.app.contentsuggestions.IClassificationsCallback.Stub {
        private final android.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        ClassificationsCallbackWrapper(android.app.contentsuggestions.ContentSuggestionsManager.ClassificationsCallback p0, java.util.concurrent.Executor p1) { super(); }
        public void onContentClassificationsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentClassification> p1) {}
    }

    public static interface SelectionsCallback {
        public void onContentSelectionsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentSelection> p1);
    }

    private static class SelectionsCallbackWrapper extends android.app.contentsuggestions.ISelectionsCallback.Stub {
        private final android.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback mCallback = null;
        private final java.util.concurrent.Executor mExecutor = null;
        SelectionsCallbackWrapper(android.app.contentsuggestions.ContentSuggestionsManager.SelectionsCallback p0, java.util.concurrent.Executor p1) { super(); }
        public void onContentSelectionsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentSelection> p1) {}
    }
}

package android.service.dreams;

public class DreamActivity extends android.app.Activity {
    static final java.lang.String EXTRA_CALLBACK = "binder";
    static final java.lang.String EXTRA_DREAM_TITLE = "title";
    public DreamActivity() { super(); }
    public void onCreate(android.os.Bundle p0) {}
    public static void setTitle(android.content.Intent p0, java.lang.CharSequence p1) {}
    public static java.lang.String getTitle(android.content.Intent p0) { return null; }
    public static void setCallback(android.content.Intent p0, android.service.dreams.DreamService.DreamActivityCallbacks p1) {}
    public static android.service.dreams.DreamService.DreamActivityCallbacks getCallback(android.content.Intent p0) { return null; }
    public void onDestroy() {}
}

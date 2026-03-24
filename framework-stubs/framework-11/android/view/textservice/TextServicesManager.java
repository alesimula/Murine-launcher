package android.view.textservice;

public final class TextServicesManager {
    private static final java.lang.String TAG = null;
    private static final boolean DBG = false;
    @java.lang.Deprecated
    private static android.view.textservice.TextServicesManager sInstance;
    private final com.android.internal.textservice.ITextServicesManager mService = null;
    private final int mUserId = 0;
    private TextServicesManager(int p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public static android.view.textservice.TextServicesManager createInstance(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    public static android.view.textservice.TextServicesManager getInstance() { return null; }
    private static java.lang.String parseLanguageFromLocaleString(java.lang.String p0) { return null; }
    public android.view.textservice.SpellCheckerSession newSpellCheckerSession(android.os.Bundle p0, java.util.Locale p1, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener p2, boolean p3) { return null; }
    public android.view.textservice.SpellCheckerInfo[] getEnabledSpellCheckers() { return null; }
    public android.view.textservice.SpellCheckerInfo getCurrentSpellChecker() { return null; }
    public android.view.textservice.SpellCheckerSubtype getCurrentSpellCheckerSubtype(boolean p0) { return null; }
    public boolean isSpellCheckerEnabled() { return false; }
    void finishSpellCheckerService(com.android.internal.textservice.ISpellCheckerSessionListener p0) {}
}

package android.view.textservice;

public final class TextServicesManager {
    public static android.view.textservice.TextServicesManager createInstance(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException { return null; }
    public static android.view.textservice.TextServicesManager getInstance() { return null; }
    public android.view.inputmethod.InputMethodManager getInputMethodManager() { return null; }
    public android.view.textservice.SpellCheckerSession newSpellCheckerSession(android.os.Bundle p0, java.util.Locale p1, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener p2, boolean p3) { return null; }
    public android.view.textservice.SpellCheckerSession newSpellCheckerSession(android.view.textservice.SpellCheckerSession.SpellCheckerSessionParams p0, java.util.concurrent.Executor p1, android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener p2) { return null; }
    public android.view.textservice.SpellCheckerInfo[] getEnabledSpellCheckers() { return null; }
    public java.util.List<android.view.textservice.SpellCheckerInfo> getEnabledSpellCheckerInfos() { return null; }
    public android.view.textservice.SpellCheckerInfo getCurrentSpellCheckerInfo() { return null; }
    public android.view.textservice.SpellCheckerInfo getCurrentSpellChecker() { return null; }
    public android.view.textservice.SpellCheckerSubtype getCurrentSpellCheckerSubtype(boolean p0) { return null; }
    public boolean isSpellCheckerEnabled() { return false; }
    void finishSpellCheckerService(com.android.internal.textservice.ISpellCheckerSessionListener p0) {}
}

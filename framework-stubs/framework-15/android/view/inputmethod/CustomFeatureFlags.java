package android.view.inputmethod;

public class CustomFeatureFlags implements android.view.inputmethod.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.view.inputmethod.FeatureFlags>> p0) {}
    public boolean concurrentInputMethods() { return false; }
    public boolean connectionlessHandwriting() { return false; }
    public boolean ctrlShiftShortcut() { return false; }
    public boolean deferShowSoftInputUntilSessionCreation() { return false; }
    public boolean editorinfoHandwritingEnabled() { return false; }
    public boolean homeScreenHandwritingDelegator() { return false; }
    public boolean imeSwitcherRevamp() { return false; }
    public boolean immUserhandleHostsidetests() { return false; }
    public boolean initiationWithoutInputConnection() { return false; }
    public boolean predictiveBackIme() { return false; }
    public boolean refactorInsetsController() { return false; }
    public boolean useHandwritingListenerForTooltype() { return false; }
    public boolean useInputMethodInfoSafeList() { return false; }
    public boolean useZeroJankProxy() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.view.inputmethod.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

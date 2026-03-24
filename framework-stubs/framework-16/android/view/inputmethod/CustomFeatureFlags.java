package android.view.inputmethod;

public class CustomFeatureFlags implements android.view.inputmethod.FeatureFlags {
    public CustomFeatureFlags(java.util.function.BiPredicate<java.lang.String, java.util.function.Predicate<android.view.inputmethod.FeatureFlags>> p0) {}
    public boolean adaptiveHandwritingBounds() { return false; }
    public boolean compatchangeForZerojankproxy() { return false; }
    public boolean concurrentInputMethods() { return false; }
    public boolean connectionlessHandwriting() { return false; }
    public boolean consistentGetCurrentInputMethodInfo() { return false; }
    public boolean ctrlShiftShortcut() { return false; }
    public boolean disableImeRestoreOnActivityCreate() { return false; }
    public boolean editorinfoHandwritingEnabled() { return false; }
    public boolean fallbackDisplayForSecondaryUserOnSecondaryDisplay() { return false; }
    public boolean homeScreenHandwritingDelegator() { return false; }
    public boolean imeSwitcherRevamp() { return false; }
    public boolean imeSwitcherRevampApi() { return false; }
    public boolean initiationWithoutInputConnection() { return false; }
    public boolean invalidateInputCallsRestart() { return false; }
    public boolean lowerImeOomImportance() { return false; }
    public boolean publicAutofillIdInEditorinfo() { return false; }
    public boolean refactorInsetsController() { return false; }
    public boolean reportAnimatingInsetsTypes() { return false; }
    public boolean useInputMethodInfoSafeList() { return false; }
    public boolean useZeroJankProxy() { return false; }
    public boolean verifyKeyEvent() { return false; }
    public boolean writingTools() { return false; }
    public boolean isFlagReadOnlyOptimized(java.lang.String p0) { return false; }
    protected boolean getValue(java.lang.String p0, java.util.function.Predicate<android.view.inputmethod.FeatureFlags> p1) { return false; }
    public java.util.List<java.lang.String> getFlagNames() { return null; }
}

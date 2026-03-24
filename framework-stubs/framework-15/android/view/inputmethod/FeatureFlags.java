package android.view.inputmethod;

public interface FeatureFlags {
    public boolean concurrentInputMethods();
    public boolean connectionlessHandwriting();
    public boolean ctrlShiftShortcut();
    public boolean deferShowSoftInputUntilSessionCreation();
    public boolean editorinfoHandwritingEnabled();
    public boolean homeScreenHandwritingDelegator();
    public boolean imeSwitcherRevamp();
    public boolean immUserhandleHostsidetests();
    public boolean initiationWithoutInputConnection();
    public boolean predictiveBackIme();
    public boolean refactorInsetsController();
    public boolean useHandwritingListenerForTooltype();
    public boolean useInputMethodInfoSafeList();
    public boolean useZeroJankProxy();
}

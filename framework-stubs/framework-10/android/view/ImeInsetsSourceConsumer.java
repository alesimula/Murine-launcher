package android.view;

public final class ImeInsetsSourceConsumer extends android.view.InsetsSourceConsumer {
    private android.view.inputmethod.EditorInfo mFocusedEditor;
    private android.view.inputmethod.EditorInfo mPreRenderedEditor;
    private boolean mShowOnNextImeRender;
    private boolean mHasWindowFocus;
    public ImeInsetsSourceConsumer(android.view.InsetsState p0, java.util.function.Supplier<android.view.SurfaceControl.Transaction> p1, android.view.InsetsController p2) { super(0, null, null, null); }
    public void onPreRendered(android.view.inputmethod.EditorInfo p0) {}
    public void onServedEditorChanged(android.view.inputmethod.EditorInfo p0) {}
    public void applyImeVisibility(boolean p0) {}
    public void onWindowFocusGained() {}
    public void onWindowFocusLost() {}
    int requestShow(boolean p0) { return 0; }
    void notifyHidden() {}
    private boolean isDummyOrEmptyEditor(android.view.inputmethod.EditorInfo p0) { return false; }
    private boolean isServedEditorRendered() { return false; }
    public static boolean areEditorsSimilar(android.view.inputmethod.EditorInfo p0, android.view.inputmethod.EditorInfo p1) { return false; }
    private android.view.inputmethod.InputMethodManager getImm() { return null; }
}

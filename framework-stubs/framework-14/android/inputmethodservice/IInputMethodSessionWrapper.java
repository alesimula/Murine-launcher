package android.inputmethodservice;

class IInputMethodSessionWrapper extends com.android.internal.inputmethod.IInputMethodSession.Stub implements com.android.internal.os.HandlerCaller.Callback {
    com.android.internal.os.HandlerCaller mCaller;
    android.view.inputmethod.InputMethodSession mInputMethodSession;
    android.view.InputChannel mChannel;
    android.inputmethodservice.IInputMethodSessionWrapper.ImeInputEventReceiver mReceiver;
    public IInputMethodSessionWrapper(android.content.Context p0, android.view.inputmethod.InputMethodSession p1, android.view.InputChannel p2) { super(); }
    public android.view.inputmethod.InputMethodSession getInternalInputMethodSession() { return null; }
    public void executeMessage(android.os.Message p0) {}
    public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) {}
    public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) {}
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) {}
    public void viewClicked(boolean p0) {}
    public void removeImeSurface() {}
    public void updateCursor(android.graphics.Rect p0) {}
    public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) {}
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) {}
    public void finishSession() {}
    public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) {}
    public void finishInput() {}

    private final class ImeInputEventReceiver extends android.view.InputEventReceiver implements android.view.inputmethod.InputMethodSession.EventCallback {
        public ImeInputEventReceiver(android.inputmethodservice.IInputMethodSessionWrapper p0, android.view.InputChannel p1, android.os.Looper p2) { super(null, null); }
        public void onInputEvent(android.view.InputEvent p0) {}
        public void finishedEvent(int p0, boolean p1) {}
    }
}

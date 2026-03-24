package android.view;

public abstract class InputFilter extends android.view.IInputFilter.Stub {
    public InputFilter(android.os.Looper p0) { super(); }
    public final void install(android.view.IInputFilterHost p0) {}
    public final void uninstall() {}
    public final void filterInputEvent(android.view.InputEvent p0, int p1) {}
    public void sendInputEvent(android.view.InputEvent p0, int p1) {}
    public void onInputEvent(android.view.InputEvent p0, int p1) {}
    public void onInstalled() {}
    public void onUninstalled() {}

    private final class H extends android.os.Handler {
        public H(android.view.InputFilter p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}

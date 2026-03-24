package android.view;

public abstract class InputFilter extends android.view.IInputFilter.Stub {
    private static final int MSG_INSTALL = 1;
    private static final int MSG_UNINSTALL = 2;
    private static final int MSG_INPUT_EVENT = 3;
    private final android.view.InputEventConsistencyVerifier mInboundInputEventConsistencyVerifier = null;
    private final android.view.InputEventConsistencyVerifier mOutboundInputEventConsistencyVerifier = null;
    private final android.view.InputFilter.H mH = null;
    private android.view.IInputFilterHost mHost;
    @android.annotation.UnsupportedAppUsage
    public InputFilter(android.os.Looper p0) { super(); }
    public final void install(android.view.IInputFilterHost p0) {}
    public final void uninstall() {}
    public final void filterInputEvent(android.view.InputEvent p0, int p1) {}
    public void sendInputEvent(android.view.InputEvent p0, int p1) {}
    @android.annotation.UnsupportedAppUsage
    public void onInputEvent(android.view.InputEvent p0, int p1) {}
    public void onInstalled() {}
    public void onUninstalled() {}

    private final class H extends android.os.Handler {
        public H(android.view.InputFilter p0, android.os.Looper p1) { super(); }
        public void handleMessage(android.os.Message p0) {}
    }
}

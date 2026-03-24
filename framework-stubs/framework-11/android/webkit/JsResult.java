package android.webkit;

public class JsResult {
    private final android.webkit.JsResult.ResultReceiver mReceiver = null;
    private boolean mResult;
    public final void cancel() {}
    public final void confirm() {}
    @android.annotation.SystemApi
    public JsResult(android.webkit.JsResult.ResultReceiver p0) {}
    @android.annotation.SystemApi
    public final boolean getResult() { return false; }
    private final void wakeUp() {}

    @android.annotation.SystemApi
    public static interface ResultReceiver {
        public void onJsResultComplete(android.webkit.JsResult p0);
    }
}

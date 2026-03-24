package android.webkit;

public class JsResult {
    public final void cancel() {}
    public final void confirm() {}
    @android.annotation.SystemApi
    public JsResult(android.webkit.JsResult.ResultReceiver p0) {}
    @android.annotation.SystemApi
    public final boolean getResult() { return false; }

    @android.annotation.SystemApi
    public static interface ResultReceiver {
        public void onJsResultComplete(android.webkit.JsResult p0);
    }
}

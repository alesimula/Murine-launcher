package android.webkit;

@android.annotation.SystemApi
public class JsDialogHelper {
    public static final int ALERT = 1;
    public static final int CONFIRM = 2;
    public static final int PROMPT = 3;
    public static final int UNLOAD = 4;
    public JsDialogHelper(android.webkit.JsPromptResult p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    public JsDialogHelper(android.webkit.JsPromptResult p0, android.os.Message p1) {}
    public boolean invokeCallback(android.webkit.WebChromeClient p0, android.webkit.WebView p1) { return false; }
    public void showDialog(android.content.Context p0) {}

    private class CancelListener implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener {
        public void onCancel(android.content.DialogInterface p0) {}
        public void onClick(android.content.DialogInterface p0, int p1) {}
    }

    private class PositiveListener implements android.content.DialogInterface.OnClickListener {
        public PositiveListener(android.webkit.JsDialogHelper p0, android.widget.EditText p1) {}
        public void onClick(android.content.DialogInterface p0, int p1) {}
    }
}

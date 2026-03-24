package android.webkit;

@android.annotation.SystemApi
public class JsDialogHelper {
    private static final java.lang.String TAG = "JsDialogHelper";
    public static final int ALERT = 1;
    public static final int CONFIRM = 2;
    public static final int PROMPT = 3;
    public static final int UNLOAD = 4;
    private final java.lang.String mDefaultValue = null;
    private final android.webkit.JsPromptResult mResult = null;
    private final java.lang.String mMessage = null;
    private final int mType = 0;
    private final java.lang.String mUrl = null;
    public JsDialogHelper(android.webkit.JsPromptResult p0, int p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) {}
    public JsDialogHelper(android.webkit.JsPromptResult p0, android.os.Message p1) {}
    public boolean invokeCallback(android.webkit.WebChromeClient p0, android.webkit.WebView p1) { return false; }
    public void showDialog(android.content.Context p0) {}
    private java.lang.String getJsDialogTitle(android.content.Context p0) { return null; }
    private static boolean canShowAlertDialog(android.content.Context p0) { return false; }

    private class PositiveListener implements android.content.DialogInterface.OnClickListener {
        private final android.widget.EditText mEdit = null;
        public PositiveListener(android.webkit.JsDialogHelper p0, android.widget.EditText p1) {}
        public void onClick(android.content.DialogInterface p0, int p1) {}
    }

    private class CancelListener implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnClickListener {
        private CancelListener(android.webkit.JsDialogHelper p0) {}
        public void onCancel(android.content.DialogInterface p0) {}
        public void onClick(android.content.DialogInterface p0, int p1) {}
    }
}

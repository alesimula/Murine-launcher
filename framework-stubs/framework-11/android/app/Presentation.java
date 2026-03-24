package android.app;

public class Presentation extends android.app.Dialog {
    private static final java.lang.String TAG = "Presentation";
    private static final int MSG_CANCEL = 1;
    private final android.view.Display mDisplay = null;
    private final android.hardware.display.DisplayManager mDisplayManager = null;
    private final android.os.IBinder mToken = null;
    private final android.hardware.display.DisplayManager.DisplayListener mDisplayListener = null;
    private final android.os.Handler mHandler = null;
    public Presentation(android.content.Context p0, android.view.Display p1) { super((android.content.Context)null); }
    public Presentation(android.content.Context p0, android.view.Display p1, int p2) { super((android.content.Context)null); }
    public android.view.Display getDisplay() { return null; }
    public android.content.res.Resources getResources() { return null; }
    protected void onStart() {}
    protected void onStop() {}
    public void show() {}
    public void onDisplayRemoved() {}
    public void onDisplayChanged() {}
    private void handleDisplayRemoved() {}
    private void handleDisplayChanged() {}
    private boolean isConfigurationStillValid() { return false; }
    private static android.content.Context createPresentationContext(android.content.Context p0, android.view.Display p1, int p2) { return null; }
}

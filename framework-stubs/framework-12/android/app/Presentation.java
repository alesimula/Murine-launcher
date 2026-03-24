package android.app;

public class Presentation extends android.app.Dialog {
    private static final java.lang.String TAG = "Presentation";
    private final android.view.Display mDisplay = null;
    private final android.hardware.display.DisplayManager mDisplayManager = null;
    private final android.os.Handler mHandler = null;
    private final android.hardware.display.DisplayManager.DisplayListener mDisplayListener = null;
    public Presentation(android.content.Context p0, android.view.Display p1) { super((android.content.Context)null); }
    public Presentation(android.content.Context p0, android.view.Display p1, int p2) { super((android.content.Context)null); }
    public Presentation(android.content.Context p0, android.view.Display p1, int p2, int p3) { super((android.content.Context)null); }
    private static int getWindowType(int p0, android.view.Display p1) { return 0; }
    public android.view.Display getDisplay() { return null; }
    public android.content.res.Resources getResources() { return null; }
    protected void onStart() {}
    protected void onStop() {}
    public void show() {}
    public void onDisplayRemoved() {}
    public void onDisplayChanged() {}
    private void handleDisplayRemoved() {}
    private void handleDisplayChanged() {}
    private static android.content.Context createPresentationContext(android.content.Context p0, android.view.Display p1, int p2) { return null; }
    private static android.content.Context createPresentationContext(android.content.Context p0, android.view.Display p1, int p2, int p3) { return null; }
}

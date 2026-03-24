package android.window;

public class WindowTokenClient extends android.app.IWindowToken.Stub {
    public WindowTokenClient() { super(); }
    public void attachContext(android.content.Context p0) {}
    public boolean attachToDisplayArea(int p0, int p1, android.os.Bundle p2) { return false; }
    public boolean attachToDisplayContent(int p0) { return false; }
    public void attachToWindowToken(android.os.IBinder p0) {}
    public void detachFromWindowContainerIfNeeded() {}
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1) {}
    public void onConfigurationChanged(android.content.res.Configuration p0, int p1, boolean p2) {}
    public void onWindowTokenRemoved() {}
}

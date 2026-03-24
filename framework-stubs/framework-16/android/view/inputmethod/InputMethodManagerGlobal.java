package android.view.inputmethod;

public class InputMethodManagerGlobal {
    public InputMethodManagerGlobal() {}
    public static boolean isImeTraceAvailable() { return false; }
    @android.annotation.RequiresNoPermission
    public static void startProtoDump(byte[] p0, int p1, java.lang.String p2, java.util.function.Consumer<android.os.RemoteException> p3) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_UI_TRACING")
    public static void startImeTrace(java.util.function.Consumer<android.os.RemoteException> p0) {}
    @android.annotation.RequiresPermission("android.permission.CONTROL_UI_TRACING")
    public static void stopImeTrace(java.util.function.Consumer<android.os.RemoteException> p0) {}
    @android.annotation.RequiresNoPermission
    public static boolean isImeTraceEnabled() { return false; }
    @android.annotation.RequiresPermission("android.permission.INTERNAL_SYSTEM_WINDOW")
    public static void removeImeSurface(int p0, java.util.function.Consumer<android.os.RemoteException> p1) {}
}

package android.webkit;

public class WebViewZygote {
    private static final java.lang.String LOGTAG = "WebViewZygote";
    private static final java.lang.Object sLock = null;
    private static android.os.ChildZygoteProcess sZygote;
    private static android.content.pm.PackageInfo sPackage;
    private static boolean sMultiprocessEnabled;
    public WebViewZygote() {}
    public static android.os.ZygoteProcess getProcess() { return null; }
    public static java.lang.String getPackageName() { return null; }
    public static boolean isMultiprocessEnabled() { return false; }
    public static void setMultiprocessEnabled(boolean p0) {}
    static void onWebViewProviderChanged(android.content.pm.PackageInfo p0) {}
    private static void stopZygoteLocked() {}
    private static void connectToZygoteIfNeededLocked() {}
}

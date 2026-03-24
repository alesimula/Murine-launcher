package android.app.sdksandbox.sandboxactivity;

public interface ActivityContextInfo {
    default public int getContextFlags() { return 0; }
    @android.annotation.NonNull
    public android.content.pm.ApplicationInfo getSdkApplicationInfo();
}

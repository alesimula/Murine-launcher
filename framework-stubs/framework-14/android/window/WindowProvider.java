package android.window;

public interface WindowProvider {
    public static final java.lang.String KEY_IS_WINDOW_PROVIDER_SERVICE = "android.windowContext.isWindowProviderService";
    public int getWindowType();
    public android.os.Bundle getWindowContextOptions();
    public android.os.IBinder getWindowContextToken();
}

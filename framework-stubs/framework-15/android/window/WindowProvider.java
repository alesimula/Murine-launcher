package android.window;

public interface WindowProvider {
    public static final java.lang.String KEY_IS_WINDOW_PROVIDER_SERVICE = "android.windowContext.isWindowProviderService";
    public int getWindowType();
    @android.annotation.Nullable
    public android.os.Bundle getWindowContextOptions();
    @android.annotation.NonNull
    public android.os.IBinder getWindowContextToken();
}

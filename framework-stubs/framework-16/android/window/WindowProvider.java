package android.window;

public interface WindowProvider {
    public static final java.lang.String KEY_IS_WINDOW_PROVIDER_SERVICE = "android.window.WindowProvider.isWindowProviderService";
    public static final java.lang.String KEY_REPARENT_TO_DEFAULT_DISPLAY_WITH_DISPLAY_REMOVAL = "android.window.WindowProvider.reparentToDefaultDisplayWithDisplayRemoval";
    public int getWindowType();
    @android.annotation.Nullable
    public android.os.Bundle getWindowContextOptions();
    @android.annotation.NonNull
    public android.os.IBinder getWindowContextToken();
    default public int getWindowTypeOverride() { return 0; }
    default public boolean isValidWindowType(int p0) { return false; }
}

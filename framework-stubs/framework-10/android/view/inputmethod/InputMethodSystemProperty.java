package android.view.inputmethod;

public class InputMethodSystemProperty {
    private static final java.lang.String PROP_PROD_MULTI_CLIENT_IME = "ro.sys.multi_client_ime";
    private static final java.lang.String PROP_DEBUG_MULTI_CLIENT_IME = "persist.debug.multi_client_ime";
    private static final java.lang.String PROP_DEBUG_PER_PROFILE_IME = "persist.debug.per_profile_ime";
    public static final android.content.ComponentName sMultiClientImeComponentName = null;
    public static final boolean MULTI_CLIENT_IME_ENABLED = Boolean.valueOf(false);
    public static final boolean PER_PROFILE_IME_ENABLED = Boolean.valueOf(false);
    public InputMethodSystemProperty() {}
    private static android.content.ComponentName getMultiClientImeComponentName() { return null; }
}

package android.inputmethodservice.navigationbar;

public final class NavigationBarInflaterView extends android.widget.FrameLayout {
    public static final java.lang.String NAV_BAR_VIEWS = "sysui_nav_bar";
    public static final java.lang.String NAV_BAR_LEFT = "sysui_nav_bar_left";
    public static final java.lang.String NAV_BAR_RIGHT = "sysui_nav_bar_right";
    public static final java.lang.String MENU_IME_ROTATE = "menu_ime";
    public static final java.lang.String BACK = "back";
    public static final java.lang.String HOME = "home";
    public static final java.lang.String RECENT = "recent";
    public static final java.lang.String NAVSPACE = "space";
    public static final java.lang.String CLIPBOARD = "clipboard";
    public static final java.lang.String HOME_HANDLE = "home_handle";
    public static final java.lang.String KEY = "key";
    public static final java.lang.String LEFT = "left";
    public static final java.lang.String RIGHT = "right";
    public static final java.lang.String CONTEXTUAL = "contextual";
    public static final java.lang.String IME_SWITCHER = "ime_switcher";
    public static final java.lang.String GRAVITY_SEPARATOR = ";";
    public static final java.lang.String BUTTON_SEPARATOR = ",";
    public static final java.lang.String SIZE_MOD_START = "[";
    public static final java.lang.String SIZE_MOD_END = "]";
    public static final java.lang.String KEY_CODE_START = "(";
    public static final java.lang.String KEY_IMAGE_DELIM = ":";
    public static final java.lang.String KEY_CODE_END = ")";
    protected android.view.LayoutInflater mLayoutInflater;
    protected android.view.LayoutInflater mLandscapeInflater;
    protected android.widget.FrameLayout mHorizontal;
    android.util.SparseArray<android.inputmethodservice.navigationbar.ButtonDispatcher> mButtonDispatchers;
    public NavigationBarInflaterView(android.content.Context p0, android.util.AttributeSet p1) { super((android.content.Context)null); }
    void createInflaters() {}
    protected void onFinishInflate() {}
    java.lang.String getDefaultLayout() { return null; }
    void setButtonDispatchers(android.util.SparseArray<android.inputmethodservice.navigationbar.ButtonDispatcher> p0) {}
    void updateButtonDispatchersCurrentView() {}
    void setAlternativeOrder(boolean p0) {}
    protected void inflateLayout(java.lang.String p0) {}
    @android.annotation.Nullable
    protected android.view.View inflateButton(java.lang.String p0, android.view.ViewGroup p1, boolean p2, boolean p3) { return null; }
    android.view.View createView(java.lang.String p0, android.view.ViewGroup p1, android.view.LayoutInflater p2) { return null; }
}

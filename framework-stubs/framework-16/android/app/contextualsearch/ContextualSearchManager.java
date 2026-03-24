package android.app.contextualsearch;

@android.annotation.FlaggedApi("android.app.contextualsearch.flags.self_invocation")
public final class ContextualSearchManager {
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_ENTRYPOINT = "android.app.contextualsearch.extra.ENTRYPOINT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_FLAG_SECURE_FOUND = "android.app.contextualsearch.extra.FLAG_SECURE_FOUND";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_SCREENSHOT = "android.app.contextualsearch.extra.SCREENSHOT";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_IS_MANAGED_PROFILE_VISIBLE = "android.app.contextualsearch.extra.IS_MANAGED_PROFILE_VISIBLE";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_VISIBLE_PACKAGE_NAMES = "android.app.contextualsearch.extra.VISIBLE_PACKAGE_NAMES";
    public static final java.lang.String EXTRA_INVOCATION_TIME_MS = "android.app.contextualsearch.extra.INVOCATION_TIME_MS";
    @android.annotation.SystemApi
    public static final java.lang.String EXTRA_TOKEN = "android.app.contextualsearch.extra.TOKEN";
    public static final java.lang.String EXTRA_IS_AUDIO_PLAYING = "android.app.contextualsearch.extra.IS_AUDIO_PLAYING";
    @android.annotation.SystemApi
    public static final java.lang.String ACTION_LAUNCH_CONTEXTUAL_SEARCH = "android.app.contextualsearch.action.LAUNCH_CONTEXTUAL_SEARCH";
    public static final java.lang.String FEATURE_CONTEXTUAL_SEARCH = "com.google.android.feature.CONTEXTUAL_SEARCH";
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_NAV_HANDLE = 1;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_HOME = 2;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_OVERVIEW = 3;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_OVERVIEW_ACTION = 4;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_OVERVIEW_MENU = 5;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_SYSTEM_ACTION = 9;
    @android.annotation.SystemApi
    public static final int ENTRYPOINT_LONG_PRESS_META = 10;
    public ContextualSearchManager() {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.ACCESS_CONTEXTUAL_SEARCH")
    public void startContextualSearch(int p0) {}
    @android.annotation.FlaggedApi("android.app.contextualsearch.flags.self_invocation")
    public void startContextualSearch() {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Entrypoint {
    }
}

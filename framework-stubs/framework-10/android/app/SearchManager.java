package android.app;

public class SearchManager implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener {
    private static final boolean DBG = false;
    private static final java.lang.String TAG = "SearchManager";
    public static final char MENU_KEY = 's';
    public static final int MENU_KEYCODE = 47;
    public static final java.lang.String QUERY = "query";
    public static final java.lang.String USER_QUERY = "user_query";
    public static final java.lang.String APP_DATA = "app_data";
    public static final java.lang.String SEARCH_MODE = "search_mode";
    public static final java.lang.String ACTION_KEY = "action_key";
    public static final java.lang.String EXTRA_DATA_KEY = "intent_extra_data_key";
    public static final java.lang.String EXTRA_SELECT_QUERY = "select_query";
    public static final java.lang.String EXTRA_NEW_SEARCH = "new_search";
    public static final java.lang.String EXTRA_WEB_SEARCH_PENDINGINTENT = "web_search_pendingintent";
    public static final java.lang.String CURSOR_EXTRA_KEY_IN_PROGRESS = "in_progress";
    public static final java.lang.String ACTION_MSG = "action_msg";
    public static final int FLAG_QUERY_REFINEMENT = 1;
    public static final java.lang.String SUGGEST_URI_PATH_QUERY = "search_suggest_query";
    public static final java.lang.String SUGGEST_MIME_TYPE = "vnd.android.cursor.dir/vnd.android.search.suggest";
    public static final java.lang.String SUGGEST_URI_PATH_SHORTCUT = "search_suggest_shortcut";
    public static final java.lang.String SHORTCUT_MIME_TYPE = "vnd.android.cursor.item/vnd.android.search.suggest";
    public static final java.lang.String SUGGEST_COLUMN_FORMAT = "suggest_format";
    public static final java.lang.String SUGGEST_COLUMN_TEXT_1 = "suggest_text_1";
    public static final java.lang.String SUGGEST_COLUMN_TEXT_2 = "suggest_text_2";
    public static final java.lang.String SUGGEST_COLUMN_TEXT_2_URL = "suggest_text_2_url";
    public static final java.lang.String SUGGEST_COLUMN_ICON_1 = "suggest_icon_1";
    public static final java.lang.String SUGGEST_COLUMN_ICON_2 = "suggest_icon_2";
    public static final java.lang.String SUGGEST_COLUMN_RESULT_CARD_IMAGE = "suggest_result_card_image";
    public static final java.lang.String SUGGEST_COLUMN_INTENT_ACTION = "suggest_intent_action";
    public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA = "suggest_intent_data";
    public static final java.lang.String SUGGEST_COLUMN_INTENT_EXTRA_DATA = "suggest_intent_extra_data";
    public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA_ID = "suggest_intent_data_id";
    public static final java.lang.String SUGGEST_COLUMN_QUERY = "suggest_intent_query";
    public static final java.lang.String SUGGEST_COLUMN_SHORTCUT_ID = "suggest_shortcut_id";
    public static final java.lang.String SUGGEST_COLUMN_SPINNER_WHILE_REFRESHING = "suggest_spinner_while_refreshing";
    public static final java.lang.String SUGGEST_COLUMN_CONTENT_TYPE = "suggest_content_type";
    public static final java.lang.String SUGGEST_COLUMN_IS_LIVE = "suggest_is_live";
    public static final java.lang.String SUGGEST_COLUMN_VIDEO_WIDTH = "suggest_video_width";
    public static final java.lang.String SUGGEST_COLUMN_VIDEO_HEIGHT = "suggest_video_height";
    public static final java.lang.String SUGGEST_COLUMN_AUDIO_CHANNEL_CONFIG = "suggest_audio_channel_config";
    public static final java.lang.String SUGGEST_COLUMN_PURCHASE_PRICE = "suggest_purchase_price";
    public static final java.lang.String SUGGEST_COLUMN_RENTAL_PRICE = "suggest_rental_price";
    public static final java.lang.String SUGGEST_COLUMN_RATING_STYLE = "suggest_rating_style";
    public static final java.lang.String SUGGEST_COLUMN_RATING_SCORE = "suggest_rating_score";
    public static final java.lang.String SUGGEST_COLUMN_PRODUCTION_YEAR = "suggest_production_year";
    public static final java.lang.String SUGGEST_COLUMN_DURATION = "suggest_duration";
    public static final java.lang.String SUGGEST_COLUMN_FLAGS = "suggest_flags";
    public static final java.lang.String SUGGEST_COLUMN_LAST_ACCESS_HINT = "suggest_last_access_hint";
    public static final java.lang.String SUGGEST_NEVER_MAKE_SHORTCUT = "_-1";
    public static final java.lang.String SUGGEST_PARAMETER_LIMIT = "limit";
    public static final java.lang.String INTENT_ACTION_GLOBAL_SEARCH = "android.search.action.GLOBAL_SEARCH";
    public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS = "android.search.action.SEARCH_SETTINGS";
    public static final java.lang.String INTENT_ACTION_WEB_SEARCH_SETTINGS = "android.search.action.WEB_SEARCH_SETTINGS";
    public static final java.lang.String INTENT_ACTION_SEARCHABLES_CHANGED = "android.search.action.SEARCHABLES_CHANGED";
    public static final java.lang.String INTENT_GLOBAL_SEARCH_ACTIVITY_CHANGED = "android.search.action.GLOBAL_SEARCH_ACTIVITY_CHANGED";
    public static final java.lang.String INTENT_ACTION_SEARCH_SETTINGS_CHANGED = "android.search.action.SETTINGS_CHANGED";
    public static final java.lang.String CONTEXT_IS_VOICE = "android.search.CONTEXT_IS_VOICE";
    @android.annotation.UnsupportedAppUsage
    public static final java.lang.String DISABLE_VOICE_SEARCH = "android.search.DISABLE_VOICE_SEARCH";
    private final android.app.ISearchManager mService = null;
    private final android.content.Context mContext = null;
    final android.os.Handler mHandler = null;
    android.app.SearchManager.OnDismissListener mDismissListener;
    android.app.SearchManager.OnCancelListener mCancelListener;
    @android.annotation.UnsupportedAppUsage
    private android.app.SearchDialog mSearchDialog;
    @android.annotation.UnsupportedAppUsage
    SearchManager(android.content.Context p0, android.os.Handler p1) throws android.os.ServiceManager.ServiceNotFoundException {}
    public void startSearch(java.lang.String p0, boolean p1, android.content.ComponentName p2, android.os.Bundle p3, boolean p4) {}
    @android.annotation.UnsupportedAppUsage
    public void startSearch(java.lang.String p0, boolean p1, android.content.ComponentName p2, android.os.Bundle p3, boolean p4, android.graphics.Rect p5) {}
    private void ensureSearchDialog() {}
    void startGlobalSearch(java.lang.String p0, boolean p1, android.os.Bundle p2, android.graphics.Rect p3) {}
    public java.util.List<android.content.pm.ResolveInfo> getGlobalSearchActivities() { return null; }
    public android.content.ComponentName getGlobalSearchActivity() { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.content.ComponentName getWebSearchActivity() { return null; }
    public void triggerSearch(java.lang.String p0, android.content.ComponentName p1, android.os.Bundle p2) {}
    public void stopSearch() {}
    @android.annotation.UnsupportedAppUsage
    public boolean isVisible() { return false; }
    public void setOnDismissListener(android.app.SearchManager.OnDismissListener p0) {}
    public void setOnCancelListener(android.app.SearchManager.OnCancelListener p0) {}
    @java.lang.Deprecated
    public void onCancel(android.content.DialogInterface p0) {}
    @java.lang.Deprecated
    public void onDismiss(android.content.DialogInterface p0) {}
    public android.app.SearchableInfo getSearchableInfo(android.content.ComponentName p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.database.Cursor getSuggestions(android.app.SearchableInfo p0, java.lang.String p1) { return null; }
    @android.annotation.UnsupportedAppUsage
    public android.database.Cursor getSuggestions(android.app.SearchableInfo p0, java.lang.String p1, int p2) { return null; }
    public java.util.List<android.app.SearchableInfo> getSearchablesInGlobalSearch() { return null; }
    public android.content.Intent getAssistIntent(boolean p0) { return null; }
    @android.annotation.UnsupportedAppUsage
    public void launchAssist(android.os.Bundle p0) {}
    public boolean launchLegacyAssist(java.lang.String p0, int p1, android.os.Bundle p2) { return false; }

    public static interface OnDismissListener {
        public void onDismiss();
    }

    public static interface OnCancelListener {
        public void onCancel();
    }
}

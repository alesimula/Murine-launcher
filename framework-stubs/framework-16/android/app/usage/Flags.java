package android.app.usage;

public final class Flags {
    public static final java.lang.String FLAG_FILTER_BASED_EVENT_QUERY_API = "android.app.usage.filter_based_event_query_api";
    public static final java.lang.String FLAG_GET_APP_ART_MANAGED_BYTES = "android.app.usage.get_app_art_managed_bytes";
    public static final java.lang.String FLAG_GET_APP_BYTES_BY_DATA_TYPE_API = "android.app.usage.get_app_bytes_by_data_type_api";
    public static final java.lang.String FLAG_REPORT_USAGE_STATS_PERMISSION = "android.app.usage.report_usage_stats_permission";
    public static final java.lang.String FLAG_USE_DEDICATED_HANDLER_THREAD = "android.app.usage.use_dedicated_handler_thread";
    public static final java.lang.String FLAG_USE_PARCELED_LIST = "android.app.usage.use_parceled_list";
    public static final java.lang.String FLAG_USER_INTERACTION_TYPE_API = "android.app.usage.user_interaction_type_api";
    public Flags() {}
    public static boolean filterBasedEventQueryApi() { return false; }
    public static boolean getAppArtManagedBytes() { return false; }
    public static boolean getAppBytesByDataTypeApi() { return false; }
    public static boolean reportUsageStatsPermission() { return false; }
    public static boolean useDedicatedHandlerThread() { return false; }
    public static boolean useParceledList() { return false; }
    public static boolean userInteractionTypeApi() { return false; }
}

package android.net.netstats;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.MODULE_LIBRARIES)
public class NetworkStatsDataMigrationUtils {
    public static final java.lang.String PREFIX_XT = "xt";
    public static final java.lang.String PREFIX_UID = "uid";
    public static final java.lang.String PREFIX_UID_TAG = "uid_tag";
    @android.annotation.NonNull
    public static android.net.NetworkStatsCollection readPlatformCollection(java.lang.String p0, long p1) throws java.io.IOException { return null; }
    public static void readPlatformCollection(android.net.NetworkStatsCollection.Builder p0, java.io.DataInput p1) throws java.io.IOException {}
    public static void readLegacyUid(android.net.NetworkStatsCollection.Builder p0, java.io.DataInput p1, boolean p2) throws java.io.IOException {}

    private static class CollectionVersion {
        static final int VERSION_NETWORK_INIT = 1;
        static final int VERSION_UID_INIT = 1;
        static final int VERSION_UID_WITH_IDENT = 2;
        static final int VERSION_UID_WITH_TAG = 3;
        static final int VERSION_UID_WITH_SET = 4;
        static final int VERSION_UNIFIED_INIT = 16;
    }

    private static class HistoryVersion {
        static final int VERSION_INIT = 1;
        static final int VERSION_ADD_PACKETS = 2;
        static final int VERSION_ADD_ACTIVE = 3;
    }

    private static class IdentitySetVersion {
        static final int VERSION_INIT = 1;
        static final int VERSION_ADD_ROAMING = 2;
        static final int VERSION_ADD_NETWORK_ID = 3;
        static final int VERSION_ADD_METERED = 4;
        static final int VERSION_ADD_DEFAULT_NETWORK = 5;
        static final int VERSION_ADD_OEM_MANAGED_NETWORK = 6;
        static final int VERSION_ADD_SUB_ID = 7;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Prefix {
    }
}

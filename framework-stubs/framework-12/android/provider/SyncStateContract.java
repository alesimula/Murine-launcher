package android.provider;

public class SyncStateContract {
    public SyncStateContract() {}

    public static interface Columns extends android.provider.BaseColumns {
        public static final java.lang.String ACCOUNT_NAME = "account_name";
        public static final java.lang.String ACCOUNT_TYPE = "account_type";
        public static final java.lang.String DATA = "data";
    }

    public static class Constants implements android.provider.SyncStateContract.Columns {
        public static final java.lang.String CONTENT_DIRECTORY = "syncstate";
        public Constants() {}
    }

    public static final class Helpers {
        private static final java.lang.String[] DATA_PROJECTION = null;
        private static final java.lang.String SELECT_BY_ACCOUNT = "account_name=? AND account_type=?";
        public Helpers() {}
        public static byte[] get(android.content.ContentProviderClient p0, android.net.Uri p1, android.accounts.Account p2) throws android.os.RemoteException { return null; }
        public static void set(android.content.ContentProviderClient p0, android.net.Uri p1, android.accounts.Account p2, byte[] p3) throws android.os.RemoteException {}
        public static android.net.Uri insert(android.content.ContentProviderClient p0, android.net.Uri p1, android.accounts.Account p2, byte[] p3) throws android.os.RemoteException { return null; }
        public static void update(android.content.ContentProviderClient p0, android.net.Uri p1, byte[] p2) throws android.os.RemoteException {}
        public static android.util.Pair<android.net.Uri, byte[]> getWithUri(android.content.ContentProviderClient p0, android.net.Uri p1, android.accounts.Account p2) throws android.os.RemoteException { return null; }
        public static android.content.ContentProviderOperation newSetOperation(android.net.Uri p0, android.accounts.Account p1, byte[] p2) { return null; }
        public static android.content.ContentProviderOperation newUpdateOperation(android.net.Uri p0, byte[] p1) { return null; }
    }
}

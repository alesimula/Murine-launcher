package android.app.contentsuggestions;

public interface IClassificationsCallback extends android.os.IInterface {
    public void onContentClassificationsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentClassification> p1) throws android.os.RemoteException;

    public static class Default implements android.app.contentsuggestions.IClassificationsCallback {
        public Default() {}
        public void onContentClassificationsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentClassification> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.contentsuggestions.IClassificationsCallback {
        private static final java.lang.String DESCRIPTOR = "android.app.contentsuggestions.IClassificationsCallback";
        static final int TRANSACTION_onContentClassificationsAvailable = 1;
        public Stub() { super(); }
        public static android.app.contentsuggestions.IClassificationsCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.contentsuggestions.IClassificationsCallback p0) { return false; }
        public static android.app.contentsuggestions.IClassificationsCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.contentsuggestions.IClassificationsCallback {
            private android.os.IBinder mRemote;
            public static android.app.contentsuggestions.IClassificationsCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onContentClassificationsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentClassification> p1) throws android.os.RemoteException {}
        }
    }
}

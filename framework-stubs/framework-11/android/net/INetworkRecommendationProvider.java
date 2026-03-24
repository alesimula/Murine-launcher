package android.net;

public interface INetworkRecommendationProvider extends android.os.IInterface {
    public void requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException;

    public static class Default implements android.net.INetworkRecommendationProvider {
        public Default() {}
        public void requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.net.INetworkRecommendationProvider {
        private static final java.lang.String DESCRIPTOR = "android.net.INetworkRecommendationProvider";
        static final int TRANSACTION_requestScores = 1;
        public Stub() { super(); }
        public static android.net.INetworkRecommendationProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.net.INetworkRecommendationProvider p0) { return false; }
        public static android.net.INetworkRecommendationProvider getDefaultImpl() { return null; }

        private static class Proxy implements android.net.INetworkRecommendationProvider {
            private android.os.IBinder mRemote;
            public static android.net.INetworkRecommendationProvider sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void requestScores(android.net.NetworkKey[] p0) throws android.os.RemoteException {}
        }
    }
}

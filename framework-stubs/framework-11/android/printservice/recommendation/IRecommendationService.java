package android.printservice.recommendation;

public interface IRecommendationService extends android.os.IInterface {
    public void registerCallbacks(android.printservice.recommendation.IRecommendationServiceCallbacks p0) throws android.os.RemoteException;

    public static class Default implements android.printservice.recommendation.IRecommendationService {
        public Default() {}
        public void registerCallbacks(android.printservice.recommendation.IRecommendationServiceCallbacks p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.printservice.recommendation.IRecommendationService {
        private static final java.lang.String DESCRIPTOR = "android.printservice.recommendation.IRecommendationService";
        static final int TRANSACTION_registerCallbacks = 1;
        public Stub() { super(); }
        public static android.printservice.recommendation.IRecommendationService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.printservice.recommendation.IRecommendationService p0) { return false; }
        public static android.printservice.recommendation.IRecommendationService getDefaultImpl() { return null; }

        private static class Proxy implements android.printservice.recommendation.IRecommendationService {
            private android.os.IBinder mRemote;
            public static android.printservice.recommendation.IRecommendationService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void registerCallbacks(android.printservice.recommendation.IRecommendationServiceCallbacks p0) throws android.os.RemoteException {}
        }
    }
}

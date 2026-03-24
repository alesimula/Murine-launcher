package android.printservice.recommendation;

public interface IRecommendationsChangeListener extends android.os.IInterface {
    public void onRecommendationsChanged() throws android.os.RemoteException;

    public static class Default implements android.printservice.recommendation.IRecommendationsChangeListener {
        public Default() {}
        public void onRecommendationsChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.printservice.recommendation.IRecommendationsChangeListener {
        private static final java.lang.String DESCRIPTOR = "android.printservice.recommendation.IRecommendationsChangeListener";
        static final int TRANSACTION_onRecommendationsChanged = 1;
        public Stub() { super(); }
        public static android.printservice.recommendation.IRecommendationsChangeListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.printservice.recommendation.IRecommendationsChangeListener p0) { return false; }
        public static android.printservice.recommendation.IRecommendationsChangeListener getDefaultImpl() { return null; }

        private static class Proxy implements android.printservice.recommendation.IRecommendationsChangeListener {
            private android.os.IBinder mRemote;
            public static android.printservice.recommendation.IRecommendationsChangeListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onRecommendationsChanged() throws android.os.RemoteException {}
        }
    }
}

package android.location.provider;

public interface IPopulationDensityProvider extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.location.provider.IPopulationDensityProvider";
    public void getDefaultCoarseningLevel(android.location.provider.IS2LevelCallback p0) throws android.os.RemoteException;
    public void getCoarsenedS2Cells(double p0, double p1, int p2, android.location.provider.IS2CellIdsCallback p3) throws android.os.RemoteException;

    public static class Default implements android.location.provider.IPopulationDensityProvider {
        public Default() {}
        public void getDefaultCoarseningLevel(android.location.provider.IS2LevelCallback p0) throws android.os.RemoteException {}
        public void getCoarsenedS2Cells(double p0, double p1, int p2, android.location.provider.IS2CellIdsCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.location.provider.IPopulationDensityProvider {
        static final int TRANSACTION_getDefaultCoarseningLevel = 1;
        static final int TRANSACTION_getCoarsenedS2Cells = 2;
        public Stub() { super(); }
        public static android.location.provider.IPopulationDensityProvider asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.location.provider.IPopulationDensityProvider {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getDefaultCoarseningLevel(android.location.provider.IS2LevelCallback p0) throws android.os.RemoteException {}
            public void getCoarsenedS2Cells(double p0, double p1, int p2, android.location.provider.IS2CellIdsCallback p3) throws android.os.RemoteException {}
        }
    }
}

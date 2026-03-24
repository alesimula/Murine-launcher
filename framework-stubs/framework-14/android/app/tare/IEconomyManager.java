package android.app.tare;

public interface IEconomyManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.tare.IEconomyManager";
    public int getEnabledMode() throws android.os.RemoteException;

    public static class Default implements android.app.tare.IEconomyManager {
        public Default() {}
        public int getEnabledMode() throws android.os.RemoteException { return 0; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.tare.IEconomyManager {
        static final int TRANSACTION_getEnabledMode = 1;
        public Stub() { super(); }
        public static android.app.tare.IEconomyManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.tare.IEconomyManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public int getEnabledMode() throws android.os.RemoteException { return 0; }
        }
    }
}

package android.app.ondeviceintelligence;

public interface IProcessingSignal extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.ondeviceintelligence.IProcessingSignal";
    public void sendSignal(android.os.PersistableBundle p0) throws android.os.RemoteException;

    public static class Default implements android.app.ondeviceintelligence.IProcessingSignal {
        public Default() {}
        public void sendSignal(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.ondeviceintelligence.IProcessingSignal {
        static final int TRANSACTION_sendSignal = 3;
        public Stub() { super(); }
        public static android.app.ondeviceintelligence.IProcessingSignal asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.ondeviceintelligence.IProcessingSignal {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void sendSignal(android.os.PersistableBundle p0) throws android.os.RemoteException {}
        }
    }
}

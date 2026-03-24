package android.os;

public interface IHintManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IHintManager";
    public android.os.IHintSession createHintSession(android.os.IBinder p0, int[] p1, long p2) throws android.os.RemoteException;
    public long getHintSessionPreferredRate() throws android.os.RemoteException;

    public static class Default implements android.os.IHintManager {
        public Default() {}
        public android.os.IHintSession createHintSession(android.os.IBinder p0, int[] p1, long p2) throws android.os.RemoteException { return null; }
        public long getHintSessionPreferredRate() throws android.os.RemoteException { return 0L; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IHintManager {
        static final int TRANSACTION_createHintSession = 1;
        static final int TRANSACTION_getHintSessionPreferredRate = 2;
        public Stub() { super(); }
        public static android.os.IHintManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IHintManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.IHintSession createHintSession(android.os.IBinder p0, int[] p1, long p2) throws android.os.RemoteException { return null; }
            public long getHintSessionPreferredRate() throws android.os.RemoteException { return 0L; }
        }
    }
}

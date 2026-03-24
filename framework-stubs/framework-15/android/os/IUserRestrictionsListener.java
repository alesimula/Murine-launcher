package android.os;

public interface IUserRestrictionsListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.os.IUserRestrictionsListener";
    public void onUserRestrictionsChanged(int p0, android.os.Bundle p1, android.os.Bundle p2) throws android.os.RemoteException;

    public static class Default implements android.os.IUserRestrictionsListener {
        public Default() {}
        public void onUserRestrictionsChanged(int p0, android.os.Bundle p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IUserRestrictionsListener {
        static final int TRANSACTION_onUserRestrictionsChanged = 1;
        public Stub() { super(); }
        public static android.os.IUserRestrictionsListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.os.IUserRestrictionsListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onUserRestrictionsChanged(int p0, android.os.Bundle p1, android.os.Bundle p2) throws android.os.RemoteException {}
        }
    }
}

package android.nfc;

public interface IAppCallback extends android.os.IInterface {
    public android.nfc.BeamShareData createBeamShareData(byte p0) throws android.os.RemoteException;
    public void onNdefPushComplete(byte p0) throws android.os.RemoteException;
    public void onTagDiscovered(android.nfc.Tag p0) throws android.os.RemoteException;

    public static class Default implements android.nfc.IAppCallback {
        public Default() {}
        public android.nfc.BeamShareData createBeamShareData(byte p0) throws android.os.RemoteException { return null; }
        public void onNdefPushComplete(byte p0) throws android.os.RemoteException {}
        public void onTagDiscovered(android.nfc.Tag p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.nfc.IAppCallback {
        public static final java.lang.String DESCRIPTOR = "android.nfc.IAppCallback";
        static final int TRANSACTION_createBeamShareData = 1;
        static final int TRANSACTION_onNdefPushComplete = 2;
        static final int TRANSACTION_onTagDiscovered = 3;
        public Stub() { super(); }
        public static android.nfc.IAppCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.nfc.IAppCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.nfc.BeamShareData createBeamShareData(byte p0) throws android.os.RemoteException { return null; }
            public void onNdefPushComplete(byte p0) throws android.os.RemoteException {}
            public void onTagDiscovered(android.nfc.Tag p0) throws android.os.RemoteException {}
        }
    }
}

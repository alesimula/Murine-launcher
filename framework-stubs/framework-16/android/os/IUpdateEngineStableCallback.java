package android.os;

public interface IUpdateEngineStableCallback extends android.os.IInterface {
    public static final int VERSION = 2;
    public static final java.lang.String HASH = "ee2e6f0bd51391955f79f4d5eeeafc37c668cd40";
    public static final java.lang.String DESCRIPTOR = null;
    public void onStatusUpdate(int p0, float p1) throws android.os.RemoteException;
    public void onPayloadApplicationComplete(int p0) throws android.os.RemoteException;
    public int getInterfaceVersion() throws android.os.RemoteException;
    public java.lang.String getInterfaceHash() throws android.os.RemoteException;

    public static class Default implements android.os.IUpdateEngineStableCallback {
        public Default() {}
        public void onStatusUpdate(int p0, float p1) throws android.os.RemoteException {}
        public void onPayloadApplicationComplete(int p0) throws android.os.RemoteException {}
        public int getInterfaceVersion() { return 0; }
        public java.lang.String getInterfaceHash() { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.os.IUpdateEngineStableCallback {
        static final int TRANSACTION_onStatusUpdate = 1;
        static final int TRANSACTION_onPayloadApplicationComplete = 2;
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_getInterfaceHash = 16777214;
        public Stub() { super(); }
        public static android.os.IUpdateEngineStableCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }

        private static class Proxy implements android.os.IUpdateEngineStableCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onStatusUpdate(int p0, float p1) throws android.os.RemoteException {}
            public void onPayloadApplicationComplete(int p0) throws android.os.RemoteException {}
            public int getInterfaceVersion() throws android.os.RemoteException { return 0; }
            public synchronized java.lang.String getInterfaceHash() throws android.os.RemoteException { return null; }
        }
    }
}

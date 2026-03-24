package android.hardware.location;

public interface IContextHubTransactionCallback extends android.os.IInterface {
    public void onQueryResponse(int p0, java.util.List<android.hardware.location.NanoAppState> p1) throws android.os.RemoteException;
    public void onTransactionComplete(int p0) throws android.os.RemoteException;

    public static class Default implements android.hardware.location.IContextHubTransactionCallback {
        public Default() {}
        public void onQueryResponse(int p0, java.util.List<android.hardware.location.NanoAppState> p1) throws android.os.RemoteException {}
        public void onTransactionComplete(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.hardware.location.IContextHubTransactionCallback {
        public static final java.lang.String DESCRIPTOR = "android.hardware.location.IContextHubTransactionCallback";
        static final int TRANSACTION_onQueryResponse = 1;
        static final int TRANSACTION_onTransactionComplete = 2;
        public Stub() { super(); }
        public static android.hardware.location.IContextHubTransactionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.hardware.location.IContextHubTransactionCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onQueryResponse(int p0, java.util.List<android.hardware.location.NanoAppState> p1) throws android.os.RemoteException {}
            public void onTransactionComplete(int p0) throws android.os.RemoteException {}
        }
    }
}

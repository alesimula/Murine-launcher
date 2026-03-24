package android.telephony.data;

public interface IQualifiedNetworksServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.telephony.data.IQualifiedNetworksServiceCallback";
    public void onQualifiedNetworkTypesChanged(int p0, int[] p1) throws android.os.RemoteException;
    public void onNetworkValidationRequested(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException;
    public void onReconnectQualifiedNetworkType(int p0, int p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.data.IQualifiedNetworksServiceCallback {
        public Default() {}
        public void onQualifiedNetworkTypesChanged(int p0, int[] p1) throws android.os.RemoteException {}
        public void onNetworkValidationRequested(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
        public void onReconnectQualifiedNetworkType(int p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.data.IQualifiedNetworksServiceCallback {
        static final int TRANSACTION_onQualifiedNetworkTypesChanged = 1;
        static final int TRANSACTION_onNetworkValidationRequested = 2;
        static final int TRANSACTION_onReconnectQualifiedNetworkType = 3;
        public Stub() { super(); }
        public static android.telephony.data.IQualifiedNetworksServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.telephony.data.IQualifiedNetworksServiceCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onQualifiedNetworkTypesChanged(int p0, int[] p1) throws android.os.RemoteException {}
            public void onNetworkValidationRequested(int p0, com.android.internal.telephony.IIntegerConsumer p1) throws android.os.RemoteException {}
            public void onReconnectQualifiedNetworkType(int p0, int p1) throws android.os.RemoteException {}
        }
    }
}

package android.telephony.data;

public interface IQualifiedNetworksServiceCallback extends android.os.IInterface {
    public void onQualifiedNetworkTypesChanged(int p0, int[] p1) throws android.os.RemoteException;

    public static class Default implements android.telephony.data.IQualifiedNetworksServiceCallback {
        public Default() {}
        public void onQualifiedNetworkTypesChanged(int p0, int[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.telephony.data.IQualifiedNetworksServiceCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.data.IQualifiedNetworksServiceCallback";
        static final int TRANSACTION_onQualifiedNetworkTypesChanged = 1;
        public Stub() { super(); }
        public static android.telephony.data.IQualifiedNetworksServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.data.IQualifiedNetworksServiceCallback p0) { return false; }
        public static android.telephony.data.IQualifiedNetworksServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.data.IQualifiedNetworksServiceCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.data.IQualifiedNetworksServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onQualifiedNetworkTypesChanged(int p0, int[] p1) throws android.os.RemoteException {}
        }
    }
}

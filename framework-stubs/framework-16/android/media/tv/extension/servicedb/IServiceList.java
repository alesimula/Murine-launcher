package android.media.tv.extension.servicedb;

public interface IServiceList extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.media.tv.extension.servicedb.IServiceList";
    public java.lang.String[] getServiceListIds() throws android.os.RemoteException;
    public android.os.Bundle getServiceListInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException;

    public static class Default implements android.media.tv.extension.servicedb.IServiceList {
        public Default() {}
        public java.lang.String[] getServiceListIds() throws android.os.RemoteException { return null; }
        public android.os.Bundle getServiceListInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.media.tv.extension.servicedb.IServiceList {
        static final int TRANSACTION_getServiceListIds = 1;
        static final int TRANSACTION_getServiceListInfo = 2;
        public Stub() { super(); }
        public static android.media.tv.extension.servicedb.IServiceList asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.media.tv.extension.servicedb.IServiceList {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.lang.String[] getServiceListIds() throws android.os.RemoteException { return null; }
            public android.os.Bundle getServiceListInfo(java.lang.String p0, java.lang.String[] p1) throws android.os.RemoteException { return null; }
        }
    }
}

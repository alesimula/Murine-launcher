package com.android.internal.os;

public interface IParcelFileDescriptorFactory extends android.os.IInterface {
    public android.os.ParcelFileDescriptor open(java.lang.String p0, int p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.os.IParcelFileDescriptorFactory {
        public Default() {}
        public android.os.ParcelFileDescriptor open(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.os.IParcelFileDescriptorFactory {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.os.IParcelFileDescriptorFactory";
        static final int TRANSACTION_open = 1;
        public Stub() { super(); }
        public static com.android.internal.os.IParcelFileDescriptorFactory asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.os.IParcelFileDescriptorFactory {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.os.ParcelFileDescriptor open(java.lang.String p0, int p1) throws android.os.RemoteException { return null; }
        }
    }
}

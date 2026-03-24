package com.android.internal.telephony;

public interface ILongConsumer extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ILongConsumer";
    public void accept(long p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ILongConsumer {
        public Default() {}
        public void accept(long p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ILongConsumer {
        static final int TRANSACTION_accept = 1;
        public Stub() { super(); }
        public static com.android.internal.telephony.ILongConsumer asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.ILongConsumer {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void accept(long p0) throws android.os.RemoteException {}
        }
    }
}

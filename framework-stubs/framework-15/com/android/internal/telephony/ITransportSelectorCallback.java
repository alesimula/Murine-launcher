package com.android.internal.telephony;

public interface ITransportSelectorCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.ITransportSelectorCallback";
    public void onCreated(com.android.internal.telephony.IDomainSelector p0) throws android.os.RemoteException;
    public void onWlanSelected(boolean p0) throws android.os.RemoteException;
    public void onWwanSelectedAsync(com.android.internal.telephony.ITransportSelectorResultCallback p0) throws android.os.RemoteException;
    public void onSelectionTerminated(int p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.ITransportSelectorCallback {
        public Default() {}
        public void onCreated(com.android.internal.telephony.IDomainSelector p0) throws android.os.RemoteException {}
        public void onWlanSelected(boolean p0) throws android.os.RemoteException {}
        public void onWwanSelectedAsync(com.android.internal.telephony.ITransportSelectorResultCallback p0) throws android.os.RemoteException {}
        public void onSelectionTerminated(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.ITransportSelectorCallback {
        static final int TRANSACTION_onCreated = 1;
        static final int TRANSACTION_onWlanSelected = 2;
        static final int TRANSACTION_onWwanSelectedAsync = 3;
        static final int TRANSACTION_onSelectionTerminated = 4;
        public Stub() { super(); }
        public static com.android.internal.telephony.ITransportSelectorCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.ITransportSelectorCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCreated(com.android.internal.telephony.IDomainSelector p0) throws android.os.RemoteException {}
            public void onWlanSelected(boolean p0) throws android.os.RemoteException {}
            public void onWwanSelectedAsync(com.android.internal.telephony.ITransportSelectorResultCallback p0) throws android.os.RemoteException {}
            public void onSelectionTerminated(int p0) throws android.os.RemoteException {}
        }
    }
}

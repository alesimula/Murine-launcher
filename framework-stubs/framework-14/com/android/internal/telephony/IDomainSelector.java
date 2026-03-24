package com.android.internal.telephony;

public interface IDomainSelector extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IDomainSelector";
    public void cancelSelection() throws android.os.RemoteException;
    public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) throws android.os.RemoteException;
    public void finishSelection() throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IDomainSelector {
        public Default() {}
        public void cancelSelection() throws android.os.RemoteException {}
        public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) throws android.os.RemoteException {}
        public void finishSelection() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IDomainSelector {
        static final int TRANSACTION_cancelSelection = 1;
        static final int TRANSACTION_reselectDomain = 2;
        static final int TRANSACTION_finishSelection = 3;
        public Stub() { super(); }
        public static com.android.internal.telephony.IDomainSelector asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.IDomainSelector {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void cancelSelection() throws android.os.RemoteException {}
            public void reselectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0) throws android.os.RemoteException {}
            public void finishSelection() throws android.os.RemoteException {}
        }
    }
}

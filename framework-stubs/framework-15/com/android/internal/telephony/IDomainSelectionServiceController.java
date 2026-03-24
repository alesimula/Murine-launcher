package com.android.internal.telephony;

public interface IDomainSelectionServiceController extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.IDomainSelectionServiceController";
    public void selectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0, com.android.internal.telephony.ITransportSelectorCallback p1) throws android.os.RemoteException;
    public void updateServiceState(int p0, int p1, android.telephony.ServiceState p2) throws android.os.RemoteException;
    public void updateBarringInfo(int p0, int p1, android.telephony.BarringInfo p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telephony.IDomainSelectionServiceController {
        public Default() {}
        public void selectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0, com.android.internal.telephony.ITransportSelectorCallback p1) throws android.os.RemoteException {}
        public void updateServiceState(int p0, int p1, android.telephony.ServiceState p2) throws android.os.RemoteException {}
        public void updateBarringInfo(int p0, int p1, android.telephony.BarringInfo p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.IDomainSelectionServiceController {
        static final int TRANSACTION_selectDomain = 1;
        static final int TRANSACTION_updateServiceState = 2;
        static final int TRANSACTION_updateBarringInfo = 3;
        public Stub() { super(); }
        public static com.android.internal.telephony.IDomainSelectionServiceController asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telephony.IDomainSelectionServiceController {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void selectDomain(android.telephony.DomainSelectionService.SelectionAttributes p0, com.android.internal.telephony.ITransportSelectorCallback p1) throws android.os.RemoteException {}
            public void updateServiceState(int p0, int p1, android.telephony.ServiceState p2) throws android.os.RemoteException {}
            public void updateBarringInfo(int p0, int p1, android.telephony.BarringInfo p2) throws android.os.RemoteException {}
        }
    }
}

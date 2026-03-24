package android.service.autofill;

public interface IAutoFillService extends android.os.IInterface {
    public void onConnectedStateChanged(boolean p0) throws android.os.RemoteException;
    public void onFillRequest(android.service.autofill.FillRequest p0, android.service.autofill.IFillCallback p1) throws android.os.RemoteException;
    public void onSaveRequest(android.service.autofill.SaveRequest p0, android.service.autofill.ISaveCallback p1) throws android.os.RemoteException;
    public void onSavedPasswordCountRequest(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.IAutoFillService {
        public Default() {}
        public void onConnectedStateChanged(boolean p0) throws android.os.RemoteException {}
        public void onFillRequest(android.service.autofill.FillRequest p0, android.service.autofill.IFillCallback p1) throws android.os.RemoteException {}
        public void onSaveRequest(android.service.autofill.SaveRequest p0, android.service.autofill.ISaveCallback p1) throws android.os.RemoteException {}
        public void onSavedPasswordCountRequest(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IAutoFillService {
        public static final java.lang.String DESCRIPTOR = "android.service.autofill.IAutoFillService";
        static final int TRANSACTION_onConnectedStateChanged = 1;
        static final int TRANSACTION_onFillRequest = 2;
        static final int TRANSACTION_onSaveRequest = 3;
        static final int TRANSACTION_onSavedPasswordCountRequest = 4;
        public Stub() { super(); }
        public static android.service.autofill.IAutoFillService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.IAutoFillService p0) { return false; }
        public static android.service.autofill.IAutoFillService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.IAutoFillService {
            private android.os.IBinder mRemote;
            public static android.service.autofill.IAutoFillService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnectedStateChanged(boolean p0) throws android.os.RemoteException {}
            public void onFillRequest(android.service.autofill.FillRequest p0, android.service.autofill.IFillCallback p1) throws android.os.RemoteException {}
            public void onSaveRequest(android.service.autofill.SaveRequest p0, android.service.autofill.ISaveCallback p1) throws android.os.RemoteException {}
            public void onSavedPasswordCountRequest(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        }
    }
}

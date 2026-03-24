package android.telephony.data;

public interface IDataServiceCallback extends android.os.IInterface {
    public void onSetupDataCallComplete(int p0, android.telephony.data.DataCallResponse p1) throws android.os.RemoteException;
    public void onDeactivateDataCallComplete(int p0) throws android.os.RemoteException;
    public void onSetInitialAttachApnComplete(int p0) throws android.os.RemoteException;
    public void onSetDataProfileComplete(int p0) throws android.os.RemoteException;
    public void onRequestDataCallListComplete(int p0, java.util.List<android.telephony.data.DataCallResponse> p1) throws android.os.RemoteException;
    public void onDataCallListChanged(java.util.List<android.telephony.data.DataCallResponse> p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.data.IDataServiceCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.data.IDataServiceCallback";
        static final int TRANSACTION_onSetupDataCallComplete = 1;
        static final int TRANSACTION_onDeactivateDataCallComplete = 2;
        static final int TRANSACTION_onSetInitialAttachApnComplete = 3;
        static final int TRANSACTION_onSetDataProfileComplete = 4;
        static final int TRANSACTION_onRequestDataCallListComplete = 5;
        static final int TRANSACTION_onDataCallListChanged = 6;
        public Stub() { super(); }
        public static android.telephony.data.IDataServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.data.IDataServiceCallback p0) { return false; }
        public static android.telephony.data.IDataServiceCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.data.IDataServiceCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.data.IDataServiceCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSetupDataCallComplete(int p0, android.telephony.data.DataCallResponse p1) throws android.os.RemoteException {}
            public void onDeactivateDataCallComplete(int p0) throws android.os.RemoteException {}
            public void onSetInitialAttachApnComplete(int p0) throws android.os.RemoteException {}
            public void onSetDataProfileComplete(int p0) throws android.os.RemoteException {}
            public void onRequestDataCallListComplete(int p0, java.util.List<android.telephony.data.DataCallResponse> p1) throws android.os.RemoteException {}
            public void onDataCallListChanged(java.util.List<android.telephony.data.DataCallResponse> p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.data.IDataServiceCallback {
        public Default() {}
        public void onSetupDataCallComplete(int p0, android.telephony.data.DataCallResponse p1) throws android.os.RemoteException {}
        public void onDeactivateDataCallComplete(int p0) throws android.os.RemoteException {}
        public void onSetInitialAttachApnComplete(int p0) throws android.os.RemoteException {}
        public void onSetDataProfileComplete(int p0) throws android.os.RemoteException {}
        public void onRequestDataCallListComplete(int p0, java.util.List<android.telephony.data.DataCallResponse> p1) throws android.os.RemoteException {}
        public void onDataCallListChanged(java.util.List<android.telephony.data.DataCallResponse> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

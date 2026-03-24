package android.telephony;

public interface IFinancialSmsCallback extends android.os.IInterface {
    public void onGetSmsMessagesForFinancialApp(android.database.CursorWindow p0) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.telephony.IFinancialSmsCallback {
        private static final java.lang.String DESCRIPTOR = "android.telephony.IFinancialSmsCallback";
        static final int TRANSACTION_onGetSmsMessagesForFinancialApp = 1;
        public Stub() { super(); }
        public static android.telephony.IFinancialSmsCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.telephony.IFinancialSmsCallback p0) { return false; }
        public static android.telephony.IFinancialSmsCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.telephony.IFinancialSmsCallback {
            private android.os.IBinder mRemote;
            public static android.telephony.IFinancialSmsCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetSmsMessagesForFinancialApp(android.database.CursorWindow p0) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.telephony.IFinancialSmsCallback {
        public Default() {}
        public void onGetSmsMessagesForFinancialApp(android.database.CursorWindow p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

package android.service.sms;

public interface IFinancialSmsService extends android.os.IInterface {
    public void getSmsMessages(android.os.RemoteCallback p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.sms.IFinancialSmsService {
        private static final java.lang.String DESCRIPTOR = "android.service.sms.IFinancialSmsService";
        static final int TRANSACTION_getSmsMessages = 1;
        public Stub() { super(); }
        public static android.service.sms.IFinancialSmsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.sms.IFinancialSmsService p0) { return false; }
        public static android.service.sms.IFinancialSmsService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.sms.IFinancialSmsService {
            private android.os.IBinder mRemote;
            public static android.service.sms.IFinancialSmsService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getSmsMessages(android.os.RemoteCallback p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.sms.IFinancialSmsService {
        public Default() {}
        public void getSmsMessages(android.os.RemoteCallback p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

package android.service.notification;

public interface IConditionListener extends android.os.IInterface {
    public void onConditionsReceived(android.service.notification.Condition[] p0) throws android.os.RemoteException;

    public static class Default implements android.service.notification.IConditionListener {
        public Default() {}
        public void onConditionsReceived(android.service.notification.Condition[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.notification.IConditionListener {
        private static final java.lang.String DESCRIPTOR = "android.service.notification.IConditionListener";
        static final int TRANSACTION_onConditionsReceived = 1;
        public Stub() { super(); }
        public static android.service.notification.IConditionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.notification.IConditionListener p0) { return false; }
        public static android.service.notification.IConditionListener getDefaultImpl() { return null; }

        private static class Proxy implements android.service.notification.IConditionListener {
            private android.os.IBinder mRemote;
            public static android.service.notification.IConditionListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConditionsReceived(android.service.notification.Condition[] p0) throws android.os.RemoteException {}
        }
    }
}

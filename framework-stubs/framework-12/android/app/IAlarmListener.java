package android.app;

public interface IAlarmListener extends android.os.IInterface {
    public void doAlarm(android.app.IAlarmCompleteListener p0) throws android.os.RemoteException;

    public static class Default implements android.app.IAlarmListener {
        public Default() {}
        public void doAlarm(android.app.IAlarmCompleteListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IAlarmListener {
        public static final java.lang.String DESCRIPTOR = "android.app.IAlarmListener";
        static final int TRANSACTION_doAlarm = 1;
        public Stub() { super(); }
        public static android.app.IAlarmListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IAlarmListener p0) { return false; }
        public static android.app.IAlarmListener getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IAlarmListener {
            private android.os.IBinder mRemote;
            public static android.app.IAlarmListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void doAlarm(android.app.IAlarmCompleteListener p0) throws android.os.RemoteException {}
        }
    }
}

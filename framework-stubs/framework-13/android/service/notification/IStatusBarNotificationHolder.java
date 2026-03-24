package android.service.notification;

public interface IStatusBarNotificationHolder extends android.os.IInterface {
    public android.service.notification.StatusBarNotification get() throws android.os.RemoteException;

    public static class Default implements android.service.notification.IStatusBarNotificationHolder {
        public Default() {}
        public android.service.notification.StatusBarNotification get() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.notification.IStatusBarNotificationHolder {
        public static final java.lang.String DESCRIPTOR = "android.service.notification.IStatusBarNotificationHolder";
        static final int TRANSACTION_get = 1;
        public Stub() { super(); }
        public static android.service.notification.IStatusBarNotificationHolder asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.notification.IStatusBarNotificationHolder {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.service.notification.StatusBarNotification get() throws android.os.RemoteException { return null; }
        }
    }
}

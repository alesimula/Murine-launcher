package android.system.suspend;

public interface ISuspendCallback extends android.os.IInterface {
    public void notifyWakeup(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.system.suspend.ISuspendCallback {
        public Default() {}
        public void notifyWakeup(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.system.suspend.ISuspendCallback {
        private static final java.lang.String DESCRIPTOR = null;
        static final int TRANSACTION_notifyWakeup = 1;
        public Stub() { super(); }
        public static android.system.suspend.ISuspendCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.system.suspend.ISuspendCallback p0) { return false; }
        public static android.system.suspend.ISuspendCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.system.suspend.ISuspendCallback {
            private android.os.IBinder mRemote;
            public static android.system.suspend.ISuspendCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void notifyWakeup(boolean p0) throws android.os.RemoteException {}
        }
    }
}

package android.view;

public interface IAppTransitionAnimationSpecsFuture extends android.os.IInterface {
    public android.view.AppTransitionAnimationSpec[] get() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.view.IAppTransitionAnimationSpecsFuture {
        private static final java.lang.String DESCRIPTOR = "android.view.IAppTransitionAnimationSpecsFuture";
        static final int TRANSACTION_get = 1;
        public Stub() { super(); }
        public static android.view.IAppTransitionAnimationSpecsFuture asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IAppTransitionAnimationSpecsFuture p0) { return false; }
        public static android.view.IAppTransitionAnimationSpecsFuture getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IAppTransitionAnimationSpecsFuture {
            private android.os.IBinder mRemote;
            public static android.view.IAppTransitionAnimationSpecsFuture sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.AppTransitionAnimationSpec[] get() throws android.os.RemoteException { return null; }
        }
    }

    public static class Default implements android.view.IAppTransitionAnimationSpecsFuture {
        public Default() {}
        public android.view.AppTransitionAnimationSpec[] get() throws android.os.RemoteException { return null; }
        public android.os.IBinder asBinder() { return null; }
    }
}

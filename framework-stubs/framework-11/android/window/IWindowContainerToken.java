package android.window;

public interface IWindowContainerToken extends android.os.IInterface {

    public static class Default implements android.window.IWindowContainerToken {
        public Default() {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IWindowContainerToken {
        private static final java.lang.String DESCRIPTOR = "android.window.IWindowContainerToken";
        public Stub() { super(); }
        public static android.window.IWindowContainerToken asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.window.IWindowContainerToken p0) { return false; }
        public static android.window.IWindowContainerToken getDefaultImpl() { return null; }

        private static class Proxy implements android.window.IWindowContainerToken {
            private android.os.IBinder mRemote;
            public static android.window.IWindowContainerToken sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
        }
    }
}

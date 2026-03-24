package android.content;

public interface IOnPrimaryClipChangedListener extends android.os.IInterface {
    public void dispatchPrimaryClipChanged() throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.content.IOnPrimaryClipChangedListener {
        private static final java.lang.String DESCRIPTOR = "android.content.IOnPrimaryClipChangedListener";
        static final int TRANSACTION_dispatchPrimaryClipChanged = 1;
        public Stub() { super(); }
        public static android.content.IOnPrimaryClipChangedListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.content.IOnPrimaryClipChangedListener p0) { return false; }
        public static android.content.IOnPrimaryClipChangedListener getDefaultImpl() { return null; }

        private static class Proxy implements android.content.IOnPrimaryClipChangedListener {
            private android.os.IBinder mRemote;
            public static android.content.IOnPrimaryClipChangedListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void dispatchPrimaryClipChanged() throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.content.IOnPrimaryClipChangedListener {
        public Default() {}
        public void dispatchPrimaryClipChanged() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

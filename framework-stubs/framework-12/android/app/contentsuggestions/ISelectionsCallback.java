package android.app.contentsuggestions;

public interface ISelectionsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.contentsuggestions.ISelectionsCallback";
    public void onContentSelectionsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentSelection> p1) throws android.os.RemoteException;

    public static class Default implements android.app.contentsuggestions.ISelectionsCallback {
        public Default() {}
        public void onContentSelectionsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentSelection> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.contentsuggestions.ISelectionsCallback {
        static final int TRANSACTION_onContentSelectionsAvailable = 1;
        public Stub() { super(); }
        public static android.app.contentsuggestions.ISelectionsCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.contentsuggestions.ISelectionsCallback p0) { return false; }
        public static android.app.contentsuggestions.ISelectionsCallback getDefaultImpl() { return null; }

        private static class Proxy implements android.app.contentsuggestions.ISelectionsCallback {
            private android.os.IBinder mRemote;
            public static android.app.contentsuggestions.ISelectionsCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onContentSelectionsAvailable(int p0, java.util.List<android.app.contentsuggestions.ContentSelection> p1) throws android.os.RemoteException {}
        }
    }
}

package android.service.selectiontoolbar;

public interface ISelectionToolbarRenderServiceCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.selectiontoolbar.ISelectionToolbarRenderServiceCallback";
    public void transferTouch(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void onPasteAction(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.selectiontoolbar.ISelectionToolbarRenderServiceCallback {
        public Default() {}
        public void transferTouch(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void onPasteAction(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.selectiontoolbar.ISelectionToolbarRenderServiceCallback {
        static final int TRANSACTION_transferTouch = 1;
        static final int TRANSACTION_onPasteAction = 2;
        public Stub() { super(); }
        public static android.service.selectiontoolbar.ISelectionToolbarRenderServiceCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.selectiontoolbar.ISelectionToolbarRenderServiceCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void transferTouch(android.os.IBinder p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void onPasteAction(int p0) throws android.os.RemoteException {}
        }
    }
}

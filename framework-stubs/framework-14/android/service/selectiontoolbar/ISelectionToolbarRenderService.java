package android.service.selectiontoolbar;

public interface ISelectionToolbarRenderService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.selectiontoolbar.ISelectionToolbarRenderService";
    public void onConnected(android.os.IBinder p0) throws android.os.RemoteException;
    public void onShow(int p0, android.view.selectiontoolbar.ShowInfo p1, android.view.selectiontoolbar.ISelectionToolbarCallback p2) throws android.os.RemoteException;
    public void onHide(long p0) throws android.os.RemoteException;
    public void onDismiss(int p0, long p1) throws android.os.RemoteException;

    public static class Default implements android.service.selectiontoolbar.ISelectionToolbarRenderService {
        public Default() {}
        public void onConnected(android.os.IBinder p0) throws android.os.RemoteException {}
        public void onShow(int p0, android.view.selectiontoolbar.ShowInfo p1, android.view.selectiontoolbar.ISelectionToolbarCallback p2) throws android.os.RemoteException {}
        public void onHide(long p0) throws android.os.RemoteException {}
        public void onDismiss(int p0, long p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.selectiontoolbar.ISelectionToolbarRenderService {
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onShow = 2;
        static final int TRANSACTION_onHide = 3;
        static final int TRANSACTION_onDismiss = 4;
        public Stub() { super(); }
        public static android.service.selectiontoolbar.ISelectionToolbarRenderService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.selectiontoolbar.ISelectionToolbarRenderService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnected(android.os.IBinder p0) throws android.os.RemoteException {}
            public void onShow(int p0, android.view.selectiontoolbar.ShowInfo p1, android.view.selectiontoolbar.ISelectionToolbarCallback p2) throws android.os.RemoteException {}
            public void onHide(long p0) throws android.os.RemoteException {}
            public void onDismiss(int p0, long p1) throws android.os.RemoteException {}
        }
    }
}

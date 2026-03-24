package android.view.selectiontoolbar;

public interface ISelectionToolbarCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.selectiontoolbar.ISelectionToolbarCallback";
    public void onShown(android.view.selectiontoolbar.WidgetInfo p0) throws android.os.RemoteException;
    public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0) throws android.os.RemoteException;
    public void onToolbarShowTimeout() throws android.os.RemoteException;
    public void onMenuItemClicked(android.view.selectiontoolbar.ToolbarMenuItem p0) throws android.os.RemoteException;
    public void onError(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.selectiontoolbar.ISelectionToolbarCallback {
        public Default() {}
        public void onShown(android.view.selectiontoolbar.WidgetInfo p0) throws android.os.RemoteException {}
        public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0) throws android.os.RemoteException {}
        public void onToolbarShowTimeout() throws android.os.RemoteException {}
        public void onMenuItemClicked(android.view.selectiontoolbar.ToolbarMenuItem p0) throws android.os.RemoteException {}
        public void onError(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.selectiontoolbar.ISelectionToolbarCallback {
        static final int TRANSACTION_onShown = 1;
        static final int TRANSACTION_onWidgetUpdated = 2;
        static final int TRANSACTION_onToolbarShowTimeout = 3;
        static final int TRANSACTION_onMenuItemClicked = 4;
        static final int TRANSACTION_onError = 5;
        public Stub() { super(); }
        public static android.view.selectiontoolbar.ISelectionToolbarCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.selectiontoolbar.ISelectionToolbarCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onShown(android.view.selectiontoolbar.WidgetInfo p0) throws android.os.RemoteException {}
            public void onWidgetUpdated(android.view.selectiontoolbar.WidgetInfo p0) throws android.os.RemoteException {}
            public void onToolbarShowTimeout() throws android.os.RemoteException {}
            public void onMenuItemClicked(android.view.selectiontoolbar.ToolbarMenuItem p0) throws android.os.RemoteException {}
            public void onError(int p0) throws android.os.RemoteException {}
        }
    }
}

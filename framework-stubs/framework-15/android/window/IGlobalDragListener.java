package android.window;

public interface IGlobalDragListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IGlobalDragListener";
    public void onCrossWindowDrop(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException;
    public void onUnhandledDrop(android.view.DragEvent p0, android.window.IUnhandledDragCallback p1) throws android.os.RemoteException;

    public static class Default implements android.window.IGlobalDragListener {
        public Default() {}
        public void onCrossWindowDrop(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
        public void onUnhandledDrop(android.view.DragEvent p0, android.window.IUnhandledDragCallback p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IGlobalDragListener {
        static final int TRANSACTION_onCrossWindowDrop = 1;
        static final int TRANSACTION_onUnhandledDrop = 2;
        public Stub() { super(); }
        public static android.window.IGlobalDragListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IGlobalDragListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCrossWindowDrop(android.app.ActivityManager.RunningTaskInfo p0) throws android.os.RemoteException {}
            public void onUnhandledDrop(android.view.DragEvent p0, android.window.IUnhandledDragCallback p1) throws android.os.RemoteException {}
        }
    }
}

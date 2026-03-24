package android.service.dreams;

public interface IDreamOverlayClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.dreams.IDreamOverlayClient";
    public void startDream(android.view.WindowManager.LayoutParams p0, android.service.dreams.IDreamOverlayCallback p1, java.lang.String p2, boolean p3) throws android.os.RemoteException;
    public void wakeUp() throws android.os.RemoteException;
    public void endDream() throws android.os.RemoteException;
    public void onWakeRequested() throws android.os.RemoteException;
    public void comeToFront() throws android.os.RemoteException;

    public static class Default implements android.service.dreams.IDreamOverlayClient {
        public Default() {}
        public void startDream(android.view.WindowManager.LayoutParams p0, android.service.dreams.IDreamOverlayCallback p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
        public void wakeUp() throws android.os.RemoteException {}
        public void endDream() throws android.os.RemoteException {}
        public void onWakeRequested() throws android.os.RemoteException {}
        public void comeToFront() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.dreams.IDreamOverlayClient {
        static final int TRANSACTION_startDream = 1;
        static final int TRANSACTION_wakeUp = 2;
        static final int TRANSACTION_endDream = 3;
        static final int TRANSACTION_onWakeRequested = 4;
        static final int TRANSACTION_comeToFront = 5;
        public Stub() { super(); }
        public static android.service.dreams.IDreamOverlayClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.dreams.IDreamOverlayClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void startDream(android.view.WindowManager.LayoutParams p0, android.service.dreams.IDreamOverlayCallback p1, java.lang.String p2, boolean p3) throws android.os.RemoteException {}
            public void wakeUp() throws android.os.RemoteException {}
            public void endDream() throws android.os.RemoteException {}
            public void onWakeRequested() throws android.os.RemoteException {}
            public void comeToFront() throws android.os.RemoteException {}
        }
    }
}

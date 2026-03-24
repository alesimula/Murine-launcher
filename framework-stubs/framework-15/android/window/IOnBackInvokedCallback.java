package android.window;

public interface IOnBackInvokedCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.window.IOnBackInvokedCallback";
    public void onBackStarted(android.window.BackMotionEvent p0) throws android.os.RemoteException;
    public void onBackProgressed(android.window.BackMotionEvent p0) throws android.os.RemoteException;
    public void onBackCancelled() throws android.os.RemoteException;
    public void onBackInvoked() throws android.os.RemoteException;
    public void setTriggerBack(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.window.IOnBackInvokedCallback {
        public Default() {}
        public void onBackStarted(android.window.BackMotionEvent p0) throws android.os.RemoteException {}
        public void onBackProgressed(android.window.BackMotionEvent p0) throws android.os.RemoteException {}
        public void onBackCancelled() throws android.os.RemoteException {}
        public void onBackInvoked() throws android.os.RemoteException {}
        public void setTriggerBack(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.window.IOnBackInvokedCallback {
        static final int TRANSACTION_onBackStarted = 1;
        static final int TRANSACTION_onBackProgressed = 2;
        static final int TRANSACTION_onBackCancelled = 3;
        static final int TRANSACTION_onBackInvoked = 4;
        static final int TRANSACTION_setTriggerBack = 5;
        public Stub() { super(); }
        public static android.window.IOnBackInvokedCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.window.IOnBackInvokedCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onBackStarted(android.window.BackMotionEvent p0) throws android.os.RemoteException {}
            public void onBackProgressed(android.window.BackMotionEvent p0) throws android.os.RemoteException {}
            public void onBackCancelled() throws android.os.RemoteException {}
            public void onBackInvoked() throws android.os.RemoteException {}
            public void setTriggerBack(boolean p0) throws android.os.RemoteException {}
        }
    }
}

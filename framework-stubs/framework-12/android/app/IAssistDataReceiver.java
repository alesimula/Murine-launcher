package android.app;

public interface IAssistDataReceiver extends android.os.IInterface {
    public void onHandleAssistData(android.os.Bundle p0) throws android.os.RemoteException;
    public void onHandleAssistScreenshot(android.graphics.Bitmap p0) throws android.os.RemoteException;

    public static class Default implements android.app.IAssistDataReceiver {
        public Default() {}
        public void onHandleAssistData(android.os.Bundle p0) throws android.os.RemoteException {}
        public void onHandleAssistScreenshot(android.graphics.Bitmap p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.IAssistDataReceiver {
        public static final java.lang.String DESCRIPTOR = "android.app.IAssistDataReceiver";
        static final int TRANSACTION_onHandleAssistData = 1;
        static final int TRANSACTION_onHandleAssistScreenshot = 2;
        public Stub() { super(); }
        public static android.app.IAssistDataReceiver asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.IAssistDataReceiver p0) { return false; }
        public static android.app.IAssistDataReceiver getDefaultImpl() { return null; }

        private static class Proxy implements android.app.IAssistDataReceiver {
            private android.os.IBinder mRemote;
            public static android.app.IAssistDataReceiver sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onHandleAssistData(android.os.Bundle p0) throws android.os.RemoteException {}
            public void onHandleAssistScreenshot(android.graphics.Bitmap p0) throws android.os.RemoteException {}
        }
    }
}

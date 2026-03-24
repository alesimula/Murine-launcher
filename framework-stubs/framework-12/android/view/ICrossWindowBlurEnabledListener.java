package android.view;

public interface ICrossWindowBlurEnabledListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.ICrossWindowBlurEnabledListener";
    public void onCrossWindowBlurEnabledChanged(boolean p0) throws android.os.RemoteException;

    public static class Default implements android.view.ICrossWindowBlurEnabledListener {
        public Default() {}
        public void onCrossWindowBlurEnabledChanged(boolean p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.ICrossWindowBlurEnabledListener {
        static final int TRANSACTION_onCrossWindowBlurEnabledChanged = 1;
        public Stub() { super(); }
        public static android.view.ICrossWindowBlurEnabledListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.ICrossWindowBlurEnabledListener p0) { return false; }
        public static android.view.ICrossWindowBlurEnabledListener getDefaultImpl() { return null; }

        private static class Proxy implements android.view.ICrossWindowBlurEnabledListener {
            private android.os.IBinder mRemote;
            public static android.view.ICrossWindowBlurEnabledListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onCrossWindowBlurEnabledChanged(boolean p0) throws android.os.RemoteException {}
        }
    }
}

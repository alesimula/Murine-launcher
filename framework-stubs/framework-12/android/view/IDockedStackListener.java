package android.view;

public interface IDockedStackListener extends android.os.IInterface {
    public void onDividerVisibilityChanged(boolean p0) throws android.os.RemoteException;
    public void onDockedStackExistsChanged(boolean p0) throws android.os.RemoteException;
    public void onDockedStackMinimizedChanged(boolean p0, long p1, boolean p2) throws android.os.RemoteException;
    public void onAdjustedForImeChanged(boolean p0, long p1) throws android.os.RemoteException;
    public void onDockSideChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.view.IDockedStackListener {
        public Default() {}
        public void onDividerVisibilityChanged(boolean p0) throws android.os.RemoteException {}
        public void onDockedStackExistsChanged(boolean p0) throws android.os.RemoteException {}
        public void onDockedStackMinimizedChanged(boolean p0, long p1, boolean p2) throws android.os.RemoteException {}
        public void onAdjustedForImeChanged(boolean p0, long p1) throws android.os.RemoteException {}
        public void onDockSideChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.IDockedStackListener {
        public static final java.lang.String DESCRIPTOR = "android.view.IDockedStackListener";
        static final int TRANSACTION_onDividerVisibilityChanged = 1;
        static final int TRANSACTION_onDockedStackExistsChanged = 2;
        static final int TRANSACTION_onDockedStackMinimizedChanged = 3;
        static final int TRANSACTION_onAdjustedForImeChanged = 4;
        static final int TRANSACTION_onDockSideChanged = 5;
        public Stub() { super(); }
        public static android.view.IDockedStackListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.IDockedStackListener p0) { return false; }
        public static android.view.IDockedStackListener getDefaultImpl() { return null; }

        private static class Proxy implements android.view.IDockedStackListener {
            private android.os.IBinder mRemote;
            public static android.view.IDockedStackListener sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onDividerVisibilityChanged(boolean p0) throws android.os.RemoteException {}
            public void onDockedStackExistsChanged(boolean p0) throws android.os.RemoteException {}
            public void onDockedStackMinimizedChanged(boolean p0, long p1, boolean p2) throws android.os.RemoteException {}
            public void onAdjustedForImeChanged(boolean p0, long p1) throws android.os.RemoteException {}
            public void onDockSideChanged(int p0) throws android.os.RemoteException {}
        }
    }
}

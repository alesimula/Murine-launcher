package com.android.internal.view.inline;

public interface IInlineContentCallback extends android.os.IInterface {
    public void onContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) throws android.os.RemoteException;
    public void onClick() throws android.os.RemoteException;
    public void onLongClick() throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.inline.IInlineContentCallback {
        public Default() {}
        public void onContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) throws android.os.RemoteException {}
        public void onClick() throws android.os.RemoteException {}
        public void onLongClick() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.inline.IInlineContentCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.inline.IInlineContentCallback";
        static final int TRANSACTION_onContent = 1;
        static final int TRANSACTION_onClick = 2;
        static final int TRANSACTION_onLongClick = 3;
        public Stub() { super(); }
        public static com.android.internal.view.inline.IInlineContentCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.inline.IInlineContentCallback p0) { return false; }
        public static com.android.internal.view.inline.IInlineContentCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.inline.IInlineContentCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.inline.IInlineContentCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onContent(android.view.SurfaceControlViewHost.SurfacePackage p0, int p1, int p2) throws android.os.RemoteException {}
            public void onClick() throws android.os.RemoteException {}
            public void onLongClick() throws android.os.RemoteException {}
        }
    }
}

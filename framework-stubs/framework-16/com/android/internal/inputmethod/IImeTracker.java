package com.android.internal.inputmethod;

public interface IImeTracker extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IImeTracker";
    public android.view.inputmethod.ImeTracker.Token onStart(java.lang.String p0, int p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException;
    public void onProgress(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException;
    public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException;
    public void onShown(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException;
    public void onHidden(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException;
    public void onDispatched(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    @android.annotation.EnforcePermission("android.permission.TEST_INPUT_METHOD")
    public boolean hasPendingImeVisibilityRequests() throws android.os.RemoteException;
    @android.annotation.RequiresPermission("android.permission.TEST_INPUT_METHOD")
    @android.annotation.EnforcePermission("android.permission.TEST_INPUT_METHOD")
    public void finishTrackingPendingImeVisibilityRequests(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IImeTracker {
        public Default() {}
        public android.view.inputmethod.ImeTracker.Token onStart(java.lang.String p0, int p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException { return null; }
        public void onProgress(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
        public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
        public void onShown(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
        public void onHidden(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
        public void onDispatched(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
        public boolean hasPendingImeVisibilityRequests() throws android.os.RemoteException { return false; }
        public void finishTrackingPendingImeVisibilityRequests(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IImeTracker {
        static final int TRANSACTION_onStart = 1;
        static final int TRANSACTION_onProgress = 2;
        static final int TRANSACTION_onFailed = 3;
        static final int TRANSACTION_onCancelled = 4;
        static final int TRANSACTION_onShown = 5;
        static final int TRANSACTION_onHidden = 6;
        static final int TRANSACTION_onDispatched = 7;
        static final int TRANSACTION_hasPendingImeVisibilityRequests = 8;
        static final int TRANSACTION_finishTrackingPendingImeVisibilityRequests = 9;
        public Stub(android.os.PermissionEnforcer p0) { super(); }
        @java.lang.Deprecated
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IImeTracker asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        protected void hasPendingImeVisibilityRequests_enforcePermission() throws java.lang.SecurityException {}
        protected void finishTrackingPendingImeVisibilityRequests_enforcePermission() throws java.lang.SecurityException {}
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.inputmethod.IImeTracker {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.view.inputmethod.ImeTracker.Token onStart(java.lang.String p0, int p1, int p2, int p3, int p4, boolean p5) throws android.os.RemoteException { return null; }
            public void onProgress(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void onFailed(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
            public void onCancelled(android.view.inputmethod.ImeTracker.Token p0, int p1) throws android.os.RemoteException {}
            public void onShown(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
            public void onHidden(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
            public void onDispatched(android.view.inputmethod.ImeTracker.Token p0) throws android.os.RemoteException {}
            public boolean hasPendingImeVisibilityRequests() throws android.os.RemoteException { return false; }
            public void finishTrackingPendingImeVisibilityRequests(com.android.internal.infra.AndroidFuture p0) throws android.os.RemoteException {}
        }
    }
}

package com.android.internal.view;

public interface IInputMethodClient extends android.os.IInterface {
    public void onBindMethod(com.android.internal.view.InputBindResult p0) throws android.os.RemoteException;
    public void onUnbindMethod(int p0, int p1) throws android.os.RemoteException;
    public void setActive(boolean p0, boolean p1) throws android.os.RemoteException;
    public void reportFullscreenMode(boolean p0) throws android.os.RemoteException;
    public void reportPreRendered(android.view.inputmethod.EditorInfo p0) throws android.os.RemoteException;
    public void applyImeVisibility(boolean p0) throws android.os.RemoteException;
    public void updateActivityViewToScreenMatrix(int p0, float[] p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethodClient {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethodClient";
        static final int TRANSACTION_onBindMethod = 1;
        static final int TRANSACTION_onUnbindMethod = 2;
        static final int TRANSACTION_setActive = 3;
        static final int TRANSACTION_reportFullscreenMode = 4;
        static final int TRANSACTION_reportPreRendered = 5;
        static final int TRANSACTION_applyImeVisibility = 6;
        static final int TRANSACTION_updateActivityViewToScreenMatrix = 7;
        public Stub() { super(); }
        public static com.android.internal.view.IInputMethodClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.IInputMethodClient p0) { return false; }
        public static com.android.internal.view.IInputMethodClient getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.IInputMethodClient {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.IInputMethodClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onBindMethod(com.android.internal.view.InputBindResult p0) throws android.os.RemoteException {}
            public void onUnbindMethod(int p0, int p1) throws android.os.RemoteException {}
            public void setActive(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void reportFullscreenMode(boolean p0) throws android.os.RemoteException {}
            public void reportPreRendered(android.view.inputmethod.EditorInfo p0) throws android.os.RemoteException {}
            public void applyImeVisibility(boolean p0) throws android.os.RemoteException {}
            public void updateActivityViewToScreenMatrix(int p0, float[] p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.view.IInputMethodClient {
        public Default() {}
        public void onBindMethod(com.android.internal.view.InputBindResult p0) throws android.os.RemoteException {}
        public void onUnbindMethod(int p0, int p1) throws android.os.RemoteException {}
        public void setActive(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void reportFullscreenMode(boolean p0) throws android.os.RemoteException {}
        public void reportPreRendered(android.view.inputmethod.EditorInfo p0) throws android.os.RemoteException {}
        public void applyImeVisibility(boolean p0) throws android.os.RemoteException {}
        public void updateActivityViewToScreenMatrix(int p0, float[] p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

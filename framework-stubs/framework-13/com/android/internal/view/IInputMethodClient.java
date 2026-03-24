package com.android.internal.view;

public interface IInputMethodClient extends android.os.IInterface {
    public void onBindMethod(com.android.internal.inputmethod.InputBindResult p0) throws android.os.RemoteException;
    public void onBindAccessibilityService(com.android.internal.inputmethod.InputBindResult p0, int p1) throws android.os.RemoteException;
    public void onUnbindMethod(int p0, int p1) throws android.os.RemoteException;
    public void onUnbindAccessibilityService(int p0, int p1) throws android.os.RemoteException;
    public void setActive(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException;
    public void scheduleStartInputIfNecessary(boolean p0) throws android.os.RemoteException;
    public void reportFullscreenMode(boolean p0) throws android.os.RemoteException;
    public void updateVirtualDisplayToScreenMatrix(int p0, float[] p1) throws android.os.RemoteException;
    public void setImeTraceEnabled(boolean p0) throws android.os.RemoteException;
    public void throwExceptionFromSystem(java.lang.String p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInputMethodClient {
        public Default() {}
        public void onBindMethod(com.android.internal.inputmethod.InputBindResult p0) throws android.os.RemoteException {}
        public void onBindAccessibilityService(com.android.internal.inputmethod.InputBindResult p0, int p1) throws android.os.RemoteException {}
        public void onUnbindMethod(int p0, int p1) throws android.os.RemoteException {}
        public void onUnbindAccessibilityService(int p0, int p1) throws android.os.RemoteException {}
        public void setActive(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException {}
        public void scheduleStartInputIfNecessary(boolean p0) throws android.os.RemoteException {}
        public void reportFullscreenMode(boolean p0) throws android.os.RemoteException {}
        public void updateVirtualDisplayToScreenMatrix(int p0, float[] p1) throws android.os.RemoteException {}
        public void setImeTraceEnabled(boolean p0) throws android.os.RemoteException {}
        public void throwExceptionFromSystem(java.lang.String p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethodClient {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethodClient";
        static final int TRANSACTION_onBindMethod = 1;
        static final int TRANSACTION_onBindAccessibilityService = 2;
        static final int TRANSACTION_onUnbindMethod = 3;
        static final int TRANSACTION_onUnbindAccessibilityService = 4;
        static final int TRANSACTION_setActive = 5;
        static final int TRANSACTION_scheduleStartInputIfNecessary = 6;
        static final int TRANSACTION_reportFullscreenMode = 7;
        static final int TRANSACTION_updateVirtualDisplayToScreenMatrix = 8;
        static final int TRANSACTION_setImeTraceEnabled = 9;
        static final int TRANSACTION_throwExceptionFromSystem = 10;
        public Stub() { super(); }
        public static com.android.internal.view.IInputMethodClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.view.IInputMethodClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onBindMethod(com.android.internal.inputmethod.InputBindResult p0) throws android.os.RemoteException {}
            public void onBindAccessibilityService(com.android.internal.inputmethod.InputBindResult p0, int p1) throws android.os.RemoteException {}
            public void onUnbindMethod(int p0, int p1) throws android.os.RemoteException {}
            public void onUnbindAccessibilityService(int p0, int p1) throws android.os.RemoteException {}
            public void setActive(boolean p0, boolean p1, boolean p2) throws android.os.RemoteException {}
            public void scheduleStartInputIfNecessary(boolean p0) throws android.os.RemoteException {}
            public void reportFullscreenMode(boolean p0) throws android.os.RemoteException {}
            public void updateVirtualDisplayToScreenMatrix(int p0, float[] p1) throws android.os.RemoteException {}
            public void setImeTraceEnabled(boolean p0) throws android.os.RemoteException {}
            public void throwExceptionFromSystem(java.lang.String p0) throws android.os.RemoteException {}
        }
    }
}

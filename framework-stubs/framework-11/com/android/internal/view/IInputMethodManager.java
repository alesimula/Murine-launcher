package com.android.internal.view;

public interface IInputMethodManager extends android.os.IInterface {
    public void addClient(com.android.internal.view.IInputMethodClient p0, com.android.internal.view.IInputContext p1, int p2) throws android.os.RemoteException;
    public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList(int p0) throws android.os.RemoteException;
    public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList(int p0) throws android.os.RemoteException;
    public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1) throws android.os.RemoteException;
    public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() throws android.os.RemoteException;
    public boolean showSoftInput(com.android.internal.view.IInputMethodClient p0, android.os.IBinder p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException;
    public boolean hideSoftInput(com.android.internal.view.IInputMethodClient p0, android.os.IBinder p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException;
    public com.android.internal.view.InputBindResult startInputOrWindowGainedFocus(int p0, com.android.internal.view.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.view.IInputContext p7, int p8, int p9) throws android.os.RemoteException;
    public void showInputMethodPickerFromClient(com.android.internal.view.IInputMethodClient p0, int p1) throws android.os.RemoteException;
    public void showInputMethodPickerFromSystem(com.android.internal.view.IInputMethodClient p0, int p1, int p2) throws android.os.RemoteException;
    public void showInputMethodAndSubtypeEnablerFromClient(com.android.internal.view.IInputMethodClient p0, java.lang.String p1) throws android.os.RemoteException;
    public boolean isInputMethodPickerShownForTest() throws android.os.RemoteException;
    public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() throws android.os.RemoteException;
    public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1) throws android.os.RemoteException;
    public int getInputMethodWindowVisibleHeight() throws android.os.RemoteException;
    public void reportActivityView(com.android.internal.view.IInputMethodClient p0, int p1, float[] p2) throws android.os.RemoteException;
    public void reportPerceptible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException;
    public void removeImeSurface() throws android.os.RemoteException;
    public void removeImeSurfaceFromWindow(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInputMethodManager {
        public Default() {}
        public void addClient(com.android.internal.view.IInputMethodClient p0, com.android.internal.view.IInputContext p1, int p2) throws android.os.RemoteException {}
        public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList(int p0) throws android.os.RemoteException { return null; }
        public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
        public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() throws android.os.RemoteException { return null; }
        public boolean showSoftInput(com.android.internal.view.IInputMethodClient p0, android.os.IBinder p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException { return false; }
        public boolean hideSoftInput(com.android.internal.view.IInputMethodClient p0, android.os.IBinder p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException { return false; }
        public com.android.internal.view.InputBindResult startInputOrWindowGainedFocus(int p0, com.android.internal.view.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.view.IInputContext p7, int p8, int p9) throws android.os.RemoteException { return null; }
        public void showInputMethodPickerFromClient(com.android.internal.view.IInputMethodClient p0, int p1) throws android.os.RemoteException {}
        public void showInputMethodPickerFromSystem(com.android.internal.view.IInputMethodClient p0, int p1, int p2) throws android.os.RemoteException {}
        public void showInputMethodAndSubtypeEnablerFromClient(com.android.internal.view.IInputMethodClient p0, java.lang.String p1) throws android.os.RemoteException {}
        public boolean isInputMethodPickerShownForTest() throws android.os.RemoteException { return false; }
        public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() throws android.os.RemoteException { return null; }
        public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1) throws android.os.RemoteException {}
        public int getInputMethodWindowVisibleHeight() throws android.os.RemoteException { return 0; }
        public void reportActivityView(com.android.internal.view.IInputMethodClient p0, int p1, float[] p2) throws android.os.RemoteException {}
        public void reportPerceptible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
        public void removeImeSurface() throws android.os.RemoteException {}
        public void removeImeSurfaceFromWindow(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputMethodManager {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputMethodManager";
        static final int TRANSACTION_addClient = 1;
        static final int TRANSACTION_getInputMethodList = 2;
        static final int TRANSACTION_getEnabledInputMethodList = 3;
        static final int TRANSACTION_getEnabledInputMethodSubtypeList = 4;
        static final int TRANSACTION_getLastInputMethodSubtype = 5;
        static final int TRANSACTION_showSoftInput = 6;
        static final int TRANSACTION_hideSoftInput = 7;
        static final int TRANSACTION_startInputOrWindowGainedFocus = 8;
        static final int TRANSACTION_showInputMethodPickerFromClient = 9;
        static final int TRANSACTION_showInputMethodPickerFromSystem = 10;
        static final int TRANSACTION_showInputMethodAndSubtypeEnablerFromClient = 11;
        static final int TRANSACTION_isInputMethodPickerShownForTest = 12;
        static final int TRANSACTION_getCurrentInputMethodSubtype = 13;
        static final int TRANSACTION_setAdditionalInputMethodSubtypes = 14;
        static final int TRANSACTION_getInputMethodWindowVisibleHeight = 15;
        static final int TRANSACTION_reportActivityView = 16;
        static final int TRANSACTION_reportPerceptible = 17;
        static final int TRANSACTION_removeImeSurface = 18;
        static final int TRANSACTION_removeImeSurfaceFromWindow = 19;
        public Stub() { super(); }
        public static com.android.internal.view.IInputMethodManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.IInputMethodManager p0) { return false; }
        public static com.android.internal.view.IInputMethodManager getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.IInputMethodManager {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.IInputMethodManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addClient(com.android.internal.view.IInputMethodClient p0, com.android.internal.view.IInputContext p1, int p2) throws android.os.RemoteException {}
            public java.util.List<android.view.inputmethod.InputMethodInfo> getInputMethodList(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.view.inputmethod.InputMethodInfo> getEnabledInputMethodList(int p0) throws android.os.RemoteException { return null; }
            public java.util.List<android.view.inputmethod.InputMethodSubtype> getEnabledInputMethodSubtypeList(java.lang.String p0, boolean p1) throws android.os.RemoteException { return null; }
            public android.view.inputmethod.InputMethodSubtype getLastInputMethodSubtype() throws android.os.RemoteException { return null; }
            public boolean showSoftInput(com.android.internal.view.IInputMethodClient p0, android.os.IBinder p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException { return false; }
            public boolean hideSoftInput(com.android.internal.view.IInputMethodClient p0, android.os.IBinder p1, int p2, android.os.ResultReceiver p3) throws android.os.RemoteException { return false; }
            public com.android.internal.view.InputBindResult startInputOrWindowGainedFocus(int p0, com.android.internal.view.IInputMethodClient p1, android.os.IBinder p2, int p3, int p4, int p5, android.view.inputmethod.EditorInfo p6, com.android.internal.view.IInputContext p7, int p8, int p9) throws android.os.RemoteException { return null; }
            public void showInputMethodPickerFromClient(com.android.internal.view.IInputMethodClient p0, int p1) throws android.os.RemoteException {}
            public void showInputMethodPickerFromSystem(com.android.internal.view.IInputMethodClient p0, int p1, int p2) throws android.os.RemoteException {}
            public void showInputMethodAndSubtypeEnablerFromClient(com.android.internal.view.IInputMethodClient p0, java.lang.String p1) throws android.os.RemoteException {}
            public boolean isInputMethodPickerShownForTest() throws android.os.RemoteException { return false; }
            public android.view.inputmethod.InputMethodSubtype getCurrentInputMethodSubtype() throws android.os.RemoteException { return null; }
            public void setAdditionalInputMethodSubtypes(java.lang.String p0, android.view.inputmethod.InputMethodSubtype[] p1) throws android.os.RemoteException {}
            public int getInputMethodWindowVisibleHeight() throws android.os.RemoteException { return 0; }
            public void reportActivityView(com.android.internal.view.IInputMethodClient p0, int p1, float[] p2) throws android.os.RemoteException {}
            public void reportPerceptible(android.os.IBinder p0, boolean p1) throws android.os.RemoteException {}
            public void removeImeSurface() throws android.os.RemoteException {}
            public void removeImeSurfaceFromWindow(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}

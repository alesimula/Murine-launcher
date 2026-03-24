package com.android.internal.view;

public interface IInputContextCallback extends android.os.IInterface {
    public void setTextBeforeCursor(java.lang.CharSequence p0, int p1) throws android.os.RemoteException;
    public void setTextAfterCursor(java.lang.CharSequence p0, int p1) throws android.os.RemoteException;
    public void setCursorCapsMode(int p0, int p1) throws android.os.RemoteException;
    public void setExtractedText(android.view.inputmethod.ExtractedText p0, int p1) throws android.os.RemoteException;
    public void setSelectedText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException;
    public void setRequestUpdateCursorAnchorInfoResult(boolean p0, int p1) throws android.os.RemoteException;
    public void setCommitContentResult(boolean p0, int p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputContextCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputContextCallback";
        static final int TRANSACTION_setTextBeforeCursor = 1;
        static final int TRANSACTION_setTextAfterCursor = 2;
        static final int TRANSACTION_setCursorCapsMode = 3;
        static final int TRANSACTION_setExtractedText = 4;
        static final int TRANSACTION_setSelectedText = 5;
        static final int TRANSACTION_setRequestUpdateCursorAnchorInfoResult = 6;
        static final int TRANSACTION_setCommitContentResult = 7;
        public Stub() { super(); }
        public static com.android.internal.view.IInputContextCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.IInputContextCallback p0) { return false; }
        public static com.android.internal.view.IInputContextCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.IInputContextCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.IInputContextCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setTextBeforeCursor(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
            public void setTextAfterCursor(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
            public void setCursorCapsMode(int p0, int p1) throws android.os.RemoteException {}
            public void setExtractedText(android.view.inputmethod.ExtractedText p0, int p1) throws android.os.RemoteException {}
            public void setSelectedText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
            public void setRequestUpdateCursorAnchorInfoResult(boolean p0, int p1) throws android.os.RemoteException {}
            public void setCommitContentResult(boolean p0, int p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements com.android.internal.view.IInputContextCallback {
        public Default() {}
        public void setTextBeforeCursor(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
        public void setTextAfterCursor(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
        public void setCursorCapsMode(int p0, int p1) throws android.os.RemoteException {}
        public void setExtractedText(android.view.inputmethod.ExtractedText p0, int p1) throws android.os.RemoteException {}
        public void setSelectedText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
        public void setRequestUpdateCursorAnchorInfoResult(boolean p0, int p1) throws android.os.RemoteException {}
        public void setCommitContentResult(boolean p0, int p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

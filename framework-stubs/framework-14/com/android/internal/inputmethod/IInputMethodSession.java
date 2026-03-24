package com.android.internal.inputmethod;

public interface IInputMethodSession extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IInputMethodSession";
    public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) throws android.os.RemoteException;
    public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException;
    public void viewClicked(boolean p0) throws android.os.RemoteException;
    public void updateCursor(android.graphics.Rect p0) throws android.os.RemoteException;
    public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) throws android.os.RemoteException;
    public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void finishSession() throws android.os.RemoteException;
    public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) throws android.os.RemoteException;
    public void removeImeSurface() throws android.os.RemoteException;
    public void finishInput() throws android.os.RemoteException;
    public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IInputMethodSession {
        public Default() {}
        public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) throws android.os.RemoteException {}
        public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
        public void viewClicked(boolean p0) throws android.os.RemoteException {}
        public void updateCursor(android.graphics.Rect p0) throws android.os.RemoteException {}
        public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) throws android.os.RemoteException {}
        public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void finishSession() throws android.os.RemoteException {}
        public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) throws android.os.RemoteException {}
        public void removeImeSurface() throws android.os.RemoteException {}
        public void finishInput() throws android.os.RemoteException {}
        public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IInputMethodSession {
        static final int TRANSACTION_updateExtractedText = 1;
        static final int TRANSACTION_updateSelection = 2;
        static final int TRANSACTION_viewClicked = 3;
        static final int TRANSACTION_updateCursor = 4;
        static final int TRANSACTION_displayCompletions = 5;
        static final int TRANSACTION_appPrivateCommand = 6;
        static final int TRANSACTION_finishSession = 7;
        static final int TRANSACTION_updateCursorAnchorInfo = 8;
        static final int TRANSACTION_removeImeSurface = 9;
        static final int TRANSACTION_finishInput = 10;
        static final int TRANSACTION_invalidateInput = 11;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IInputMethodSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.inputmethod.IInputMethodSession {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void updateExtractedText(int p0, android.view.inputmethod.ExtractedText p1) throws android.os.RemoteException {}
            public void updateSelection(int p0, int p1, int p2, int p3, int p4, int p5) throws android.os.RemoteException {}
            public void viewClicked(boolean p0) throws android.os.RemoteException {}
            public void updateCursor(android.graphics.Rect p0) throws android.os.RemoteException {}
            public void displayCompletions(android.view.inputmethod.CompletionInfo[] p0) throws android.os.RemoteException {}
            public void appPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void finishSession() throws android.os.RemoteException {}
            public void updateCursorAnchorInfo(android.view.inputmethod.CursorAnchorInfo p0) throws android.os.RemoteException {}
            public void removeImeSurface() throws android.os.RemoteException {}
            public void finishInput() throws android.os.RemoteException {}
            public void invalidateInput(android.view.inputmethod.EditorInfo p0, com.android.internal.inputmethod.IRemoteInputConnection p1, int p2) throws android.os.RemoteException {}
        }
    }
}

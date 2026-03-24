package com.android.internal.view;

public interface IInputContext extends android.os.IInterface {
    public void getTextBeforeCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) throws android.os.RemoteException;
    public void getTextAfterCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) throws android.os.RemoteException;
    public void getCursorCapsMode(int p0, com.android.internal.inputmethod.IIntResultCallback p1) throws android.os.RemoteException;
    public void getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1, com.android.internal.inputmethod.IExtractedTextResultCallback p2) throws android.os.RemoteException;
    public void deleteSurroundingText(int p0, int p1) throws android.os.RemoteException;
    public void deleteSurroundingTextInCodePoints(int p0, int p1) throws android.os.RemoteException;
    public void setComposingText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException;
    public void finishComposingText() throws android.os.RemoteException;
    public void commitText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException;
    public void commitCompletion(android.view.inputmethod.CompletionInfo p0) throws android.os.RemoteException;
    public void commitCorrection(android.view.inputmethod.CorrectionInfo p0) throws android.os.RemoteException;
    public void setSelection(int p0, int p1) throws android.os.RemoteException;
    public void performEditorAction(int p0) throws android.os.RemoteException;
    public void performContextMenuAction(int p0) throws android.os.RemoteException;
    public void beginBatchEdit() throws android.os.RemoteException;
    public void endBatchEdit() throws android.os.RemoteException;
    public void sendKeyEvent(android.view.KeyEvent p0) throws android.os.RemoteException;
    public void clearMetaKeyStates(int p0) throws android.os.RemoteException;
    public void performPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;
    public void setComposingRegion(int p0, int p1) throws android.os.RemoteException;
    public void getSelectedText(int p0, com.android.internal.inputmethod.ICharSequenceResultCallback p1) throws android.os.RemoteException;
    public void requestUpdateCursorAnchorInfo(int p0, com.android.internal.inputmethod.IIntResultCallback p1) throws android.os.RemoteException;
    public void commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2, com.android.internal.inputmethod.IIntResultCallback p3) throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInputContext {
        public Default() {}
        public void getTextBeforeCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) throws android.os.RemoteException {}
        public void getTextAfterCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) throws android.os.RemoteException {}
        public void getCursorCapsMode(int p0, com.android.internal.inputmethod.IIntResultCallback p1) throws android.os.RemoteException {}
        public void getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1, com.android.internal.inputmethod.IExtractedTextResultCallback p2) throws android.os.RemoteException {}
        public void deleteSurroundingText(int p0, int p1) throws android.os.RemoteException {}
        public void deleteSurroundingTextInCodePoints(int p0, int p1) throws android.os.RemoteException {}
        public void setComposingText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
        public void finishComposingText() throws android.os.RemoteException {}
        public void commitText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
        public void commitCompletion(android.view.inputmethod.CompletionInfo p0) throws android.os.RemoteException {}
        public void commitCorrection(android.view.inputmethod.CorrectionInfo p0) throws android.os.RemoteException {}
        public void setSelection(int p0, int p1) throws android.os.RemoteException {}
        public void performEditorAction(int p0) throws android.os.RemoteException {}
        public void performContextMenuAction(int p0) throws android.os.RemoteException {}
        public void beginBatchEdit() throws android.os.RemoteException {}
        public void endBatchEdit() throws android.os.RemoteException {}
        public void sendKeyEvent(android.view.KeyEvent p0) throws android.os.RemoteException {}
        public void clearMetaKeyStates(int p0) throws android.os.RemoteException {}
        public void performPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public void setComposingRegion(int p0, int p1) throws android.os.RemoteException {}
        public void getSelectedText(int p0, com.android.internal.inputmethod.ICharSequenceResultCallback p1) throws android.os.RemoteException {}
        public void requestUpdateCursorAnchorInfo(int p0, com.android.internal.inputmethod.IIntResultCallback p1) throws android.os.RemoteException {}
        public void commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2, com.android.internal.inputmethod.IIntResultCallback p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInputContext {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInputContext";
        static final int TRANSACTION_getTextBeforeCursor = 1;
        static final int TRANSACTION_getTextAfterCursor = 2;
        static final int TRANSACTION_getCursorCapsMode = 3;
        static final int TRANSACTION_getExtractedText = 4;
        static final int TRANSACTION_deleteSurroundingText = 5;
        static final int TRANSACTION_deleteSurroundingTextInCodePoints = 6;
        static final int TRANSACTION_setComposingText = 7;
        static final int TRANSACTION_finishComposingText = 8;
        static final int TRANSACTION_commitText = 9;
        static final int TRANSACTION_commitCompletion = 10;
        static final int TRANSACTION_commitCorrection = 11;
        static final int TRANSACTION_setSelection = 12;
        static final int TRANSACTION_performEditorAction = 13;
        static final int TRANSACTION_performContextMenuAction = 14;
        static final int TRANSACTION_beginBatchEdit = 15;
        static final int TRANSACTION_endBatchEdit = 16;
        static final int TRANSACTION_sendKeyEvent = 17;
        static final int TRANSACTION_clearMetaKeyStates = 18;
        static final int TRANSACTION_performPrivateCommand = 19;
        static final int TRANSACTION_setComposingRegion = 20;
        static final int TRANSACTION_getSelectedText = 21;
        static final int TRANSACTION_requestUpdateCursorAnchorInfo = 22;
        static final int TRANSACTION_commitContent = 23;
        public Stub() { super(); }
        public static com.android.internal.view.IInputContext asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.view.IInputContext p0) { return false; }
        public static com.android.internal.view.IInputContext getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.view.IInputContext {
            private android.os.IBinder mRemote;
            public static com.android.internal.view.IInputContext sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getTextBeforeCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) throws android.os.RemoteException {}
            public void getTextAfterCursor(int p0, int p1, com.android.internal.inputmethod.ICharSequenceResultCallback p2) throws android.os.RemoteException {}
            public void getCursorCapsMode(int p0, com.android.internal.inputmethod.IIntResultCallback p1) throws android.os.RemoteException {}
            public void getExtractedText(android.view.inputmethod.ExtractedTextRequest p0, int p1, com.android.internal.inputmethod.IExtractedTextResultCallback p2) throws android.os.RemoteException {}
            public void deleteSurroundingText(int p0, int p1) throws android.os.RemoteException {}
            public void deleteSurroundingTextInCodePoints(int p0, int p1) throws android.os.RemoteException {}
            public void setComposingText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
            public void finishComposingText() throws android.os.RemoteException {}
            public void commitText(java.lang.CharSequence p0, int p1) throws android.os.RemoteException {}
            public void commitCompletion(android.view.inputmethod.CompletionInfo p0) throws android.os.RemoteException {}
            public void commitCorrection(android.view.inputmethod.CorrectionInfo p0) throws android.os.RemoteException {}
            public void setSelection(int p0, int p1) throws android.os.RemoteException {}
            public void performEditorAction(int p0) throws android.os.RemoteException {}
            public void performContextMenuAction(int p0) throws android.os.RemoteException {}
            public void beginBatchEdit() throws android.os.RemoteException {}
            public void endBatchEdit() throws android.os.RemoteException {}
            public void sendKeyEvent(android.view.KeyEvent p0) throws android.os.RemoteException {}
            public void clearMetaKeyStates(int p0) throws android.os.RemoteException {}
            public void performPrivateCommand(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
            public void setComposingRegion(int p0, int p1) throws android.os.RemoteException {}
            public void getSelectedText(int p0, com.android.internal.inputmethod.ICharSequenceResultCallback p1) throws android.os.RemoteException {}
            public void requestUpdateCursorAnchorInfo(int p0, com.android.internal.inputmethod.IIntResultCallback p1) throws android.os.RemoteException {}
            public void commitContent(android.view.inputmethod.InputContentInfo p0, int p1, android.os.Bundle p2, com.android.internal.inputmethod.IIntResultCallback p3) throws android.os.RemoteException {}
        }
    }
}

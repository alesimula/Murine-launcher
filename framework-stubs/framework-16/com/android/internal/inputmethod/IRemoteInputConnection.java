package com.android.internal.inputmethod;

public interface IRemoteInputConnection extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IRemoteInputConnection";
    public void getTextBeforeCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;
    public void getTextAfterCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;
    public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException;
    public void getExtractedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ExtractedTextRequest p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;
    public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException;
    public void deleteSurroundingTextInCodePoints(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException;
    public void setComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException;
    public void setComposingTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException;
    public void finishComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException;
    public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException;
    public void commitTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException;
    public void commitCompletion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CompletionInfo p1) throws android.os.RemoteException;
    public void commitCorrection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CorrectionInfo p1) throws android.os.RemoteException;
    public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException;
    public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException;
    public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException;
    public void beginBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException;
    public void endBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException;
    public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException;
    public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException;
    public void performSpellCheck(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException;
    public void performPrivateCommand(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void performHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void previewHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.IBinder p2) throws android.os.RemoteException;
    public void setComposingRegion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException;
    public void setComposingRegionWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException;
    public void getSelectedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException;
    public void requestCursorUpdates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException;
    public void requestCursorUpdatesWithFilter(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException;
    public void requestTextBoundsInfo(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.graphics.RectF p1, android.os.ResultReceiver p2) throws android.os.RemoteException;
    public void commitContent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.InputContentInfo p1, int p2, android.os.Bundle p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException;
    public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException;
    public void setImeConsumesInput(com.android.internal.inputmethod.InputConnectionCommandHeader p0, boolean p1) throws android.os.RemoteException;
    public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4, android.view.inputmethod.TextAttribute p5) throws android.os.RemoteException;
    public void cancelCancellationSignal(android.os.IBinder p0) throws android.os.RemoteException;
    public void forgetCancellationSignal(android.os.IBinder p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IRemoteInputConnection {
        public Default() {}
        public void getTextBeforeCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public void getTextAfterCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
        public void getExtractedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ExtractedTextRequest p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
        public void deleteSurroundingTextInCodePoints(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
        public void setComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
        public void setComposingTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
        public void finishComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
        public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
        public void commitTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
        public void commitCompletion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CompletionInfo p1) throws android.os.RemoteException {}
        public void commitCorrection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CorrectionInfo p1) throws android.os.RemoteException {}
        public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
        public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        public void beginBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
        public void endBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
        public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException {}
        public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
        public void performSpellCheck(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
        public void performPrivateCommand(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void performHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void previewHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.IBinder p2) throws android.os.RemoteException {}
        public void setComposingRegion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
        public void setComposingRegionWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
        public void getSelectedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
        public void requestCursorUpdates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
        public void requestCursorUpdatesWithFilter(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
        public void requestTextBoundsInfo(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.graphics.RectF p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
        public void commitContent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.InputContentInfo p1, int p2, android.os.Bundle p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
        public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
        public void setImeConsumesInput(com.android.internal.inputmethod.InputConnectionCommandHeader p0, boolean p1) throws android.os.RemoteException {}
        public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4, android.view.inputmethod.TextAttribute p5) throws android.os.RemoteException {}
        public void cancelCancellationSignal(android.os.IBinder p0) throws android.os.RemoteException {}
        public void forgetCancellationSignal(android.os.IBinder p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IRemoteInputConnection {
        static final int TRANSACTION_getTextBeforeCursor = 1;
        static final int TRANSACTION_getTextAfterCursor = 2;
        static final int TRANSACTION_getCursorCapsMode = 3;
        static final int TRANSACTION_getExtractedText = 4;
        static final int TRANSACTION_deleteSurroundingText = 5;
        static final int TRANSACTION_deleteSurroundingTextInCodePoints = 6;
        static final int TRANSACTION_setComposingText = 7;
        static final int TRANSACTION_setComposingTextWithTextAttribute = 8;
        static final int TRANSACTION_finishComposingText = 9;
        static final int TRANSACTION_commitText = 10;
        static final int TRANSACTION_commitTextWithTextAttribute = 11;
        static final int TRANSACTION_commitCompletion = 12;
        static final int TRANSACTION_commitCorrection = 13;
        static final int TRANSACTION_setSelection = 14;
        static final int TRANSACTION_performEditorAction = 15;
        static final int TRANSACTION_performContextMenuAction = 16;
        static final int TRANSACTION_beginBatchEdit = 17;
        static final int TRANSACTION_endBatchEdit = 18;
        static final int TRANSACTION_sendKeyEvent = 19;
        static final int TRANSACTION_clearMetaKeyStates = 20;
        static final int TRANSACTION_performSpellCheck = 21;
        static final int TRANSACTION_performPrivateCommand = 22;
        static final int TRANSACTION_performHandwritingGesture = 23;
        static final int TRANSACTION_previewHandwritingGesture = 24;
        static final int TRANSACTION_setComposingRegion = 25;
        static final int TRANSACTION_setComposingRegionWithTextAttribute = 26;
        static final int TRANSACTION_getSelectedText = 27;
        static final int TRANSACTION_requestCursorUpdates = 28;
        static final int TRANSACTION_requestCursorUpdatesWithFilter = 29;
        static final int TRANSACTION_requestTextBoundsInfo = 30;
        static final int TRANSACTION_commitContent = 31;
        static final int TRANSACTION_getSurroundingText = 32;
        static final int TRANSACTION_setImeConsumesInput = 33;
        static final int TRANSACTION_replaceText = 34;
        static final int TRANSACTION_cancelCancellationSignal = 35;
        static final int TRANSACTION_forgetCancellationSignal = 36;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IRemoteInputConnection asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.inputmethod.IRemoteInputConnection {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void getTextBeforeCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
            public void getTextAfterCursor(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
            public void getCursorCapsMode(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
            public void getExtractedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ExtractedTextRequest p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
            public void deleteSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
            public void deleteSurroundingTextInCodePoints(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
            public void setComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
            public void setComposingTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
            public void finishComposingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
            public void commitText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2) throws android.os.RemoteException {}
            public void commitTextWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.CharSequence p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
            public void commitCompletion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CompletionInfo p1) throws android.os.RemoteException {}
            public void commitCorrection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.CorrectionInfo p1) throws android.os.RemoteException {}
            public void setSelection(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
            public void performEditorAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
            public void performContextMenuAction(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
            public void beginBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
            public void endBatchEdit(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
            public void sendKeyEvent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.KeyEvent p1) throws android.os.RemoteException {}
            public void clearMetaKeyStates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1) throws android.os.RemoteException {}
            public void performSpellCheck(com.android.internal.inputmethod.InputConnectionCommandHeader p0) throws android.os.RemoteException {}
            public void performPrivateCommand(com.android.internal.inputmethod.InputConnectionCommandHeader p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void performHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void previewHandwritingGesture(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.ParcelableHandwritingGesture p1, android.os.IBinder p2) throws android.os.RemoteException {}
            public void setComposingRegion(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2) throws android.os.RemoteException {}
            public void setComposingRegionWithTextAttribute(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, android.view.inputmethod.TextAttribute p3) throws android.os.RemoteException {}
            public void getSelectedText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, com.android.internal.infra.AndroidFuture p2) throws android.os.RemoteException {}
            public void requestCursorUpdates(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, com.android.internal.infra.AndroidFuture p3) throws android.os.RemoteException {}
            public void requestCursorUpdatesWithFilter(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
            public void requestTextBoundsInfo(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.graphics.RectF p1, android.os.ResultReceiver p2) throws android.os.RemoteException {}
            public void commitContent(com.android.internal.inputmethod.InputConnectionCommandHeader p0, android.view.inputmethod.InputContentInfo p1, int p2, android.os.Bundle p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
            public void getSurroundingText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, int p3, com.android.internal.infra.AndroidFuture p4) throws android.os.RemoteException {}
            public void setImeConsumesInput(com.android.internal.inputmethod.InputConnectionCommandHeader p0, boolean p1) throws android.os.RemoteException {}
            public void replaceText(com.android.internal.inputmethod.InputConnectionCommandHeader p0, int p1, int p2, java.lang.CharSequence p3, int p4, android.view.inputmethod.TextAttribute p5) throws android.os.RemoteException {}
            public void cancelCancellationSignal(android.os.IBinder p0) throws android.os.RemoteException {}
            public void forgetCancellationSignal(android.os.IBinder p0) throws android.os.RemoteException {}
        }
    }
}

package android.service.textclassifier;

public interface ITextClassifierService extends android.os.IInterface {
    public void onSuggestSelection(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextSelection.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException;
    public void onClassifyText(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassification.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException;
    public void onGenerateLinks(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLinks.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException;
    public void onSelectionEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.SelectionEvent p1) throws android.os.RemoteException;
    public void onTextClassifierEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassifierEvent p1) throws android.os.RemoteException;
    public void onCreateTextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassificationSessionId p1) throws android.os.RemoteException;
    public void onDestroyTextClassificationSession(android.view.textclassifier.TextClassificationSessionId p0) throws android.os.RemoteException;
    public void onDetectLanguage(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLanguage.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException;
    public void onSuggestConversationActions(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.ConversationActions.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException;
    public void onConnectedStateChanged(int p0) throws android.os.RemoteException;

    public static class Default implements android.service.textclassifier.ITextClassifierService {
        public Default() {}
        public void onSuggestSelection(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextSelection.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
        public void onClassifyText(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassification.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
        public void onGenerateLinks(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLinks.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
        public void onSelectionEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.SelectionEvent p1) throws android.os.RemoteException {}
        public void onTextClassifierEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassifierEvent p1) throws android.os.RemoteException {}
        public void onCreateTextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassificationSessionId p1) throws android.os.RemoteException {}
        public void onDestroyTextClassificationSession(android.view.textclassifier.TextClassificationSessionId p0) throws android.os.RemoteException {}
        public void onDetectLanguage(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLanguage.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
        public void onSuggestConversationActions(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.ConversationActions.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
        public void onConnectedStateChanged(int p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.textclassifier.ITextClassifierService {
        public static final java.lang.String DESCRIPTOR = "android.service.textclassifier.ITextClassifierService";
        static final int TRANSACTION_onSuggestSelection = 1;
        static final int TRANSACTION_onClassifyText = 2;
        static final int TRANSACTION_onGenerateLinks = 3;
        static final int TRANSACTION_onSelectionEvent = 4;
        static final int TRANSACTION_onTextClassifierEvent = 5;
        static final int TRANSACTION_onCreateTextClassificationSession = 6;
        static final int TRANSACTION_onDestroyTextClassificationSession = 7;
        static final int TRANSACTION_onDetectLanguage = 8;
        static final int TRANSACTION_onSuggestConversationActions = 9;
        static final int TRANSACTION_onConnectedStateChanged = 10;
        public Stub() { super(); }
        public static android.service.textclassifier.ITextClassifierService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.textclassifier.ITextClassifierService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onSuggestSelection(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextSelection.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
            public void onClassifyText(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassification.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
            public void onGenerateLinks(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLinks.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
            public void onSelectionEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.SelectionEvent p1) throws android.os.RemoteException {}
            public void onTextClassifierEvent(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextClassifierEvent p1) throws android.os.RemoteException {}
            public void onCreateTextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassificationSessionId p1) throws android.os.RemoteException {}
            public void onDestroyTextClassificationSession(android.view.textclassifier.TextClassificationSessionId p0) throws android.os.RemoteException {}
            public void onDetectLanguage(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.TextLanguage.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
            public void onSuggestConversationActions(android.view.textclassifier.TextClassificationSessionId p0, android.view.textclassifier.ConversationActions.Request p1, android.service.textclassifier.ITextClassifierCallback p2) throws android.os.RemoteException {}
            public void onConnectedStateChanged(int p0) throws android.os.RemoteException {}
        }
    }
}

package android.service.autofill;

public interface IInlineSuggestionUiCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.service.autofill.IInlineSuggestionUiCallback";
    public void onClick() throws android.os.RemoteException;
    public void onLongClick() throws android.os.RemoteException;
    public void onContent(android.service.autofill.IInlineSuggestionUi p0, android.view.SurfaceControlViewHost.SurfacePackage p1, int p2, int p3) throws android.os.RemoteException;
    public void onError() throws android.os.RemoteException;
    public void onTransferTouchFocusToImeWindow(android.os.IBinder p0, int p1) throws android.os.RemoteException;
    public void onStartIntentSender(android.content.IntentSender p0) throws android.os.RemoteException;

    public static class Default implements android.service.autofill.IInlineSuggestionUiCallback {
        public Default() {}
        public void onClick() throws android.os.RemoteException {}
        public void onLongClick() throws android.os.RemoteException {}
        public void onContent(android.service.autofill.IInlineSuggestionUi p0, android.view.SurfaceControlViewHost.SurfacePackage p1, int p2, int p3) throws android.os.RemoteException {}
        public void onError() throws android.os.RemoteException {}
        public void onTransferTouchFocusToImeWindow(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
        public void onStartIntentSender(android.content.IntentSender p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.IInlineSuggestionUiCallback {
        static final int TRANSACTION_onClick = 1;
        static final int TRANSACTION_onLongClick = 2;
        static final int TRANSACTION_onContent = 3;
        static final int TRANSACTION_onError = 4;
        static final int TRANSACTION_onTransferTouchFocusToImeWindow = 5;
        static final int TRANSACTION_onStartIntentSender = 6;
        public Stub() { super(); }
        public static android.service.autofill.IInlineSuggestionUiCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.service.autofill.IInlineSuggestionUiCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onClick() throws android.os.RemoteException {}
            public void onLongClick() throws android.os.RemoteException {}
            public void onContent(android.service.autofill.IInlineSuggestionUi p0, android.view.SurfaceControlViewHost.SurfacePackage p1, int p2, int p3) throws android.os.RemoteException {}
            public void onError() throws android.os.RemoteException {}
            public void onTransferTouchFocusToImeWindow(android.os.IBinder p0, int p1) throws android.os.RemoteException {}
            public void onStartIntentSender(android.content.IntentSender p0) throws android.os.RemoteException {}
        }
    }
}

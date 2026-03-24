package android.view.autofill;

public interface IAutoFillManagerClient extends android.os.IInterface {
    public void setState(int p0) throws android.os.RemoteException;
    public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) throws android.os.RemoteException;
    public void onGetCredentialResponse(int p0, android.view.autofill.AutofillId p1, android.credentials.GetCredentialResponse p2) throws android.os.RemoteException;
    public void onGetCredentialException(int p0, android.view.autofill.AutofillId p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) throws android.os.RemoteException;
    public void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) throws android.os.RemoteException;
    public void setTrackedViews(int p0, android.view.autofill.AutofillId[] p1, boolean p2, boolean p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId p5) throws android.os.RemoteException;
    public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) throws android.os.RemoteException;
    public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException;
    public void requestHideFillUiWhenDestroyed(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException;
    public void notifyNoFillUi(int p0, android.view.autofill.AutofillId p1, int p2) throws android.os.RemoteException;
    public void notifyFillUiShown(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException;
    public void notifyFillUiHidden(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException;
    public void dispatchUnhandledKey(int p0, android.view.autofill.AutofillId p1, android.view.KeyEvent p2) throws android.os.RemoteException;
    public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1) throws android.os.RemoteException;
    public void setSaveUiState(int p0, boolean p1) throws android.os.RemoteException;
    public void setSessionFinished(int p0, java.util.List<android.view.autofill.AutofillId> p1) throws android.os.RemoteException;
    public void getAugmentedAutofillClient(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void notifyDisableAutofill(long p0, android.content.ComponentName p1) throws android.os.RemoteException;
    public void requestShowSoftInput(android.view.autofill.AutofillId p0) throws android.os.RemoteException;
    public void notifyFillDialogTriggerIds(java.util.List<android.view.autofill.AutofillId> p0) throws android.os.RemoteException;

    public static class Default implements android.view.autofill.IAutoFillManagerClient {
        public Default() {}
        public void setState(int p0) throws android.os.RemoteException {}
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) throws android.os.RemoteException {}
        public void onGetCredentialResponse(int p0, android.view.autofill.AutofillId p1, android.credentials.GetCredentialResponse p2) throws android.os.RemoteException {}
        public void onGetCredentialException(int p0, android.view.autofill.AutofillId p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) throws android.os.RemoteException {}
        public void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) throws android.os.RemoteException {}
        public void setTrackedViews(int p0, android.view.autofill.AutofillId[] p1, boolean p2, boolean p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId p5) throws android.os.RemoteException {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) throws android.os.RemoteException {}
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
        public void requestHideFillUiWhenDestroyed(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
        public void notifyNoFillUi(int p0, android.view.autofill.AutofillId p1, int p2) throws android.os.RemoteException {}
        public void notifyFillUiShown(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
        public void notifyFillUiHidden(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
        public void dispatchUnhandledKey(int p0, android.view.autofill.AutofillId p1, android.view.KeyEvent p2) throws android.os.RemoteException {}
        public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1) throws android.os.RemoteException {}
        public void setSaveUiState(int p0, boolean p1) throws android.os.RemoteException {}
        public void setSessionFinished(int p0, java.util.List<android.view.autofill.AutofillId> p1) throws android.os.RemoteException {}
        public void getAugmentedAutofillClient(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void notifyDisableAutofill(long p0, android.content.ComponentName p1) throws android.os.RemoteException {}
        public void requestShowSoftInput(android.view.autofill.AutofillId p0) throws android.os.RemoteException {}
        public void notifyFillDialogTriggerIds(java.util.List<android.view.autofill.AutofillId> p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.autofill.IAutoFillManagerClient {
        public static final java.lang.String DESCRIPTOR = "android.view.autofill.IAutoFillManagerClient";
        static final int TRANSACTION_setState = 1;
        static final int TRANSACTION_autofill = 2;
        static final int TRANSACTION_onGetCredentialResponse = 3;
        static final int TRANSACTION_onGetCredentialException = 4;
        static final int TRANSACTION_autofillContent = 5;
        static final int TRANSACTION_authenticate = 6;
        static final int TRANSACTION_setTrackedViews = 7;
        static final int TRANSACTION_requestShowFillUi = 8;
        static final int TRANSACTION_requestHideFillUi = 9;
        static final int TRANSACTION_requestHideFillUiWhenDestroyed = 10;
        static final int TRANSACTION_notifyNoFillUi = 11;
        static final int TRANSACTION_notifyFillUiShown = 12;
        static final int TRANSACTION_notifyFillUiHidden = 13;
        static final int TRANSACTION_dispatchUnhandledKey = 14;
        static final int TRANSACTION_startIntentSender = 15;
        static final int TRANSACTION_setSaveUiState = 16;
        static final int TRANSACTION_setSessionFinished = 17;
        static final int TRANSACTION_getAugmentedAutofillClient = 18;
        static final int TRANSACTION_notifyDisableAutofill = 19;
        static final int TRANSACTION_requestShowSoftInput = 20;
        static final int TRANSACTION_notifyFillDialogTriggerIds = 21;
        public Stub() { super(); }
        public static android.view.autofill.IAutoFillManagerClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.autofill.IAutoFillManagerClient {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void setState(int p0) throws android.os.RemoteException {}
            public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) throws android.os.RemoteException {}
            public void onGetCredentialResponse(int p0, android.view.autofill.AutofillId p1, android.credentials.GetCredentialResponse p2) throws android.os.RemoteException {}
            public void onGetCredentialException(int p0, android.view.autofill.AutofillId p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void autofillContent(int p0, android.view.autofill.AutofillId p1, android.content.ClipData p2) throws android.os.RemoteException {}
            public void authenticate(int p0, int p1, android.content.IntentSender p2, android.content.Intent p3, boolean p4) throws android.os.RemoteException {}
            public void setTrackedViews(int p0, android.view.autofill.AutofillId[] p1, boolean p2, boolean p3, android.view.autofill.AutofillId[] p4, android.view.autofill.AutofillId p5) throws android.os.RemoteException {}
            public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) throws android.os.RemoteException {}
            public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
            public void requestHideFillUiWhenDestroyed(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
            public void notifyNoFillUi(int p0, android.view.autofill.AutofillId p1, int p2) throws android.os.RemoteException {}
            public void notifyFillUiShown(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
            public void notifyFillUiHidden(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
            public void dispatchUnhandledKey(int p0, android.view.autofill.AutofillId p1, android.view.KeyEvent p2) throws android.os.RemoteException {}
            public void startIntentSender(android.content.IntentSender p0, android.content.Intent p1) throws android.os.RemoteException {}
            public void setSaveUiState(int p0, boolean p1) throws android.os.RemoteException {}
            public void setSessionFinished(int p0, java.util.List<android.view.autofill.AutofillId> p1) throws android.os.RemoteException {}
            public void getAugmentedAutofillClient(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void notifyDisableAutofill(long p0, android.content.ComponentName p1) throws android.os.RemoteException {}
            public void requestShowSoftInput(android.view.autofill.AutofillId p0) throws android.os.RemoteException {}
            public void notifyFillDialogTriggerIds(java.util.List<android.view.autofill.AutofillId> p0) throws android.os.RemoteException {}
        }
    }
}

package android.view.autofill;

public interface IAutoFillManager extends android.os.IInterface {
    public void addClient(android.view.autofill.IAutoFillManagerClient p0, android.content.ComponentName p1, int p2, com.android.internal.os.IResultReceiver p3, boolean p4) throws android.os.RemoteException;
    public void removeClient(android.view.autofill.IAutoFillManagerClient p0, int p1) throws android.os.RemoteException;
    public void startSession(android.os.IBinder p0, android.os.IBinder p1, android.view.autofill.AutofillId p2, android.graphics.Rect p3, android.view.autofill.AutofillValue p4, int p5, boolean p6, int p7, android.content.ComponentName p8, boolean p9, com.android.internal.os.IResultReceiver p10) throws android.os.RemoteException;
    public void getFillEventHistory(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void restoreSession(int p0, android.os.IBinder p1, android.os.IBinder p2, com.android.internal.os.IResultReceiver p3) throws android.os.RemoteException;
    public void updateSession(int p0, android.view.autofill.AutofillId p1, android.graphics.Rect p2, android.view.autofill.AutofillValue p3, int p4, int p5, int p6) throws android.os.RemoteException;
    public void setAutofillFailure(int p0, java.util.List<android.view.autofill.AutofillId> p1, int p2) throws android.os.RemoteException;
    public void setViewAutofilled(int p0, android.view.autofill.AutofillId p1, int p2) throws android.os.RemoteException;
    public void finishSession(int p0, int p1, int p2) throws android.os.RemoteException;
    public void cancelSession(int p0, int p1) throws android.os.RemoteException;
    public void setAuthenticationResult(android.os.Bundle p0, int p1, int p2, int p3) throws android.os.RemoteException;
    public void setHasCallback(int p0, int p1, boolean p2) throws android.os.RemoteException;
    public void disableOwnedAutofillServices(int p0) throws android.os.RemoteException;
    public void isServiceSupported(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;
    public void isServiceEnabled(int p0, java.lang.String p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException;
    public void onPendingSaveUi(int p0, android.os.IBinder p1) throws android.os.RemoteException;
    public void getUserData(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void getUserDataId(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void setUserData(android.service.autofill.UserData p0) throws android.os.RemoteException;
    public void isFieldClassificationEnabled(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void getAutofillServiceComponentName(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void getAvailableFieldClassificationAlgorithms(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void getDefaultFieldClassificationAlgorithm(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException;
    public void setAugmentedAutofillWhitelist(java.util.List<java.lang.String> p0, java.util.List<android.content.ComponentName> p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException;

    public static class Default implements android.view.autofill.IAutoFillManager {
        public Default() {}
        public void addClient(android.view.autofill.IAutoFillManagerClient p0, android.content.ComponentName p1, int p2, com.android.internal.os.IResultReceiver p3, boolean p4) throws android.os.RemoteException {}
        public void removeClient(android.view.autofill.IAutoFillManagerClient p0, int p1) throws android.os.RemoteException {}
        public void startSession(android.os.IBinder p0, android.os.IBinder p1, android.view.autofill.AutofillId p2, android.graphics.Rect p3, android.view.autofill.AutofillValue p4, int p5, boolean p6, int p7, android.content.ComponentName p8, boolean p9, com.android.internal.os.IResultReceiver p10) throws android.os.RemoteException {}
        public void getFillEventHistory(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void restoreSession(int p0, android.os.IBinder p1, android.os.IBinder p2, com.android.internal.os.IResultReceiver p3) throws android.os.RemoteException {}
        public void updateSession(int p0, android.view.autofill.AutofillId p1, android.graphics.Rect p2, android.view.autofill.AutofillValue p3, int p4, int p5, int p6) throws android.os.RemoteException {}
        public void setAutofillFailure(int p0, java.util.List<android.view.autofill.AutofillId> p1, int p2) throws android.os.RemoteException {}
        public void setViewAutofilled(int p0, android.view.autofill.AutofillId p1, int p2) throws android.os.RemoteException {}
        public void finishSession(int p0, int p1, int p2) throws android.os.RemoteException {}
        public void cancelSession(int p0, int p1) throws android.os.RemoteException {}
        public void setAuthenticationResult(android.os.Bundle p0, int p1, int p2, int p3) throws android.os.RemoteException {}
        public void setHasCallback(int p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void disableOwnedAutofillServices(int p0) throws android.os.RemoteException {}
        public void isServiceSupported(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        public void isServiceEnabled(int p0, java.lang.String p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException {}
        public void onPendingSaveUi(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
        public void getUserData(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void getUserDataId(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void setUserData(android.service.autofill.UserData p0) throws android.os.RemoteException {}
        public void isFieldClassificationEnabled(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void getAutofillServiceComponentName(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void getAvailableFieldClassificationAlgorithms(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void getDefaultFieldClassificationAlgorithm(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
        public void setAugmentedAutofillWhitelist(java.util.List<java.lang.String> p0, java.util.List<android.content.ComponentName> p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.autofill.IAutoFillManager {
        public static final java.lang.String DESCRIPTOR = "android.view.autofill.IAutoFillManager";
        static final int TRANSACTION_addClient = 1;
        static final int TRANSACTION_removeClient = 2;
        static final int TRANSACTION_startSession = 3;
        static final int TRANSACTION_getFillEventHistory = 4;
        static final int TRANSACTION_restoreSession = 5;
        static final int TRANSACTION_updateSession = 6;
        static final int TRANSACTION_setAutofillFailure = 7;
        static final int TRANSACTION_setViewAutofilled = 8;
        static final int TRANSACTION_finishSession = 9;
        static final int TRANSACTION_cancelSession = 10;
        static final int TRANSACTION_setAuthenticationResult = 11;
        static final int TRANSACTION_setHasCallback = 12;
        static final int TRANSACTION_disableOwnedAutofillServices = 13;
        static final int TRANSACTION_isServiceSupported = 14;
        static final int TRANSACTION_isServiceEnabled = 15;
        static final int TRANSACTION_onPendingSaveUi = 16;
        static final int TRANSACTION_getUserData = 17;
        static final int TRANSACTION_getUserDataId = 18;
        static final int TRANSACTION_setUserData = 19;
        static final int TRANSACTION_isFieldClassificationEnabled = 20;
        static final int TRANSACTION_getAutofillServiceComponentName = 21;
        static final int TRANSACTION_getAvailableFieldClassificationAlgorithms = 22;
        static final int TRANSACTION_getDefaultFieldClassificationAlgorithm = 23;
        static final int TRANSACTION_setAugmentedAutofillWhitelist = 24;
        public Stub() { super(); }
        public static android.view.autofill.IAutoFillManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.view.autofill.IAutoFillManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void addClient(android.view.autofill.IAutoFillManagerClient p0, android.content.ComponentName p1, int p2, com.android.internal.os.IResultReceiver p3, boolean p4) throws android.os.RemoteException {}
            public void removeClient(android.view.autofill.IAutoFillManagerClient p0, int p1) throws android.os.RemoteException {}
            public void startSession(android.os.IBinder p0, android.os.IBinder p1, android.view.autofill.AutofillId p2, android.graphics.Rect p3, android.view.autofill.AutofillValue p4, int p5, boolean p6, int p7, android.content.ComponentName p8, boolean p9, com.android.internal.os.IResultReceiver p10) throws android.os.RemoteException {}
            public void getFillEventHistory(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void restoreSession(int p0, android.os.IBinder p1, android.os.IBinder p2, com.android.internal.os.IResultReceiver p3) throws android.os.RemoteException {}
            public void updateSession(int p0, android.view.autofill.AutofillId p1, android.graphics.Rect p2, android.view.autofill.AutofillValue p3, int p4, int p5, int p6) throws android.os.RemoteException {}
            public void setAutofillFailure(int p0, java.util.List<android.view.autofill.AutofillId> p1, int p2) throws android.os.RemoteException {}
            public void setViewAutofilled(int p0, android.view.autofill.AutofillId p1, int p2) throws android.os.RemoteException {}
            public void finishSession(int p0, int p1, int p2) throws android.os.RemoteException {}
            public void cancelSession(int p0, int p1) throws android.os.RemoteException {}
            public void setAuthenticationResult(android.os.Bundle p0, int p1, int p2, int p3) throws android.os.RemoteException {}
            public void setHasCallback(int p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void disableOwnedAutofillServices(int p0) throws android.os.RemoteException {}
            public void isServiceSupported(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
            public void isServiceEnabled(int p0, java.lang.String p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException {}
            public void onPendingSaveUi(int p0, android.os.IBinder p1) throws android.os.RemoteException {}
            public void getUserData(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void getUserDataId(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void setUserData(android.service.autofill.UserData p0) throws android.os.RemoteException {}
            public void isFieldClassificationEnabled(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void getAutofillServiceComponentName(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void getAvailableFieldClassificationAlgorithms(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void getDefaultFieldClassificationAlgorithm(com.android.internal.os.IResultReceiver p0) throws android.os.RemoteException {}
            public void setAugmentedAutofillWhitelist(java.util.List<java.lang.String> p0, java.util.List<android.content.ComponentName> p1, com.android.internal.os.IResultReceiver p2) throws android.os.RemoteException {}
        }
    }
}

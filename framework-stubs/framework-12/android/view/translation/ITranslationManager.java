package android.view.translation;

public interface ITranslationManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.translation.ITranslationManager";
    public void onTranslationCapabilitiesRequest(int p0, int p1, android.os.ResultReceiver p2, int p3) throws android.os.RemoteException;
    public void registerTranslationCapabilityCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterTranslationCapabilityCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException;
    public void onSessionCreated(android.view.translation.TranslationContext p0, int p1, com.android.internal.os.IResultReceiver p2, int p3) throws android.os.RemoteException;
    public void updateUiTranslationState(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, java.util.List<android.view.autofill.AutofillId> p3, android.os.IBinder p4, int p5, android.view.translation.UiTranslationSpec p6, int p7) throws android.os.RemoteException;
    public void registerUiTranslationStateCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException;
    public void unregisterUiTranslationStateCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException;
    public void getServiceSettingsActivity(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException;
    public void onTranslationFinished(boolean p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException;

    public static class Default implements android.view.translation.ITranslationManager {
        public Default() {}
        public void onTranslationCapabilitiesRequest(int p0, int p1, android.os.ResultReceiver p2, int p3) throws android.os.RemoteException {}
        public void registerTranslationCapabilityCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterTranslationCapabilityCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
        public void onSessionCreated(android.view.translation.TranslationContext p0, int p1, com.android.internal.os.IResultReceiver p2, int p3) throws android.os.RemoteException {}
        public void updateUiTranslationState(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, java.util.List<android.view.autofill.AutofillId> p3, android.os.IBinder p4, int p5, android.view.translation.UiTranslationSpec p6, int p7) throws android.os.RemoteException {}
        public void registerUiTranslationStateCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
        public void unregisterUiTranslationStateCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
        public void getServiceSettingsActivity(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
        public void onTranslationFinished(boolean p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.translation.ITranslationManager {
        static final int TRANSACTION_onTranslationCapabilitiesRequest = 1;
        static final int TRANSACTION_registerTranslationCapabilityCallback = 2;
        static final int TRANSACTION_unregisterTranslationCapabilityCallback = 3;
        static final int TRANSACTION_onSessionCreated = 4;
        static final int TRANSACTION_updateUiTranslationState = 5;
        static final int TRANSACTION_registerUiTranslationStateCallback = 6;
        static final int TRANSACTION_unregisterUiTranslationStateCallback = 7;
        static final int TRANSACTION_getServiceSettingsActivity = 8;
        static final int TRANSACTION_onTranslationFinished = 9;
        public Stub() { super(); }
        public static android.view.translation.ITranslationManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.translation.ITranslationManager p0) { return false; }
        public static android.view.translation.ITranslationManager getDefaultImpl() { return null; }

        private static class Proxy implements android.view.translation.ITranslationManager {
            private android.os.IBinder mRemote;
            public static android.view.translation.ITranslationManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onTranslationCapabilitiesRequest(int p0, int p1, android.os.ResultReceiver p2, int p3) throws android.os.RemoteException {}
            public void registerTranslationCapabilityCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterTranslationCapabilityCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
            public void onSessionCreated(android.view.translation.TranslationContext p0, int p1, com.android.internal.os.IResultReceiver p2, int p3) throws android.os.RemoteException {}
            public void updateUiTranslationState(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, java.util.List<android.view.autofill.AutofillId> p3, android.os.IBinder p4, int p5, android.view.translation.UiTranslationSpec p6, int p7) throws android.os.RemoteException {}
            public void registerUiTranslationStateCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
            public void unregisterUiTranslationStateCallback(android.os.IRemoteCallback p0, int p1) throws android.os.RemoteException {}
            public void getServiceSettingsActivity(com.android.internal.os.IResultReceiver p0, int p1) throws android.os.RemoteException {}
            public void onTranslationFinished(boolean p0, android.os.IBinder p1, android.content.ComponentName p2, int p3) throws android.os.RemoteException {}
        }
    }
}

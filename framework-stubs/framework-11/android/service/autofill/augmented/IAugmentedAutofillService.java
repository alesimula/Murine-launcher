package android.service.autofill.augmented;

public interface IAugmentedAutofillService extends android.os.IInterface {
    public void onConnected(boolean p0, boolean p1) throws android.os.RemoteException;
    public void onDisconnected() throws android.os.RemoteException;
    public void onFillRequest(int p0, android.os.IBinder p1, int p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, long p6, android.view.inputmethod.InlineSuggestionsRequest p7, android.service.autofill.augmented.IFillCallback p8) throws android.os.RemoteException;
    public void onDestroyAllFillWindowsRequest() throws android.os.RemoteException;

    public static class Default implements android.service.autofill.augmented.IAugmentedAutofillService {
        public Default() {}
        public void onConnected(boolean p0, boolean p1) throws android.os.RemoteException {}
        public void onDisconnected() throws android.os.RemoteException {}
        public void onFillRequest(int p0, android.os.IBinder p1, int p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, long p6, android.view.inputmethod.InlineSuggestionsRequest p7, android.service.autofill.augmented.IFillCallback p8) throws android.os.RemoteException {}
        public void onDestroyAllFillWindowsRequest() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.autofill.augmented.IAugmentedAutofillService {
        private static final java.lang.String DESCRIPTOR = "android.service.autofill.augmented.IAugmentedAutofillService";
        static final int TRANSACTION_onConnected = 1;
        static final int TRANSACTION_onDisconnected = 2;
        static final int TRANSACTION_onFillRequest = 3;
        static final int TRANSACTION_onDestroyAllFillWindowsRequest = 4;
        public Stub() { super(); }
        public static android.service.autofill.augmented.IAugmentedAutofillService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.autofill.augmented.IAugmentedAutofillService p0) { return false; }
        public static android.service.autofill.augmented.IAugmentedAutofillService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.autofill.augmented.IAugmentedAutofillService {
            private android.os.IBinder mRemote;
            public static android.service.autofill.augmented.IAugmentedAutofillService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onConnected(boolean p0, boolean p1) throws android.os.RemoteException {}
            public void onDisconnected() throws android.os.RemoteException {}
            public void onFillRequest(int p0, android.os.IBinder p1, int p2, android.content.ComponentName p3, android.view.autofill.AutofillId p4, android.view.autofill.AutofillValue p5, long p6, android.view.inputmethod.InlineSuggestionsRequest p7, android.service.autofill.augmented.IFillCallback p8) throws android.os.RemoteException {}
            public void onDestroyAllFillWindowsRequest() throws android.os.RemoteException {}
        }
    }
}

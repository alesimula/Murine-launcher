package android.view.autofill;

public interface IAugmentedAutofillManagerClient extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.view.autofill.IAugmentedAutofillManagerClient";
    public android.graphics.Rect getViewCoordinates(android.view.autofill.AutofillId p0) throws android.os.RemoteException;
    public android.app.assist.AssistStructure.ViewNodeParcelable getViewNodeParcelable(android.view.autofill.AutofillId p0) throws android.os.RemoteException;
    public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) throws android.os.RemoteException;
    public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) throws android.os.RemoteException;
    public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException;
    public boolean requestAutofill(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException;

    public static class Default implements android.view.autofill.IAugmentedAutofillManagerClient {
        public Default() {}
        public android.graphics.Rect getViewCoordinates(android.view.autofill.AutofillId p0) throws android.os.RemoteException { return null; }
        public android.app.assist.AssistStructure.ViewNodeParcelable getViewNodeParcelable(android.view.autofill.AutofillId p0) throws android.os.RemoteException { return null; }
        public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) throws android.os.RemoteException {}
        public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) throws android.os.RemoteException {}
        public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
        public boolean requestAutofill(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException { return false; }
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.view.autofill.IAugmentedAutofillManagerClient {
        static final int TRANSACTION_getViewCoordinates = 1;
        static final int TRANSACTION_getViewNodeParcelable = 2;
        static final int TRANSACTION_autofill = 3;
        static final int TRANSACTION_requestShowFillUi = 4;
        static final int TRANSACTION_requestHideFillUi = 5;
        static final int TRANSACTION_requestAutofill = 6;
        public Stub() { super(); }
        public static android.view.autofill.IAugmentedAutofillManagerClient asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.view.autofill.IAugmentedAutofillManagerClient p0) { return false; }
        public static android.view.autofill.IAugmentedAutofillManagerClient getDefaultImpl() { return null; }

        private static class Proxy implements android.view.autofill.IAugmentedAutofillManagerClient {
            private android.os.IBinder mRemote;
            public static android.view.autofill.IAugmentedAutofillManagerClient sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.graphics.Rect getViewCoordinates(android.view.autofill.AutofillId p0) throws android.os.RemoteException { return null; }
            public android.app.assist.AssistStructure.ViewNodeParcelable getViewNodeParcelable(android.view.autofill.AutofillId p0) throws android.os.RemoteException { return null; }
            public void autofill(int p0, java.util.List<android.view.autofill.AutofillId> p1, java.util.List<android.view.autofill.AutofillValue> p2, boolean p3) throws android.os.RemoteException {}
            public void requestShowFillUi(int p0, android.view.autofill.AutofillId p1, int p2, int p3, android.graphics.Rect p4, android.view.autofill.IAutofillWindowPresenter p5) throws android.os.RemoteException {}
            public void requestHideFillUi(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException {}
            public boolean requestAutofill(int p0, android.view.autofill.AutofillId p1) throws android.os.RemoteException { return false; }
        }
    }
}

package com.android.internal.view;

public interface IInlineSuggestionsResponseCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.view.IInlineSuggestionsResponseCallback";
    public void onInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.view.IInlineSuggestionsResponseCallback {
        public Default() {}
        public void onInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.view.IInlineSuggestionsResponseCallback {
        static final int TRANSACTION_onInlineSuggestionsResponse = 1;
        public Stub() { super(); }
        public static com.android.internal.view.IInlineSuggestionsResponseCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.view.IInlineSuggestionsResponseCallback {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onInlineSuggestionsResponse(android.view.autofill.AutofillId p0, android.view.inputmethod.InlineSuggestionsResponse p1) throws android.os.RemoteException {}
        }
    }
}

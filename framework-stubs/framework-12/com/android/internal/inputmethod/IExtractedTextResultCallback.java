package com.android.internal.inputmethod;

public interface IExtractedTextResultCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.inputmethod.IExtractedTextResultCallback";
    public void onResult(android.view.inputmethod.ExtractedText p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.inputmethod.IExtractedTextResultCallback {
        public Default() {}
        public void onResult(android.view.inputmethod.ExtractedText p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.inputmethod.IExtractedTextResultCallback {
        static final int TRANSACTION_onResult = 1;
        public Stub() { super(); }
        public static com.android.internal.inputmethod.IExtractedTextResultCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.inputmethod.IExtractedTextResultCallback p0) { return false; }
        public static com.android.internal.inputmethod.IExtractedTextResultCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.inputmethod.IExtractedTextResultCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.inputmethod.IExtractedTextResultCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onResult(android.view.inputmethod.ExtractedText p0) throws android.os.RemoteException {}
        }
    }
}

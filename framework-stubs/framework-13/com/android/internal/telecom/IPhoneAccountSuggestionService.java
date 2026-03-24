package com.android.internal.telecom;

public interface IPhoneAccountSuggestionService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IPhoneAccountSuggestionService";
    public void onAccountSuggestionRequest(com.android.internal.telecom.IPhoneAccountSuggestionCallback p0, java.lang.String p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.IPhoneAccountSuggestionService {
        public Default() {}
        public void onAccountSuggestionRequest(com.android.internal.telecom.IPhoneAccountSuggestionCallback p0, java.lang.String p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IPhoneAccountSuggestionService {
        static final int TRANSACTION_onAccountSuggestionRequest = 1;
        public Stub() { super(); }
        public static com.android.internal.telecom.IPhoneAccountSuggestionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.telecom.IPhoneAccountSuggestionService {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onAccountSuggestionRequest(com.android.internal.telecom.IPhoneAccountSuggestionCallback p0, java.lang.String p1) throws android.os.RemoteException {}
        }
    }
}

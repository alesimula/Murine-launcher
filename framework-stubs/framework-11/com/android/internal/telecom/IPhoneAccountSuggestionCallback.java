package com.android.internal.telecom;

public interface IPhoneAccountSuggestionCallback extends android.os.IInterface {
    public void suggestPhoneAccounts(java.lang.String p0, java.util.List<android.telecom.PhoneAccountSuggestion> p1) throws android.os.RemoteException;

    public static class Default implements com.android.internal.telecom.IPhoneAccountSuggestionCallback {
        public Default() {}
        public void suggestPhoneAccounts(java.lang.String p0, java.util.List<android.telecom.PhoneAccountSuggestion> p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.telecom.IPhoneAccountSuggestionCallback {
        private static final java.lang.String DESCRIPTOR = "com.android.internal.telecom.IPhoneAccountSuggestionCallback";
        static final int TRANSACTION_suggestPhoneAccounts = 1;
        public Stub() { super(); }
        public static com.android.internal.telecom.IPhoneAccountSuggestionCallback asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.telecom.IPhoneAccountSuggestionCallback p0) { return false; }
        public static com.android.internal.telecom.IPhoneAccountSuggestionCallback getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.telecom.IPhoneAccountSuggestionCallback {
            private android.os.IBinder mRemote;
            public static com.android.internal.telecom.IPhoneAccountSuggestionCallback sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void suggestPhoneAccounts(java.lang.String p0, java.util.List<android.telecom.PhoneAccountSuggestion> p1) throws android.os.RemoteException {}
        }
    }
}

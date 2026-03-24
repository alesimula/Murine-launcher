package com.android.internal.textservice;

public interface ISpellCheckerSession extends android.os.IInterface {
    public void onGetSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) throws android.os.RemoteException;
    public void onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) throws android.os.RemoteException;
    public void onCancel() throws android.os.RemoteException;
    public void onClose() throws android.os.RemoteException;

    public static class Default implements com.android.internal.textservice.ISpellCheckerSession {
        public Default() {}
        public void onGetSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) throws android.os.RemoteException {}
        public void onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) throws android.os.RemoteException {}
        public void onCancel() throws android.os.RemoteException {}
        public void onClose() throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.textservice.ISpellCheckerSession {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.textservice.ISpellCheckerSession";
        static final int TRANSACTION_onGetSuggestionsMultiple = 1;
        static final int TRANSACTION_onGetSentenceSuggestionsMultiple = 2;
        static final int TRANSACTION_onCancel = 3;
        static final int TRANSACTION_onClose = 4;
        public Stub() { super(); }
        public static com.android.internal.textservice.ISpellCheckerSession asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(com.android.internal.textservice.ISpellCheckerSession p0) { return false; }
        public static com.android.internal.textservice.ISpellCheckerSession getDefaultImpl() { return null; }

        private static class Proxy implements com.android.internal.textservice.ISpellCheckerSession {
            private android.os.IBinder mRemote;
            public static com.android.internal.textservice.ISpellCheckerSession sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1, boolean p2) throws android.os.RemoteException {}
            public void onGetSentenceSuggestionsMultiple(android.view.textservice.TextInfo[] p0, int p1) throws android.os.RemoteException {}
            public void onCancel() throws android.os.RemoteException {}
            public void onClose() throws android.os.RemoteException {}
        }
    }
}

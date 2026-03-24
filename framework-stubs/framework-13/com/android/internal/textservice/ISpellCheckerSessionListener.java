package com.android.internal.textservice;

public interface ISpellCheckerSessionListener extends android.os.IInterface {
    public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) throws android.os.RemoteException;
    public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) throws android.os.RemoteException;

    public static class Default implements com.android.internal.textservice.ISpellCheckerSessionListener {
        public Default() {}
        public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) throws android.os.RemoteException {}
        public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements com.android.internal.textservice.ISpellCheckerSessionListener {
        public static final java.lang.String DESCRIPTOR = "com.android.internal.textservice.ISpellCheckerSessionListener";
        static final int TRANSACTION_onGetSuggestions = 1;
        static final int TRANSACTION_onGetSentenceSuggestions = 2;
        public Stub() { super(); }
        public static com.android.internal.textservice.ISpellCheckerSessionListener asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements com.android.internal.textservice.ISpellCheckerSessionListener {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void onGetSuggestions(android.view.textservice.SuggestionsInfo[] p0) throws android.os.RemoteException {}
            public void onGetSentenceSuggestions(android.view.textservice.SentenceSuggestionsInfo[] p0) throws android.os.RemoteException {}
        }
    }
}

package android.app.contentsuggestions;

public interface IContentSuggestionsManager extends android.os.IInterface {
    public void provideContextImage(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void suggestContentSelections(int p0, android.app.contentsuggestions.SelectionsRequest p1, android.app.contentsuggestions.ISelectionsCallback p2) throws android.os.RemoteException;
    public void classifyContentSelections(int p0, android.app.contentsuggestions.ClassificationsRequest p1, android.app.contentsuggestions.IClassificationsCallback p2) throws android.os.RemoteException;
    public void notifyInteraction(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void isEnabled(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.app.contentsuggestions.IContentSuggestionsManager {
        private static final java.lang.String DESCRIPTOR = "android.app.contentsuggestions.IContentSuggestionsManager";
        static final int TRANSACTION_provideContextImage = 1;
        static final int TRANSACTION_suggestContentSelections = 2;
        static final int TRANSACTION_classifyContentSelections = 3;
        static final int TRANSACTION_notifyInteraction = 4;
        static final int TRANSACTION_isEnabled = 5;
        public Stub() { super(); }
        public static android.app.contentsuggestions.IContentSuggestionsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.app.contentsuggestions.IContentSuggestionsManager p0) { return false; }
        public static android.app.contentsuggestions.IContentSuggestionsManager getDefaultImpl() { return null; }

        private static class Proxy implements android.app.contentsuggestions.IContentSuggestionsManager {
            private android.os.IBinder mRemote;
            public static android.app.contentsuggestions.IContentSuggestionsManager sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void provideContextImage(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void suggestContentSelections(int p0, android.app.contentsuggestions.SelectionsRequest p1, android.app.contentsuggestions.ISelectionsCallback p2) throws android.os.RemoteException {}
            public void classifyContentSelections(int p0, android.app.contentsuggestions.ClassificationsRequest p1, android.app.contentsuggestions.IClassificationsCallback p2) throws android.os.RemoteException {}
            public void notifyInteraction(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void isEnabled(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.app.contentsuggestions.IContentSuggestionsManager {
        public Default() {}
        public void provideContextImage(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void suggestContentSelections(int p0, android.app.contentsuggestions.SelectionsRequest p1, android.app.contentsuggestions.ISelectionsCallback p2) throws android.os.RemoteException {}
        public void classifyContentSelections(int p0, android.app.contentsuggestions.ClassificationsRequest p1, android.app.contentsuggestions.IClassificationsCallback p2) throws android.os.RemoteException {}
        public void notifyInteraction(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void isEnabled(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

package android.service.contentsuggestions;

public interface IContentSuggestionsService extends android.os.IInterface {
    public void provideContextImage(int p0, android.graphics.GraphicBuffer p1, int p2, android.os.Bundle p3) throws android.os.RemoteException;
    public void suggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ISelectionsCallback p1) throws android.os.RemoteException;
    public void classifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.IClassificationsCallback p1) throws android.os.RemoteException;
    public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException;

    public static abstract class Stub extends android.os.Binder implements android.service.contentsuggestions.IContentSuggestionsService {
        private static final java.lang.String DESCRIPTOR = "android.service.contentsuggestions.IContentSuggestionsService";
        static final int TRANSACTION_provideContextImage = 1;
        static final int TRANSACTION_suggestContentSelections = 2;
        static final int TRANSACTION_classifyContentSelections = 3;
        static final int TRANSACTION_notifyInteraction = 4;
        public Stub() { super(); }
        public static android.service.contentsuggestions.IContentSuggestionsService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.contentsuggestions.IContentSuggestionsService p0) { return false; }
        public static android.service.contentsuggestions.IContentSuggestionsService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.contentsuggestions.IContentSuggestionsService {
            private android.os.IBinder mRemote;
            public static android.service.contentsuggestions.IContentSuggestionsService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void provideContextImage(int p0, android.graphics.GraphicBuffer p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
            public void suggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ISelectionsCallback p1) throws android.os.RemoteException {}
            public void classifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.IClassificationsCallback p1) throws android.os.RemoteException {}
            public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        }
    }

    public static class Default implements android.service.contentsuggestions.IContentSuggestionsService {
        public Default() {}
        public void provideContextImage(int p0, android.graphics.GraphicBuffer p1, int p2, android.os.Bundle p3) throws android.os.RemoteException {}
        public void suggestContentSelections(android.app.contentsuggestions.SelectionsRequest p0, android.app.contentsuggestions.ISelectionsCallback p1) throws android.os.RemoteException {}
        public void classifyContentSelections(android.app.contentsuggestions.ClassificationsRequest p0, android.app.contentsuggestions.IClassificationsCallback p1) throws android.os.RemoteException {}
        public void notifyInteraction(java.lang.String p0, android.os.Bundle p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }
}

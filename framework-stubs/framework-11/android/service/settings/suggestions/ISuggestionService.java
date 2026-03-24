package android.service.settings.suggestions;

public interface ISuggestionService extends android.os.IInterface {
    public java.util.List<android.service.settings.suggestions.Suggestion> getSuggestions() throws android.os.RemoteException;
    public void dismissSuggestion(android.service.settings.suggestions.Suggestion p0) throws android.os.RemoteException;
    public void launchSuggestion(android.service.settings.suggestions.Suggestion p0) throws android.os.RemoteException;

    public static class Default implements android.service.settings.suggestions.ISuggestionService {
        public Default() {}
        public java.util.List<android.service.settings.suggestions.Suggestion> getSuggestions() throws android.os.RemoteException { return null; }
        public void dismissSuggestion(android.service.settings.suggestions.Suggestion p0) throws android.os.RemoteException {}
        public void launchSuggestion(android.service.settings.suggestions.Suggestion p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.service.settings.suggestions.ISuggestionService {
        private static final java.lang.String DESCRIPTOR = "android.service.settings.suggestions.ISuggestionService";
        static final int TRANSACTION_getSuggestions = 2;
        static final int TRANSACTION_dismissSuggestion = 3;
        static final int TRANSACTION_launchSuggestion = 4;
        public Stub() { super(); }
        public static android.service.settings.suggestions.ISuggestionService asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public static boolean setDefaultImpl(android.service.settings.suggestions.ISuggestionService p0) { return false; }
        public static android.service.settings.suggestions.ISuggestionService getDefaultImpl() { return null; }

        private static class Proxy implements android.service.settings.suggestions.ISuggestionService {
            private android.os.IBinder mRemote;
            public static android.service.settings.suggestions.ISuggestionService sDefaultImpl;
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public java.util.List<android.service.settings.suggestions.Suggestion> getSuggestions() throws android.os.RemoteException { return null; }
            public void dismissSuggestion(android.service.settings.suggestions.Suggestion p0) throws android.os.RemoteException {}
            public void launchSuggestion(android.service.settings.suggestions.Suggestion p0) throws android.os.RemoteException {}
        }
    }
}

package android.app.contentsuggestions;

public interface IContentSuggestionsManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.contentsuggestions.IContentSuggestionsManager";
    public void provideContextImage(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void provideContextBitmap(int p0, android.graphics.Bitmap p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void suggestContentSelections(int p0, android.app.contentsuggestions.SelectionsRequest p1, android.app.contentsuggestions.ISelectionsCallback p2) throws android.os.RemoteException;
    public void classifyContentSelections(int p0, android.app.contentsuggestions.ClassificationsRequest p1, android.app.contentsuggestions.IClassificationsCallback p2) throws android.os.RemoteException;
    public void notifyInteraction(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException;
    public void isEnabled(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException;
    public void resetTemporaryService(int p0) throws android.os.RemoteException;
    public void setTemporaryService(int p0, java.lang.String p1, int p2) throws android.os.RemoteException;
    public void setDefaultServiceEnabled(int p0, boolean p1) throws android.os.RemoteException;

    public static class Default implements android.app.contentsuggestions.IContentSuggestionsManager {
        public Default() {}
        public void provideContextImage(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void provideContextBitmap(int p0, android.graphics.Bitmap p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void suggestContentSelections(int p0, android.app.contentsuggestions.SelectionsRequest p1, android.app.contentsuggestions.ISelectionsCallback p2) throws android.os.RemoteException {}
        public void classifyContentSelections(int p0, android.app.contentsuggestions.ClassificationsRequest p1, android.app.contentsuggestions.IClassificationsCallback p2) throws android.os.RemoteException {}
        public void notifyInteraction(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
        public void isEnabled(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
        public void resetTemporaryService(int p0) throws android.os.RemoteException {}
        public void setTemporaryService(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
        public void setDefaultServiceEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.contentsuggestions.IContentSuggestionsManager {
        static final int TRANSACTION_provideContextImage = 1;
        static final int TRANSACTION_provideContextBitmap = 2;
        static final int TRANSACTION_suggestContentSelections = 3;
        static final int TRANSACTION_classifyContentSelections = 4;
        static final int TRANSACTION_notifyInteraction = 5;
        static final int TRANSACTION_isEnabled = 6;
        static final int TRANSACTION_resetTemporaryService = 7;
        static final int TRANSACTION_setTemporaryService = 8;
        static final int TRANSACTION_setDefaultServiceEnabled = 9;
        public Stub() { super(); }
        public static android.app.contentsuggestions.IContentSuggestionsManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.contentsuggestions.IContentSuggestionsManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public void provideContextImage(int p0, int p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void provideContextBitmap(int p0, android.graphics.Bitmap p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void suggestContentSelections(int p0, android.app.contentsuggestions.SelectionsRequest p1, android.app.contentsuggestions.ISelectionsCallback p2) throws android.os.RemoteException {}
            public void classifyContentSelections(int p0, android.app.contentsuggestions.ClassificationsRequest p1, android.app.contentsuggestions.IClassificationsCallback p2) throws android.os.RemoteException {}
            public void notifyInteraction(int p0, java.lang.String p1, android.os.Bundle p2) throws android.os.RemoteException {}
            public void isEnabled(int p0, com.android.internal.os.IResultReceiver p1) throws android.os.RemoteException {}
            public void resetTemporaryService(int p0) throws android.os.RemoteException {}
            public void setTemporaryService(int p0, java.lang.String p1, int p2) throws android.os.RemoteException {}
            public void setDefaultServiceEnabled(int p0, boolean p1) throws android.os.RemoteException {}
        }
    }
}

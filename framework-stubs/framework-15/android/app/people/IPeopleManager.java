package android.app.people;

public interface IPeopleManager extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.app.people.IPeopleManager";
    public android.app.people.ConversationChannel getConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getRecentConversations() throws android.os.RemoteException;
    public void removeRecentConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void removeAllRecentConversations() throws android.os.RemoteException;
    public boolean isConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public long getLastInteraction(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void addOrUpdateStatus(java.lang.String p0, int p1, java.lang.String p2, android.app.people.ConversationStatus p3) throws android.os.RemoteException;
    public void clearStatus(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException;
    public void clearStatuses(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public android.content.pm.ParceledListSlice getStatuses(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException;
    public void registerConversationListener(java.lang.String p0, int p1, java.lang.String p2, android.app.people.IConversationListener p3) throws android.os.RemoteException;
    public void unregisterConversationListener(android.app.people.IConversationListener p0) throws android.os.RemoteException;

    public static class Default implements android.app.people.IPeopleManager {
        public Default() {}
        public android.app.people.ConversationChannel getConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public android.content.pm.ParceledListSlice getRecentConversations() throws android.os.RemoteException { return null; }
        public void removeRecentConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public void removeAllRecentConversations() throws android.os.RemoteException {}
        public boolean isConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
        public long getLastInteraction(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
        public void addOrUpdateStatus(java.lang.String p0, int p1, java.lang.String p2, android.app.people.ConversationStatus p3) throws android.os.RemoteException {}
        public void clearStatus(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
        public void clearStatuses(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
        public android.content.pm.ParceledListSlice getStatuses(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
        public void registerConversationListener(java.lang.String p0, int p1, java.lang.String p2, android.app.people.IConversationListener p3) throws android.os.RemoteException {}
        public void unregisterConversationListener(android.app.people.IConversationListener p0) throws android.os.RemoteException {}
        public android.os.IBinder asBinder() { return null; }
    }

    public static abstract class Stub extends android.os.Binder implements android.app.people.IPeopleManager {
        static final int TRANSACTION_getConversation = 1;
        static final int TRANSACTION_getRecentConversations = 2;
        static final int TRANSACTION_removeRecentConversation = 3;
        static final int TRANSACTION_removeAllRecentConversations = 4;
        static final int TRANSACTION_isConversation = 5;
        static final int TRANSACTION_getLastInteraction = 6;
        static final int TRANSACTION_addOrUpdateStatus = 7;
        static final int TRANSACTION_clearStatus = 8;
        static final int TRANSACTION_clearStatuses = 9;
        static final int TRANSACTION_getStatuses = 10;
        static final int TRANSACTION_registerConversationListener = 11;
        static final int TRANSACTION_unregisterConversationListener = 12;
        public Stub() { super(); }
        public static android.app.people.IPeopleManager asInterface(android.os.IBinder p0) { return null; }
        public android.os.IBinder asBinder() { return null; }
        public static java.lang.String getDefaultTransactionName(int p0) { return null; }
        public java.lang.String getTransactionName(int p0) { return null; }
        public boolean onTransact(int p0, android.os.Parcel p1, android.os.Parcel p2, int p3) throws android.os.RemoteException { return false; }
        public int getMaxTransactionId() { return 0; }

        private static class Proxy implements android.app.people.IPeopleManager {
            Proxy(android.os.IBinder p0) {}
            public android.os.IBinder asBinder() { return null; }
            public java.lang.String getInterfaceDescriptor() { return null; }
            public android.app.people.ConversationChannel getConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public android.content.pm.ParceledListSlice getRecentConversations() throws android.os.RemoteException { return null; }
            public void removeRecentConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public void removeAllRecentConversations() throws android.os.RemoteException {}
            public boolean isConversation(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return false; }
            public long getLastInteraction(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return 0L; }
            public void addOrUpdateStatus(java.lang.String p0, int p1, java.lang.String p2, android.app.people.ConversationStatus p3) throws android.os.RemoteException {}
            public void clearStatus(java.lang.String p0, int p1, java.lang.String p2, java.lang.String p3) throws android.os.RemoteException {}
            public void clearStatuses(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException {}
            public android.content.pm.ParceledListSlice getStatuses(java.lang.String p0, int p1, java.lang.String p2) throws android.os.RemoteException { return null; }
            public void registerConversationListener(java.lang.String p0, int p1, java.lang.String p2, android.app.people.IConversationListener p3) throws android.os.RemoteException {}
            public void unregisterConversationListener(android.app.people.IConversationListener p0) throws android.os.RemoteException {}
        }
    }
}

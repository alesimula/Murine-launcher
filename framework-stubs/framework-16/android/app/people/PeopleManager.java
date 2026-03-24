package android.app.people;

public final class PeopleManager {
    public java.util.Map<android.app.people.PeopleManager.ConversationListener, android.util.Pair<java.util.concurrent.Executor, android.app.people.IConversationListener>> mConversationListeners;
    public PeopleManager(android.content.Context p0) throws android.os.ServiceManager.ServiceNotFoundException {}
    public PeopleManager(android.content.Context p0, android.app.people.IPeopleManager p1) {}
    @android.annotation.SystemApi
    @android.annotation.RequiresPermission("android.permission.READ_PEOPLE_DATA")
    public boolean isConversation(java.lang.String p0, java.lang.String p1) { return false; }
    public void addOrUpdateStatus(java.lang.String p0, android.app.people.ConversationStatus p1) {}
    public void clearStatus(java.lang.String p0, java.lang.String p1) {}
    public void clearStatuses(java.lang.String p0) {}
    @android.annotation.NonNull
    public java.util.List<android.app.people.ConversationStatus> getStatuses(java.lang.String p0) { return null; }
    public void registerConversationListener(java.lang.String p0, int p1, java.lang.String p2, android.app.people.PeopleManager.ConversationListener p3, java.util.concurrent.Executor p4) {}
    public void unregisterConversationListener(android.app.people.PeopleManager.ConversationListener p0) {}

    public static interface ConversationListener {
        default public void onConversationUpdate(android.app.people.ConversationChannel p0) {}
    }

    private static class ConversationListenerProxy extends android.app.people.IConversationListener.Stub {
        ConversationListenerProxy(java.util.concurrent.Executor p0, android.app.people.PeopleManager.ConversationListener p1) { super(); }
        public void onConversationUpdate(android.app.people.ConversationChannel p0) {}
    }
}

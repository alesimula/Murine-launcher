package android.provider;

public class ContactsInternal {
    private static final android.content.UriMatcher sContactsUriMatcher = null;
    private static final int CONTACTS_URI_LOOKUP_ID = 1000;
    private static final int CONTACTS_URI_LOOKUP = 1001;
    private ContactsInternal() {}
    @android.annotation.UnsupportedAppUsage
    public static void startQuickContactWithErrorToast(android.content.Context p0, android.content.Intent p1) {}
    public static void startQuickContactWithErrorToastForUser(android.content.Context p0, android.content.Intent p1, android.os.UserHandle p2) {}
    private static boolean maybeStartManagedQuickContact(android.content.Context p0, android.content.Intent p1) { return false; }
}

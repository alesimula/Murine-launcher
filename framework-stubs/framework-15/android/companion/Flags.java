package android.companion;

public final class Flags {
    public static final java.lang.String FLAG_ASSOCIATION_TAG = "android.companion.association_tag";
    public static final java.lang.String FLAG_COMPANION_TRANSPORT_APIS = "android.companion.companion_transport_apis";
    public static final java.lang.String FLAG_DEVICE_PRESENCE = "android.companion.device_presence";
    public static final java.lang.String FLAG_NEW_ASSOCIATION_BUILDER = "android.companion.new_association_builder";
    public static final java.lang.String FLAG_ONGOING_PERM_SYNC = "android.companion.ongoing_perm_sync";
    public static final java.lang.String FLAG_PERM_SYNC_USER_CONSENT = "android.companion.perm_sync_user_consent";
    public static final java.lang.String FLAG_UNPAIR_ASSOCIATED_DEVICE = "android.companion.unpair_associated_device";
    public Flags() {}
    public static boolean associationTag() { return false; }
    public static boolean companionTransportApis() { return false; }
    public static boolean devicePresence() { return false; }
    public static boolean newAssociationBuilder() { return false; }
    public static boolean ongoingPermSync() { return false; }
    public static boolean permSyncUserConsent() { return false; }
    public static boolean unpairAssociatedDevice() { return false; }
}

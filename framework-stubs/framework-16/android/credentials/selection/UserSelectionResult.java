package android.credentials.selection;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.credentials.flags.configurable_selector_ui_enabled")
public final class UserSelectionResult {
    public static void sendUserSelectionResult(android.os.ResultReceiver p0, android.credentials.selection.UserSelectionResult p1) {}
    public UserSelectionResult(java.lang.String p0, java.lang.String p1, java.lang.String p2, android.credentials.selection.ProviderPendingIntentResponse p3) {}
    @android.annotation.NonNull
    public java.lang.String getProviderId() { return null; }
    @android.annotation.NonNull
    public java.lang.String getEntryKey() { return null; }
    @android.annotation.NonNull
    public java.lang.String getEntrySubkey() { return null; }
    @android.annotation.Nullable
    public android.credentials.selection.ProviderPendingIntentResponse getPendingIntentProviderResponse() { return null; }
    @android.annotation.NonNull
    android.credentials.selection.UserSelectionDialogResult toUserSelectionDialogResult() { return null; }
}

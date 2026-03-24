package android.credentials.selection;

@android.annotation.FlaggedApi("android.credentials.flags.propagate_user_context_for_intent_creation")
public class IntentFactory {
    @android.annotation.NonNull
    public static android.credentials.selection.IntentCreationResult createCredentialSelectorIntentForAutofill(android.content.Context p0, android.credentials.selection.RequestInfo p1, java.util.ArrayList<android.credentials.selection.DisabledProviderData> p2, android.os.ResultReceiver p3, int p4) { return null; }
    @android.annotation.NonNull
    public static android.credentials.selection.IntentCreationResult createCredentialSelectorIntentForCredMan(android.content.Context p0, android.credentials.selection.RequestInfo p1, java.util.ArrayList<android.credentials.selection.ProviderData> p2, java.util.ArrayList<android.credentials.selection.DisabledProviderData> p3, android.os.ResultReceiver p4, int p5) { return null; }
    @android.annotation.NonNull
    public static android.content.Intent createCredentialSelectorIntent(android.content.Context p0, android.credentials.selection.RequestInfo p1, java.util.ArrayList<android.credentials.selection.ProviderData> p2, java.util.ArrayList<android.credentials.selection.DisabledProviderData> p3, android.os.ResultReceiver p4, int p5) { return null; }
    @android.annotation.NonNull
    public static android.content.Intent createCancelUiIntent(android.content.Context p0, android.os.IBinder p1, boolean p2, java.lang.String p3, int p4) { return null; }
}

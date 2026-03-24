package android.view.textclassifier;

public final class ActionsSuggestionsHelper {
    private static final java.lang.String TAG = "ActionsSuggestions";
    private static final int USER_LOCAL = 0;
    private static final int FIRST_NON_LOCAL_USER = 1;
    private ActionsSuggestionsHelper() {}
    public static com.google.android.textclassifier.ActionsSuggestionsModel.ConversationMessage[] toNativeMessages(java.util.List<android.view.textclassifier.ConversationActions.Message> p0, java.util.function.Function<java.lang.CharSequence, java.lang.String> p1) { return null; }
    public static java.lang.String createResultId(android.content.Context p0, java.util.List<android.view.textclassifier.ConversationActions.Message> p1, int p2, java.util.List<java.util.Locale> p3) { return null; }
    public static android.view.textclassifier.intent.LabeledIntent.Result createLabeledIntentResult(android.content.Context p0, android.view.textclassifier.intent.TemplateIntentFactory p1, com.google.android.textclassifier.ActionsSuggestionsModel.ActionSuggestion p2) { return null; }
    public static android.view.textclassifier.intent.LabeledIntent.TitleChooser createTitleChooser(java.lang.String p0) { return null; }
    public static java.util.List<android.view.textclassifier.ConversationAction> removeActionsWithDuplicates(java.util.List<android.view.textclassifier.ConversationAction> p0) { return null; }
    private static android.util.Pair<java.lang.String, java.lang.String> getRepresentation(android.view.textclassifier.ConversationAction p0) { return null; }
    private static int hashMessage(android.view.textclassifier.ConversationActions.Message p0) { return 0; }

    private static final class PersonEncoder {
        private final java.util.Map<android.app.Person, java.lang.Integer> mMapping = null;
        private int mNextUserId;
        private PersonEncoder() {}
        private int encode(android.app.Person p0) { return 0; }
    }
}

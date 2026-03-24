package android.view.textclassifier;

public final class TextClassifierImpl implements android.view.textclassifier.TextClassifier {
    private static final java.lang.String LOG_TAG = "androidtc";
    private static final boolean DEBUG = false;
    private static final java.io.File FACTORY_MODEL_DIR = null;
    private static final java.lang.String ANNOTATOR_FACTORY_MODEL_FILENAME_REGEX = "textclassifier\\.(.*)\\.model";
    private static final java.io.File ANNOTATOR_UPDATED_MODEL_FILE = null;
    private static final java.lang.String LANG_ID_FACTORY_MODEL_FILENAME_REGEX = "lang_id.model";
    private static final java.io.File UPDATED_LANG_ID_MODEL_FILE = null;
    private static final java.lang.String ACTIONS_FACTORY_MODEL_FILENAME_REGEX = "actions_suggestions\\.(.*)\\.model";
    private static final java.io.File UPDATED_ACTIONS_MODEL = null;
    private final android.content.Context mContext = null;
    private final android.view.textclassifier.TextClassifier mFallback = null;
    private final android.view.textclassifier.GenerateLinksLogger mGenerateLinksLogger = null;
    private final java.lang.Object mLock = null;
    private android.view.textclassifier.ModelFileManager.ModelFile mAnnotatorModelInUse;
    private android.view.textclassifier.ModelFileManager.ModelFile mLangIdModelInUse;
    private android.view.textclassifier.ModelFileManager.ModelFile mActionModelInUse;
    private final android.view.textclassifier.SelectionSessionLogger mSessionLogger = null;
    private final android.view.textclassifier.TextClassifierEventTronLogger mTextClassifierEventTronLogger = null;
    private final android.view.textclassifier.TextClassificationConstants mSettings = null;
    private final android.view.textclassifier.ModelFileManager mAnnotatorModelFileManager = null;
    private final android.view.textclassifier.ModelFileManager mLangIdModelFileManager = null;
    private final android.view.textclassifier.ModelFileManager mActionsModelFileManager = null;
    private final android.view.textclassifier.intent.ClassificationIntentFactory mClassificationIntentFactory = null;
    private final android.view.textclassifier.intent.TemplateIntentFactory mTemplateIntentFactory = null;
    private final java.util.function.Supplier<android.view.textclassifier.ActionsModelParamsSupplier.ActionsModelParams> mActionsModelParamsSupplier = null;
    public TextClassifierImpl(android.content.Context p0, android.view.textclassifier.TextClassificationConstants p1, android.view.textclassifier.TextClassifier p2) {}
    public TextClassifierImpl(android.content.Context p0, android.view.textclassifier.TextClassificationConstants p1) {}
    public android.view.textclassifier.TextSelection suggestSelection(android.view.textclassifier.TextSelection.Request p0) { return null; }
    public android.view.textclassifier.TextClassification classifyText(android.view.textclassifier.TextClassification.Request p0) { return null; }
    public android.view.textclassifier.TextLinks generateLinks(android.view.textclassifier.TextLinks.Request p0) { return null; }
    public int getMaxGenerateLinksTextLength() { return 0; }
    private java.util.Collection<java.lang.String> getEntitiesForHints(java.util.Collection<java.lang.String> p0) { return null; }
    public void onSelectionEvent(android.view.textclassifier.SelectionEvent p0) {}
    public void onTextClassifierEvent(android.view.textclassifier.TextClassifierEvent p0) {}
    public android.view.textclassifier.TextLanguage detectLanguage(android.view.textclassifier.TextLanguage.Request p0) { return null; }
    public android.view.textclassifier.ConversationActions suggestConversationActions(android.view.textclassifier.ConversationActions.Request p0) { return null; }
    private android.view.textclassifier.ConversationActions createConversationActionResult(android.view.textclassifier.ConversationActions.Request p0, com.google.android.textclassifier.ActionsSuggestionsModel.ActionSuggestion[] p1) { return null; }
    private java.lang.String detectLanguageTagsFromText(java.lang.CharSequence p0) { return null; }
    private java.util.Collection<java.lang.String> resolveActionTypesFromRequest(android.view.textclassifier.ConversationActions.Request p0) { return null; }
    private com.google.android.textclassifier.AnnotatorModel getAnnotatorImpl(android.os.LocaleList p0) throws java.io.FileNotFoundException { return null; }
    private com.google.android.textclassifier.LangIdModel getLangIdImpl() throws java.io.FileNotFoundException { return null; }
    private com.google.android.textclassifier.ActionsSuggestionsModel getActionsImpl() throws java.io.FileNotFoundException { return null; }
    private java.lang.String createId(java.lang.String p0, int p1, int p2) { return null; }
    private static java.lang.String concatenateLocales(android.os.LocaleList p0) { return null; }
    private android.view.textclassifier.TextClassification createClassificationResult(com.google.android.textclassifier.AnnotatorModel.ClassificationResult[] p0, java.lang.String p1, int p2, int p3, java.time.Instant p4) { return null; }
    private android.util.Pair<android.os.Bundle, android.os.Bundle> generateLanguageBundles(java.lang.String p0, int p1, int p2) { return null; }
    private android.view.textclassifier.EntityConfidence detectLanguages(java.lang.String p0, int p1, int p2) throws java.io.FileNotFoundException { return null; }
    private android.view.textclassifier.EntityConfidence detectLanguages(java.lang.String p0) throws java.io.FileNotFoundException { return null; }
    private float getLangIdThreshold() { return 0.0f; }
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    private static void maybeCloseAndLogError(android.os.ParcelFileDescriptor p0) {}
    private java.lang.String getResourceLocalesString() { return null; }
}

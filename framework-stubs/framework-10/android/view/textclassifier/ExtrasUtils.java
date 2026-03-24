package android.view.textclassifier;

public final class ExtrasUtils {
    private static final java.lang.String SERIALIZED_ENTITIES_DATA = "serialized-entities-data";
    private static final java.lang.String ENTITIES_EXTRAS = "entities-extras";
    private static final java.lang.String ACTION_INTENT = "action-intent";
    private static final java.lang.String ACTIONS_INTENTS = "actions-intents";
    private static final java.lang.String FOREIGN_LANGUAGE = "foreign-language";
    private static final java.lang.String ENTITY_TYPE = "entity-type";
    private static final java.lang.String SCORE = "score";
    private static final java.lang.String MODEL_VERSION = "model-version";
    private static final java.lang.String MODEL_NAME = "model-name";
    private static final java.lang.String TEXT_LANGUAGES = "text-languages";
    private static final java.lang.String ENTITIES = "entities";
    private static final java.lang.String IS_SERIALIZED_ENTITY_DATA_ENABLED = "is-serialized-entity-data-enabled";
    private ExtrasUtils() {}
    static android.os.Bundle createForeignLanguageExtra(java.lang.String p0, float p1, int p2) { return null; }
    static void putForeignLanguageExtra(android.os.Bundle p0, android.os.Bundle p1) {}
    public static android.os.Bundle getForeignLanguageExtra(android.view.textclassifier.TextClassification p0) { return null; }
    static void putTopLanguageScores(android.os.Bundle p0, android.view.textclassifier.EntityConfidence p1) {}
    public static android.icu.util.ULocale getTopLanguage(android.content.Intent p0) { return null; }
    public static void putTextLanguagesExtra(android.os.Bundle p0, android.os.Bundle p1) {}
    static void putActionsIntents(android.os.Bundle p0, java.util.ArrayList<android.content.Intent> p1) {}
    public static void putActionIntent(android.os.Bundle p0, android.content.Intent p1) {}
    public static android.content.Intent getActionIntent(android.os.Bundle p0) { return null; }
    public static void putSerializedEntityData(android.os.Bundle p0, byte[] p1) {}
    public static byte[] getSerializedEntityData(android.os.Bundle p0) { return null; }
    public static void putEntitiesExtras(android.os.Bundle p0, android.os.Bundle p1) {}
    public static java.lang.String getCopyText(android.os.Bundle p0) { return null; }
    public static java.util.ArrayList<android.content.Intent> getActionsIntents(android.view.textclassifier.TextClassification p0) { return null; }
    public static android.app.RemoteAction findAction(android.view.textclassifier.TextClassification p0, java.lang.String p1) { return null; }
    public static android.app.RemoteAction findTranslateAction(android.view.textclassifier.TextClassification p0) { return null; }
    public static java.lang.String getEntityType(android.os.Bundle p0) { return null; }
    public static float getScore(android.os.Bundle p0) { return 0.0f; }
    public static java.lang.String getModelName(android.os.Bundle p0) { return null; }
    public static void putEntities(android.os.Bundle p0, com.google.android.textclassifier.AnnotatorModel.ClassificationResult[] p1) {}
    public static java.util.List<android.os.Bundle> getEntities(android.os.Bundle p0) { return null; }
    public static boolean isSerializedEntityDataEnabled(android.view.textclassifier.TextLinks.Request p0) { return false; }
    public static void putIsSerializedEntityDataEnabled(android.os.Bundle p0, boolean p1) {}
}

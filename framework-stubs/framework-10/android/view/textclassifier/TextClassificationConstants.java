package android.view.textclassifier;

public final class TextClassificationConstants {
    private static final java.lang.String SMART_LINKIFY_ENABLED = "smart_linkify_enabled";
    private static final java.lang.String SYSTEM_TEXT_CLASSIFIER_ENABLED = "system_textclassifier_enabled";
    private static final java.lang.String LOCAL_TEXT_CLASSIFIER_ENABLED = "local_textclassifier_enabled";
    private static final java.lang.String MODEL_DARK_LAUNCH_ENABLED = "model_dark_launch_enabled";
    private static final java.lang.String SMART_SELECTION_ENABLED = "smart_selection_enabled";
    private static final java.lang.String SMART_TEXT_SHARE_ENABLED = "smart_text_share_enabled";
    private static final java.lang.String SMART_SELECT_ANIMATION_ENABLED = "smart_select_animation_enabled";
    private static final java.lang.String SUGGEST_SELECTION_MAX_RANGE_LENGTH = "suggest_selection_max_range_length";
    private static final java.lang.String CLASSIFY_TEXT_MAX_RANGE_LENGTH = "classify_text_max_range_length";
    private static final java.lang.String GENERATE_LINKS_MAX_TEXT_LENGTH = "generate_links_max_text_length";
    private static final java.lang.String GENERATE_LINKS_LOG_SAMPLE_RATE = "generate_links_log_sample_rate";
    private static final java.lang.String ENTITY_LIST_DEFAULT = "entity_list_default";
    private static final java.lang.String ENTITY_LIST_NOT_EDITABLE = "entity_list_not_editable";
    private static final java.lang.String ENTITY_LIST_EDITABLE = "entity_list_editable";
    private static final java.lang.String IN_APP_CONVERSATION_ACTION_TYPES_DEFAULT = "in_app_conversation_action_types_default";
    private static final java.lang.String NOTIFICATION_CONVERSATION_ACTION_TYPES_DEFAULT = "notification_conversation_action_types_default";
    private static final java.lang.String LANG_ID_THRESHOLD_OVERRIDE = "lang_id_threshold_override";
    private static final java.lang.String TEMPLATE_INTENT_FACTORY_ENABLED = "template_intent_factory_enabled";
    private static final java.lang.String TRANSLATE_IN_CLASSIFICATION_ENABLED = "translate_in_classification_enabled";
    private static final java.lang.String DETECT_LANGUAGES_FROM_TEXT_ENABLED = "detect_languages_from_text_enabled";
    private static final java.lang.String LANG_ID_CONTEXT_SETTINGS = "lang_id_context_settings";
    private static final boolean LOCAL_TEXT_CLASSIFIER_ENABLED_DEFAULT = true;
    private static final boolean SYSTEM_TEXT_CLASSIFIER_ENABLED_DEFAULT = true;
    private static final boolean MODEL_DARK_LAUNCH_ENABLED_DEFAULT = false;
    private static final boolean SMART_SELECTION_ENABLED_DEFAULT = true;
    private static final boolean SMART_TEXT_SHARE_ENABLED_DEFAULT = true;
    private static final boolean SMART_LINKIFY_ENABLED_DEFAULT = true;
    private static final boolean SMART_SELECT_ANIMATION_ENABLED_DEFAULT = true;
    private static final int SUGGEST_SELECTION_MAX_RANGE_LENGTH_DEFAULT = 10000;
    private static final int CLASSIFY_TEXT_MAX_RANGE_LENGTH_DEFAULT = 10000;
    private static final int GENERATE_LINKS_MAX_TEXT_LENGTH_DEFAULT = 100000;
    private static final int GENERATE_LINKS_LOG_SAMPLE_RATE_DEFAULT = 100;
    private static final java.util.List<java.lang.String> ENTITY_LIST_DEFAULT_VALUE = null;
    private static final java.util.List<java.lang.String> CONVERSATION_ACTIONS_TYPES_DEFAULT_VALUES = null;
    private static final float LANG_ID_THRESHOLD_OVERRIDE_DEFAULT = -1.0f;
    private static final boolean TEMPLATE_INTENT_FACTORY_ENABLED_DEFAULT = true;
    private static final boolean TRANSLATE_IN_CLASSIFICATION_ENABLED_DEFAULT = true;
    private static final boolean DETECT_LANGUAGES_FROM_TEXT_ENABLED_DEFAULT = true;
    private static final float[] LANG_ID_CONTEXT_SETTINGS_DEFAULT = null;
    private final android.view.textclassifier.ConfigParser mConfigParser = null;
    public TextClassificationConstants(java.util.function.Supplier<java.lang.String> p0) {}
    public boolean isLocalTextClassifierEnabled() { return false; }
    public boolean isSystemTextClassifierEnabled() { return false; }
    public boolean isModelDarkLaunchEnabled() { return false; }
    public boolean isSmartSelectionEnabled() { return false; }
    public boolean isSmartTextShareEnabled() { return false; }
    public boolean isSmartLinkifyEnabled() { return false; }
    public boolean isSmartSelectionAnimationEnabled() { return false; }
    public int getSuggestSelectionMaxRangeLength() { return 0; }
    public int getClassifyTextMaxRangeLength() { return 0; }
    public int getGenerateLinksMaxTextLength() { return 0; }
    public int getGenerateLinksLogSampleRate() { return 0; }
    public java.util.List<java.lang.String> getEntityListDefault() { return null; }
    public java.util.List<java.lang.String> getEntityListNotEditable() { return null; }
    public java.util.List<java.lang.String> getEntityListEditable() { return null; }
    public java.util.List<java.lang.String> getInAppConversationActionTypes() { return null; }
    public java.util.List<java.lang.String> getNotificationConversationActionTypes() { return null; }
    public float getLangIdThresholdOverride() { return 0.0f; }
    public boolean isTemplateIntentFactoryEnabled() { return false; }
    public boolean isTranslateInClassificationEnabled() { return false; }
    public boolean isDetectLanguagesFromTextEnabled() { return false; }
    public float[] getLangIdContextSettings() { return null; }
    void dump(com.android.internal.util.IndentingPrintWriter p0) {}
}

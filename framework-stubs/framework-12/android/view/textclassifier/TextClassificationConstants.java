package android.view.textclassifier;

public final class TextClassificationConstants {
    private static final java.lang.String SMART_LINKIFY_ENABLED = "smart_linkify_enabled";
    static final java.lang.String SYSTEM_TEXT_CLASSIFIER_ENABLED = "system_textclassifier_enabled";
    static final java.lang.String LOCAL_TEXT_CLASSIFIER_ENABLED = "local_textclassifier_enabled";
    private static final java.lang.String MODEL_DARK_LAUNCH_ENABLED = "model_dark_launch_enabled";
    private static final java.lang.String SMART_SELECTION_ENABLED = "smart_selection_enabled";
    private static final java.lang.String SMART_TEXT_SHARE_ENABLED = "smart_text_share_enabled";
    private static final java.lang.String SMART_SELECT_ANIMATION_ENABLED = "smart_select_animation_enabled";
    static final java.lang.String GENERATE_LINKS_MAX_TEXT_LENGTH = "generate_links_max_text_length";
    static final java.lang.String TEXT_CLASSIFIER_SERVICE_PACKAGE_OVERRIDE = "textclassifier_service_package_override";
    static final java.lang.String SYSTEM_TEXT_CLASSIFIER_API_TIMEOUT_IN_SECOND = "system_textclassifier_api_timeout_in_second";
    private static final java.lang.String SMART_SELECTION_TRIM_DELTA = "smart_selection_trim_delta";
    private static final java.lang.String DEFAULT_TEXT_CLASSIFIER_SERVICE_PACKAGE_OVERRIDE = null;
    private static final boolean LOCAL_TEXT_CLASSIFIER_ENABLED_DEFAULT = true;
    private static final boolean SYSTEM_TEXT_CLASSIFIER_ENABLED_DEFAULT = true;
    private static final boolean MODEL_DARK_LAUNCH_ENABLED_DEFAULT = false;
    private static final boolean SMART_SELECTION_ENABLED_DEFAULT = true;
    private static final boolean SMART_TEXT_SHARE_ENABLED_DEFAULT = true;
    private static final boolean SMART_LINKIFY_ENABLED_DEFAULT = true;
    private static final boolean SMART_SELECT_ANIMATION_ENABLED_DEFAULT = true;
    private static final int GENERATE_LINKS_MAX_TEXT_LENGTH_DEFAULT = 100000;
    private static final long SYSTEM_TEXT_CLASSIFIER_API_TIMEOUT_IN_SECOND_DEFAULT = 60L;
    private static final int SMART_SELECTION_TRIM_DELTA_DEFAULT = 120;
    public TextClassificationConstants() {}
    public java.lang.String getTextClassifierServicePackageOverride() { return null; }
    public boolean isLocalTextClassifierEnabled() { return false; }
    public boolean isSystemTextClassifierEnabled() { return false; }
    public boolean isModelDarkLaunchEnabled() { return false; }
    public boolean isSmartSelectionEnabled() { return false; }
    public boolean isSmartTextShareEnabled() { return false; }
    public boolean isSmartLinkifyEnabled() { return false; }
    public boolean isSmartSelectionAnimationEnabled() { return false; }
    public int getGenerateLinksMaxTextLength() { return 0; }
    public long getSystemTextClassifierApiTimeoutInSecond() { return 0L; }
    public int getSmartSelectionTrimDelta() { return 0; }
    void dump(com.android.internal.util.IndentingPrintWriter p0) {}
}

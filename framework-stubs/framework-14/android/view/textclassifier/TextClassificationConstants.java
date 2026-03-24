package android.view.textclassifier;

public final class TextClassificationConstants {
    static final java.lang.String SYSTEM_TEXT_CLASSIFIER_ENABLED = "system_textclassifier_enabled";
    static final java.lang.String LOCAL_TEXT_CLASSIFIER_ENABLED = "local_textclassifier_enabled";
    static final java.lang.String GENERATE_LINKS_MAX_TEXT_LENGTH = "generate_links_max_text_length";
    static final java.lang.String TEXT_CLASSIFIER_SERVICE_PACKAGE_OVERRIDE = "textclassifier_service_package_override";
    static final java.lang.String SYSTEM_TEXT_CLASSIFIER_API_TIMEOUT_IN_SECOND = "system_textclassifier_api_timeout_in_second";
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

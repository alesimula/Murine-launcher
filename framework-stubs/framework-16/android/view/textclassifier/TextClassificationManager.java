package android.view.textclassifier;

public final class TextClassificationManager {
    public TextClassificationManager(android.content.Context p0) {}
    @android.annotation.NonNull
    public android.view.textclassifier.TextClassifier getTextClassifier() { return null; }
    public void setTextClassifier(android.view.textclassifier.TextClassifier p0) {}
    public android.view.textclassifier.TextClassifier getTextClassifier(int p0) { return null; }
    @android.annotation.SystemApi
    @android.annotation.NonNull
    @android.annotation.FlaggedApi("android.permission.flags.text_classifier_choice_api_enabled")
    @android.annotation.RequiresPermission("android.permission.ACCESS_TEXT_CLASSIFIER_BY_TYPE")
    public android.view.textclassifier.TextClassifier getClassifier(int p0) { return null; }
    @android.annotation.NonNull
    public android.view.textclassifier.TextClassifier createTextClassificationSession(android.view.textclassifier.TextClassificationContext p0) { return null; }
    public android.view.textclassifier.TextClassifier createTextClassificationSession(android.view.textclassifier.TextClassificationContext p0, android.view.textclassifier.TextClassifier p1) { return null; }
    public void setTextClassificationSessionFactory(android.view.textclassifier.TextClassificationSessionFactory p0) {}
    public void dump(com.android.internal.util.IndentingPrintWriter p0) {}
    public static android.view.textclassifier.TextClassificationConstants getSettings(android.content.Context p0) { return null; }
}

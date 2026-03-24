package android.view.textclassifier.intent;

public interface ClassificationIntentFactory {
    public java.util.List<android.view.textclassifier.intent.LabeledIntent> create(android.content.Context p0, java.lang.String p1, boolean p2, java.time.Instant p3, com.google.android.textclassifier.AnnotatorModel.ClassificationResult p4);
    public static void insertTranslateAction(java.util.List<android.view.textclassifier.intent.LabeledIntent> p0, android.content.Context p1, java.lang.String p2) {}
}

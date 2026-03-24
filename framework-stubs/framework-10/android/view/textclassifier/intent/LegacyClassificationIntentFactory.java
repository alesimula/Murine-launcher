package android.view.textclassifier.intent;

public final class LegacyClassificationIntentFactory implements android.view.textclassifier.intent.ClassificationIntentFactory {
    private static final java.lang.String TAG = "LegacyClassificationIntentFactory";
    private static final long MIN_EVENT_FUTURE_MILLIS = Long.valueOf(0L);
    private static final long DEFAULT_EVENT_DURATION = Long.valueOf(0L);
    public LegacyClassificationIntentFactory() {}
    public java.util.List<android.view.textclassifier.intent.LabeledIntent> create(android.content.Context p0, java.lang.String p1, boolean p2, java.time.Instant p3, com.google.android.textclassifier.AnnotatorModel.ClassificationResult p4) { return null; }
    private static java.util.List<android.view.textclassifier.intent.LabeledIntent> createForEmail(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.util.List<android.view.textclassifier.intent.LabeledIntent> createForPhone(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.util.List<android.view.textclassifier.intent.LabeledIntent> createForAddress(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.util.List<android.view.textclassifier.intent.LabeledIntent> createForUrl(android.content.Context p0, java.lang.String p1) { return null; }
    private static java.util.List<android.view.textclassifier.intent.LabeledIntent> createForDatetime(android.content.Context p0, java.lang.String p1, java.time.Instant p2, java.time.Instant p3) { return null; }
    private static java.util.List<android.view.textclassifier.intent.LabeledIntent> createForFlight(android.content.Context p0, java.lang.String p1) { return null; }
    private static android.view.textclassifier.intent.LabeledIntent createCalendarViewIntent(android.content.Context p0, java.time.Instant p1) { return null; }
    private static android.view.textclassifier.intent.LabeledIntent createCalendarCreateEventIntent(android.content.Context p0, java.time.Instant p1, java.lang.String p2) { return null; }
    private static java.util.List<android.view.textclassifier.intent.LabeledIntent> createForDictionary(android.content.Context p0, java.lang.String p1) { return null; }
}

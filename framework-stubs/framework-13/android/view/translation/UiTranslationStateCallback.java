package android.view.translation;

public interface UiTranslationStateCallback {
    @java.lang.Deprecated
    default public void onStarted(java.lang.String p0, java.lang.String p1) {}
    default public void onStarted(android.icu.util.ULocale p0, android.icu.util.ULocale p1) {}
    default public void onStarted(android.icu.util.ULocale p0, android.icu.util.ULocale p1, java.lang.String p2) {}
    public void onPaused();
    default public void onPaused(java.lang.String p0) {}
    default public void onResumed(android.icu.util.ULocale p0, android.icu.util.ULocale p1) {}
    default public void onResumed(android.icu.util.ULocale p0, android.icu.util.ULocale p1, java.lang.String p2) {}
    public void onFinished();
    default public void onFinished(java.lang.String p0) {}
}

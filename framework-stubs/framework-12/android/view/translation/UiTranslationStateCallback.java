package android.view.translation;

public interface UiTranslationStateCallback {
    @java.lang.Deprecated
    default public void onStarted(java.lang.String p0, java.lang.String p1) {}
    default public void onStarted(android.icu.util.ULocale p0, android.icu.util.ULocale p1) {}
    public void onPaused();
    default public void onResumed(android.icu.util.ULocale p0, android.icu.util.ULocale p1) {}
    public void onFinished();
}

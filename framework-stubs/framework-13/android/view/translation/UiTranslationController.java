package android.view.translation;

public class UiTranslationController implements android.util.Dumpable {
    public static final boolean DEBUG = Boolean.valueOf(false);
    public static final java.lang.String DUMPABLE_NAME = "UiTranslationController";
    public UiTranslationController(android.app.Activity p0, android.content.Context p1) {}
    public void updateUiTranslationState(int p0, android.view.translation.TranslationSpec p1, android.view.translation.TranslationSpec p2, java.util.List<android.view.autofill.AutofillId> p3, android.view.translation.UiTranslationSpec p4) {}
    public void onActivityDestroyed() {}
    public java.lang.String getDumpableName() { return null; }
    public void dump(java.io.PrintWriter p0, java.lang.String[] p1) {}
    public void onTranslationCompleted(android.view.translation.TranslationResponse p0) {}
    public static java.lang.String stateToString(int p0) { return null; }
}

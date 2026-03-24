package android.view.textclassifier.intent;

public final class LabeledIntent {
    private static final java.lang.String TAG = "LabeledIntent";
    public static final int DEFAULT_REQUEST_CODE = 0;
    private static final android.view.textclassifier.intent.LabeledIntent.TitleChooser DEFAULT_TITLE_CHOOSER = null;
    public final java.lang.String titleWithoutEntity = null;
    public final java.lang.String titleWithEntity = null;
    public final java.lang.String description = null;
    public final java.lang.String descriptionWithAppName = null;
    public final android.content.Intent intent = null;
    public final int requestCode = 0;
    public LabeledIntent(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, android.content.Intent p4, int p5) {}
    public android.view.textclassifier.intent.LabeledIntent.Result resolve(android.content.Context p0, android.view.textclassifier.intent.LabeledIntent.TitleChooser p1, android.os.Bundle p2) { return null; }
    private java.lang.String resolveDescription(android.content.pm.ResolveInfo p0, android.content.pm.PackageManager p1) { return null; }
    private java.lang.String getApplicationName(android.content.pm.ResolveInfo p0, android.content.pm.PackageManager p1) { return null; }
    private android.os.Bundle getFromTextClassifierExtra(android.os.Bundle p0) { return null; }

    public static interface TitleChooser {
        public java.lang.CharSequence chooseTitle(android.view.textclassifier.intent.LabeledIntent p0, android.content.pm.ResolveInfo p1);
    }

    public static final class Result {
        public final android.content.Intent resolvedIntent = null;
        public final android.app.RemoteAction remoteAction = null;
        public Result(android.content.Intent p0, android.app.RemoteAction p1) {}
    }
}

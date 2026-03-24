package android.view;

@android.annotation.FlaggedApi("android.view.flags.scroll_feedback_api")
public interface ScrollFeedbackProvider {
    @android.annotation.FlaggedApi("android.view.flags.scroll_feedback_api")
    @android.annotation.NonNull
    public static android.view.ScrollFeedbackProvider createProvider(android.view.View p0) { return null; }
    @android.annotation.FlaggedApi("android.view.flags.scroll_feedback_api")
    public void onSnapToItem(int p0, int p1, int p2);
    @android.annotation.FlaggedApi("android.view.flags.scroll_feedback_api")
    public void onScrollLimit(int p0, int p1, int p2, boolean p3);
    @android.annotation.FlaggedApi("android.view.flags.scroll_feedback_api")
    public void onScrollProgress(int p0, int p1, int p2, int p3);
}

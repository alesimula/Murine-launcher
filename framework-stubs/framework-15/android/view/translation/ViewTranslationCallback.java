package android.view.translation;

public interface ViewTranslationCallback {
    public boolean onShowTranslation(android.view.View p0);
    public boolean onHideTranslation(android.view.View p0);
    public boolean onClearTranslation(android.view.View p0);
    default public void enableContentPadding() {}
    default public void setAnimationDurationMillis(int p0) {}
}

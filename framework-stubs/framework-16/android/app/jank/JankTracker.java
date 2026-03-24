package android.app.jank;

@android.annotation.FlaggedApi("android.app.jank.detailed_app_jank_metrics_api")
public class JankTracker {
    public JankTracker(android.view.Choreographer p0, android.view.View p1) {}
    public JankTracker(android.view.View p0) {}
    public void mergeAppJankStats(android.app.jank.AppJankStats p0) {}
    public void setActivityName(java.lang.String p0) {}
    public void setAppUid(int p0) {}
    public void addUiState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void removeUiState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void updateUiState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public void enableAppJankTracking() {}
    public void disableAppJankTracking() {}
    public void getAllUiStates(java.util.ArrayList<android.app.jank.StateTracker.StateData> p0) {}
    public java.util.HashMap<java.lang.String, android.app.jank.JankDataProcessor.PendingJankStat> getPendingJankStats() { return null; }
    public void forceListenerRegistration() {}
    public boolean shouldTrack() { return false; }
}

package android.app.jank;

@android.annotation.FlaggedApi("android.app.jank.detailed_app_jank_metrics_api")
public class StateTracker {
    protected static final int MAX_CONCURRENT_STATE_COUNT = 25;
    protected static final int MAX_PREVIOUSLY_ACTIVE_STATE_COUNT = 1000;
    public StateTracker(android.view.Choreographer p0) {}
    public void updateState(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    public void removeState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void putState(java.lang.String p0, java.lang.String p1, java.lang.String p2) {}
    public void retrieveAllStates(java.util.ArrayList<android.app.jank.StateTracker.StateData> p0) {}
    public void stateProcessingComplete() {}
    public void addPendingStateData(java.util.List<android.app.jank.StateTracker.StateData> p0) {}
    public java.lang.String getStateKey(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return null; }

    public static class StateData {
        public java.lang.String mStateDataKey;
        public java.lang.String mWidgetCategory;
        public java.lang.String mWidgetState;
        public java.lang.String mWidgetId;
        public long mVsyncIdStart;
        public long mVsyncIdEnd;
        public boolean mProcessed;
        public StateData() {}
    }
}

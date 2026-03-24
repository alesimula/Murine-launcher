package android.app.jank;

@android.annotation.FlaggedApi("android.app.jank.detailed_app_jank_metrics_api")
public class JankDataProcessor {
    public JankDataProcessor(android.app.jank.StateTracker p0) {}
    public void processJankData(java.util.List<android.view.SurfaceControl.JankData> p0, java.lang.String p1, int p2) {}
    public void mergeJankStats(android.app.jank.AppJankStats p0, java.lang.String p1) {}
    public java.util.HashMap<java.lang.String, android.app.jank.JankDataProcessor.PendingJankStat> getPendingJankStats() { return null; }
    public void logMetricCounts() {}

    public static final class PendingJankStat {
        public long processedVsyncId;
        public PendingJankStat() {}
        public long getProcessedVsyncId() { return 0L; }
        public void setProcessedVsyncId(long p0) {}
        public int getUid() { return 0; }
        public void setUid(int p0) {}
        public java.lang.String getActivityName() { return null; }
        public void setActivityName(java.lang.String p0) {}
        public java.lang.String getWidgetId() { return null; }
        public void setWidgetId(java.lang.String p0) {}
        public java.lang.String getWidgetCategory() { return null; }
        public void setWidgetCategory(java.lang.String p0) {}
        public java.lang.String getWidgetState() { return null; }
        public void setWidgetState(java.lang.String p0) {}
        public long getTotalFrames() { return 0L; }
        public void setTotalFrames(long p0) {}
        public long getJankyFrames() { return 0L; }
        public void setJankyFrames(long p0) {}
        public int[] getFrameOverrunBuckets() { return null; }
        public int getRefreshRate() { return 0; }
        public void setRefreshRate(int p0) {}
        public void recordFrameOverrun(long p0) {}
        public void clearStats() {}
    }
}

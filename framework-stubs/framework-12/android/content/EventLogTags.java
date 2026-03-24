package android.content;

public class EventLogTags {
    public static final int CONTENT_QUERY_SAMPLE = 52002;
    public static final int CONTENT_UPDATE_SAMPLE = 52003;
    public static final int BINDER_SAMPLE = 52004;
    private EventLogTags() {}
    public static void writeContentQuerySample(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, int p4, java.lang.String p5, int p6) {}
    public static void writeContentUpdateSample(java.lang.String p0, java.lang.String p1, java.lang.String p2, int p3, java.lang.String p4, int p5) {}
    public static void writeBinderSample(java.lang.String p0, int p1, int p2, java.lang.String p3, int p4) {}
}

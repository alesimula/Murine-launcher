package android.view;

public final class FrameMetrics {
    public static final int UNKNOWN_DELAY_DURATION = 0;
    public static final int INPUT_HANDLING_DURATION = 1;
    public static final int ANIMATION_DURATION = 2;
    public static final int LAYOUT_MEASURE_DURATION = 3;
    public static final int DRAW_DURATION = 4;
    public static final int SYNC_DURATION = 5;
    public static final int COMMAND_ISSUE_DURATION = 6;
    public static final int SWAP_BUFFERS_DURATION = 7;
    public static final int TOTAL_DURATION = 8;
    public static final int FIRST_DRAW_FRAME = 9;
    public static final int INTENDED_VSYNC_TIMESTAMP = 10;
    public static final int VSYNC_TIMESTAMP = 11;
    private static final int FRAME_INFO_FLAG_FIRST_DRAW = 1;
    private static final int[] DURATIONS = null;
    final long[] mTimingData = null;
    public FrameMetrics(android.view.FrameMetrics p0) {}
    FrameMetrics() {}
    public long getMetric(int p0) { return 0L; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    private static @interface Index {
        public static final int FLAGS = 0;
        public static final int INTENDED_VSYNC = 1;
        public static final int VSYNC = 2;
        public static final int OLDEST_INPUT_EVENT = 3;
        public static final int NEWEST_INPUT_EVENT = 4;
        public static final int HANDLE_INPUT_START = 5;
        public static final int ANIMATION_START = 6;
        public static final int PERFORM_TRAVERSALS_START = 7;
        public static final int DRAW_START = 8;
        public static final int SYNC_QUEUED = 9;
        public static final int SYNC_START = 10;
        public static final int ISSUE_DRAW_COMMANDS_START = 11;
        public static final int SWAP_BUFFERS = 12;
        public static final int FRAME_COMPLETED = 13;
        public static final int FRAME_STATS_COUNT = 17;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Metric {
    }
}

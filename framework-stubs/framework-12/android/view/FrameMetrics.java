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
    public static final int GPU_DURATION = 12;
    public static final int DEADLINE = 13;
    private static final int[] DURATIONS = null;
    public final long[] mTimingData = null;
    public FrameMetrics(android.view.FrameMetrics p0) {}
    public FrameMetrics() {}
    public long getMetric(int p0) { return 0L; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Index {
        public static final int FLAGS = 0;
        public static final int FRAME_TIMELINE_VSYNC_ID = 1;
        public static final int INTENDED_VSYNC = 2;
        public static final int VSYNC = 3;
        public static final int INPUT_EVENT_ID = 4;
        public static final int HANDLE_INPUT_START = 5;
        public static final int ANIMATION_START = 6;
        public static final int PERFORM_TRAVERSALS_START = 7;
        public static final int DRAW_START = 8;
        public static final int FRAME_DEADLINE = 9;
        public static final int FRAME_START_TIME = 10;
        public static final int FRAME_INTERVAL = 11;
        public static final int SYNC_QUEUED = 12;
        public static final int SYNC_START = 13;
        public static final int ISSUE_DRAW_COMMANDS_START = 14;
        public static final int SWAP_BUFFERS = 15;
        public static final int FRAME_COMPLETED = 16;
        public static final int DEQUEUE_BUFFER_DURATION = 17;
        public static final int QUEUE_BUFFER_DURATION = 18;
        public static final int GPU_COMPLETED = 19;
        public static final int SWAP_BUFFERS_COMPLETED = 20;
        public static final int DISPLAY_PRESENT_TIME = 21;
        public static final int FRAME_STATS_COUNT = 22;
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Metric {
    }
}

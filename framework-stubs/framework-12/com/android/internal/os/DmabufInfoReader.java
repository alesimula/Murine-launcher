package com.android.internal.os;

public final class DmabufInfoReader {
    private DmabufInfoReader() {}
    public static native com.android.internal.os.DmabufInfoReader.ProcessDmabuf getProcessStats(int p0);

    public static final class ProcessDmabuf {
        public final int retainedSizeKb = 0;
        public final int retainedBuffersCount = 0;
        public final int mappedSizeKb = 0;
        public final int mappedBuffersCount = 0;
        ProcessDmabuf(int p0, int p1, int p2, int p3) {}
    }
}

package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class DvbsCodeRate {
    private final long mInnerFec = 0L;
    private final boolean mIsLinear = false;
    private final boolean mIsShortFrames = false;
    private final int mBitsPer1000Symbol = 0;
    private DvbsCodeRate(long p0, boolean p1, boolean p2, int p3) {}
    public long getInnerFec() { return 0L; }
    public boolean isLinear() { return false; }
    public boolean isShortFrameEnabled() { return false; }
    public int getBitsPer1000Symbol() { return 0; }
    public static android.media.tv.tuner.frontend.DvbsCodeRate.Builder builder() { return null; }

    public static class Builder {
        private long mFec;
        private boolean mIsLinear;
        private boolean mIsShortFrames;
        private int mBitsPer1000Symbol;
        private Builder() {}
        public android.media.tv.tuner.frontend.DvbsCodeRate.Builder setInnerFec(long p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsCodeRate.Builder setLinear(boolean p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsCodeRate.Builder setShortFrameEnabled(boolean p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsCodeRate.Builder setBitsPer1000Symbol(int p0) { return null; }
        public android.media.tv.tuner.frontend.DvbsCodeRate build() { return null; }
    }
}

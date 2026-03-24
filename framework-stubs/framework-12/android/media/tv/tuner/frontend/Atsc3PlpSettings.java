package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class Atsc3PlpSettings {
    private final int mPlpId = 0;
    private final int mModulation = 0;
    private final int mInterleaveMode = 0;
    private final int mCodeRate = 0;
    private final int mFec = 0;
    private Atsc3PlpSettings(int p0, int p1, int p2, int p3, int p4) {}
    public int getPlpId() { return 0; }
    public int getModulation() { return 0; }
    public int getInterleaveMode() { return 0; }
    public int getCodeRate() { return 0; }
    public int getFec() { return 0; }
    public static android.media.tv.tuner.frontend.Atsc3PlpSettings.Builder builder() { return null; }

    public static class Builder {
        private int mPlpId;
        private int mModulation;
        private int mInterleaveMode;
        private int mCodeRate;
        private int mFec;
        private Builder() {}
        public android.media.tv.tuner.frontend.Atsc3PlpSettings.Builder setPlpId(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3PlpSettings.Builder setModulation(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3PlpSettings.Builder setInterleaveMode(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3PlpSettings.Builder setCodeRate(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3PlpSettings.Builder setFec(int p0) { return null; }
        public android.media.tv.tuner.frontend.Atsc3PlpSettings build() { return null; }
    }
}

package android.media.tv.tuner.filter;

@android.annotation.SystemApi
public abstract class SectionSettings extends android.media.tv.tuner.filter.Settings {
    final boolean mCrcEnabled = false;
    final boolean mIsRepeat = false;
    final boolean mIsRaw = false;
    final int mBitWidthOfLengthField = 0;
    SectionSettings(int p0, boolean p1, boolean p2, boolean p3, int p4) { super(0); }
    public boolean isCrcEnabled() { return false; }
    public boolean isRepeat() { return false; }
    public boolean isRaw() { return false; }
    public int getLengthFieldBitWidth() { return 0; }

    public static abstract class Builder<T extends android.media.tv.tuner.filter.SectionSettings.Builder<T>> {
        final int mMainType = 0;
        boolean mCrcEnabled;
        boolean mIsRepeat;
        boolean mIsRaw;
        int mBitWidthOfLengthField;
        Builder(int p0) {}
        public T setCrcEnabled(boolean p0) { return null; }
        public T setRepeat(boolean p0) { return null; }
        public T setRaw(boolean p0) { return null; }
        public T setBitWidthOfLengthField(int p0) { return null; }
        abstract T self();
    }
}

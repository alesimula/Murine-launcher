package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public class AtscFrontendSettings extends android.media.tv.tuner.frontend.FrontendSettings {
    public static final int MODULATION_UNDEFINED = 0;
    public static final int MODULATION_AUTO = 1;
    public static final int MODULATION_MOD_8VSB = 4;
    public static final int MODULATION_MOD_16VSB = 8;
    AtscFrontendSettings() { super(0L); }
    public int getModulation() { return 0; }
    @android.annotation.NonNull
    public static android.media.tv.tuner.frontend.AtscFrontendSettings.Builder builder() { return null; }
    public int getType() { return 0; }

    public static class Builder {
        @java.lang.Deprecated
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.AtscFrontendSettings.Builder setFrequency(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.AtscFrontendSettings.Builder setFrequencyLong(long p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.AtscFrontendSettings.Builder setModulation(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.AtscFrontendSettings build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Modulation {
    }
}

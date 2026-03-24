package android.media.tv.tuner.frontend;

@android.annotation.SystemApi
public final class IptvFrontendSettingsFec {
    public static final int FEC_TYPE_UNDEFINED = 0;
    public static final int FEC_TYPE_COLUMN = 1;
    public static final int FEC_TYPE_ROW = 2;
    public static final int FEC_TYPE_COLUMN_ROW = 4;
    public int getFecType() { return 0; }
    public int getFecRowNum() { return 0; }
    public int getFecColNum() { return 0; }

    public static final class Builder {
        public Builder() {}
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec.Builder setFecType(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec.Builder setFecRowNum(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec.Builder setFecColNum(int p0) { return null; }
        @android.annotation.NonNull
        public android.media.tv.tuner.frontend.IptvFrontendSettingsFec build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface FecType {
    }
}

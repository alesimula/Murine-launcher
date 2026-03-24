package android.os;

@android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
public final class GpuHeadroomParams {
    public static final int GPU_HEADROOM_CALCULATION_TYPE_MIN = 0;
    public static final int GPU_HEADROOM_CALCULATION_TYPE_AVERAGE = 1;
    public static final int GPU_HEADROOM_CALCULATION_WINDOW_MILLIS_MIN = 50;
    public static final int GPU_HEADROOM_CALCULATION_WINDOW_MILLIS_MAX = 10000;
    public final android.os.GpuHeadroomParamsInternal mInternal = null;
    public int getCalculationType() { return 0; }
    public int getCalculationWindowMillis() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.os.GpuHeadroomParams p0) {}
        @android.annotation.NonNull
        public android.os.GpuHeadroomParams.Builder setCalculationType(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.GpuHeadroomParams.Builder setCalculationWindowMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.GpuHeadroomParams build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface GpuHeadroomCalculationType {
    }
}

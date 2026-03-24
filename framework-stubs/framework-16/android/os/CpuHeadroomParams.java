package android.os;

@android.annotation.FlaggedApi("android.os.cpu_gpu_headrooms")
public final class CpuHeadroomParams {
    public static final int CPU_HEADROOM_CALCULATION_TYPE_MIN = 0;
    public static final int CPU_HEADROOM_CALCULATION_TYPE_AVERAGE = 1;
    public final android.os.CpuHeadroomParamsInternal mInternal = null;
    @android.annotation.NonNull
    public android.os.CpuHeadroomParams.Builder toBuilder() { return null; }
    public int getCalculationType() { return 0; }
    public long getCalculationWindowMillis() { return 0L; }
    @android.annotation.NonNull
    public int[] getTids() { return null; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    public static final class Builder {
        public Builder() {}
        public Builder(android.os.CpuHeadroomParams p0) {}
        @android.annotation.NonNull
        public android.os.CpuHeadroomParams.Builder setCalculationType(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.CpuHeadroomParams.Builder setCalculationWindowMillis(int p0) { return null; }
        @android.annotation.NonNull
        public android.os.CpuHeadroomParams.Builder setTids(int... p0) { return null; }
        @android.annotation.NonNull
        public android.os.CpuHeadroomParams build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CpuHeadroomCalculationType {
    }
}

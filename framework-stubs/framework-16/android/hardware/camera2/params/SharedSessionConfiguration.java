package android.hardware.camera2.params;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("com.android.internal.camera.flags.camera_multi_client")
public final class SharedSessionConfiguration {
    public SharedSessionConfiguration(int p0, long[] p1) {}
    @android.annotation.SuppressLint("MethodNameUnits")
    @android.annotation.Nullable
    public android.graphics.ColorSpace getColorSpace() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.hardware.camera2.params.SharedSessionConfiguration.SharedOutputConfiguration> getOutputStreamsInformation() { return null; }

    public static final class SharedOutputConfiguration {
        public SharedOutputConfiguration(int p0, android.util.Size p1, int p2, int p3, boolean p4, int p5, int p6, long p7, long p8, java.lang.String p9) {}
        public int getSurfaceType() { return 0; }
        public int getFormat() { return 0; }
        @android.annotation.NonNull
        public android.util.Size getSize() { return null; }
        public int getDataspace() { return 0; }
        public int getMirrorMode() { return 0; }
        public long getStreamUseCase() { return 0L; }
        public int getTimestampBase() { return 0; }
        public boolean isReadoutTimestampEnabled() { return false; }
        public long getUsage() { return 0L; }
        @android.annotation.Nullable
        public java.lang.String getPhysicalCameraId() { return null; }
    }
}

package android.nearby;

public abstract class NearbyDevice {
    NearbyDevice() {}
    @android.annotation.NonNull
    public java.util.List<java.lang.Integer> getMediums() { return null; }
    @android.annotation.Nullable
    public java.lang.String getName() { return null; }
    public int getRssi() { return 0; }
    public static boolean isValidMedium(int p0) { return false; }
}

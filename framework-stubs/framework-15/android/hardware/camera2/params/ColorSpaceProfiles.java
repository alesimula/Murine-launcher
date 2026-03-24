package android.hardware.camera2.params;

public final class ColorSpaceProfiles {
    public static final int UNSPECIFIED = -1;
    public ColorSpaceProfiles(long[] p0) {}
    public static void checkProfileValue(int p0) {}
    @android.annotation.NonNull
    public java.util.Map<android.graphics.ColorSpace.Named, java.util.Map<java.lang.Integer, java.util.Set<java.lang.Long>>> getProfileMap() { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.graphics.ColorSpace.Named> getSupportedColorSpaces(int p0) { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Integer> getSupportedImageFormatsForColorSpace(android.graphics.ColorSpace.Named p0) { return null; }
    @android.annotation.NonNull
    public java.util.Set<java.lang.Long> getSupportedDynamicRangeProfiles(android.graphics.ColorSpace.Named p0, int p1) { return null; }
    @android.annotation.NonNull
    public java.util.Set<android.graphics.ColorSpace.Named> getSupportedColorSpacesForDynamicRange(int p0, long p1) { return null; }
}

package android.app;

public final class WallpaperColors implements android.os.Parcelable {
    private static final boolean DEBUG_DARK_PIXELS = false;
    @android.annotation.SystemApi
    public static final int HINT_SUPPORTS_DARK_TEXT = 1;
    @android.annotation.SystemApi
    public static final int HINT_SUPPORTS_DARK_THEME = 2;
    public static final int HINT_FROM_BITMAP = 4;
    private static final int MAX_BITMAP_SIZE = 112;
    private static final int MAX_WALLPAPER_EXTRACTION_AREA = 12544;
    private static final float MIN_COLOR_OCCURRENCE = 0.05000000074505806f;
    private static final float DARK_THEME_MEAN_LUMINANCE = 0.25f;
    private static final float BRIGHT_IMAGE_MEAN_LUMINANCE = 0.75f;
    private static final float DARK_PIXEL_CONTRAST = 6.0f;
    private static final float MAX_DARK_AREA = 0.02500000037252903f;
    private final java.util.ArrayList<android.graphics.Color> mMainColors = null;
    private int mColorHints;
    public static final android.os.Parcelable.Creator<android.app.WallpaperColors> CREATOR = null;
    public WallpaperColors(android.os.Parcel p0) {}
    public static android.app.WallpaperColors fromDrawable(android.graphics.drawable.Drawable p0) { return null; }
    public static android.app.WallpaperColors fromBitmap(android.graphics.Bitmap p0) { return null; }
    public WallpaperColors(android.graphics.Color p0, android.graphics.Color p1, android.graphics.Color p2) {}
    @android.annotation.SystemApi
    public WallpaperColors(android.graphics.Color p0, android.graphics.Color p1, android.graphics.Color p2, int p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public android.graphics.Color getPrimaryColor() { return null; }
    public android.graphics.Color getSecondaryColor() { return null; }
    public android.graphics.Color getTertiaryColor() { return null; }
    public java.util.List<android.graphics.Color> getMainColors() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.SystemApi
    public int getColorHints() { return 0; }
    public void setColorHints(int p0) {}
    private static int calculateDarkHints(android.graphics.Bitmap p0) { return 0; }
    private static android.util.Size calculateOptimalSize(int p0, int p1) { return null; }
    public java.lang.String toString() { return null; }
}

package android.app;

public final class WallpaperColors implements android.os.Parcelable {
    public static final int HINT_SUPPORTS_DARK_TEXT = 1;
    public static final int HINT_SUPPORTS_DARK_THEME = 2;
    public static final int HINT_FROM_BITMAP = 4;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.WallpaperColors> CREATOR = null;
    public WallpaperColors(android.os.Parcel p0) {}
    public static android.app.WallpaperColors fromDrawable(android.graphics.drawable.Drawable p0) { return null; }
    public static android.app.WallpaperColors fromBitmap(android.graphics.Bitmap p0) { return null; }
    public static android.app.WallpaperColors fromBitmap(android.graphics.Bitmap p0, float p1) { return null; }
    public WallpaperColors(android.graphics.Color p0, android.graphics.Color p1, android.graphics.Color p2) {}
    public WallpaperColors(android.graphics.Color p0, android.graphics.Color p1, android.graphics.Color p2, int p3) {}
    public WallpaperColors(java.util.Map<java.lang.Integer, java.lang.Integer> p0, int p1) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.graphics.Color getPrimaryColor() { return null; }
    @android.annotation.Nullable
    public android.graphics.Color getSecondaryColor() { return null; }
    @android.annotation.Nullable
    public android.graphics.Color getTertiaryColor() { return null; }
    @android.annotation.NonNull
    public java.util.List<android.graphics.Color> getMainColors() { return null; }
    @android.annotation.NonNull
    public java.util.Map<java.lang.Integer, java.lang.Integer> getAllColors() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public int getColorHints() { return 0; }
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ColorsHints {
    }
}

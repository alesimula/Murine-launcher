package android.graphics.drawable;

public final class Icon implements android.os.Parcelable {
    public static final int TYPE_BITMAP = 1;
    public static final int TYPE_RESOURCE = 2;
    public static final int TYPE_DATA = 3;
    public static final int TYPE_URI = 4;
    public static final int TYPE_ADAPTIVE_BITMAP = 5;
    public static final int TYPE_URI_ADAPTIVE_BITMAP = 6;
    static final android.graphics.BlendMode DEFAULT_BLEND_MODE = null;
    public static final int MIN_ASHMEM_ICON_SIZE = 131072;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.graphics.drawable.Icon> CREATOR = null;
    public int getType() { return 0; }
    public android.graphics.Bitmap getBitmap() { return null; }
    public int getDataLength() { return 0; }
    public int getDataOffset() { return 0; }
    public byte[] getDataBytes() { return null; }
    public android.content.res.Resources getResources() { return null; }
    @android.annotation.NonNull
    public java.lang.String getResPackage() { return null; }
    public int getResId() { return 0; }
    public java.lang.String getUriString() { return null; }
    @android.annotation.NonNull
    public android.net.Uri getUri() { return null; }
    public void loadDrawableAsync(android.content.Context p0, android.os.Message p1) {}
    public void loadDrawableAsync(android.content.Context p0, android.graphics.drawable.Icon.OnDrawableLoadedListener p1, android.os.Handler p2) {}
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable loadDrawable(android.content.Context p0) { return null; }
    public android.graphics.drawable.Drawable loadDrawableAsUser(android.content.Context p0, int p1) { return null; }
    @android.annotation.Nullable
    public android.graphics.drawable.Drawable loadDrawableCheckingUriGrant(android.content.Context p0, android.app.IUriGrantsManager p1, int p2, java.lang.String p3) { return null; }
    public void convertToAshmem() {}
    public void writeToStream(java.io.OutputStream p0) throws java.io.IOException {}
    @android.annotation.Nullable
    public static android.graphics.drawable.Icon createFromStream(java.io.InputStream p0) throws java.io.IOException { return null; }
    public boolean sameAs(android.graphics.drawable.Icon p0) { return false; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithResource(android.content.Context p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithResource(android.content.res.Resources p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithResource(java.lang.String p0, int p1) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithResourceAdaptiveDrawable(java.lang.String p0, int p1, boolean p2, float p3) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithBitmap(android.graphics.Bitmap p0) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithAdaptiveBitmap(android.graphics.Bitmap p0) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithData(byte[] p0, int p1, int p2) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithContentUri(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithContentUri(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(java.lang.String p0) { return null; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithAdaptiveBitmapContentUri(android.net.Uri p0) { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Icon setTint(int p0) { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Icon setTintList(android.content.res.ColorStateList p0) { return null; }
    @android.annotation.Nullable
    public android.content.res.ColorStateList getTintList() { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Icon setTintMode(android.graphics.PorterDuff.Mode p0) { return null; }
    @android.annotation.NonNull
    public android.graphics.drawable.Icon setTintBlendMode(android.graphics.BlendMode p0) { return null; }
    @android.annotation.NonNull
    public android.graphics.BlendMode getTintBlendMode() { return null; }
    public boolean hasTint() { return false; }
    @android.annotation.NonNull
    public static android.graphics.drawable.Icon createWithFilePath(java.lang.String p0) { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.graphics.Bitmap scaleDownIfNecessary(android.graphics.Bitmap p0, int p1, int p2) { return null; }
    public void scaleDownIfNecessary(int p0, int p1) {}

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IconType {
    }

    private class LoadDrawableTask implements java.lang.Runnable {
        final android.content.Context mContext = null;
        final android.os.Message mMessage = null;
        public LoadDrawableTask(android.graphics.drawable.Icon p0, android.content.Context p1, android.os.Handler p2, android.graphics.drawable.Icon.OnDrawableLoadedListener p3) {}
        public LoadDrawableTask(android.graphics.drawable.Icon p0, android.content.Context p1, android.os.Message p2) {}
        public void run() {}
        public void runAsync() {}
    }

    public static interface OnDrawableLoadedListener {
        public void onDrawableLoaded(android.graphics.drawable.Drawable p0);
    }
}

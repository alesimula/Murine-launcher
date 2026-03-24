package android.app.wallpapereffectsgeneration;

@android.annotation.SystemApi
public final class TexturedMesh implements android.os.Parcelable {
    public static final int INDICES_LAYOUT_UNDEFINED = 0;
    public static final int INDICES_LAYOUT_TRIANGLES = 1;
    public static final int VERTICES_LAYOUT_UNDEFINED = 0;
    public static final int VERTICES_LAYOUT_POSITION3_UV2 = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.wallpapereffectsgeneration.TexturedMesh> CREATOR = null;
    @android.annotation.NonNull
    public android.graphics.Bitmap getBitmap() { return null; }
    @android.annotation.NonNull
    public int[] getIndices() { return null; }
    @android.annotation.NonNull
    public float[] getVertices() { return null; }
    @android.annotation.NonNull
    public int getIndicesLayoutType() { return 0; }
    @android.annotation.NonNull
    public int getVerticesLayoutType() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }

    @android.annotation.SystemApi
    public static final class Builder {
        @android.annotation.SystemApi
        public Builder(android.graphics.Bitmap p0) {}
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.TexturedMesh.Builder setIndices(int[] p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.TexturedMesh.Builder setVertices(float[] p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.TexturedMesh.Builder setIndicesLayoutType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.TexturedMesh.Builder setVerticesLayoutType(int p0) { return null; }
        @android.annotation.NonNull
        public android.app.wallpapereffectsgeneration.TexturedMesh build() { return null; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface IndicesLayoutType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface VerticesLayoutType {
    }
}

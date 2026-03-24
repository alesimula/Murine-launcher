package android.app.appsearch;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_schema_embedding_property_config")
public final class EmbeddingVector implements android.os.Parcelable {
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.app.appsearch.EmbeddingVector> CREATOR = null;
    public EmbeddingVector(float[] p0, java.lang.String p1) {}
    @android.annotation.FlaggedApi("com.android.appsearch.flags.enable_safe_parcelable_2")
    public final int describeContents() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getModelSignature() { return null; }
    @android.annotation.NonNull
    public float[] getValues() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

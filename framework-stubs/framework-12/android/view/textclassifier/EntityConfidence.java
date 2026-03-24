package android.view.textclassifier;

final class EntityConfidence implements android.os.Parcelable {
    private final android.util.ArrayMap<java.lang.String, java.lang.Float> mEntityConfidence = null;
    private final java.util.ArrayList<java.lang.String> mSortedEntities = null;
    public static final android.os.Parcelable.Creator<android.view.textclassifier.EntityConfidence> CREATOR = null;
    EntityConfidence() {}
    EntityConfidence(android.view.textclassifier.EntityConfidence p0) {}
    EntityConfidence(java.util.Map<java.lang.String, java.lang.Float> p0) {}
    public java.util.List<java.lang.String> getEntities() { return null; }
    public float getConfidenceScore(java.lang.String p0) { return 0.0f; }
    public java.util.Map<java.lang.String, java.lang.Float> toMap() { return null; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private EntityConfidence(android.os.Parcel p0) {}
    private void resetSortedEntitiesFromMap() {}
}

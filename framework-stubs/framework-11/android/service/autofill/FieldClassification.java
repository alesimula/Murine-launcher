package android.service.autofill;

public final class FieldClassification {
    private final java.util.ArrayList<android.service.autofill.FieldClassification.Match> mMatches = null;
    public FieldClassification(java.util.ArrayList<android.service.autofill.FieldClassification.Match> p0) {}
    public java.util.List<android.service.autofill.FieldClassification.Match> getMatches() { return null; }
    public java.lang.String toString() { return null; }
    private void writeToParcel(android.os.Parcel p0) {}
    private static android.service.autofill.FieldClassification readFromParcel(android.os.Parcel p0) { return null; }
    static android.service.autofill.FieldClassification[] readArrayFromParcel(android.os.Parcel p0) { return null; }
    static void writeArrayToParcel(android.os.Parcel p0, android.service.autofill.FieldClassification[] p1) {}

    public static final class Match {
        private final java.lang.String mCategoryId = null;
        private final float mScore = 0.0f;
        public Match(java.lang.String p0, float p1) {}
        public java.lang.String getCategoryId() { return null; }
        public float getScore() { return 0.0f; }
        public java.lang.String toString() { return null; }
        private void writeToParcel(android.os.Parcel p0) {}
        private static android.service.autofill.FieldClassification.Match readFromParcel(android.os.Parcel p0) { return null; }
    }
}

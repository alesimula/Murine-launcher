package android.service.autofill;

public final class FieldClassification {
    public FieldClassification(java.util.ArrayList<android.service.autofill.FieldClassification.Match> p0) {}
    public java.util.List<android.service.autofill.FieldClassification.Match> getMatches() { return null; }
    public java.lang.String toString() { return null; }
    static android.service.autofill.FieldClassification[] readArrayFromParcel(android.os.Parcel p0) { return null; }
    static void writeArrayToParcel(android.os.Parcel p0, android.service.autofill.FieldClassification[] p1) {}

    public static final class Match {
        public Match(java.lang.String p0, float p1) {}
        public java.lang.String getCategoryId() { return null; }
        public float getScore() { return 0.0f; }
        public java.lang.String toString() { return null; }
    }
}

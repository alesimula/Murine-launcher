package android.content.integrity;

@android.annotation.SystemApi
public final class Rule implements android.os.Parcelable {
    public static final int DENY = 0;
    public static final int FORCE_ALLOW = 1;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.content.integrity.Rule> CREATOR = null;
    public Rule(android.content.integrity.IntegrityFormula p0, int p1) {}
    Rule(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    @android.annotation.NonNull
    public android.content.integrity.IntegrityFormula getFormula() { return null; }
    public int getEffect() { return 0; }
    public java.lang.String toString() { return null; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Effect {
    }
}

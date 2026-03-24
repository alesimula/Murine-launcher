package android.net;

@java.lang.Deprecated
@android.annotation.SystemApi
public class ScoredNetwork implements android.os.Parcelable {
    public static final java.lang.String ATTRIBUTES_KEY_BADGING_CURVE = "android.net.attributes.key.BADGING_CURVE";
    public static final java.lang.String ATTRIBUTES_KEY_HAS_CAPTIVE_PORTAL = "android.net.attributes.key.HAS_CAPTIVE_PORTAL";
    public static final java.lang.String ATTRIBUTES_KEY_RANKING_SCORE_OFFSET = "android.net.attributes.key.RANKING_SCORE_OFFSET";
    public final android.net.NetworkKey networkKey = null;
    public final android.net.RssiCurve rssiCurve = null;
    public final boolean meteredHint = false;
    @android.annotation.Nullable
    public final android.os.Bundle attributes = null;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.net.ScoredNetwork> CREATOR = null;
    public ScoredNetwork(android.net.NetworkKey p0, android.net.RssiCurve p1) {}
    public ScoredNetwork(android.net.NetworkKey p0, android.net.RssiCurve p1, boolean p2) {}
    public ScoredNetwork(android.net.NetworkKey p0, android.net.RssiCurve p1, boolean p2, android.os.Bundle p3) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }
    public boolean hasRankingScore() { return false; }
    public int calculateRankingScore(int p0) throws java.lang.UnsupportedOperationException { return 0; }
    public int calculateBadge(int p0) { return 0; }
}

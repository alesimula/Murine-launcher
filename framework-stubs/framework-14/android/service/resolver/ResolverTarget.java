package android.service.resolver;

@android.annotation.SystemApi
public final class ResolverTarget implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.service.resolver.ResolverTarget> CREATOR = null;
    public ResolverTarget() {}
    ResolverTarget(android.os.Parcel p0) {}
    public float getRecencyScore() { return 0.0f; }
    public void setRecencyScore(float p0) {}
    public float getTimeSpentScore() { return 0.0f; }
    public void setTimeSpentScore(float p0) {}
    public float getLaunchScore() { return 0.0f; }
    public void setLaunchScore(float p0) {}
    public float getChooserScore() { return 0.0f; }
    public void setChooserScore(float p0) {}
    public float getSelectProbability() { return 0.0f; }
    public void setSelectProbability(float p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
}

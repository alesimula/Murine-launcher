package android.media.audiopolicy;

public class AudioPolicyConfig implements android.os.Parcelable {
    protected final java.util.ArrayList<android.media.audiopolicy.AudioMix> mMixes = null;
    protected int mDuckingPolicy;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.media.audiopolicy.AudioPolicyConfig> CREATOR = null;
    protected AudioPolicyConfig(android.media.audiopolicy.AudioPolicyConfig p0) {}
    public AudioPolicyConfig(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0) {}
    public void addMix(android.media.audiopolicy.AudioMix p0) throws java.lang.IllegalArgumentException {}
    public java.util.ArrayList<android.media.audiopolicy.AudioMix> getMixes() { return null; }
    public int hashCode() { return 0; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public java.lang.String toLogFriendlyString() { return null; }
    public java.lang.String toCompactLogString() { return null; }
    protected void reset() {}
    protected void setRegistration(java.lang.String p0) {}
    protected void setMixRegistration(android.media.audiopolicy.AudioMix p0) {}
    protected void add(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0) {}
    protected void remove(java.util.ArrayList<android.media.audiopolicy.AudioMix> p0) {}
    public void updateMixingRules(java.util.List<android.util.Pair<android.media.audiopolicy.AudioMix, android.media.audiopolicy.AudioMixingRule>> p0) {}
    protected java.lang.String getRegistration() { return null; }
}

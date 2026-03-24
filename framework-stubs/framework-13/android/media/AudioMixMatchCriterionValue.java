package android.media;

public final class AudioMixMatchCriterionValue implements android.os.Parcelable {
    public static final int usage = 0;
    public static final int source = 1;
    public static final int uid = 2;
    public static final int userId = 3;
    public static final android.os.Parcelable.Creator<android.media.AudioMixMatchCriterionValue> CREATOR = null;
    public AudioMixMatchCriterionValue() {}
    public int getTag() { return 0; }
    public static android.media.AudioMixMatchCriterionValue usage(int p0) { return null; }
    public int getUsage() { return 0; }
    public void setUsage(int p0) {}
    public static android.media.AudioMixMatchCriterionValue source(int p0) { return null; }
    public int getSource() { return 0; }
    public void setSource(int p0) {}
    public static android.media.AudioMixMatchCriterionValue uid(int p0) { return null; }
    public int getUid() { return 0; }
    public void setUid(int p0) {}
    public static android.media.AudioMixMatchCriterionValue userId(int p0) { return null; }
    public int getUserId() { return 0; }
    public void setUserId(int p0) {}
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }

    public static @interface Tag {
        public static final int usage = 0;
        public static final int source = 1;
        public static final int uid = 2;
        public static final int userId = 3;
    }
}

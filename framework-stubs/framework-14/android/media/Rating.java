package android.media;

public final class Rating implements android.os.Parcelable {
    public static final int RATING_NONE = 0;
    public static final int RATING_HEART = 1;
    public static final int RATING_THUMB_UP_DOWN = 2;
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_PERCENTAGE = 6;
    public static final android.os.Parcelable.Creator<android.media.Rating> CREATOR = null;
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public static android.media.Rating newUnratedRating(int p0) { return null; }
    public static android.media.Rating newHeartRating(boolean p0) { return null; }
    public static android.media.Rating newThumbRating(boolean p0) { return null; }
    public static android.media.Rating newStarRating(int p0, float p1) { return null; }
    public static android.media.Rating newPercentageRating(float p0) { return null; }
    public boolean isRated() { return false; }
    public int getRatingStyle() { return 0; }
    public boolean hasHeart() { return false; }
    public boolean isThumbUp() { return false; }
    public float getStarRating() { return 0.0f; }
    public float getPercentRating() { return 0.0f; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface StarStyle {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Style {
    }
}

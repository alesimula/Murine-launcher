package android.telephony;

@android.annotation.SystemApi
public final class SmsCbCmasInfo implements android.os.Parcelable {
    public static final int CMAS_CLASS_PRESIDENTIAL_LEVEL_ALERT = 0;
    public static final int CMAS_CLASS_EXTREME_THREAT = 1;
    public static final int CMAS_CLASS_SEVERE_THREAT = 2;
    public static final int CMAS_CLASS_CHILD_ABDUCTION_EMERGENCY = 3;
    public static final int CMAS_CLASS_REQUIRED_MONTHLY_TEST = 4;
    public static final int CMAS_CLASS_CMAS_EXERCISE = 5;
    public static final int CMAS_CLASS_OPERATOR_DEFINED_USE = 6;
    public static final int CMAS_CLASS_UNKNOWN = -1;
    public static final int CMAS_CATEGORY_GEO = 0;
    public static final int CMAS_CATEGORY_MET = 1;
    public static final int CMAS_CATEGORY_SAFETY = 2;
    public static final int CMAS_CATEGORY_SECURITY = 3;
    public static final int CMAS_CATEGORY_RESCUE = 4;
    public static final int CMAS_CATEGORY_FIRE = 5;
    public static final int CMAS_CATEGORY_HEALTH = 6;
    public static final int CMAS_CATEGORY_ENV = 7;
    public static final int CMAS_CATEGORY_TRANSPORT = 8;
    public static final int CMAS_CATEGORY_INFRA = 9;
    public static final int CMAS_CATEGORY_CBRNE = 10;
    public static final int CMAS_CATEGORY_OTHER = 11;
    public static final int CMAS_CATEGORY_UNKNOWN = -1;
    public static final int CMAS_RESPONSE_TYPE_SHELTER = 0;
    public static final int CMAS_RESPONSE_TYPE_EVACUATE = 1;
    public static final int CMAS_RESPONSE_TYPE_PREPARE = 2;
    public static final int CMAS_RESPONSE_TYPE_EXECUTE = 3;
    public static final int CMAS_RESPONSE_TYPE_MONITOR = 4;
    public static final int CMAS_RESPONSE_TYPE_AVOID = 5;
    public static final int CMAS_RESPONSE_TYPE_ASSESS = 6;
    public static final int CMAS_RESPONSE_TYPE_NONE = 7;
    public static final int CMAS_RESPONSE_TYPE_UNKNOWN = -1;
    public static final int CMAS_SEVERITY_EXTREME = 0;
    public static final int CMAS_SEVERITY_SEVERE = 1;
    public static final int CMAS_SEVERITY_UNKNOWN = -1;
    public static final int CMAS_URGENCY_IMMEDIATE = 0;
    public static final int CMAS_URGENCY_EXPECTED = 1;
    public static final int CMAS_URGENCY_UNKNOWN = -1;
    public static final int CMAS_CERTAINTY_OBSERVED = 0;
    public static final int CMAS_CERTAINTY_LIKELY = 1;
    public static final int CMAS_CERTAINTY_UNKNOWN = -1;
    public static final android.os.Parcelable.Creator<android.telephony.SmsCbCmasInfo> CREATOR = null;
    public SmsCbCmasInfo(int p0, int p1, int p2, int p3, int p4, int p5) {}
    SmsCbCmasInfo(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getMessageClass() { return 0; }
    public int getCategory() { return 0; }
    public int getResponseType() { return 0; }
    public int getSeverity() { return 0; }
    public int getUrgency() { return 0; }
    public int getCertainty() { return 0; }
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Category {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Certainty {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Class {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface ResponseType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Severity {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface Urgency {
    }
}

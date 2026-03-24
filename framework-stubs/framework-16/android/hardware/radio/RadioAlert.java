package android.hardware.radio;

@android.annotation.SystemApi
@android.annotation.FlaggedApi("android.hardware.radio.hd_radio_emergency_alert_system")
public final class RadioAlert implements android.os.Parcelable {
    public static final int STATUS_ACTUAL = 0;
    public static final int STATUS_EXERCISE = 1;
    public static final int STATUS_TEST = 2;
    public static final int MESSAGE_TYPE_ALERT = 0;
    public static final int MESSAGE_TYPE_UPDATE = 1;
    public static final int MESSAGE_TYPE_CANCEL = 2;
    public static final int CATEGORY_GEO = 0;
    public static final int CATEGORY_MET = 1;
    public static final int CATEGORY_SAFETY = 2;
    public static final int CATEGORY_SECURITY = 3;
    public static final int CATEGORY_RESCUE = 4;
    public static final int CATEGORY_FIRE = 5;
    public static final int CATEGORY_HEALTH = 6;
    public static final int CATEGORY_ENV = 7;
    public static final int CATEGORY_TRANSPORT = 8;
    public static final int CATEGORY_INFRA = 9;
    public static final int CATEGORY_CBRNE = 10;
    public static final int CATEGORY_OTHER = 11;
    public static final int URGENCY_IMMEDIATE = 0;
    public static final int URGENCY_EXPECTED = 1;
    public static final int URGENCY_FUTURE = 2;
    public static final int URGENCY_PAST = 3;
    public static final int URGENCY_UNKNOWN = 4;
    public static final int SEVERITY_EXTREME = 0;
    public static final int SEVERITY_SEVERE = 1;
    public static final int SEVERITY_MODERATE = 2;
    public static final int SEVERITY_MINOR = 3;
    public static final int SEVERITY_UNKNOWN = 4;
    public static final int CERTAINTY_OBSERVED = 0;
    public static final int CERTAINTY_LIKELY = 1;
    public static final int CERTAINTY_POSSIBLE = 2;
    public static final int CERTAINTY_UNLIKELY = 3;
    public static final int CERTAINTY_UNKNOWN = 4;
    public static final android.os.Parcelable.Creator<android.hardware.radio.RadioAlert> CREATOR = null;
    public RadioAlert(int p0, int p1, java.util.List<android.hardware.radio.RadioAlert.AlertInfo> p2) {}
    public int getStatus() { return 0; }
    public int getMessageType() { return 0; }
    public java.util.List<android.hardware.radio.RadioAlert.AlertInfo> getInfoList() { return null; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public java.lang.String toString() { return null; }
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }

    public static final class AlertArea implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioAlert.AlertArea> CREATOR = null;
        public AlertArea(java.util.List<android.hardware.radio.RadioAlert.Polygon> p0, java.util.List<android.hardware.radio.RadioAlert.Geocode> p1) {}
        public java.util.List<android.hardware.radio.RadioAlert.Polygon> getPolygons() { return null; }
        public java.util.List<android.hardware.radio.RadioAlert.Geocode> getGeocodes() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertCategory {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertCertainty {
    }

    public static final class AlertInfo implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioAlert.AlertInfo> CREATOR = null;
        public AlertInfo(int[] p0, int p1, int p2, int p3, java.lang.String p4, java.util.List<android.hardware.radio.RadioAlert.AlertArea> p5, java.lang.String p6) {}
        public int[] getCategories() { return null; }
        public int getUrgency() { return 0; }
        public int getSeverity() { return 0; }
        public int getCertainty() { return 0; }
        public java.lang.String getDescription() { return null; }
        public java.util.List<android.hardware.radio.RadioAlert.AlertArea> getAreas() { return null; }
        @android.annotation.Nullable
        public java.lang.String getLanguage() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertMessageType {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertSeverity {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertStatus {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface AlertUrgency {
    }

    public static final class Coordinate implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioAlert.Coordinate> CREATOR = null;
        public Coordinate(double p0, double p1) {}
        public double getLatitude() { return 0.0; }
        public double getLongitude() { return 0.0; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static final class Geocode implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioAlert.Geocode> CREATOR = null;
        public Geocode(java.lang.String p0, java.lang.String p1) {}
        public java.lang.String getValueName() { return null; }
        public java.lang.String getValue() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static final class Polygon implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<android.hardware.radio.RadioAlert.Polygon> CREATOR = null;
        public Polygon(java.util.List<android.hardware.radio.RadioAlert.Coordinate> p0) {}
        public java.util.List<android.hardware.radio.RadioAlert.Coordinate> getCoordinates() { return null; }
        public int describeContents() { return 0; }
        public void writeToParcel(android.os.Parcel p0, int p1) {}
        public java.lang.String toString() { return null; }
        public int hashCode() { return 0; }
        public boolean equals(java.lang.Object p0) { return false; }
    }
}

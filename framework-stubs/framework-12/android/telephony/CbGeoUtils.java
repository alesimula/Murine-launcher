package android.telephony;

@android.annotation.SystemApi
public class CbGeoUtils {
    public static final double EPS = 1e-07;
    public static final int EARTH_RADIUS_METER = 6371000;
    private static final java.lang.String TAG = "CbGeoUtils";
    public static final int GEO_FENCING_MAXIMUM_WAIT_TIME = 1;
    public static final int GEOMETRY_TYPE_POLYGON = 2;
    public static final int GEOMETRY_TYPE_CIRCLE = 3;
    private static final java.lang.String CIRCLE_SYMBOL = "circle";
    private static final java.lang.String POLYGON_SYMBOL = "polygon";
    private CbGeoUtils() {}
    public static java.util.List<android.telephony.CbGeoUtils.Geometry> parseGeometriesFromString(java.lang.String p0) { return null; }
    public static java.lang.String encodeGeometriesToString(java.util.List<android.telephony.CbGeoUtils.Geometry> p0) { return null; }
    private static java.lang.String encodeGeometryToString(android.telephony.CbGeoUtils.Geometry p0) { return null; }
    public static android.telephony.CbGeoUtils.LatLng parseLatLngFromString(java.lang.String p0) { return null; }
    public static int sign(double p0) { return 0; }

    public static class Circle implements android.telephony.CbGeoUtils.Geometry {
        private final android.telephony.CbGeoUtils.LatLng mCenter = null;
        private final double mRadiusMeter = 0.0;
        public Circle(android.telephony.CbGeoUtils.LatLng p0, double p1) {}
        public android.telephony.CbGeoUtils.LatLng getCenter() { return null; }
        public double getRadius() { return 0.0; }
        public boolean contains(android.telephony.CbGeoUtils.LatLng p0) { return false; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static interface Geometry {
        public boolean contains(android.telephony.CbGeoUtils.LatLng p0);
    }

    public static class LatLng {
        public final double lat = 0.0;
        public final double lng = 0.0;
        public LatLng(double p0, double p1) {}
        public android.telephony.CbGeoUtils.LatLng subtract(android.telephony.CbGeoUtils.LatLng p0) { return null; }
        public double distance(android.telephony.CbGeoUtils.LatLng p0) { return 0.0; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }
    }

    public static class Polygon implements android.telephony.CbGeoUtils.Geometry {
        private static final double SCALE = 1000.0;
        private final java.util.List<android.telephony.CbGeoUtils.LatLng> mVertices = null;
        private final java.util.List<android.telephony.CbGeoUtils.Polygon.Point> mScaledVertices = null;
        private final android.telephony.CbGeoUtils.LatLng mOrigin = null;
        public Polygon(java.util.List<android.telephony.CbGeoUtils.LatLng> p0) {}
        public java.util.List<android.telephony.CbGeoUtils.LatLng> getVertices() { return null; }
        public boolean contains(android.telephony.CbGeoUtils.LatLng p0) { return false; }
        private android.telephony.CbGeoUtils.Polygon.Point convertAndScaleLatLng(android.telephony.CbGeoUtils.LatLng p0) { return null; }
        private static double crossProduct(android.telephony.CbGeoUtils.Polygon.Point p0, android.telephony.CbGeoUtils.Polygon.Point p1) { return 0.0; }
        public java.lang.String toString() { return null; }
        public boolean equals(java.lang.Object p0) { return false; }

        static final class Point {
            public final double x = 0.0;
            public final double y = 0.0;
            Point(double p0, double p1) {}
            public android.telephony.CbGeoUtils.Polygon.Point subtract(android.telephony.CbGeoUtils.Polygon.Point p0) { return null; }
        }
    }
}

package android.service.autofill;

public abstract class InternalTransformation implements android.service.autofill.Transformation, android.os.Parcelable {
    public InternalTransformation() {}
    abstract void apply(android.service.autofill.ValueFinder p0, android.widget.RemoteViews p1, int p2) throws java.lang.Exception;
    public static boolean batchApply(android.service.autofill.ValueFinder p0, android.widget.RemoteViews p1, java.util.ArrayList<android.util.Pair<java.lang.Integer, android.service.autofill.InternalTransformation>> p2) { return false; }
}

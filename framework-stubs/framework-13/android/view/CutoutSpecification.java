package android.view;

public class CutoutSpecification {
    public android.graphics.Path getPath() { return null; }
    public android.graphics.Rect getLeftBound() { return null; }
    public android.graphics.Rect getTopBound() { return null; }
    public android.graphics.Rect getRightBound() { return null; }
    public android.graphics.Rect getBottomBound() { return null; }
    public android.graphics.Rect getSafeInset() { return null; }

    public static class Parser {
        public Parser(float p0, int p1, int p2) {}
        Parser(float p0, int p1, int p2, float p3) {}
        public android.view.CutoutSpecification parse(java.lang.String p0) { return null; }
    }
}

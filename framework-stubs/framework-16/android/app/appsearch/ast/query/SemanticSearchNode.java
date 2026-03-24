package android.app.appsearch.ast.query;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_abstract_syntax_trees")
public final class SemanticSearchNode implements android.app.appsearch.ast.FunctionNode {
    public SemanticSearchNode(int p0) {}
    public SemanticSearchNode(int p0, float p1) {}
    public SemanticSearchNode(int p0, float p1, float p2) {}
    public SemanticSearchNode(int p0, float p1, float p2, int p3) {}
    public int getDistanceMetric() { return 0; }
    @android.annotation.NonNull
    public java.lang.String getFunctionName() { return null; }
    public float getLowerBound() { return 0.0f; }
    public float getUpperBound() { return 0.0f; }
    public int getVectorIndex() { return 0; }
    public void setBounds(float p0, float p1) {}
    public void setDistanceMetric(int p0) {}
    public void setVectorIndex(int p0) {}
}

package android.app.appsearch.ast;

@android.annotation.FlaggedApi("com.android.appsearch.flags.enable_abstract_syntax_trees")
public interface FunctionNode extends android.app.appsearch.ast.Node {
    public static final java.lang.String FUNCTION_NAME_GET_SEARCH_STRING_PARAMETER = "getSearchStringParameter";
    public static final java.lang.String FUNCTION_NAME_HAS_PROPERTY = "hasProperty";
    public static final java.lang.String FUNCTION_NAME_PROPERTY_DEFINED = "propertyDefined";
    public static final java.lang.String FUNCTION_NAME_SEARCH = "search";
    public static final java.lang.String FUNCTION_NAME_SEMANTIC_SEARCH = "semanticSearch";
    @android.annotation.NonNull
    public java.lang.String getFunctionName();
}

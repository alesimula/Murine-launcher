package com.android.framework.protobuf;

@java.lang.annotation.Documented
@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
@interface InlineMe {
    public java.lang.String replacement();
    public java.lang.String[] imports() default {};
    public java.lang.String[] staticImports() default {};
}

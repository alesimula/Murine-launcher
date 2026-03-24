package com.android.internal.annotations;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
public @interface GuardedBy {
    public java.lang.String[] value();
}

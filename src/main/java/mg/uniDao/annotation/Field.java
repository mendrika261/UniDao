package mg.uniDao.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Field {
    String name() default "";
    boolean isPrimaryKey() default false;
    boolean isNullable() default true;
    boolean isUnique() default false;
    String databaseMappingType() default "";
}

package br.com.bluesoft.rest.annotations;


import org.springframework.core.annotation.AliasFor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.lang.annotation.*;

@RequestMapping(method = RequestMethod.GET)
@ResponseStatus(HttpStatus.CREATED)
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ResponseBody
public @interface Post {
    @AliasFor(annotation = RequestMapping.class, attribute = "name")
    String name() default "";

    @AliasFor(annotation = RequestMapping.class, attribute = "path")
    String[] value() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "path")
    String[] path() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "params")
    String[] params() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "headers")
    String[] headers() default {};

    @AliasFor(annotation = RequestMapping.class, attribute = "produces")
    String[] produces() default {};

}

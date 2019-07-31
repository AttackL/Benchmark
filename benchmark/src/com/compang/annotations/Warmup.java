package com.compang.annotations;

public @interface Warmup {
    int iterations() default 0;//预热次数
}

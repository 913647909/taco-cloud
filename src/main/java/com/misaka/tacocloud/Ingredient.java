package com.misaka.tacocloud;

import lombok.Data;
import lombok.RequiredArgsConstructor;


/**
 * @author 汤滨
 * @version 1.0
 * @date 2019/5/24
 * @description Defining taco ingredients
 **/

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}

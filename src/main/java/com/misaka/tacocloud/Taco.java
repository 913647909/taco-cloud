package com.misaka.tacocloud;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author 汤滨
 * @version 1.0
 * @date 2019/5/24
 * @description
 **/

@Data
public class Taco {

    @NotBlank
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;
}

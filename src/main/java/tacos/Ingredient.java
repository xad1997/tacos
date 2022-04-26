package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author adam_xie
 * @create 2022-04-26 11:39
 */

@Data
// @RequiredArgsConstructor作用于类，用于生成包含 final 和 @NonNull 注解的成员变量的构造方法
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;


    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}

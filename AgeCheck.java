package com.zeroten.javales.flow;

public class AgeCheck {

//   public static void main(String[] args){
//       String ageLeve = getAgeName(52);
//       System.out.print(ageLeve);
//    }
    //|年龄范围    |描述         |
//|-----------|------------|
//|0 ~ 6岁     |儿童 |
//|7 ~ 17岁    |少年 |
//|18 ~ 40岁   |青年 |
//|41 ~ 59岁   |中年 |
//|60及以上     |老年 |
    public static String getAgeName(int age) {
        if (age < 7) {
            return "儿童";
        }
        if (age < 18) {
            return "少年";
        }
        if (age < 41) {
            return "青年";
        }
        if (age < 60) {
            return "中年";
        }
        return "老年";
    }
}

package com.sixth.springboot.enumeration;

/**
 * @Author ：liuhao
 * @Company: qinglian cloud
 * @Date ：Created in 2020/4/4 22:06
 * @ 性别枚举
 */
public enum SexEnum {

    /**
     * 男 - 1， 女 - 0
     */
    MALE(1, "男"),
    FEMALE(0, "女");
    private int id;
    private String name;

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static SexEnum getSexById(int id) {
        for (SexEnum sexEnum : SexEnum.values()) {
            if (sexEnum.getId() == id) {
                return sexEnum;
            }
        }
        return null;
    }

    public static SexEnum getSexByName(String name) {
        for (SexEnum sexEnum : SexEnum.values()) {
            if (name.equals(sexEnum.getName())) {
                return sexEnum;
            }
        }
        return null;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

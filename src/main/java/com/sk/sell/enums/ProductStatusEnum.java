package com.sk.sell.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum  ProductStatusEnum {

    UP(0,"上架"),
    DOWN(1,"下架");
    private int code;
    private String message;

    ProductStatusEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}

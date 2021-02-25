package com.clickheart.common.vo.business;

import lombok.Data;

/**
 * @Author clickheart
 * @Date 2020/3/20 16:53
 * @Version 1.0
 **/
@Data
public class InStockItemVO {
    private Long id;

    private String pNum;

    private String name;

    private String model;

    private String unit;

    private String imageUrl;

    private int count;
}

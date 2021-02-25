package com.clickheart.common.vo.business;

import lombok.Data;

/**
 * @Author clickheart
 * @Date 2020/5/25 16:26
 * @Version 1.0
 **/
@Data
public class OutStockItemVO {

    private Long id;

    private String pNum;

    private String name;

    private String model;

    private String unit;

    private String imageUrl;

    private int count;

}

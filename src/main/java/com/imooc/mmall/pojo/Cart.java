package com.imooc.mmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class Cart {

    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer quantity;
    private Integer checked;
    private Date createTime;
    private Date updateTime;

}
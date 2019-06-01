package com.imooc.mmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
public class OrderItem {

    private Integer id;
    private Long orderNo;
    private Integer productId;
    private String productName;
    private String productImage;
    private BigDecimal currentUnitPrice;
    private Integer quantity;
    private BigDecimal totalPrice;
    private Date createTime;
    private Date updateTime;
    private Integer userId;

}
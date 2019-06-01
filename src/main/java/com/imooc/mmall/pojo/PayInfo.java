package com.imooc.mmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class PayInfo {

    private Integer id;
    private Integer userId;
    private Long orderNo;
    private Integer payPlatform;
    private String platformNumber;
    private String platformStatus;
    private Date createTime;
    private Date updateTime;

}
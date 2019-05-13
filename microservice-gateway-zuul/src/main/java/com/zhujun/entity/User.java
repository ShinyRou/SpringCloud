package com.zhujun.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * className: User
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 15:23
 */


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;

    private String userName;


    private String name;

    private Integer age;


    private BigDecimal balance;
}

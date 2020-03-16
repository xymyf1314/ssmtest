package com.fan.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Fan
 * @version 1.0
 * @date 2020/3/16 20:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Admin implements Serializable {
    private int id;
    private String username;
    private String password;
}

package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import lombok.Data;
import lombok.ToString;

import java.util.Map;

@TableName("user")
@Data
@ToString
public class UserPO {
    @TableId
    private Long id;
    private String name;
    @TableField(typeHandler = JacksonTypeHandler.class)
    private Map content;
}

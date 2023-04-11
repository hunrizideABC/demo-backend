package com.shop.myapp.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PageDTO<T> {
    private int page;//分页起始页
    private int size;//每页记录数
    private List<T> rows;//返回的记录集合
    private long total;//总记录条数
}

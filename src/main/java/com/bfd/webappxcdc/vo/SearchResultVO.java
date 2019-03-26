package com.bfd.webappxcdc.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class SearchResultVO {
    @ApiModelProperty(value = "页数", required = true)
    private int pages;

    @ApiModelProperty(value = "结果集", required = true)
    private List<SearchInformationVO> resultlist;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<SearchInformationVO> getResultlist() {
        return resultlist;
    }

    public void setResultlist(List<SearchInformationVO> resultlist) {
        this.resultlist = resultlist;
    }
}

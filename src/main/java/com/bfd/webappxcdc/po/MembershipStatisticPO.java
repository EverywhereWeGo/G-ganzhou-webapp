package com.bfd.webappxcdc.po;

/**
 * 会员数量统计PO.
 *
 * @author: SiqiTang
 * @Date: 2018-12-05
 */
public class MembershipStatisticPO extends BasePO {
    /**
     * id,主键
     */
    private Integer id;
    /**
     * 会员增量
     */
    private Integer memberIncr;
    /**
     * 会员总量
     */
    private Integer memberTotal;

    /**
     * 查询时间点
     */
    private String queryTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMemberIncr() {
        return memberIncr;
    }

    public void setMemberIncr(Integer memberIncr) {
        this.memberIncr = memberIncr;
    }

    public Integer getMemberTotal() {
        return memberTotal;
    }

    public void setMemberTotal(Integer memberTotal) {
        this.memberTotal = memberTotal;
    }

    public String getQueryTime() {
        return queryTime;
    }

    public void setQueryTime(String queryTime) {
        this.queryTime = queryTime;
    }

}
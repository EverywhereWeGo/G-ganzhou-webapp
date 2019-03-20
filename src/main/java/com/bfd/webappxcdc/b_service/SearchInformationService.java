package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;
import com.bfd.webappxcdc.vo.SearchInformationVO;

import java.util.List;

/**
 * 日常销售额service层接口.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:54
 */
public interface SearchInformationService {

    /**
     * 获取最新更新数据的时间.
     *
     * @return 返回时间字符串
     */
    List<SearchInformationVO> getInfo(String type ,String name,int pageindex);
}

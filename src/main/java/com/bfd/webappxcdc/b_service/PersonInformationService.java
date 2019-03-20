package com.bfd.webappxcdc.b_service;

import com.bfd.webappxcdc.vo.PersonInformationDetailVO;
import com.bfd.webappxcdc.vo.PersonInformationNumVO;

import java.util.List;

/**
 * 日常销售额service层接口.
 *
 * @author wangzhongcheng
 * @Date 2018/12/4 15:54
 */
public interface PersonInformationService {

    /**
     * 获取最新更新数据的时间.
     *
     * @return 返回时间字符串
     */
	List<PersonInformationNumVO> getPersonNum();
    List<PersonInformationDetailVO> getPersonDetail(String type);
}

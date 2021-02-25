package com.clickheart.business.service;


import com.clickheart.common.error.BusinessException;
import com.clickheart.common.model.business.Health;
import com.clickheart.common.vo.business.HealthVO;
import com.clickheart.common.vo.system.PageVO;

/**
 * @Author clickheart
 * @Date 2020/5/7 10:20
 * @Version 1.0
 **/
public interface HealthService {

    /**
     * 健康上报
     * @param healthVO
     */
    void report(HealthVO healthVO) throws BusinessException;

    /**
     * 今日是否已经报备
     * @param id
     * @return
     */
    Health isReport(Long id);

    /**
     * 签到记录
     * @return
     */
    PageVO<Health> history(Long id, Integer pageNum, Integer pageSize);
}

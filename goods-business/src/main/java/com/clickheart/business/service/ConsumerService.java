package com.clickheart.business.service;


import com.clickheart.common.model.business.Consumer;
import com.clickheart.common.vo.business.ConsumerVO;
import com.clickheart.common.vo.system.PageVO;

import java.util.List;

/**
 * @Author clickheart
 * @Date 2020/4/5 09:53
 * @Version 1.0
 **/
public interface ConsumerService {

    /**
     * 添加物资去向
     * @param consumerVO
     */
    Consumer add(ConsumerVO consumerVO);


    /**
     * 物资去向列表
     * @param pageNum
     * @param pageSize
     * @param consumerVO
     * @return
     */
    PageVO<ConsumerVO> findConsumerList(Integer pageNum, Integer pageSize, ConsumerVO consumerVO);


    /**
     * 编辑物资去向
     * @param id
     * @return
     */
    ConsumerVO edit(Long id);

    /**
     * 更新物资去向
     * @param id
     * @param consumerVO
     */
    void update(Long id, ConsumerVO consumerVO);

    /**
     * 删除物资去向
     * @param id
     */
    void delete(Long id);

    /**
     * 查询所有物资去向
     * @return
     */
    List<ConsumerVO> findAll();

}
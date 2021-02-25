package com.clickheart.business.converter;

import com.clickheart.business.mapper.SupplierMapper;
import com.clickheart.common.model.business.InStock;
import com.clickheart.common.model.business.Supplier;
import com.clickheart.common.vo.business.InStockVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author clickheart
 * @Date 2020/3/19 09:58
 * @Version 1.0
 **/
@Component
public class InStockConverter {

    @Autowired
    private SupplierMapper supplierMapper;

    /**
     * 转voList
     * @param inStocks
     * @return
     */
    public  List<InStockVO> converterToVOList(List<InStock> inStocks) {
        List<InStockVO> inStockVOS=new ArrayList<>();
        if(!CollectionUtils.isEmpty(inStocks)){
            for (InStock inStock : inStocks) {
                InStockVO inStockVO = new InStockVO();
                BeanUtils.copyProperties(inStock,inStockVO);
                Supplier supplier = supplierMapper.selectByPrimaryKey(inStock.getSupplierId());
                if(supplier!=null){
                    inStockVO.setSupplierName(supplier.getName());
                    inStockVO.setPhone(supplier.getPhone());
                }
                inStockVOS.add(inStockVO);
            }
        }
        return inStockVOS;
    }
}

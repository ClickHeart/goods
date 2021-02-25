package com.clickheart.system.converter;

import com.clickheart.common.model.system.Department;
import com.clickheart.common.vo.system.DepartmentVO;
import org.springframework.beans.BeanUtils;

/**
 * @Author clickheart
 * @Date 2020/3/7 19:56
 * @Version 1.0
 **/
public class DepartmentConverter {


    /**
     * 转vo
     * @return
     */
    public static DepartmentVO converterToDepartmentVO(Department department){
        DepartmentVO departmentVO = new DepartmentVO();
        BeanUtils.copyProperties(department,departmentVO);
        return departmentVO;
    }
}

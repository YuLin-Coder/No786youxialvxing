package com.dao;

import com.entity.ChepiaoOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChepiaoOrderView;

/**
 * 车票订单 Dao 接口
 *
 * @author 
 * @since 2021-04-14
 */
public interface ChepiaoOrderDao extends BaseMapper<ChepiaoOrderEntity> {

   List<ChepiaoOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

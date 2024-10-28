package com.dao;

import com.entity.LvxingtuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.LvxingtuanView;

/**
 * 旅行团信息 Dao 接口
 *
 * @author 
 * @since 2021-04-15
 */
public interface LvxingtuanDao extends BaseMapper<LvxingtuanEntity> {

   List<LvxingtuanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

package com.example.demo.dao.goods;

import java.util.List;

import com.example.demo.dto.goods.GoodsDto;

/**
 * 商品信息数据持久层
 * @author Administrator
 *
 */
public interface GoodsDao {
	//获取商品列表
	public List<GoodsDto> getGoodsList();
	//根据商品ID获取商品详细信息
	//public GoodsDto getGoodsDtoInfoById(String goodsId);
	//根据商品名称获取商品详情
	//public GoodsDto getGoodsDtoInfoByName(String goodsName);
}

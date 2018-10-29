package com.example.demo.service.userGoods;

import java.util.List;

import com.example.demo.dto.goods.GoodsDto;

public interface UserGoodsService {
	//查询用户商品列表
	public List<GoodsDto> queryUserGoodsDtoList();
}

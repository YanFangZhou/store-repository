package com.example.demo.service.goods;

import java.util.List;

import com.example.demo.dto.goods.GoodsDto;

public interface GoodsService {
	//查询商品列表
	public List<GoodsDto> getGoodsList();
}

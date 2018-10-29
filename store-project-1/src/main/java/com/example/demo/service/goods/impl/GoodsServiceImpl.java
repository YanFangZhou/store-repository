package com.example.demo.service.goods.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.goods.GoodsDao;
import com.example.demo.dto.goods.GoodsDto;
import com.example.demo.service.goods.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsDao goodsDao;
	
	//查询商品列表
	@Override
	public List<GoodsDto> getGoodsList() {
		return goodsDao.getGoodsList();
	}

}

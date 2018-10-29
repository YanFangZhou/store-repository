package com.example.demo.controller.goods;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dto.goods.GoodsDto;
import com.example.demo.dto.goods.GoodsImageDto;
import com.example.demo.dto.goods.TypeDto;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/GoodsController")
public class GoodsController {
	
	/**
	 *  获取商品列表
	 * @return
	 */
	@RequestMapping("/getGoodsList")
	public ModelAndView getGoodsList(ModelAndView mv) {
		List<GoodsDto> list = new ArrayList<GoodsDto>();
		for(int x=0;x<10;x++) {
			Date dt = new Date();
			
			GoodsDto gd = new GoodsDto();
			String goodsDescribe = "商品描述"+x;
			gd.setGoodsDescribe(goodsDescribe);
			String goodsId = ""+x;
			gd.setGoodsId(goodsId);
			
			GoodsImageDto goodsImage = new GoodsImageDto();
			String imageId = ""+x;
			goodsImage.setImageId(imageId);
			String imageName = "商品图片"+x;
			goodsImage.setImageName(imageName);
			String imageUrl = "http://localhost/images"+x+".jpg";
			goodsImage.setImageUrl(imageUrl);
			Date createDate = dt;
			goodsImage.setCreateDate(createDate);
			String createUserId = "user"+x;
			goodsImage.setCreateUserId(createUserId);
			Date updateDate = dt;
			goodsImage.setUpdateDate(updateDate);
			String updateUserId = "user"+x;
			goodsImage.setUpdateUserId(updateUserId);
			gd.setGoodsImage(goodsImage);
			
			String goodsName = "商品"+x;
			gd.setGoodsName(goodsName);
			BigDecimal goodsPrice = new BigDecimal(100.00);
			gd.setGoodsPrice(goodsPrice);
			
			TypeDto goodsType = new TypeDto();
			String typeDesc = "类型"+x;
			goodsType.setTypeDesc(typeDesc);
			String typeId = "类型ID"+x;
			goodsType.setTypeId(typeId);
			String typeName = "类型名称"+x;
			goodsType.setTypeName(typeName);
			gd.setGoodsType(goodsType);
			
			gd.setCreateDate(createDate);
			gd.setCreateUserId(createUserId);
			gd.setUpdateDate(updateDate);
			gd.setUpdateUserId(updateUserId);
			
			list.add(gd);
		}
		mv.addObject("goodsList", list);
		mv.setViewName("goods/main");
		return mv;
	}
	
	/**
	 *  获取商品详情
	 * @param mv
	 * @return
	 */
	public ModelAndView getGoodsInfo(ModelAndView mv,GoodsDto gd) {
		return mv;
	}
	
}

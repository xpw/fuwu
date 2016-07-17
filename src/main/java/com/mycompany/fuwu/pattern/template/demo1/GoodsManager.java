//package com.mycompany.fuwu.pattern.template.demo1;
//
//public class GoodsManager {
//
//	public Result<GoodsDTO> save(List<GoodsDTO> newInfo) {
//		// 获取商品的老扩展属性信息
//		List<GoodsDTO> oldInfo = getGoodsAttrByGoodsId(Long goodsId);
//		
//		for(GoodsDTO newGoods : newInfo) {
//			boolean isNeedInsert = true;
//			for(GoodsDTO oldGoods :oldInfo) {
//				if(newGoods.getId() = oldGoods.getId()) {// 属性表有的，参数有的，则为更新
//					isNeedInsert = false;
//					updateAttr(newGoods);
//					break;
//				}
//			}
//			if(isNeedInsert) {// 属性表没有的，参数有的，则为插入
//				insertAttr(newGoods);
//			}
//		}
//		for(GoodsDTO oldGoods : newInfo) {
//			boolean isNeedDelete = true;
//			for(GoodsDTO newGoods :oldInfo) {
//				if(newGoods.getId() = oldGoods.getId()) {// 属性表有的，参数没有的，则为删除
//					isNeedDelete = false;
//					break;
//				}
//			}
//			if(isNeedDelete) {
//				deleteAttr(oldGoods);
//			}
//		}
//	}
//}

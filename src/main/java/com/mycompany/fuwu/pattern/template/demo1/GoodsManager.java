//package com.mycompany.fuwu.pattern.template.demo1;
//
//public class GoodsManager {
//
//	public Result<GoodsDTO> save(List<GoodsDTO> newInfo) {
//		// ��ȡ��Ʒ������չ������Ϣ
//		List<GoodsDTO> oldInfo = getGoodsAttrByGoodsId(Long goodsId);
//		
//		for(GoodsDTO newGoods : newInfo) {
//			boolean isNeedInsert = true;
//			for(GoodsDTO oldGoods :oldInfo) {
//				if(newGoods.getId() = oldGoods.getId()) {// ���Ա��еģ������еģ���Ϊ����
//					isNeedInsert = false;
//					updateAttr(newGoods);
//					break;
//				}
//			}
//			if(isNeedInsert) {// ���Ա�û�еģ������еģ���Ϊ����
//				insertAttr(newGoods);
//			}
//		}
//		for(GoodsDTO oldGoods : newInfo) {
//			boolean isNeedDelete = true;
//			for(GoodsDTO newGoods :oldInfo) {
//				if(newGoods.getId() = oldGoods.getId()) {// ���Ա��еģ�����û�еģ���Ϊɾ��
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

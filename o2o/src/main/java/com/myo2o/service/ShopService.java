package com.myo2o.service;

import java.io.InputStream;

import com.myo2o.Exception.ShopOperationExcetion;
import com.myo2o.dto.ShopExecution;
import com.myo2o.entity.Shop;

public interface ShopService {
	/**
	 * 通过店铺Id获取店铺信息
	 * @param shopId
	 * @return
	 */

Shop getbyShopId(long shopId);

/**
 * 更新店铺信息
 * @param shop
 * @param shopImg
 * @return
 * @throws ShopOperationExcetion
 */
   ShopExecution modifySshop(Shop shop,InputStream shopImgInputStream,
	String fileName) throws ShopOperationExcetion;
	
	/**
	 * 注册店铺信息
	 * @param shop
	 * @param shopImgInputStream
	 * @param fileName
	 * @return
	 * @throws ShopOperationExcetion
	 */
	ShopExecution addShop(Shop shop,InputStream shopImgInputStream,
	String fileName) throws ShopOperationExcetion;
	/**
	 * ����shopCondition��ҳ������Ӧ�����б�
	 * @param shopCondition
	 * @param pageIndex
	 * @param PageSize
	 * @return
	 */
	public ShopExecution getshopList(Shop shopCondition,int pageIndex,int PageSize);
}

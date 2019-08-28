package com.tedu.sp02.item.sercive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tedu.sp01.pojo.Item;
import com.tedu.sp01.service.ItemService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class itemServiceImpl implements ItemService {

	@Override
	public List<Item> getItems(String orderId) {
		ArrayList<Item> list = new ArrayList<>();
		list.add(new Item(1, "商品1", 1));
		list.add(new Item(2, "商品2", 2));
		list.add(new Item(3, "商品3", 3));
		list.add(new Item(4, "商品4", 4));
		list.add(new Item(5, "商品5", 5));
		list.add(new Item(6, "商品6", 6));
		return list;
	}

	@Override
	public void decreaseNumbers(List<Item> list) {
		if (log.isInfoEnabled()) {
			for (Item item : list) {
				log.info("减少库存 -"+item);
			}
		}

	}

}

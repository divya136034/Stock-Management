package  com.tcsion.java.Project1Backend.dao;

import com.tcsion.java.Project1Backend.dto.Sell_product;

public interface Sell_productDao {

	Boolean add(Sell_product sell_product);
	Sell_product getSellProductByProductid(Long sale_product_id);
	Boolean update(Sell_product sell_product);
	 Boolean delete(Long sell_product_id);

}

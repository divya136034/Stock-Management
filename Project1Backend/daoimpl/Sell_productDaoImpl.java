package com.tcsion.java.Project1Backend.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcsion.java.Project1Backend.dao.Sell_productDao;
import com.tcsion.java.Project1Backend.dto.Sell_product;
import com.tcsion.java.Project1Backend.dto.User;

@Repository("sell_productDao") // repository is a container to objects. so we don't have to create object
// anywhere.
@Transactional
public class Sell_productDaoImpl implements Sell_productDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Boolean add(Sell_product sell_product) {

		try {
			sessionFactory.getCurrentSession().persist(sell_product);
			return true;
		} catch (Exception e) {
			System.out.println(e); // shows error at console
			return false;
		}	
	}

	@Override
	public Sell_product getSellProductByProductid(Long sale_product_id) {
		return sessionFactory.getCurrentSession().get(Sell_product.class, sale_product_id);
	}

	@Override
	public Boolean update(Sell_product sell_product) {
		try {
			sessionFactory.getCurrentSession().update(sell_product);
			return true;
		} catch (Exception e) {
			System.out.println(e); // shows error at console
			return false;
		}	
	}

	@Override
	public Boolean delete(Long sale_product_id) {
		Sell_product sell_product= getSellProductByProductid(sale_product_id);
		sell_product.setEnable(false);
		return update(sell_product);
	}

}

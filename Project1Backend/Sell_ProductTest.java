package com.tcsion.java.Project1Backend;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcsion.java.Project1Backend.dao.ProductDao;
import com.tcsion.java.Project1Backend.dao.Sell_productDao;
import com.tcsion.java.Project1Backend.dao.UserDao;
import com.tcsion.java.Project1Backend.dto.Product;
import com.tcsion.java.Project1Backend.dto.Sell_product;
import com.tcsion.java.Project1Backend.dto.User;

public class Sell_ProductTest {
	private static AnnotationConfigApplicationContext context;
	private static Sell_productDao sell_productDao;// reference variable of the interface

	private User user;
	private Product product;
	private static UserDao userDao;
	private static ProductDao productDao;
	@SuppressWarnings("unused") // warning ni ayenge only error will stop the project from running
	private Sell_product sell_product;
	SessionFactory sessionFactory;

	public Sell_ProductTest() {
/*		context = new AnnotationConfigApplicationContext();
		context.scan("com.tcsion.java.Project1Backend");
	context.refresh();
		sell_productDao = (Sell_productDao) context.getBean("sell_productDao"); 
	userDao=(UserDao)context.getBean("userDao");
	productDao=(ProductDao) context.getBean("productDao");// now no need to write : userDao=newUserDaoImpl();
*/
	}

	public void getSell() {
/*
		Long sale_product_id = new Long(3);
		System.out.println(sell_productDao.getSellProductByProductid(sale_product_id));*/
	}

	public void getuser() {
/*
		Long user_id = new Long(3);
		System.out.println(userDao.getuserByuserId(user_id));*/
	}

	public void getproduct() {

		/*Long product_id = new Long(4);
		System.out.println(productDao.getProductByProductid(product_id));*/
	}

/* public void updateSell()
	 {
	 Sell_product sell_product=sell_productDao.getSellProductByProductid(new
	 Long(1));
	 sell_product.setTotal_quantity(15);
	 System.out.println(sell_productDao.update(sell_product));
	 }*/
	public void updateSell() {
		/*sell_product = sell_productDao.getSellProductByProductid(new Long(15));
		user = userDao.getuserByuserId(new Long(18));
		product = productDao.getProductByProductid(new Long(19));
		sell_product.setUser(user);
		sell_product.setProduct(product);
		sell_product.setTotal_quantity(5);
		sell_product.setTotal_price(sell_product.getTotal_quantity() * product.getProduct_unit_price());
		sell_productDao.update(sell_product);*/
	}

	public void addSell() { // write the code of the add method of DaoImpl here to check it
/*		Sell_product sell_product = new Sell_product();
		sell_product.setTotal_price(sell_product.getTotal_quantity() * product.getProduct_unit_price());
		sell_product.setTotal_quantity(6);
		sell_product.setEnable(true);
		
		 User user=new User();
		 user.setUser_name("divya");
		 user.setUser_age(20);
		 user.setUser_contact("5678945367");
		 Product product=new Product();
		 product.setProduct_name("headphone");
		product.setProduct_unit_price(230);
	     product.setProduct_available_quantity(20);
		 sell_product.setUser(user);
		sell_product.setProduct(product);
		System.out.println(sell_productDao.add(sell_product));*/
	}

	public void deleteSell() {
		/*System.out.println(sell_productDao.delete(new Long(5)));*/
	}

	public static void main(String[] args) { // main method for project testing
/*
	Sell_ProductTest t1 = new Sell_ProductTest();
		t1.addSell();*/
		//t1.updateSell();
		 //t1.getSell();
		//t1.deleteSell();

	}
}

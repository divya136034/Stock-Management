package com.tcsion.FrontEnd;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcsion.java.Project1Backend.dao.ProductDao;
import com.tcsion.java.Project1Backend.dao.Sell_productDao;
import com.tcsion.java.Project1Backend.dao.UserDao;
import com.tcsion.java.Project1Backend.dto.Product;
import com.tcsion.java.Project1Backend.dto.Sell_product;
import com.tcsion.java.Project1Backend.dto.User;

public class GetData {
	private static AnnotationConfigApplicationContext context;
	private static ProductDao productDao;
	private static UserDao userDao;
	private static Sell_productDao sell_productDao;
	@SuppressWarnings("unused")     // warning ni ayenge only error will stop the project from running
	private Product product;
	private Sell_product sell_product;
    private User user;
	
    SessionFactory sessionFactory;
	
public List<String> getlist()
{
	List<String> l=productDao.getl();
	return l;
}
public List<Float> getpricelist()
{
	List<Float> l2=productDao.getl2();
	return l2;
}


	public GetData() {
	context = new AnnotationConfigApplicationContext();
	context.scan("com.tcsion.java.Project1Backend");
	context.refresh();
	productDao = (ProductDao) context.getBean("productDao");
	userDao = (UserDao) context.getBean("userDao"); // now no need to write : userDao=new UserDaoImpl();
	sell_productDao = (Sell_productDao) context.getBean("sell_productDao"); 
}
	
	
	public List<Integer> getQualist()
	{
		List<Integer> l3=productDao.getl3();
		return l3;
	}
	public void addProduct(String pname,int punit,int pprice) {    // write the code of the add method of DaoImpl here to check it
		Product product=new Product();    
	product.setProduct_available_quantity(punit);
	product.setProduct_name(pname);
	product.setProduct_unit_price(pprice);
	product.setEnable(true);
		System.out.println(productDao.add(product));
	}
/*	public void getproduct()
	{
		
		Long product_id=new Long(1);
		System.out.println(productDao.getProductByProductid(product_id));
	}
	*/
/*	public void updateproduct(Long id,Integer punit,Float pprice)
	{
		Product product=productDao.getProductByProductid(id);
		product.setProduct_available_quantity(punit);
		product.setProduct_unit_price(pprice);
		System.out.println(productDao.update(product));
	} */
	public void deleteproduct(Long id)
	{
		productDao.deleteproducts(id);
		
		} 


/*	public void getSell() {

		Long sale_product_id = new Long(3);
		System.out.println(sell_productDao.getSellProductByProductid(sale_product_id));
	}

	public void getSelluser() {

		Long user_id = new Long(4);
		System.out.println(userDao.getuserByuserId(user_id));
	}*/

/*	public void getSellproduct() {

		Long product_id = new Long(4);
		System.out.println(productDao.getProductByProductid(product_id));
	}
*/
/* public void updateSell()
	 {
	 Sell_product sell_product=sell_productDao.getSellProductByProductid(new
	 Long(1));
	 sell_product.setTotal_quantity(15);
	 System.out.println(sell_productDao.update(sell_product));
	 }*/
/*	public  updFloatateSell() {
		sell_product = sell_productDao.getSellProductByProductid(new Long(15));
		user = userDao.getuserByuserId(new Long(18));
		product = productDao.getProductByProductid(new Long(19));
		sell_product.setUser(user);
		sell_product.setProduct(product);
		sell_product.setTotal_quantity(5);
		sell_product.sell_product.getTotal_quantity() * product.getProduct_unit_price());
		
	}*/

	public void addSell() { // write the code of the add method of DaoImpl here to check it
		Sell_product sell_product = new Sell_product();
		sell_product.setTotal_quantity(6);
		sell_product.setTotal_price(90);
		
		sell_product.setEnable(true);
		
		 User user=new User();
		 user.setUser_name("divya");
		 user.setUser_age(20);
		 user.setuser_password("jaipur");
		 user.setUser_contact("5678945367");
		 Product product=new Product();
		 product.setProduct_name("headphone");
		product.setProduct_unit_price(230);
	     product.setProduct_available_quantity(20);
		 sell_product.setUser(user);
		sell_product.setProduct(product);
		System.out.println(sell_productDao.add(sell_product));
	}

	public void deleteSell() {
		System.out.println(sell_productDao.delete(new Long(5)));
	}
	
public void addUser(String uname,String pass,int age,String contact,String role) {    // write the code of the add method of DaoImpl here to check it
		User user = new User();   
		
		user.setuser_password(pass);
		user.setUser_name(uname);
		user.setUser_age(age);
		user.setUser_role(role);
		user.setUser_contact(contact);
		user.setEnable(true);
		System.out.println(userDao.add(user));
	}
Boolean valid (String uname,String pass)
{
	User user = new User();
	Boolean b=userDao.validate(uname,pass);
	return b;
}
Long get_id (String pname)
{
	Product product=new Product();
	Long id=productDao.validate(pname);
	return id;
}
public Float getprice(String pname)
{

	Product product=new Product();
	Float price=productDao.getp(pname);
	return price;
}

	public void getuser()
	{
		
		Long user_id=new Long(1);
		System.out.println(userDao.getuserByuserId(user_id));
	}
	public void updateproduct(Long id,Integer punit,Float pprice)
	{
		Product product=productDao.getProductByProductid(id);
		product.setProduct_available_quantity(punit);
		product.setProduct_unit_price(pprice);
		System.out.println(productDao.update(product));
	}
	public void update_admin(String pass,String old_pass)
	{
		Long user_id=userDao.getidbypass(old_pass);
		User user=userDao.getuserByuserId(user_id);
		user.setuser_password(pass);
		if(userDao.update(user))
			{System.out.print("yes");
	}}

/*	public void deleteuser()
	{
		System.out.println(userDao.delete(new Long(1)));
	}*/
	public Integer getquantity(String pname)
	{
		Product product=new Product();
		Integer que=productDao.getque(pname);
		return que;
		
	}
	public String getadminpass()
	{
		return userDao.getadminpassw();
	}
	public String getadminname()
	{
	return userDao.getadminnamee();
	}
	public static void main(String args[])
	{
		GetData ob=new GetData();
	/*	ob.update_admin("pp123","pp");*/
		/*ob.addUser("pr", "pp", 90, "9800", "ugiuui");
	
		ob.addSell();*/
	}
	}
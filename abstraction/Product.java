package abstraction;


public class Product {
	private int id;
	private String productName;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
		
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}
	public static void main(String[] args) {
		Product pro= new Product();
		pro.setId(201);
		pro.setProductName("IPhone");
		pro.setPrice(45000);
		
		System.out.println("Product Id : "+pro.getId());
		System.out.println("Product Name : "+pro.getProductName());
		System.out.println("Product Price : "+pro.getPrice());
		
		System.out.println(pro);
	}

}

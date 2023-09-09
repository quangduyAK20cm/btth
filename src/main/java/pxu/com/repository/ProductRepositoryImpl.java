package pxu.com.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pxu.com.model.Product;

public class ProductRepositoryImpl implements ProductRepository {

	private static final Map<Integer, Product> products;

	static {
		products = new HashMap<Integer, Product>();
		products.put(1, new Product(1, "asus vivobook", 5900101,"https://tse1.mm.bing.net/th?id=OIP.MR90ZbpW2_ta0PjXBt4HeAHaE-&pid=Api&P=0&h=180"));
		products.put(2, new Product(2, "HP", 5910102,"https://tse2.mm.bing.net/th?id=OIP.Vgy3MLKkzCyX2JbdCl-PugHaE3&pid=Api&P=0&h=180"));
		products.put(3, new Product(3, "mackbook", 5912103,"https://tse4.mm.bing.net/th?id=OIP.HtCzenosPNqPo-g-STLhmQHaE7&pid=Api&P=0&h=180"));
		products.put(4, new Product(4, "dell", 5932104,"https://tse3.mm.bing.net/th?id=OIP.WQrcIkcu40hBtgDEH4t3qgHaEv&pid=Api&P=0&h=180"));
		products.put(5, new Product(5, "acer", 5921105,"https://tse1.mm.bing.net/th?id=OIP.I6dP8F8-kCr2h8q9dPCx_wHaFj&pid=Api&P=0&h=180"));
		products.put(6, new Product(6, "msi", 5904106,"https://tse2.mm.bing.net/th?id=OIP.a3G1CzQEdd8HHmhPC1rsPgHaGE&pid=Api&P=0&h=180"));
		products.put(7, new Product(7, "huwaei", 5931107,"https://tse4.mm.bing.net/th?id=OIP.VQUe76-EjqxgzxQB1sBldQHaEK&pid=Api&P=0&h=180"));

	}

	@Override
	public List<Product> fimAll() {
		// TODO Auto-generated method stub
		return new ArrayList<Product>(products.values());
	}

	@Override
	public Product finByid(int code) {
		// TODO Auto-generated method stub
		Product product = products.get(code);
		return product;
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		products.put(product.getCode(), product);
	}

	@Override
	public void delete(int code) {
		products.remove(code);
	}

	@Override
	public void update(Product product) {
		int productId = product.getCode();
		if (products.containsKey(productId)) {
			products.put(productId, product);
		}
	}

}

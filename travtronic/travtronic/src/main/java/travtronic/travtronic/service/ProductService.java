package travtronic.travtronic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import travtronic.travtronic.entty.Product;
import travtronic.travtronic.repostory.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;

	public List<Product> searchProducts(String keyword) {
		return productRepository.searchProducts(keyword);
	}

	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

	@Transactional
	public Product updateProduct(Long id, Product updatedProduct) {
		Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
		product.setName(updatedProduct.getName());
		product.setCategory(updatedProduct.getCategory());
		product.setPrice(updatedProduct.getPrice());
		product.setStock(updatedProduct.getStock());
		return product;
	}
}

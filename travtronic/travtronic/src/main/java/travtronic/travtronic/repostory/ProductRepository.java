package travtronic.travtronic.repostory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import travtronic.travtronic.entty.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	@Query("SELECT p FROM Product p WHERE p.name LIKE %:keyword% OR p.category LIKE %:keyword%")
	List<Product> searchProducts(@Param("keyword") String keyword);
}

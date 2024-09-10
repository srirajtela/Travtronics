package travtronic.travtronic.repostory;


import org.springframework.data.jpa.repository.JpaRepository;

import travtronic.travtronic.entty.CartItem;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    List<CartItem> findByUserId(Long userId);
}


package travtronic.travtronic.repostory;


import org.springframework.data.jpa.repository.JpaRepository;

import travtronic.travtronic.entty.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}


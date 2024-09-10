package travtronic.travtronic.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import travtronic.travtronic.entty.Order;
import travtronic.travtronic.repostory.CartItemRepository;
import travtronic.travtronic.repostory.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Transactional
    public Order placeOrder(Long userId) {
        Order order = new Order();
        order.setUserId(userId);
        order.setOrderDate(new Date());
        Order savedOrder = orderRepository.save(order);

        // Process cart items
        cartItemRepository.findByUserId(userId).forEach(cartItem -> {
            // Logic to handle stock reduction and order item persistence
            cartItemRepository.delete(cartItem);
        });

        return savedOrder;
    }
}


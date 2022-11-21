package me.ahmouny.orderservice.repositories;

import me.ahmouny.orderservice.entities.Order;
import me.ahmouny.orderservice.entities.ProductItem;
import org.aspectj.weaver.ast.Or;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, String> {
    Collection<Order> findAllByCustomerId(Long id);
}

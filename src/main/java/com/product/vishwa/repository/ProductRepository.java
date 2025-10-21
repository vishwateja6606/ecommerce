package com.product.vishwa.repository;
import com.product.vishwa.entity.Product;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}

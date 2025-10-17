package com.ecommerce.project.repository;

import com.ecommerce.project.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    @Query("SELECT c from Cart c WHERE c.user.email = ?1")
    Cart findCartByEmail(String email);


    @Query("SELECT c from Cart c WHERE c.user.email = ?1 AND c.id = ?2")
    Cart findCartByEmailAndCartId(String email, Long cartId);

    @Query("DELETE from CartItem ci WHERE ci.cart.id = ?1 AND ci.product.id = ?2")
    void deleteCartItemByProductIdAndCartId(Long cartId, Long productId);

    @Query("SELECT c from Cart c JOIN FETCH c.cartItems ci JOIN FETCH ci.product p WHERE p.id = ?1")
    List<Cart> findCartByProductId(Long productId);


}

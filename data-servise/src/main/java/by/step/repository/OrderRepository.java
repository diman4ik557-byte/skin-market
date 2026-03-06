package by.step.repository;

import by.step.entity.Order;
import by.step.entity.User;
import by.step.entity.enums.OrderStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Long> {

    Page<Order> findByCustomer(User customer, Pageable pageable);

    Page<Order> findByArtist(User artist, Pageable pageable);

    Page<Order> findByStatus(OrderStatus status, Pageable pageable);

    List<Order> findByArtistAndStatusIn(User artist, List<OrderStatus> statuses);

    @Modifying
    @Transactional
    @Query("UPDATE Order o SET o.status = :status WHERE o.id = :orderId")
    void updateStatus(@Param("orderId") Long orderId,
                      @Param("status") OrderStatus status);

    @Modifying
    @Transactional
    @Query("UPDATE Order o SET o.finalFileUrl = :fileUrl WHERE o.id = :orderId")
    void updateFinalFile(@Param("orderId") Long orderId,
                         @Param("fileUrl") String fileUrl);
}

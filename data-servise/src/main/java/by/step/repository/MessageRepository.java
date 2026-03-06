package by.step.repository;

import by.step.entity.Message;
import by.step.entity.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    Page<Message> findByOrder(Order order, Pageable pageable);

    List<Message> findByOrderAndIsPreviewTrue(Order order);

    void deleteByOrder(Order order);
}

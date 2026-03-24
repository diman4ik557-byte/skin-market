package by.step.dto;

import by.step.entity.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private Long id;
    private Long customerId;
    private String customerName;
    private Long artistId;
    private String artistName;
    private OrderStatus status;
    private String description;
    private BigDecimal price;
    private String finalFileUrl;
    private LocalDateTime createdAt;
    private LocalDateTime completedAt;

    public static OrderDto of(Long id, String customerName,
                              String artistName, OrderStatus status,
                              String description,BigDecimal price, String finalFileUrl,
                              LocalDateTime createdAt, LocalDateTime completedAt){
        return new OrderDto(id,null,customerName,null,artistName,status,description,
                price,finalFileUrl,createdAt,completedAt);
    }
}

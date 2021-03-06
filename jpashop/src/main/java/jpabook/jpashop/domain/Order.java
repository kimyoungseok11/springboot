package jpabook.jpashop.domain;

import OrderStatus.OrderStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.Mapping;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@Getter @Setter
public class Order {

    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItems> orderItems = new ArrayList<>();

    @OneToOne
    @JoinColumn(name = "deliver_id")
    private Delivery delivery;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}

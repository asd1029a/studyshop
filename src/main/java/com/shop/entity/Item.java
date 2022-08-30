package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Item extends BaseEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long id;

    private String itemNm;

    private int price;

    private int stockNumber;

    private String itemDetail;

    private ItemSellStatus itemSellStatus;

    protected Item() {}
}

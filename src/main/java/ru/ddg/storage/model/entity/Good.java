package ru.ddg.storage.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.ddg.storage.model.dto.GoodDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="good")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Good {
    @Embeddable
    public static class Pk implements Serializable{
        @ManyToOne
        @JoinColumn(name="store_id")
        public Store store;

        @Column(name = "good_id")
        public Long goodId;

        public Pk() {
        }
    }
    @EmbeddedId
    private Pk id;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "note")
    private String note;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

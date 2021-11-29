package ru.ddg.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="good")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Good extends AbstractEntity {
//    @Embeddable
//    @Getter
//    @Setter
//    public static class Pk implements Serializable{
//        @ManyToOne
//        @JoinColumn(name="store_id")
//        public Store store;
//
//        @Column(name = "good_id")
//        @GeneratedValue(strategy = GenerationType.AUTO)
//        public Long goodId;
//
//        public Pk() {
//        }
//    }
//    @EmbeddedId
//    private Pk id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "amount")
    private Long amount;
    @Column(name = "note")
    private String note;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}

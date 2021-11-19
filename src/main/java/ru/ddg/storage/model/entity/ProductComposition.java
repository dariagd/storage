package ru.ddg.storage.model.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_composition")
public class ProductComposition {
    @Embeddable
    static class Pk implements Serializable {
        @ManyToOne
        @JoinColumn(name = "parent_id")
        private Product parent;

        @ManyToOne
        @JoinColumn(name = "child_id")
        private Product child;
    }

    @EmbeddedId
    private Pk id;

    @Column(name = "amount")
    private Long amount;
}

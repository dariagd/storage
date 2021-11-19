package ru.ddg.storage.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product_composition")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

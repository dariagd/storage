package ru.ddg.storage.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product__composition",
        uniqueConstraints = { @UniqueConstraint(columnNames = { "parent_id", "child_id"})})
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductComposition extends AbstractEntity {
//    @Embeddable
//    @Getter
//    @Setter
//    public static class Pk implements Serializable {
//        private Long parentId;
//        private Long childId;
//    }
//    @EmbeddedId
//    private Pk id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private Long amount;

    @ManyToOne
//    @MapsId("parentId")
    @JoinColumn(name = "parent_id")
    private Product parentId;

    @ManyToOne
//    @MapsId("childId")
    @JoinColumn(name = "child_id")
    private Product childId;
}

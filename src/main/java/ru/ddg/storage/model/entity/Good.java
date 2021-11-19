package ru.ddg.storage.model.entity;

import ru.ddg.storage.model.dto.GoodDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="good")
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

    public Good() {
    }

    public static Good from(GoodDto goodDto){
        Good good = new Good();
        good.setAmount(goodDto.getAmount());
        good.setNote(goodDto.getNote());
        return good;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Pk getId() {
        return id;
    }

    public void setId(Pk id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

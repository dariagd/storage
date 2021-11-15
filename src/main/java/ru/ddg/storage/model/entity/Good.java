package ru.ddg.storage.model.entity;

import ru.ddg.storage.model.dto.GoodDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="goods")
public class Good {

    @Embeddable
    public static class Pk implements Serializable{
        @Column(name = "storehouse_id", nullable=false, updatable=false)
        public Long storehouseId;

        @Column(name = "good_id")
        public Long goodId;

        public Pk(Long storehouseId, Long goodId) {
            this.storehouseId = storehouseId;
            this.goodId = goodId;
        }

        public Pk() {
        }
    }

    @EmbeddedId
    private Pk id;

    @ManyToOne
    @JoinColumn(name = "storehouse_id", insertable = false, updatable = false)
    @org.hibernate.annotations.ForeignKey(name = "FK_GOOD_STOREHOUSEID")
    public Storehouse storehouse;


    private Long amount;
    private String note;

    public Good(Pk id, Storehouse storehouse, Long amount, String note) {
        this.id = id;
        this.storehouse = storehouse;
        this.amount = amount;
        this.note = note;
//        this.product = product;
    }

    //    @ManyToOne
//    @JoinColumn(name="storehouse_id")
//    private Storehouse storehouse;

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

    public Storehouse getStorehouse() {
        return storehouse;
    }

    public void setStorehouse(Storehouse storehouse) {
        this.storehouse = storehouse;
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

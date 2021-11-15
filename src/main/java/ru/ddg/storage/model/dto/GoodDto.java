package ru.ddg.storage.model.dto;

import ru.ddg.storage.model.entity.Good;

public class GoodDto {
    private Long id;
    private Long amount;
    private String note;

    public static GoodDto from(Good good){
        GoodDto goodDto = new GoodDto();
        goodDto.setAmount(good.getAmount());
        goodDto.setNote(good.getNote());
        return goodDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}

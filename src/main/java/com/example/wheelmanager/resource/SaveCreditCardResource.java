package com.example.wheelmanager.resource;

import com.example.wheelmanager.domain.model.CreditCard;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
public class SaveCreditCardResource {
    @NotNull
    private String cardNumber;
    @NotNull
    private String cardCcv;


    public String getCardNumber() {
        return cardNumber;
    }

    public SaveCreditCardResource setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
        return this;
    }


    public String getCardCcv() {
        return cardCcv;
    }

    public SaveCreditCardResource setCardCcv(String cardCcv) {
        this.cardCcv = cardCcv;
        return this;
    }
}

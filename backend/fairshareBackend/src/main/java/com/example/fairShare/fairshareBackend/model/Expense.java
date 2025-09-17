package com.example.fairShare.fairshareBackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityResult;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Expense {

    private String expenseId;
    private String groupId;
    private String title;
    private String paidBy;
    private Double amount;
    private Map<String, Float> sharedBy;

    public String getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(String expenseId) {
        this.expenseId = expenseId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(String paidBy) {
        this.paidBy = paidBy;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Map<String, Float> getSharedBy() {
        return sharedBy;
    }

    public void setSharedBy(Map<String, Float> sharedBy) {
        this.sharedBy = sharedBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    private Date creationDate;
    private enum splitType{
        equal,
        percentage,
        customShare
    };
}

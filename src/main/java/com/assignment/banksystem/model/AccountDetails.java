package com.assignment.banksystem.model;
import lombok.*;
import javax.persistence.*;
@Entity
@Table(name="account_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class AccountDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="account_number")
    private Integer lastDigitOfAccountNumber;
    private String customerName;
    private double amount;
    private double depositAmount;
    private double withdrawAmount;
}

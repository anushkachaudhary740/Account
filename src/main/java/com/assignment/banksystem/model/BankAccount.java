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
public class BankAccount {
    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="account_number")
    private Integer lastDigitOfAccountNumber;
    private double initialAmount;
    private double depositAmount;
    private double withdrawAmount;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customerDetails;
}

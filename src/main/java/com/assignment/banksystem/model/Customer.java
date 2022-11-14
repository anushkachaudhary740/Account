package com.assignment.banksystem.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "customer_Table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customerId;
    private String customerName;
    private String MobileNumber;
    private String customerEmail;
}

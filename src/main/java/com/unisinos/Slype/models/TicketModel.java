package com.unisinos.Slype.models;

import com.unisinos.Slype.enums.TicketStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "tb_ticket")
public class TicketModel extends Model implements Serializable {
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "agent", nullable = false, unique = true)
    private AgentModel agent;

    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "customer", nullable = false, unique = true)
    private CustomerModel customer;

    private LocalDateTime expirationTime;

    @Enumerated
    @Column(name = "status", nullable = false)
    private TicketStatus status;
}
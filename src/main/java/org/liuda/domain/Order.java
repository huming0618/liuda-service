package org.liuda.domain;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
@Table(name="eventorder")
@Data
public class Order {

  @Id @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  @NotNull
  @ManyToOne
  @JoinColumn(name = "event_id")
  private Event event;

  @NotNull
  private String orderno;

  @NotNull
  private String phone;

  @NotNull
  private Integer qty;
  
  @NotNull
  private Date createon;

}
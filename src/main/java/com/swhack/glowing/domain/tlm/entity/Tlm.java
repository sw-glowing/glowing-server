package com.swhack.glowing.domain.tlm.entity;

import com.swhack.glowing.domain.school.entity.School;
import com.swhack.glowing.domain.user.entity.User;
import com.swhack.glowing.global.entity.BaseEntity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "tlm")
public class Tlm extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Long id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "userId")
  private User user;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "schoolId")
  private School school;

  @NotNull
  @Column(name = "title")
  private String title;

  @Builder
  public Tlm(Long id, User user, School school, String title){
    this.id = id;
    this.user = user;
    this.school = school;
    this.title = title;
  }

}
package com.spring.mongo.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppUser implements Serializable {

  @Id
  private String id;


  private String username;
  private String email;
  private String password;

//  @ElementCollection(fetch = FetchType.EAGER)
//  List<AppUserRole> appUserRoles;

}

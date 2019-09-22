package com.foobar.foo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "foo")
public class Foo {

  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "foo")
  private String foo;

  Foo(String foo) {
    this.foo = foo;
  }

  Foo() {
    // Default constructor needed by JPA
  }

  public String getFoo() {
    return foo;
  }

}

package com.newer.domain;

import java.io.Serializable;

public class Student implements Serializable {
     private Integer stuid;
     private String stuname;
     private String class;
     public Integer getStuid() {
          return stuid;
     }

     public void setStuid(Integer stuid) {
          this.stuid = stuid;
     }
}

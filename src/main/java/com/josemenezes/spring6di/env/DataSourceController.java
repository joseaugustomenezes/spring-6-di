package com.josemenezes.spring6di.controllers;

import com.josemenezes.spring6di.services.env.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

  private final DataSource dataSource;

  @Autowired
  public DataSourceController(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  public String displayDataSource() {
    return this.dataSource.getDataSource();
  }
}

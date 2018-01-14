package com.moyu.bi.service;

import com.moyu.bi.domain.dbconfig.DBConfiguration;
import com.moyu.bi.domain.dbconfig.DataSourceShow;

import java.util.List;

/**
 * Created by Joker on 18/1/13.
 */
public interface DBSourceConfigurationService {
    void addSourceConfig(DBConfiguration dbConfiguration);
    List<DataSourceShow> getSourceConfig();
}
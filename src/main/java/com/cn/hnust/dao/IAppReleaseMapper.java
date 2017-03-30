package com.cn.hnust.dao;

import com.cn.hnust.pojo.AppRelease;
import com.cn.hnust.pojo.AppReleaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IAppReleaseMapper {
    long countByExample(AppReleaseExample example);

    int deleteByExample(AppReleaseExample example);

    int insert(AppRelease record);

    int insertSelective(AppRelease record);

    List<AppRelease> selectByExample(AppReleaseExample example);

    int updateByExampleSelective(@Param("record") AppRelease record, @Param("example") AppReleaseExample example);

    int updateByExample(@Param("record") AppRelease record, @Param("example") AppReleaseExample example);
}
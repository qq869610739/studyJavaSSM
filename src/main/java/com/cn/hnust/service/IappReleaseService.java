package com.cn.hnust.service;

import com.cn.hnust.pojo.AppRelease;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kangkang on 2017/3/29.
 */
public interface IappReleaseService {

    public List<AppRelease> getUserById(String userId);

}

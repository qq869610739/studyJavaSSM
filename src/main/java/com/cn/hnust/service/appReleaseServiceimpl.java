package com.cn.hnust.service;

import com.cn.hnust.dao.IAppReleaseMapper;
import com.cn.hnust.pojo.AppRelease;
import com.cn.hnust.pojo.AppReleaseExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kangkang on 2017/3/29.
 */
@Service("userService")
public class appReleaseServiceimpl implements IappReleaseService{
//    @Autowired
    @Resource
    private IAppReleaseMapper appReleaseMapper;
    public List<AppRelease> getUserById(String userId) {
        AppReleaseExample appReleaseExample=new AppReleaseExample();
        appReleaseExample.setLimit(2);
        appReleaseExample.setOffset(1);
        return appReleaseMapper.selectByExample(appReleaseExample);
    }
}

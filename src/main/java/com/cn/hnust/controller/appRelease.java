package com.cn.hnust.controller;

import com.cn.hnust.pojo.AppRelease;
import com.cn.hnust.pojo.AppReleaseExample;
import com.cn.hnust.service.IappReleaseService;
import com.cn.hnust.service.appReleaseServiceimpl;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by kangkang on 2017/3/29.
 */
@Controller
@RequestMapping("/appRelease")
public class appRelease {

@Resource
private IappReleaseService eleaseService;

    @RequestMapping(value = "/showRelease", method = RequestMethod.GET)
    public  String showRelease(HttpServletRequest request, Model model)
    {
//         loginUser = (User) request.getSession().getAttribute("loginUser");
//        // 判断SESSION是否失效
//        if (loginUser == null || "".equals(loginUser)) {
//            return "redirect:/";
//        }
        List<AppRelease> appReleasesArray=eleaseService.getUserById("e5709b598f0e451f9029a59bf979e2c9");
        model.addAttribute("user", "传输信息");
        return "showApplog";
    }
}

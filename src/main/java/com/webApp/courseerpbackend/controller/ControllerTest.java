package com.webApp.courseerpbackend.controller;/*
 * @author ashraf on 09.12.23
 *
 *
 */

import com.webApp.courseerpbackend.models.base.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class ControllerTest {
    @GetMapping("/")
    public static BaseResponse<String> getHello(){
        return BaseResponse.success("course erp backend");
    }


}
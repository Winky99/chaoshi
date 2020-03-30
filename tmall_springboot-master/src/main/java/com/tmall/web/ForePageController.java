package com.tmall.web;

import com.tmall.pojo.Product;
import com.tmall.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

/*
* 专用于前台页面跳转的页面分发器
* */
@Controller
public class ForePageController {
    //首页
    @GetMapping(value = "/")
    public String index(){
        return "redirect:home";
    }
    @GetMapping(value = "/home")
    public String home(){
        return "fore/home";
    }
   @GetMapping(value="/register")
    public String register(){
        return "fore/register";
    }
    @GetMapping(value="/alipay")
    public String alipay(){
        return "fore/alipay";
    }
    @GetMapping(value="/bought")
    public String bought(){
        return "fore/bought";
    }
    @GetMapping(value="/buy")
    public String buy(){
        return "fore/buy";
    }
    @GetMapping(value="/cart")
    public String cart(){
        return "fore/cart";
    }
    @GetMapping(value="/category")
    public String category(){
        return "fore/category";
    }
    @GetMapping(value="/confirmPay")
    public String confirmPay(){
        return "fore/confirmPay";
    }
    @GetMapping(value="/login")
    public String login(){
        return "fore/login";
    }
    @GetMapping(value="/orderConfirmed")
    public String orderConfirmed(){
        return "fore/orderConfirmed";
    }
    @GetMapping(value="/payed")
    public String payed(){
        return "fore/payed";
    }
    @GetMapping(value="/product")
    public String product(){
        return "fore/product";
    }
    @GetMapping(value="/registerSuccess")
    public String registerSuccess(){
        return "fore/registerSuccess";
    }
    @GetMapping(value="/review")
    public String review(){
        return "fore/review";
    }
    //搜索跳转
    @GetMapping(value="/search")
    public String searchResult(){
        return "fore/search";
    }
    //退出当前账户并返回首页
    @GetMapping("/forelogout")
    public String logout(HttpSession session) {
        session.removeAttribute("user");
        return "redirect:home";
    }

}

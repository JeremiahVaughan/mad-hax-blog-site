package com.madhax.blog.controller;

import com.madhax.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("articles", articleService.getAllArticles());
        return "index";
    }
}

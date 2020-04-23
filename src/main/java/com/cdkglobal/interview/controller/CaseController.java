package com.cdkglobal.interview.controller;

import com.cdkglobal.interview.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;


@Controller
public class CaseController {

    @Autowired
    private CaseService caseService;

    @GetMapping("/")
    public String cases(Model model) throws IOException {
        model.addAttribute("cases", caseService.getAllCases());
        return "cases";
    }
    @GetMapping("/index")
    public String index(@RequestParam String caseNumber,Model model) throws IOException {
        model.addAttribute("case", caseService.getCase(caseNumber));
        return "index";
    }
    @PostMapping("/add-case")
    public String addCase(@RequestParam String subject, @RequestParam String description) throws IOException {
        caseService.addCase(subject, description);
        return "redirect:/";
    }

    @PostMapping("/add-comment")
    public String addComment(@RequestParam String comment, @RequestParam String caseId, @RequestParam String createdBy) throws IOException {
        caseService.addCommentToCase(caseId, comment, createdBy);
        return "redirect:/index";
    }

}

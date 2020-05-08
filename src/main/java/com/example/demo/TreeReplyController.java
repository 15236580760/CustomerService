package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TreeReplyController {
    @RequestMapping("tree-reply")
    public String treeReply() {
        return "tree-reply.html";
    }
}

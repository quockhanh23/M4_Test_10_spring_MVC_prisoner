package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.SentinelServiceImpl;

@Controller
@RequestMapping("/sen")
public class SentiController {
    @Autowired
    private SentinelServiceImpl sentinelService;
    @GetMapping("")
    public String showList(Model model){

      return "/list2";
    }
}

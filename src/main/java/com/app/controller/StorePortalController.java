package com.app.controller;

import com.app.model.CampaignFeed;
import com.app.model.NewArrivalsFeed;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StorePortalController {

  @GetMapping("/")
  public String portal(Model model) {
    model.addAttribute("newArrivals", NewArrivalsFeed.list());
    model.addAttribute("campaigns", CampaignFeed.list());
    return "portal";
  }
}
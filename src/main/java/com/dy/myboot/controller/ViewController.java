package com.dy.myboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ViewController {
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value = "/base-{id}", method = RequestMethod.GET)
    public String baseView(@PathVariable("id") String id) {
        return "page/base-" + id;
    }

    @RequestMapping(value = "/buttons-{id}", method = RequestMethod.GET)
    public String buttonsView(@PathVariable("id") String id) {
        return "page/buttons-" + id;
    }

    @RequestMapping(value = "/icons-{id}", method = RequestMethod.GET)
    public String iconsView(@PathVariable("id") String id) {
        return "page/icons-" + id;
    }

    @RequestMapping(value = "/notifications-{id}", method = RequestMethod.GET)
    public String notificationsView(@PathVariable("id") String id) {
        return "page/notifications-" + id;
    }

    @RequestMapping(value = "/blank", method = RequestMethod.GET)
    public String blankView() {
        return "page/blank";
    }

    @RequestMapping(value = "/charts", method = RequestMethod.GET)
    public String chartsView() {
        return "page/charts";
    }

    @RequestMapping(value = "/colors", method = RequestMethod.GET)
    public String colorsView() {
        return "page/colors";
    }

    @RequestMapping(value = "/typography", method = RequestMethod.GET)
    public String typographyView() {
        return "page/typography";
    }

    @RequestMapping(value = "/widgets", method = RequestMethod.GET)
    public String widgetsView() {
        return "page/widgets";
    }
}

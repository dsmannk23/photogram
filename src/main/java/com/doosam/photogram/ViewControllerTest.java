package com.doosam.photogram;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewControllerTest {

    @GetMapping("/auth/signup")
    public String signupPage() {
        return "auth/signup";
    }

    @GetMapping("/auth/signin")
    public String signinPage() {
        return "auth/signin";
    }

    @GetMapping("/image/story")
    public String storyPage() {
        return "image/story";
    }

    @GetMapping("/image/upload")
    public String popularPage() {
        return "image/popular";
    }

    @GetMapping("/user/profile")
    public String uploadPage() {
        return "user/profile";
    }

    @GetMapping("/user/update")
    public String updatePage() {
        return "user/update";
    }

}

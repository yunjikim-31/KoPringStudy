package net.bellsoft.study.kps.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {

    @GetMapping("/")
    fun displayIndex(): String {
        println("test")
        return "test response"
    }

}
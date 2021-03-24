package br.com.ufg.pesquisadecampo.dto

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ResponseBody

import org.springframework.web.bind.annotation.RequestMapping


@Controller
class HelloController {

    @RequestMapping("/")
    @ResponseBody
    fun hello() = "Hello World!"

}
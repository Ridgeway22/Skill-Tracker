package org.launchcode.skillstracker.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkillsController {





@GetMapping
    @ResponseBody
    public String list () {
    return "<html>" +
            "<body>" +
            "<h1>Skill Tracker</h1>" +
            "<h2>We have a few skills we would like to learn</h2>" +
            "<ol>" +
            "<li>Java</li>" +
            "<li>Java Script</li>" +
            "<li>Python</li>" +
            "</ol>" +
            "</body >" +
            "</html >";

}

    @GetMapping("form")
    @ResponseBody
    public String languageCode(){
       return "<html>" +
            "<body>" +

                "<form action='form' method = 'post'>" +
               "<h1>Enter your name</h1>"+
               "<input type='text' name='name' <br>>" +
               "<h1>First choice</h1>"+

                " <select id='language' name='one'>"+
                " <option value='Java'>Java"+
                " <option value='JavaScript'>JavaScript"+
                " <option value='Ruby'>Ruby"+
                "</select>"+
               "<h1>2nd choice</h1><br>"+
               " <select id='language' name='two'>"+
               " <option value='Java'>Java"+
               " <option value='JavaScript'>JavaScript"+
               " <option value='Ruby'>Ruby"+

               "</select><br>"+
               "<h1>Third choice</h1>"+
               " <select id='language' name='three'>"+
               " <option value='Java'>Java"+
               " <option value='JavaScript'>JavaScript"+
               " <option value='Ruby'>Ruby<br>"+

               "</select><br>"+
               "<input type='submit' value='Submit'>"+
                "</form>" +
                "</body>"+
                "</html>";
    }


    @PostMapping("form")
    @ResponseBody
    public String getName(@RequestParam String name, @RequestParam String one, @RequestParam String two, @RequestParam String three) {
               return "<ol>" +
                "<h3>"+name+"</h3><br>" +
                "<li>"+ one +"</li>" +
                "<li>" +two+ "</li>" +
                "<li>" +three+ "</li>" +
                "</ol>" ;

    }
}

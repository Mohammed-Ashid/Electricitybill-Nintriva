package com.example.first.demo.Controller;

import com.example.first.demo.Service.ReadingService;
import com.example.first.demo.Vo.ReadingVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reading")
public class readingController {
    @Autowired
    private ReadingService readingService;
    @PostMapping("/newreading")
    public String newReading(@RequestBody ReadingVo reading){
        return readingService.newReading(reading);
    }
}

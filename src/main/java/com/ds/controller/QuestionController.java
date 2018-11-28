package com.ds.controller;

import com.alibaba.fastjson.JSON;
import com.ds.domain.Question;
import com.ds.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("question")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    //获取所有问题
    @RequestMapping("/getList")
    @ResponseBody
    public String getList(){
        System.out.println("已经到这了");
        List<Question> list=questionService.findQuestion();
        return JSON.toJSONString(list);
    }
    //审核问题(修改)
    @RequestMapping("/")
    @ResponseBody
    public String updateQuesion(Question question){
        questionService.updateQuestion(question);
        return null;
    }

}


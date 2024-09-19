package com.springMICRO2.Microservice_WEb2.Service.Impl.IMPL;

import com.springMICRO2.Microservice_WEb2.presentation.Questions2;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
@FeignClient(url = "MICROSERVICE_WEB2",value = "Qeustions-client")
public interface QuestionsClient {
    @GetMapping("/questions/quiz/{id}")
    List<Questions2> getQuestions(@PathVariable int id);
}

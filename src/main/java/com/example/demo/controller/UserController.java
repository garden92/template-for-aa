package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

// @Slf4j
@RequestMapping("/api/v1")
@RestController
public class UserController {


/**
 * Restful API 개발 : sampleapp1-[사번].ce-aa.kubepia.net/api/v1/user GET 방식으로 사번을 리턴하는 API를 만드세요
 */

    /**
     * TodoItem 목록 조회
     *
     * @param pageable
     * @param id
     * @param keyword
     * @return
     */
    @GetMapping("/user")
    public String getTodoItemList() {

        return "82234586";
    }
}

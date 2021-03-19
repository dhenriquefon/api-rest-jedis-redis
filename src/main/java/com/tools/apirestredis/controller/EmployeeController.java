package com.tools.apirestredis.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.tools.apirestredis.vo.EmployeeVO;
import com.tools.apirestredis.vo.MessageVO;
import com.tools.apirestredis.service.RedisService;

import com.google.gson.Gson;

@RestController
public class EmployeeController
{

    @Autowired
    private RedisService redisService;

    @GetMapping(value = "/healthcheck", produces = "application/json; charset=utf-8")
    public String getHealthCheck()
    {
        return "{ \"isWorking\" : true }";
    }

    @GetMapping("/employeeslala")
    public String getEmployees()
    {
        return "{ \"employees\" : lala }";
    }

    @GetMapping("/employeesvo")
    public MessageVO<EmployeeVO> getEmployeesvo()
    {
        EmployeeVO employeeVO = new EmployeeVO(true, true, 7, 8, 9
                    , true, 1000);
        Gson gson = new Gson();

        // escrevendo objeto no formato json
        // ------------------
        String jsonString = gson.toJson(employeeVO);

        redisService.writeOnRedis("test_write", jsonString);
        // ------------------

        // lendo objeto no formato json e gravando em uma chave diferente para validar se grava o objeto java
        // ------------------
        String teste = redisService.getValueRedis("test_read");
        EmployeeVO aux = new EmployeeVO();
        aux = gson.fromJson(teste, EmployeeVO.class);
        // ------------------


        return new MessageVO<EmployeeVO>().success(employeeVO);
    }

}

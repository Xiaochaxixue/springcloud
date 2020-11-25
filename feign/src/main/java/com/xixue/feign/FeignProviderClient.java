package com.xixue.feign;

import com.xixue.entity.Student;
import com.xixue.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
@Component
@FeignClient(value = "songclient",fallback = FeignError.class)//声明feign客户端接口,发生错误则找FeignError中的逻辑
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();
}

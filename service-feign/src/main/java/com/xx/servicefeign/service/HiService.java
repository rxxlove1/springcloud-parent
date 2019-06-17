/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HiService
 * Author:   Administrator
 * Date:     2019/6/16 0016 21:12
 * Description: hiservice
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xx.servicefeign.service;

import com.xx.servicefeign.service.impl.HiServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉<br> 
 * 〈hiservice〉
 *
 * @author Administrator
 * @create 2019/6/16 0016
 * @since 1.0.0
 */
@FeignClient(value = "service-eureka1",fallback = HiServiceImpl.class)
public interface HiService {

    @GetMapping("/hi")
    String getHi(@RequestParam("name") String name);
}

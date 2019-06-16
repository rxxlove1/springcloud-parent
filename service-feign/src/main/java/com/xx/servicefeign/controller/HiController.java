/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HiController
 * Author:   xingxing ruan
 * Date:     2019/6/16 0016 21:08
 * Description: hi
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xx.servicefeign.controller;

import com.xx.servicefeign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈hi〉
 *
 * @author xingxing ruan
 * @create 2019/6/16 0016
 * @since 1.0.0
 */
@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/hi")
    public String hi(String name){
        return hiService.getHi(name);
    }
}

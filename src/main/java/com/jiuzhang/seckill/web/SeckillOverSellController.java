package com.jiuzhang.seckill.web;

import com.jiuzhang.seckill.services.SeckillOverSellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SeckillOverSellController {
    @Autowired
    private SeckillOverSellService seckillOverSellService;

    @ResponseBody
    @RequestMapping("/seckill/{secKillActivityId}")
    public String seckill (@PathVariable long secKillActivityId) {
        return seckillOverSellService.processSeckill(secKillActivityId);
    }
}

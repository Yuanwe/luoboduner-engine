package com.luoboduner.api.home.web;

import com.luoboduner.api.home.service.WeddingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by zhouy on 2017/6/26.
 */
@RestController
@RequestMapping("wedding/")
public class WeddingController {
    private static final Logger logger = LoggerFactory.getLogger(WeddingController.class);

    @Autowired
    private WeddingService weddingService;

    @RequestMapping(value = "/getAlbumPhotoUrls", method = RequestMethod.GET)
    public List<String> getAlbumPhotoUrls(@RequestParam(value = "pageNum", required = true) int pageNum,
                                          @RequestParam(value = "pageSize", required = true) int pageSize, HttpServletResponse response) {
//        response.setHeader("Access-Control-Allow-Origin", "*");
//        response.setHeader("Access-Control-Allow-Methods", "POST");
//        response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type");

        return weddingService.getAlbumPhotoUrls(pageNum, pageSize);
    }

}

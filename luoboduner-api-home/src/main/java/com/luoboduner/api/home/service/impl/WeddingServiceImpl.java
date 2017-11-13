package com.luoboduner.api.home.service.impl;

import com.github.pagehelper.PageHelper;
import com.luoboduner.api.home.service.WeddingService;
import com.luoboduner.dao.mapper.WeddingAlbumMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhouy on 2017/6/26.
 */
@Service
public class WeddingServiceImpl implements WeddingService {
    @Autowired
    WeddingAlbumMapper weddingAlbumMapper;

    @Override
    public List<String> getAlbumPhotoUrls(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return weddingAlbumMapper.getAlbumPhotoUrls();
    }
}

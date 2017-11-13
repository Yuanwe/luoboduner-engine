package com.luoboduner.dao.mapper;

import com.luoboduner.dao.domain.WeddingAlbum;

import java.util.List;

public interface WeddingAlbumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WeddingAlbum record);

    int insertSelective(WeddingAlbum record);

    WeddingAlbum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WeddingAlbum record);

    int updateByPrimaryKey(WeddingAlbum record);

    List<String> getAlbumPhotoUrls();
}
package com.example.demo.dao;

import com.example.demo.domain.RankList;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RankListMapper {

    int insert(RankList record);

    int insertSelective(RankList record);

    /**
     * 查总分
     * @param songListId
     * @return
     */
    int selectScoreSum(Long songListId);

    /**
     * 查总评分人数
     * @param songListId
     * @return
     */
    int selectRankNum(Long songListId);

    /**
     * 查指定用户评分
     * @param consumerId
     * @param songListId
     * @return
     */
    int selectUserRank(@Param("consumerId") Long consumerId, @Param("songListId") Long songListId);

    int deleteByPrimaryKey(Long id);

    RankList selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RankList record);

    int updateByPrimaryKey(RankList record);
}
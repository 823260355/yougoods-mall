package ltd.yougoods.mall.service;

import ltd.yougoods.mall.controller.vo.NewBeeMallIndexCarouselVO;
import ltd.yougoods.mall.entity.Carousel;
import ltd.yougoods.mall.util.PageQueryUtil;
import ltd.yougoods.mall.util.PageResult;

import java.util.List;

public interface NewBeeMallCarouselService {
    /**
     * 后台分页
     *
     * @param pageUtil
     * @return
     */
    PageResult getCarouselPage(PageQueryUtil pageUtil);

    String saveCarousel(Carousel carousel);

    String updateCarousel(Carousel carousel);

    Carousel getCarouselById(Integer id);

    Boolean deleteBatch(Integer[] ids);

    /**
     * 返回固定数量的轮播图对象(首页调用)
     *
     * @param number
     * @return
     */
    List<NewBeeMallIndexCarouselVO> getCarouselsForIndex(int number);
}

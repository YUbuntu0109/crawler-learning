package pers.huangyuhui.bookcrawler.crawler;


import pers.huangyuhui.bookcrawler.crawler.task.BookProcessor;
import pers.huangyuhui.bookcrawler.crawler.util.FileUtils;

/**
 * @project: bookcrawler
 * @description: 爬虫测试程序
 * @author: 黄宇辉
 * @date: 7/11/2019-9:12 PM
 * @version: 2.0
 * @website: https://yubuntu0109.github.io/
 */
public class BookCrawlerTest {
    //自定义搜索关键字
    private static final String KEY_WORD = "网络爬虫";
    //自定义页码数,每页可爬取三十条数据(注:下一页的页码数为前一页的页码数加二)
    private static final int END_PAGE_NUM = 2;
    private static final int CURRENT_PAGE_NUM = 1;
    //获取项目下存储书籍图片的文件夹路径
    private static final String IMAGE_PATH = FileUtils.getDirPath("/static/download/bookImage/");
    //书籍列表页面的链接
    private static final String URL = "https://search.jd.com/Search?keyword=" + KEY_WORD + "&enc=utf-8&page=";

    /**
     * @description: 🕷启动爬虫
     * @date: 2019-07-15 4:09 PM
     */
    public static void main(String[] args) {
        new BookProcessor(URL, IMAGE_PATH, CURRENT_PAGE_NUM, END_PAGE_NUM).run();
    }
}
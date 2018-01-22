package com.cn.entity;

import java.io.Serializable;

/**
 * Created by User on 2017/11/27.
 */
public class Page implements Serializable{
    private int pageNow = 1;//当前页
    private int pageSize = 4;//每页显示记录的条数
    private int totalCount;//总的记录条数
    private int totalPageCount;//总的页数

    @SuppressWarnings("unused")
    private int startPos;//开始位置，从0开始
    @SuppressWarnings("unused")
    private boolean hasFirst;//是否有首页
    @SuppressWarnings("unused")
    private boolean hasPre;// 是否有前一页
    @SuppressWarnings("unused")
    private boolean hasNext;// 是否有下一页
    @SuppressWarnings("unused")
    private boolean hasLast;// 是否有最后一页

    /*
    * 通过构造函数传入总记录数和当前页
    * */
    public Page(int pageNow, int totalCount) {
        this.pageNow = pageNow;
        this.totalCount = totalCount;
    }

    /*
    * 取得总页数，总页数=总记录数/每页记录数
    * */
    public int getTotalPageCount() {
        totalPageCount = getTotalCount() / getPageSize();
        return (totalCount % pageSize == 0) ? totalPageCount
                : totalPageCount + 1;
    }

    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /*
    * 取得选择记录的初始位置
    * */
    public int getStartPos() {
        return (pageNow - 1) * pageSize;
    }

    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    /*
    * 是否是第一页
    * */
    public boolean isHasFirst() {
        return (pageNow == 1) ? true : false;
    }

    public void setHasFirst(boolean hasFirst) {
        this.hasFirst = hasFirst;
    }

    /*
    * 是否有首页
    * */
    public boolean isHasPre() {

        return isHasFirst() ? false : true;
    }

    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    /*
    * 是否有下一页
    * */
    public boolean isHasNext() {
        return isHasLast() ? false : true;
    }

    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    /*
    * 是否有尾页
    * */
    public boolean isHasLast() {
        return (pageNow == getTotalPageCount()) ? true :false;
    }

    public void setHasLast(boolean hasLast) {
        this.hasLast = hasLast;
    }
}

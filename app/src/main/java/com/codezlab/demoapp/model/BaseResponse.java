package com.codezlab.demoapp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/*
"page": 2,
	"per_page": 6,
	"total": 12,
	"total_pages": 2,
	"data": [{}]
 */
public class BaseResponse {

    private int page;
    private int total;
    @SerializedName("total_pages")
    private int totalPages;
    private List<User> data;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "BaseResponse{" +
                "page=" + page +
                ", total=" + total +
                ", totalPages=" + totalPages +
                ", data=" + data +
                '}';
    }
}

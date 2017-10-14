package com.wangln.ykdproject.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/10/14 0014.
 */

public class FirstPageBean {
    /**
     * resultCode : 0
     * msg : 获取首页成功！
     * data : {"slideShowUrlList":[{"id":1,"pictureurl":"http://114.215.46.63/Test/images/guang1.jpg","shopid":2},{"id":2,"pictureurl":"http://114.215.46.63/Test/images/guang2.jpg","shopid":6},{"id":3,"pictureurl":"http://114.215.46.63/Test/images/guang3.jpg","shopid":3},{"id":4,"pictureurl":"http://114.215.46.63/Test/images/guang4.jpg","shopid":5},{"id":5,"pictureurl":"http://114.215.46.63/Test/images/guang5.jpg","shopid":7}],"classifyList":[{"id":1,"classifypictureurl":"http://114.215.46.63/Test/images/1176886.png","classifyid":0,"classifytitle":"医药保健"},{"id":2,"classifypictureurl":"http://114.215.46.63/Test/images/1204387.png","classifyid":1,"classifytitle":"食品生鲜"},{"id":3,"classifypictureurl":"http://114.215.46.63/Test/images/1204387.png","classifyid":2,"classifytitle":"电器"},{"id":4,"classifypictureurl":"http://114.215.46.63/Test/images/1185182.png","classifyid":3,"classifytitle":"装饰装潢"},{"id":5,"classifypictureurl":"http://114.215.46.63/Test/images/1188517.png","classifyid":4,"classifytitle":"酒水饮料"},{"id":6,"classifypictureurl":"http://114.215.46.63/Test/images/1176886.png","classifyid":5,"classifytitle":"母婴童装"},{"id":7,"classifypictureurl":"http://114.215.46.63/Test/images/1114469.png","classifyid":6,"classifytitle":"运动户外"}],"recommendationList":[{"shopid":1,"shoptitle":"优卡丹复方小儿退热栓","shopprice":16,"shopfreight":5,"shopsalesvolume":100,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/aaa.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402692.html","classifyid":0,"twoclassifyid":1,"recommend":1,"shopCount":48},{"shopid":2,"shoptitle":"智利奇异果猕猴桃","shopprice":39.05,"shopfreight":5,"shopsalesvolume":100,"shoptype":1,"shoppictureurl":"http://114.215.46.63/Test/images/bbb.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402693.html","classifyid":1,"twoclassifyid":1,"recommend":1,"shopCount":10},{"shopid":3,"shoptitle":"智利奇异果猕猴桃","shopprice":39.05,"shopfreight":2,"shopsalesvolume":99,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/ccc.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402694.html","classifyid":2,"twoclassifyid":1,"recommend":1,"shopCount":30},{"shopid":4,"shoptitle":"优卡丹复方小儿退热栓","shopprice":16,"shopfreight":4,"shopsalesvolume":100,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/ddd.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402695.html","classifyid":3,"twoclassifyid":2,"recommend":1,"shopCount":5},{"shopid":5,"shoptitle":"优卡丹复方小儿退热栓","shopprice":16,"shopfreight":3,"shopsalesvolume":20,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/ddd.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402696.html","classifyid":4,"twoclassifyid":2,"recommend":1,"shopCount":10},{"shopid":6,"shoptitle":"智利奇异果猕猴桃","shopprice":10,"shopfreight":5,"shopsalesvolume":30,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/ccc.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402697.html","classifyid":5,"twoclassifyid":2,"recommend":1,"shopCount":8},{"shopid":7,"shoptitle":"优卡丹复方小儿退热栓","shopprice":20,"shopfreight":4,"shopsalesvolume":20,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/ccc.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402698.html","classifyid":6,"twoclassifyid":3,"recommend":1,"shopCount":10},{"shopid":8,"shoptitle":"智利奇异果猕猴桃","shopprice":10,"shopfreight":4,"shopsalesvolume":40,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/bbb.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402699.html","classifyid":3,"twoclassifyid":3,"recommend":1,"shopCount":3},{"shopid":9,"shoptitle":"智利奇异果猕猴桃","shopprice":10,"shopfreight":4,"shopsalesvolume":40,"shoptype":0,"shoppictureurl":"http://114.215.46.63/Test/images/aaa.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402609.html","classifyid":2,"twoclassifyid":2,"recommend":1,"shopCount":10},{"shopid":10,"shoptitle":"智利奇异果猕猴桃","shopprice":10,"shopfreight":3,"shopsalesvolume":60,"shoptype":1,"shoppictureurl":"http://114.215.46.63/Test/images/ccc.jpg","shopgraphicdetails":"https://in.m.jd.com/product/jieshao/2402619.html","classifyid":1,"twoclassifyid":4,"recommend":1,"shopCount":6}]}
     */

    private int resultCode;

    @Override
    public String toString() {
        return "FirstPageBean{" +
                "resultCode=" + resultCode +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    private String msg;
    private DataBean data;

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        private List<SlideShowUrlListBean> slideShowUrlList;
        private List<ClassifyListBean> classifyList;
        private List<RecommendationListBean> recommendationList;

        @Override
        public String toString() {
            return "DataBean{" +
                    "slideShowUrlList=" + slideShowUrlList +
                    ", classifyList=" + classifyList +
                    ", recommendationList=" + recommendationList +
                    '}';
        }

        public List<SlideShowUrlListBean> getSlideShowUrlList() {
            return slideShowUrlList;
        }

        public void setSlideShowUrlList(List<SlideShowUrlListBean> slideShowUrlList) {
            this.slideShowUrlList = slideShowUrlList;
        }

        public List<ClassifyListBean> getClassifyList() {
            return classifyList;
        }

        public void setClassifyList(List<ClassifyListBean> classifyList) {
            this.classifyList = classifyList;
        }

        public List<RecommendationListBean> getRecommendationList() {
            return recommendationList;
        }

        public void setRecommendationList(List<RecommendationListBean> recommendationList) {
            this.recommendationList = recommendationList;
        }

        public static class SlideShowUrlListBean {
            /**
             * id : 1
             * pictureurl : http://114.215.46.63/Test/images/guang1.jpg
             * shopid : 2
             */

            private int id;
            private String pictureurl;
            private int shopid;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPictureurl() {
                return pictureurl;
            }

            public void setPictureurl(String pictureurl) {
                this.pictureurl = pictureurl;
            }

            public int getShopid() {
                return shopid;
            }

            public void setShopid(int shopid) {
                this.shopid = shopid;
            }
        }

        public static class ClassifyListBean {
            /**
             * id : 1
             * classifypictureurl : http://114.215.46.63/Test/images/1176886.png
             * classifyid : 0
             * classifytitle : 医药保健
             */

            private int id;
            private String classifypictureurl;
            private int classifyid;
            private String classifytitle;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getClassifypictureurl() {
                return classifypictureurl;
            }

            public void setClassifypictureurl(String classifypictureurl) {
                this.classifypictureurl = classifypictureurl;
            }

            public int getClassifyid() {
                return classifyid;
            }

            public void setClassifyid(int classifyid) {
                this.classifyid = classifyid;
            }

            public String getClassifytitle() {
                return classifytitle;
            }

            public void setClassifytitle(String classifytitle) {
                this.classifytitle = classifytitle;
            }
        }

        public static class RecommendationListBean {
            /**
             * shopid : 1
             * shoptitle : 优卡丹复方小儿退热栓
             * shopprice : 16.0
             * shopfreight : 5.0
             * shopsalesvolume : 100
             * shoptype : 0
             * shoppictureurl : http://114.215.46.63/Test/images/aaa.jpg
             * shopgraphicdetails : https://in.m.jd.com/product/jieshao/2402692.html
             * classifyid : 0
             * twoclassifyid : 1
             * recommend : 1
             * shopCount : 48
             */

            private int shopid;
            private String shoptitle;
            private double shopprice;
            private double shopfreight;
            private int shopsalesvolume;
            private int shoptype;
            private String shoppictureurl;
            private String shopgraphicdetails;
            private int classifyid;
            private int twoclassifyid;
            private int recommend;
            private int shopCount;

            @Override
            public String toString() {
                return "RecommendationListBean{" +
                        "shopid=" + shopid +
                        ", shoptitle='" + shoptitle + '\'' +
                        ", shopprice=" + shopprice +
                        ", shopfreight=" + shopfreight +
                        ", shopsalesvolume=" + shopsalesvolume +
                        ", shoptype=" + shoptype +
                        ", shoppictureurl='" + shoppictureurl + '\'' +
                        ", shopgraphicdetails='" + shopgraphicdetails + '\'' +
                        ", classifyid=" + classifyid +
                        ", twoclassifyid=" + twoclassifyid +
                        ", recommend=" + recommend +
                        ", shopCount=" + shopCount +
                        '}';
            }

            public int getShopid() {
                return shopid;
            }

            public void setShopid(int shopid) {
                this.shopid = shopid;
            }

            public String getShoptitle() {
                return shoptitle;
            }

            public void setShoptitle(String shoptitle) {
                this.shoptitle = shoptitle;
            }

            public double getShopprice() {
                return shopprice;
            }

            public void setShopprice(double shopprice) {
                this.shopprice = shopprice;
            }

            public double getShopfreight() {
                return shopfreight;
            }

            public void setShopfreight(double shopfreight) {
                this.shopfreight = shopfreight;
            }

            public int getShopsalesvolume() {
                return shopsalesvolume;
            }

            public void setShopsalesvolume(int shopsalesvolume) {
                this.shopsalesvolume = shopsalesvolume;
            }

            public int getShoptype() {
                return shoptype;
            }

            public void setShoptype(int shoptype) {
                this.shoptype = shoptype;
            }

            public String getShoppictureurl() {
                return shoppictureurl;
            }

            public void setShoppictureurl(String shoppictureurl) {
                this.shoppictureurl = shoppictureurl;
            }

            public String getShopgraphicdetails() {
                return shopgraphicdetails;
            }

            public void setShopgraphicdetails(String shopgraphicdetails) {
                this.shopgraphicdetails = shopgraphicdetails;
            }

            public int getClassifyid() {
                return classifyid;
            }

            public void setClassifyid(int classifyid) {
                this.classifyid = classifyid;
            }

            public int getTwoclassifyid() {
                return twoclassifyid;
            }

            public void setTwoclassifyid(int twoclassifyid) {
                this.twoclassifyid = twoclassifyid;
            }

            public int getRecommend() {
                return recommend;
            }

            public void setRecommend(int recommend) {
                this.recommend = recommend;
            }

            public int getShopCount() {
                return shopCount;
            }

            public void setShopCount(int shopCount) {
                this.shopCount = shopCount;
            }
        }
    }
}

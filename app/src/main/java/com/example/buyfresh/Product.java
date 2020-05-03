package com.example.buyfresh;

class Product {

    private String Title;
    private String Description ;
    private String Price;
    private int Thumbnail ;

    public Product() {
    }

    //making class for data which will be printed on product and description page
    public Product(String title, String description, String price, int thumbnail) {
        Title = title;
        Description = description;
        Thumbnail = thumbnail;
        Price= price;
    }

    // functions used to extract value of above assigned variables.
    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getPrice() {
        return Price;
    }

    public int getThumbnail() {
        return Thumbnail;
    }



    public void setTitle(String title) {
        Title = title;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }
}

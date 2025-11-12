class ProductCategory {}
class BookCategory extends ProductCategory {}
class ClothingCategory extends ProductCategory {}
class Product<T extends ProductCategory> {
    String name; double price;
    Product(String n,double p){name=n;price=p;}
    double getPrice(){return price;}
}
class Marketplace {
    public static <T extends Product<?>> void applyDiscount(T product, double percent){
        System.out.println(product.name+" discounted price: "+(product.getPrice()*(1-percent/100)));
    }
    public static void main(String[] args){
        Product<BookCategory> book=new Product<>("Java Book",500);
        Product<ClothingCategory> cloth=new Product<>("T-Shirt",1000);
        applyDiscount(book,10);
        applyDiscount(cloth,20);
    }
}
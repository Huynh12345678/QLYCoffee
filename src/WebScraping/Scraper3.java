package WebScraping;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.Mongo;
import static java.lang.Integer.parseInt;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Scraper3 {

    public static void main(String[] args) throws Exception {
        Mongo mongo = new Mongo();
        DB db = mongo.getDB("QlyCofee");
        final Document document = Jsoup.connect("https://www.thecoffeehouse.com").get();
//                    System.out.println(document.outerHtml());

        for (Element row : document.select(".menu_list_home .menu_item .menu_item_info")) {

            final String name = row.select("  h3").text();
            final String price = row.select(".price_product_item").text();
            int min = 0;
            int max = 100;
            int random_int = (int) (Math.random() * (max - min + 1) + min);
//            System.out.println(random_int);
//            final String id = row.select(".key").text();

//            String string = id;
//            String[] parts = string.split(" ");
//            String part1 = parts[1];
//
//            String string2 = price;
//            String[] partss = string2.split(" ");
//            String part11 = partss[0];
//            String string3 = part11;
//            String u = part11.replaceAll("[.]", "");
//            int uu = parseInt(u);
//            System.out.println(u);
            System.out.println(name + " -> " +"id:G" + random_int +" -> Price: "+ price);

//            System.out.println(title);
//            DBCollection history = db.getCollection("Product");
//            DBCollection history2 = db.getCollection("Product&ProductType");
//
//            String s = "Vừa";
//
//            BasicDBObject document1 = new BasicDBObject();
//            document1.put("IDProduct", part1);
//            document1.put("ProductName", name);
//            document1.put("IDType", "T02");
//            document1.put("Price", uu);
//            history.insert(document1);
//
//            BasicDBObject document2 = new BasicDBObject();
//            document2.put("IDProduct", part1);
//            document2.put("ProductName", name);
//            document2.put("IDType", "T02");
//            document2.put("Price", uu);
//            document2.put("TypeName", "Kem");
//            document2.put("Size", s);
//            history2.insert(document2);
//            if (i == 1) {
//                x1 = x2;
//                s = "Vừa";
//
//            } else {
//                x1 = x3;
//                s = "Lớn";
//
//            }
        }
//        DBCollection history3 = db.getCollection("ProductType");
//        BasicDBObject document3 = new BasicDBObject();
//        document3.put("IDType", "T02");
//        document3.put("TypeName", "Kem");
//        document3.put("Size", "Vừa");
//        history3.insert(document3);
//        System.out.println("Thu thập dữ liệu thành công.");

    }
}
